package principal;

import java.util.Scanner;

import clases.Conferencia;
import clases.Estadio;
import exceptions.EquipoSinDorsalesRetiradosException;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.Equipo;
import superClases.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conferencia este = new Conferencia("este", null);
		Conferencia oeste = new Conferencia("oeste", null);

		Estadio stateFarmArena = new Estadio("State Farm Arena", (short) 16600);
		Estadio tdGarden = new Estadio("TD Garden", (short) 18624);
		Estadio barclaysCenter = new Estadio("Barclays Center", (short) 17732);
		Estadio spectrumCenter = new Estadio("Spectrum center", (short) 19077);
		Estadio unitedCenter = new Estadio("United center", (short) 20917);
		Estadio rocketMortageFieldHouse = new Estadio("Rocket Mortgage FieldHouse", (short) 19432);
		Estadio littkeCaesarsArena = new Estadio("Little Caesar Arena", (short) 20332);
		Estadio bankersLifeFieldHouse = new Estadio("Bankers Life FieldHouse", (short) 17923);
		Estadio ftxArena = new Estadio("FTX Arena", (short) 19600);
		Estadio fiservForum = new Estadio("Fiserv Forum", (short) 17341);
		Estadio madisonSquareGarde = new Estadio("Madison Square Garden", (short) 19812);
		Estadio amwayCenter = new Estadio("Amway Center", (short) 18846);
		Estadio wellsFargoCenter = new Estadio("Wells Fargo Center", (short) 20478);
		Estadio scotiaBankArena = new Estadio("Scotia Bank Arena", (short) 19800);
		Estadio capitalOneArena = new Estadio("Capital One Arena", (short) 20356);
		Estadio americanAirlinesCenter = new Estadio("American Airlines Center", (short) 19200);
		Estadio ballCenter = new Estadio("Ball Center", (short) 19520);
		Estadio chaseCenter = new Estadio("Chase Center", (short) 18064);
		Estadio toyotaCenter = new Estadio("Toyota Center", (short) 18055);
		Estadio cryptocomArena = new Estadio("Crypto.com Arena", (short) 19060);
		Estadio fedexForum = new Estadio("FedEx Forum", (short) 18119);
		Estadio targetCenter = new Estadio("Target Center", (short) 18798);
		Estadio smoothieKingCenter = new Estadio("Smoothie King Center", (short) 16867);
		Estadio paycomCenter = new Estadio("Paycom Center", (short) 18203);
		Estadio footprintCenter = new Estadio("Footprint Center", (short) 18422);
		Estadio modaCenter = new Estadio("Moda Center", (short) 19393);
		Estadio golden1Center = new Estadio("Golden 1 Center", (short) 17608);
		Estadio attcenter = new Estadio("AT&T Center", (short) 18418);
		Estadio vivintArena = new Estadio("Vivint Arena", (short) 18306);

		Equipo hawks = new Equipo("HAWKS", este, "Atlanta", null, "Anthony Ressler", "Travis Schlenk", 0,
				stateFarmArena);
		Equipo celtics = new Equipo("CELTICS", este, "Boston", null, "Boston basketball partners", "Brad Stevens", 0,
				tdGarden);
		Equipo nets = new Equipo("NETS", este, "Brooklyn", null, "Joseph Tsai", "Sean marks", 0, barclaysCenter);
		Equipo hornets = new Equipo("HORNETS", este, "Charlotte", null, "Michael Jordan", "Mitch Kupchak", 0,
				spectrumCenter);
		Equipo bulls = new Equipo("BULLS", este, "Chicago", null, "Jerry Reinsdorf", "Marc Eversley", 0, unitedCenter);
		Equipo cavs = new Equipo("CAVS", este, "Cleveland", null, "Dan Gilbert", "Mike Gansey", 0,
				rocketMortageFieldHouse);
		Equipo pistons = new Equipo("PISTONS", este, "Detroit", null, "Tom Gores", "Troy Weaver", 0,
				littkeCaesarsArena);
		Equipo pacers = new Equipo("PACERS", este, "Indiana", null, "Herbert Simon", "Chad Buchanan", 0,
				bankersLifeFieldHouse);
		Equipo heat = new Equipo("HEAT", este, "Miami", null, "Micky Arison", "Andy Elisburg", 0, ftxArena);
		Equipo bucks = new Equipo("BUCKS", este, "Milwaukee", null, "Los hermanos Edens", "Jon Horst", 0, fiservForum);
		Equipo knicks = new Equipo("KNICKS", este, "New York", null, "James L Dolan", "Scott Perry", 0,
				madisonSquareGarde);
		Equipo magic = new Equipo("MAGIC", este, "Orlando", null, "Richard DeVos", "John Hammond", 0, amwayCenter);
		Equipo sixers = new Equipo("76ERS", este, "Philladelphia", null, "Josh Harris", "Elton Brand", 0,
				wellsFargoCenter);
		Equipo raptors = new Equipo("RAPTORS", este, "Toronto", null, "Maple Leaf Sports & Entertainment",
				"Bobby Webster", 0, scotiaBankArena);
		Equipo wizards = new Equipo("WIZARDS", este, "Washinton", null, "Ted Leonsis", "Tommy Sheppard", 0,
				capitalOneArena);
		Equipo mavs = new Equipo("MAVERICKS", oeste, "Dallas", null, "Mark Cuban", "Nico Harrison", 0,
				americanAirlinesCenter);
		Equipo nuggets = new Equipo("NUGGETS", oeste, "Denver", null, "Kroenke Sports & Entertainment", "Calvin Booth",
				0, ballCenter);
		Equipo warriors = new Equipo("WARRIORS", oeste, "San Francisco", null, "Joe Lacob,Peter Guber", "Bob Myers", 0,
				chaseCenter);
		Equipo rockets = new Equipo("ROCKETS", oeste, "Houston", null, "Tilman Fertitta", "Rafael Stone", 0,
				toyotaCenter);
		Equipo clippers = new Equipo("CLIPPERS", oeste, "Los Ángeles", null, "Steve Ballmer", "Michael Winger", 0,
				cryptocomArena);
		Equipo lakers = new Equipo("LAKERS", oeste, "Los Ángeles", null, "Jeanie Buss", "Rob Pelinka", 0,
				cryptocomArena);
		Equipo wolves = new Equipo("TIMBERWOLVES", oeste, "Minnesota", null, "Marc Lore", "Sachin Gupta", 0,
				targetCenter);
		Equipo pelicans = new Equipo("PELICANS", oeste, "New Orleans", null, "Gayle Benson", "Trajan Langdon", 0,
				smoothieKingCenter);
		Equipo grizzlies = new Equipo("GRIZZLIES", este, "Memphis", null, "Robert Pera", "Jason Wexler", 0, fedexForum);
		Equipo okc = new Equipo("THUNDER", oeste, "Oklahoma", null, "Professional Basketball Club LLC", "Sam Presti", 0,
				paycomCenter);
		Equipo suns = new Equipo("SUNS", oeste, "Phoenix", null, "Robert Sarver", "James Andrew Jones", 0,
				footprintCenter);
		Equipo blazers = new Equipo("BLAZERS", oeste, "Portland", null, "Paul Allen", "Joe Cronin", 0, modaCenter);
		Equipo kings = new Equipo("KINGS", oeste, "Sacramento", null, "Vivek Ranadivé", "Monte McNair", 0,
				golden1Center);
		Equipo spurs = new Equipo("SPURS", oeste, "San Antonio", null, "Spurs Sports & Entertainment L.L.C.",
				"Brian Wright", 0, attcenter);
		Equipo jazz = new Equipo("JAZZ", oeste, "Utah", null, "Ryan Smith", "Justin Zanik", 0, vivintArena);

		System.out.println("Bienvenido al mejor juego indie de NBA,con que équipo NBA quieres jugar?");
		System.out.println("1 Atlanta Hawks \n2 Boston Celtics\n3 Brooklyn Nets\n4 Charlotte Hornets\n"
				+ "5 Chicago Bulls\n6 Cleveland Cavaliers\n7 Detroit Pistons\n8 Indiana Pacers\n9 Miami Heat\n10 Milwaukee Bucks"
				+ "\n11 New York Knicks\n12 Orlando Magic\n13 Philladelphia 76ers\n14 Toronto Raptors\n15 Washinton Wizards"
				+ "\n16 Dallas Mavericks\n17 Denver Nuggets\n18 Golden State Warriors\n19 Houston Rockets\n20 Los Angeles Clippers"
				+ "\n21 Los Angeles Lakers\n22 Minnesota Timberwolves\n23 New Orleans Pelicans\n24 Memphis Grizzlies\n25 Oklahoma City Thunder"
				+ "\n26 Phoenix Suns\n27 Portland Trail Blazers\n28 Sacramento Kings\n29 San Antonio Spurs\n30 Utah Jazz");
		int opcionEquipo = Integer.parseInt(sc.nextLine());
		switch (opcionEquipo) {
		case 1:

			try {
				System.out.println(hawks.getDorsalesRetirados(hawks.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 2:

			try {
				System.out.println(celtics.getDorsalesRetirados(celtics.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 3:

			try {
				System.out.println(nets.getDorsalesRetirados(nets.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 4:

			try {
				System.out.println(hornets.getDorsalesRetirados(hornets.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 5:

			try {
				System.out.println(bulls.getDorsalesRetirados(bulls.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 6:

			try {
				System.out.println(cavs.getDorsalesRetirados(cavs.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 7:

			try {
				System.out.println(pistons.getDorsalesRetirados(pistons.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 8:

			try {
				System.out.println(pacers.getDorsalesRetirados(pacers.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 9:

			try {
				System.out.println(heat.getDorsalesRetirados(heat.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 10:

			try {
				System.out.println(bucks.getDorsalesRetirados(bucks.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 11:

			try {
				System.out.println(knicks.getDorsalesRetirados(knicks.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 12:

			try {
				System.out.println(magic.getDorsalesRetirados(magic.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 13:

			try {
				System.out.println(sixers.getDorsalesRetirados(sixers.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 14:

			try {
				System.out.println(raptors.getDorsalesRetirados(raptors.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 15:

			try {
				System.out.println(wizards.getDorsalesRetirados(wizards.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 16:

			try {
				System.out.println(mavs.getDorsalesRetirados(mavs.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 17:

			try {
				System.out.println(nuggets.getDorsalesRetirados(nuggets.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 18:

			try {
				System.out.println(warriors.getDorsalesRetirados(warriors.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 19:

			try {
				System.out.println(rockets.getDorsalesRetirados(rockets.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 20:

			try {
				System.out.println(clippers.getDorsalesRetirados(clippers.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 21:

			try {
				System.out.println(lakers.getDorsalesRetirados(lakers.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 22:

			try {
				System.out.println(wolves.getDorsalesRetirados(wolves.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 23:

			try {
				System.out.println(pelicans.getDorsalesRetirados(pelicans.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 24:

			try {
				System.out.println(grizzlies.getDorsalesRetirados(grizzlies.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 25:

			try {
				System.out.println(okc.getDorsalesRetirados(okc.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 26:

			try {
				System.out.println(suns.getDorsalesRetirados(suns.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 27:

			try {
				System.out.println(blazers.getDorsalesRetirados(blazers.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 28:

			try {
				System.out.println(kings.getDorsalesRetirados(kings.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 29:

			try {
				System.out.println(spurs.getDorsalesRetirados(spurs.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;
		case 30:

			try {
				System.out.println(jazz.getDorsalesRetirados(jazz.getNombre()));
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			break;

		}
		System.out.println("Fin del programa");
	}

}
