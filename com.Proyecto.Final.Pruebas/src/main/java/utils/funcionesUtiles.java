package utils;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Random;

import clases.Conferencia;
import clases.Equipo;
import clases.Estadio;
import clases.Liga;
import clases.PartidoAllStar;
import clases.Playoff;
import clases.RondaPlayoffs;
import exceptions.EquipoMalIntroduciodoException;
import superClases.Jugador;

public class funcionesUtiles {
	public static void borrarDatosTablas() throws SQLException {
		Statement query = utilsDB.conectarBBDD();
		query.executeUpdate("DELETE FROM partidos;");
		query.executeUpdate("DELETE FROM estadio;");
		query.executeUpdate("DELETE FROM jugador;");
		query.executeUpdate("DELETE FROM partidonormal;");
		query.executeUpdate("DELETE FROM equipo;");
		query.executeUpdate("DELETE FROM partidoallstar;");
		query.executeUpdate("DELETE FROM rondaplayoff;");
		query.executeUpdate("DELETE FROM playoffs;");
		query.executeUpdate("DELETE FROM conferencia;");
		query.executeUpdate("DELETE FROM liga;");
		System.err.println("Bien borrao");

		utilsDB.desconectarBBDD();
	}

	public static void declararObjetos() throws SQLException, EquipoMalIntroduciodoException {
		Random r = new Random();

		Liga liga = new Liga((byte) 1);

		Conferencia confEste = new Conferencia("Conferencia Este", (byte) 1, (byte) 1);
		Conferencia confOeste = new Conferencia("Conferencia Oeste", (byte) 2, (byte) 1);

		Playoff playoff = new Playoff("Playoffs 2022", (byte) 1, (byte) 3, (byte) 3);

		RondaPlayoffs ronda = new RondaPlayoffs("Primera Ronda", (byte) 1, (byte) 2, (byte) 1);
		RondaPlayoffs ronda2 = new RondaPlayoffs("Semifinales de conferencia", (byte) 2, (byte) 2, (byte) 1);
		RondaPlayoffs ronda3 = new RondaPlayoffs("Finales de conferencia", (byte) 3, (byte) 2, (byte) 1);
		RondaPlayoffs ronda4 = new RondaPlayoffs("Finales NBA", (byte) 4, (byte) 2, (byte) 1);

		PartidoAllStar allStar = new PartidoAllStar((byte) 1, (short) ((short) r.nextInt(160) + 1),
				(short) ((short) r.nextInt(160) + 1), LocalDateTime.of(2022, 02, 17, 21, 30), "Equipo 1", "Equipo 2",
				"Titulares");
		
		Jugador ejemplo=new Jugador((byte) 1, "Michael", "Jordan", (byte) 23, (byte) 5);

		Equipo hawks = new Equipo((byte) 1, "Hawks", (byte) 1, "Atlanta", "jugadores Retirados", "Anthony Ressler",
				109.6f, "Estadio", "Travis Schlenk", "plantilla", (byte) 1);
		Estadio stateFarmArena = new Estadio((byte) 1, "State Farm Arena", (short) 16600, (byte) 1);

		Equipo celtics = new Equipo((byte) 2, "Celtics", (byte) 1, "Boston", "jugadores Retirados", "Brad Stevens",
				109.6f, "Estadio", "Boston basketball partners", "plantilla", (byte) 1);
		Estadio tdGarden = new Estadio((byte) 2, "TD Garden", (short) 18624, (byte) 2);

		Equipo nets = new Equipo((byte) 3, "Nets", (byte) 1, "Brooklyn", "jugadores Retirados", "Sean marks", 109.4f,
				"Estadio", "Joseph Tsai", "plantilla", (byte) 1);
		Estadio barclaysCenter = new Estadio((byte) 3, "Barclays Center", (short) 17732, (byte) 3);

		Equipo hornets = new Equipo((byte) 4, "Hornets", (byte) 1, "Charlotte", "jugadores Retirados", "Mitch Kupchak",
				109.4f, "Estadio", "Michael Jordan", "plantilla", (byte) 1);
		Estadio spectrumCenter = new Estadio((byte) 4, "Spectrum center", (short) 19077, (byte) 4);

		Equipo bulls = new Equipo((byte) 5, "Bulls", (byte) 1, "Chicago", "jugadores Retirados", "Marc Eversley",
				109.4f, "Estadio", "Jerry Reinsdorf", "plantilla", (byte) 1);
		Estadio unitedCenter = new Estadio((byte) 5, "United center", (short) 20917, (byte) 5);

		Equipo cavs = new Equipo((byte) 6, "Cavaliers", (byte) 1, "Cleveland", "jugadores Retirados", "Mike Gansey",
				109.4f, "Estadio", "Dan Gilbert", "plantilla", (byte) 1);
		Estadio rocketMortageFieldHouse = new Estadio((byte) 6, "Rocket Mortgage FieldHouse", (short) 19432, (byte) 6);

		Equipo pistons = new Equipo((byte) 7, "Pistons", (byte) 1, "Detroit", "jugadores Retirados", "Troy Weaver",
				109.4f, "Estadio", "Tom Gores", "plantilla", (byte) 1);
		Estadio littkeCaesarsArena = new Estadio((byte) 7, "Little Caesar Arena", (short) 20332, (byte) 7);

		Equipo pacers = new Equipo((byte) 8, "Pacers", (byte) 1, "Indiana", "jugadores Retirados", "Chad Buchanan",
				109.4f, "Estadio", "Herbert Simon", "plantilla", (byte) 1);
		Estadio bankersLifeFieldHouse = new Estadio((byte) 8, "Bankers Life FieldHouse", (short) 17923, (byte) 8);

		Equipo heat = new Equipo((byte) 9, "Heat", (byte) 9, "Miami", "jugadores Retirados", "Andy Elisburg", 109.4f,
				"Estadio", "Micky Arison", "plantilla", (byte) 9);
		Estadio ftxArena = new Estadio((byte) 9, "FTX Arena", (short) 19600, (byte) 9);

		Equipo bucks = new Equipo((byte) 10, "Bucks", (byte) 1, "Milwaukee", "jugadores Retirados", "Jon Horst", 109.4f,
				"Estadio", "Los hermanos Edens", "plantilla", (byte) 1);
		Estadio fiservForum = new Estadio((byte) 10, "Fiserv Forum", (short) 17341, (byte) 10);

		Equipo knicks = new Equipo((byte) 11, "Knicks", (byte) 1, "New York", "jugadores Retirados", "Scott Perry",
				109.4f, "Estadio", "James L Dolan", "plantilla", (byte) 1);
		Estadio madisonSquareGarde = new Estadio((byte) 11, "Madison Square Garden", (short) 19812, (byte) 11);

		Equipo magic = new Equipo((byte) 12, "Magic", (byte) 1, "Orlando", "jugadores Retirados", "John Hammond",
				109.4f, "Estadio", "Richard DeVos", "plantilla", (byte) 1);
		Estadio amwayCenter = new Estadio((byte) 12, "Amway Center", (short) 18846, (byte) 12);

		Equipo sixers = new Equipo((byte) 13, "76ers", (byte) 1, "Philladelphia", "jugadores Retirados", "Elton Brand",
				109.4f, "Estadio", "Josh Harris", "plantilla", (byte) 1);
		Estadio wellsFargoCenter = new Estadio((byte) 13, "Wells Fargo Center", (short) 20478, (byte) 13);

		Equipo raptors = new Equipo((byte) 14, "Raptors", (byte) 1, "Toronto", "jugadores Retirados", "Bobby Webster",
				109.4f, "Estadio", "Maple Leaf Sports & Entertainment", "plantilla", (byte) 1);
		Estadio scotiaBankArena = new Estadio((byte) 14, "Scotia Bank Arena", (short) 19800, (byte) 14);

		Equipo wizards = new Equipo((byte) 15, "Wizards", (byte) 1, "Washinton", "jugadores Retirados",
				"Tommy Sheppard", 109.4f, "Estadio", "Ted Leonsis", "plantilla", (byte) 1);
		Estadio capitalOneArena = new Estadio((byte) 15, "Capital One Arena", (short) 20356, (byte) 15);

		Equipo mavs = new Equipo((byte) 16, "Mavericks", (byte) 2, "Dallas", "jugadores Retirados", "Nico Harrison",
				109.4f, "Estadio", "Mark Cuban", "plantilla", (byte) 1);
		Estadio americanAirlinesCenter = new Estadio((byte) 16, "American Airlines Center", (short) 19200, (byte) 16);

		Equipo nuggets = new Equipo((byte) 17, "Nuggets", (byte) 2, "Denver", "jugadores Retirados", "Calvin Booth",
				109.4f, "Estadio", "Kroenke Sports & Entertainment", "plantilla", (byte) 1);
		Estadio ballCenter = new Estadio((byte) 17, "Ball Center", (short) 19520, (byte) 17);

		Equipo warriors = new Equipo((byte) 18, "Golden State Warriors", (byte) 2, "San Francisco",
				"jugadores Retirados", "Bob Myers", 109.4f, "Estadio", "Joe Lacob,Peter Guber", "plantilla", (byte) 1);
		Estadio chaseCenter = new Estadio((byte) 18, "Chase Center", (short) 18064, (byte) 18);

		Equipo rockets = new Equipo((byte) 19, "Rockets", (byte) 2, "Houston", "jugadores Retirados", "Rafael Stone",
				109.4f, "Estadio", "Tilman Fertitta", "plantilla", (byte) 1);
		Estadio toyotaCenter = new Estadio((byte) 19, "Toyota Center", (short) 18055, (byte) 19);

		Equipo clippers = new Equipo((byte) 20, "Clippers", (byte) 2, "Los Ángeles", "jugadores Retirados",
				"Michael Winger", 109.4f, "Estadio", "Steve Ballmer", "plantilla", (byte) 1);
		Estadio cryptocomArenaClippers = new Estadio((byte) 20, "Crypto.com Arena", (short) 19060, (byte) 20);

		Equipo lakers = new Equipo((byte) 21, "Lakers", (byte) 2, "Los Ángeles", "jugadores Retirados", "Rob Pelinka",
				109.4f, "Estadio", "Jeanie Buss", "plantilla", (byte) 1);
		Estadio cryptocomArena = new Estadio((byte) 21, "Crypto.com Arena", (short) 19060, (byte) 21);

		Equipo wolves = new Equipo((byte) 22, "Timberwolves", (byte) 2, "Minnesota", "jugadores Retirados",
				"Sachin Gupta", 109.4f, "Estadio", "Marc Lore", "plantilla", (byte) 1);
		Estadio targetCenter = new Estadio((byte) 22, "Target Center", (short) 18798, (byte) 22);

		Equipo pelicans = new Equipo((byte) 23, "Pelicans", (byte) 2, "New Orleans", "jugadores Retirados",
				"Trajan Langdon", 109.4f, "Estadio", "Gayle Benson", "plantilla", (byte) 1);
		Estadio smoothieKingCenter = new Estadio((byte) 23, "Smoothie King Center", (short) 16867, (byte) 23);

		Equipo grizzlies = new Equipo((byte) 24, "Grizzlies", (byte) 2, "Memphis", "jugadores Retirados",
				"Jason Wexler", 109.4f, "Estadio", "Robert Pera", "plantilla", (byte) 1);
		Estadio fedexForum = new Estadio((byte) 24, "FedEx Forum", (short) 18119, (byte) 24);

		Equipo okc = new Equipo((byte) 25, "Thunder", (byte) 2, "Oklahoma city", "jugadores Retirados", "Sam Presti",
				109.4f, "Estadio", "Professional Basketball Club LLC", "plantilla", (byte) 1);
		Estadio paycomCenter = new Estadio((byte) 25, "Paycom Center", (short) 18203, (byte) 25);

		Equipo suns = new Equipo((byte) 26, "Suns", (byte) 2, "Phoenix", "jugadores Retirados", "James Andrew Jones",
				109.4f, "Estadio", "Robert Sarver", "plantilla", (byte) 1);
		Estadio footprintCenter = new Estadio((byte) 26, "Footprint Center", (short) 18422, (byte) 26);

		Equipo blazers = new Equipo((byte) 27, "Trail Blazers", (byte) 2, "Portland", "jugadores Retirados",
				"Joe Cronin", 109.4f, "Estadio", "Paul Allen", "plantilla", (byte) 1);
		Estadio modaCenter = new Estadio((byte) 27, "Moda Center", (short) 19393, (byte) 27);

		Equipo kings = new Equipo((byte) 28, "Kings", (byte) 2, "Sacramento", "jugadores Retirados", "Monte McNair",
				109.4f, "Estadio", "Vivek Ranadivé", "plantilla", (byte) 1);
		Estadio golden1Center = new Estadio((byte) 28, "Golden 1 Center", (short) 17608, (byte) 28);

		Equipo spurs = new Equipo((byte) 29, "Spurs", (byte) 2, "San Antonio", "jugadores Retirados", "Brian Wright",
				109.4f, "Estadio", "Spurs Sports & Entertainment L.L.C.", "plantilla", (byte) 1);
		Estadio attcenter = new Estadio((byte) 29, "AT&T Center", (short) 18418, (byte) 29);

		Equipo jazz = new Equipo((byte) 30, "Jazz", (byte) 2, "Utah", "jugadores Retirados", "Justin Zanik", 109.4f,
				"Estadio", "Ryan Smith", "plantilla", (byte) 1);
		Estadio vivintArena = new Estadio((byte) 30, "Vivint Arena", (short) 18306, (byte) 30);

	}
}
