package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import clases.Conferencia;
import clases.Equipo;
import clases.Estadio;
import clases.Liga;
import clases.PartidoAllStar;
import clases.Playoff;
import clases.RondaPlayoffs;
import enums.Posicion;
import enums.Valores;
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

		Equipo heat = new Equipo((byte) 9, "Heat", (byte) 2, "Miami", "jugadores Retirados", "Andy Elisburg", 109.4f,
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

		Jugador bobCousy = new Jugador((short) 1, "Bob", "Cousy", (byte) 9, (byte) 1);
		Jugador tedTurner = new Jugador((short) 2, "Ted", "Turner", (byte) 17, (byte) 1);
		Jugador dominiqueWilkins = new Jugador((short) 3, "Dominique", "Wilkins", (byte) 21, (byte) 1);
		Jugador louHudson = new Jugador((short) 4, "Lou", "Hudson", (byte) 23, (byte) 1);
		Jugador jasonColler = new Jugador((short) 5, "Jason", "Collier", (byte) 40, (byte) 1);
		Jugador peteMaravich = new Jugador((short) 6, "Pete", "Maravich", (byte) 44, "Pistol Pete", (byte) 1);
		Jugador dikembeMutombo = new Jugador((short) 7, "Dikembe", "Mutombo", (byte) 55, (byte) 1);

		Jugador robertparish = new Jugador((short) 8, "Robert", "Parish", (byte) 00, (byte) 2);
		Jugador walterBrown = new Jugador((short) 9, "Walter", "brown", (byte) 1, (byte) 9);
		Jugador arnoldAuerbach = new Jugador((short) 10, "Arnold", "Auerbach", (byte) 2, "Red", (byte) 2);
		Jugador dennisJhonson = new Jugador((short) 11, "Dennis", "Jhonson", (byte) 3, (byte) 2);
		Jugador kevinGarnet = new Jugador((short) 12, "Kevin", "Garnet", (byte) 5, "Big Ticket", (byte) 2);
		Jugador billRussel = new Jugador((short) 13, "Bill", "Russel", (byte) 6, "Lord of the Rings", (byte) 2);
		Jugador jojoWhite = new Jugador((short) 14, "Jo Jo", "White", (byte) 10, (byte) 2);
		Jugador bobCousyCeltics = new Jugador((short) 15, "Bob", "Cousy", (byte) 14, (byte) 2);
		Jugador tomHeison = new Jugador((short) 16, "Tom", "Heison", (byte) 15, (byte) 2);
		Jugador tomSanders = new Jugador((short) 17, "Tom", "Sanders", (byte) 16, "Satch", (byte) 2);
		Jugador jhonHavliceK = new Jugador((short) 18, "Jhon", "Havlicek", (byte) 17, (byte) 2);
		Jugador jimLoscutoff = new Jugador((short) 19, "Bob", "Cousy", (byte) 18, (byte) 2);
		Jugador daveCowens = new Jugador((short) 20, "Dave", "Cowens", (byte) 18, (byte) 2);
		Jugador donaldNelson = new Jugador((short) 21, "Donald", "Nelson", (byte) 19, "Don Nelson", (byte) 2);
		Jugador billSharman = new Jugador((short) 22, "Bill", "Sharman", (byte) 21, (byte) 2);
		Jugador edMacauley = new Jugador((short) 23, "Edward", "Macauley", (byte) 22, "Ed Macauley", (byte) 2);
		Jugador frankRamsey = new Jugador((short) 24, "Frank Vernon", "Ramsey", (byte) 23, "Frank Ramsey", (byte) 2);
		Jugador samJones = new Jugador((short) 25, "Sam", "Jones", (byte) 24, (byte) 2);
		Jugador kcJones = new Jugador((short) 26, "K.C.", "Jones", (byte) 25, (byte) 2);
		Jugador cedricMaxwell = new Jugador((short) 27, "Cedric", "Maxwell", (byte) 31, "Cornbread", (byte) 2);
		Jugador kevinMcHale = new Jugador((short) 28, "Kevin Edward", "McHale", (byte) 32, "Kevin McHale", (byte) 2);
		Jugador larryBird = new Jugador((short) 29, "Larry Joe", "Bird", (byte) 33, "Larry Bird", (byte) 2);
		Jugador paulPierce = new Jugador((short) 30, "Paul", "Pierce", (byte) 34, "the truth", (byte) 2);
		Jugador reggieLewis = new Jugador((short) 31, "Reginald", "Lewis", (byte) 35, "Reggie Lewis", (byte) 2);

		Jugador drazenPetrovich = new Jugador((short) 32, "Dražen ", "Petrović", (byte) 3, (byte) 3);
		Jugador wendellLadner = new Jugador((short) 33, "Wendell", "Ladner", (byte) 4, (byte) 3);
		Jugador jasonKidd = new Jugador((short) 34, "Jason", "Kidd", (byte) 5, (byte) 3);
		Jugador jhonWilliamson = new Jugador((short) 35, "Jhon Lee", "Williamson", (byte) 23, "John Williamson",
				(byte) 3);
		Jugador billMelchionni = new Jugador((short) 36, "William P", "Melchionni", (byte) 25, "Bill Melchionni",
				(byte) 3);
		Jugador juliusErving = new Jugador((short) 37, "Julius Winfield", "Earving ||", (byte) 32, "Dr J", (byte) 3);
		Jugador buckWilliams = new Jugador((short) 38, "Dikembe", "Mutombo", (byte) 55, (byte) 3);

		Jugador bobbyPhills = new Jugador((short) 39, "Bobby Ray ", "Phills ||", (byte) 13, "Bobby Phills", (byte) 4);

		Jugador michaelJordan = new Jugador((short) 40, "Michael", "Jordan", (byte) 23, "Air Jordan", (byte) 5);
		Jugador scottiePippen = new Jugador((short) 41, "Scottie", "Pippen", (byte) 33, "Pip", (byte) 5);
		Jugador bobLove = new Jugador((short) 42, "Bob", "Love", (byte) 10, (byte) 5);
		Jugador jerrySloan = new Jugador((byte) 43, "Jerry", "Sloan", (byte) 4, (byte) 5);

		Jugador bingoSmith = new Jugador((short) 44, "Robert", "Smith", (byte) 7, "Bingo Smith", (byte) 6);
		Jugador zydrunasilgaukas = new Jugador((short) 45, "Žydrūnas ", "Ilgauskas", (byte) 11, (byte) 6);
		Jugador larryNance = new Jugador((short) 46, "Larry Donnel", "Nance Sr", (byte) 2, "Larry Nance", (byte) 6);
		Jugador markPrice = new Jugador((short) (byte) 47, "William Mark", "Price", (byte) 25, "Mark Price", (byte) 6);
		Jugador austinCarr = new Jugador((short) 48, "Austin George ", "Carr", (byte) 34, "Austin Carr", (byte) 6);
		Jugador nateThurmond = new Jugador((short) 49, "Nathaniel", "Thurmond", (byte) 42, "Nate the Great", (byte) 6);
		Jugador bradDaugherty = new Jugador((short) 50, "Bradley Lee", "Daugherty", (byte) 43, "Brad Daugherty",
				(byte) 6);

		Jugador derekHarper = new Jugador((short) 51, "Derek ", "Harper", (byte) 12, (byte) 16);
		Jugador bradDavis = new Jugador((short) 52, "Bradley Ernest ", "Davis", (byte) 15, "Brad Davis", (byte) 16);
		Jugador rolandoBlackman = new Jugador((short) 53, "Rolando  Antonio", "Price", (byte) 22, "Ro Blackman",
				(byte) 16);
		Jugador dirkNowitzki = new Jugador((short) 54, "Dirk", "Werner Nowitzki", (byte) 41, "Wunderkind", (byte) 16);

		Jugador alexEnglish = new Jugador((short) 55, "Alexander", "English", (byte) 2, "Alex English", (byte) 17);
		Jugador fatLever = new Jugador((short) 56, "Lafayette ", "Lever", (byte) 12, "Fat Lever", (byte) 17);
		Jugador davidThompson = new Jugador((short) 57, "David ONeil", "Thompson", (byte) 33, (byte) 17);
		Jugador byronbeck = new Jugador((short) 58, "Byrin", "Beck", (byte) 40, (byte) 17);
		Jugador danIssel = new Jugador((short) 59, "Daniel Paul ", "Issel", (byte) 44, "Dan Issel", (byte) 17);
		Jugador dikembeMutomboNuggets = new Jugador((short) 60, "Dikembe", "Mutombo", (byte) 55, (byte) 17);
		Jugador dougMoe = new Jugador((short) 61, "Douglas Edwin", "Moe", (byte) 432, "Doug Moe", (byte) 17);

		Jugador chaunceyBillups = new Jugador((short) 62, "Chauncey", "Billups", (byte) 1, "Mr. Big Shot", (byte) 7);
		Jugador chuckDaily = new Jugador((short) 63, "Charles Jerome ", "Daily", (byte) 2, "Chuck Daly", (byte) 7);
		Jugador benWallace = new Jugador((short) 64, "Ben", "Wallace", (byte) 6, "Big Ben", (byte) 7);
		Jugador joeDumars = new Jugador((short) 65, "Joe", "Dumars", (byte) 4, "Joe-D", (byte) 7);
		Jugador dennisRodman = new Jugador((short) 66, "Dennis Keith", "Rodman", (byte) 10, "The Worm", (byte) 7);
		Jugador isaiahThomas = new Jugador((short) 67, "Isiah Lord", "Thomas", (byte) 11, "Zeke", (byte) 7);
		Jugador vinnieJhonson = new Jugador((short) 68, "Vincent", "Jhonson", (byte) 15, "Microwave", (byte) 7);
		Jugador bobLanier = new Jugador((short) 69, "Robert Jerry", "Lanier", (byte) 16, "Bob Lanier", (byte) 7);
		Jugador daveBing = new Jugador((short) 70, "David ", "Bing", (byte) 21, "Duke", (byte) 7);
		Jugador richardHamilton = new Jugador((short) 71, "Richard Clay", "Hamilton", (byte) 32, "The Man in the Mask",
				(byte) 7);
		Jugador billLaimbeer = new Jugador((short) 72, "William J.", "Laimbeer", (byte) 40, "Bill Laimbeer", (byte) 7);

		Jugador wiltChamberlain = new Jugador((short) 73, "Wilton Norman", "Chamberlain", (byte) 13, "Wilt the Stilt",
				(byte) 18);
		Jugador thomMeschery = new Jugador((short) 74, "Thomas Nicholas  ", "Meschery", (byte) 14, "Thom Meschery",
				(byte) 18);
		Jugador alAttles = new Jugador((short) 75, "Alvin", "Attles", (byte) 16, "Destroyer", (byte) 18);
		Jugador chrisMullin = new Jugador((short) 76, "Christopher Paul", "Dumars", (byte) 17, "Chris Mullin",
				(byte) 18);
		Jugador rickBarry = new Jugador((short) 77, "Richard Francis Dennis", "Barry |||", (byte) 24, "Greyhound",
				(byte) 18);
		Jugador nateThurmondWarriors = new Jugador((short) 78, "Nathaniel", "Thurmond", (byte) 42, "Nate the Great",
				(byte) 18);

		Jugador yaoMing = new Jugador((short) 79, "Yao", "Ming", (byte) 11, "Yaos dinasty", (byte) 19);
		Jugador clydeDrexler = new Jugador((short) 80, "Clyde Austin", "Drexler ", (byte) 22, "The Glide", (byte) 19);
		Jugador calvinMurphy = new Jugador((short) 81, "Calvin Jerome", "Murphy ", (byte) 23, "Destroyer", (byte) 19);
		Jugador mosesMalone = new Jugador((short) 82, "Moses Eugene", "Malone", (byte) 24, "Moses Malone", (byte) 19);
		Jugador hakeemOlajuwon = new Jugador((short) 83, "Hakeem Abdul", "Olajuwon", (byte) 34, "The Dream", (byte) 19);
		Jugador rudyTomjanovich = new Jugador((short) 84, "Rudolph ", "Tomjanovich", (byte) 45, "Rudy Tomjanovich",
				(byte) 19);

		Jugador georgemcGinnis = new Jugador((short) 85, "George", "McGinnis", (byte) 30, (byte) 8);
		Jugador reggieMiller = new Jugador((short) 86, "Reginald Wayne", "Miller ", (byte) 31, "Miller Time", (byte) 8);
		Jugador melDaniels = new Jugador((short) 87, "Melvin Joe", "Daniels ", (byte) 34, "Melvin Joe", (byte) 8);
		Jugador rogerBrown = new Jugador((short) 88, "Roger William", "Brown", (byte) 35, "The Rajah", (byte) 8);
		Jugador slickLeonard = new Jugador((short) 89, "William Robert", "Leonard", (byte) 529, "Slick Leonard",
				(byte) 8);

		Jugador kobe8 = new Jugador((short) 90, "Kobe ", "Bryant", (byte) 8, "Black mamba", (byte) 21);
		Jugador wiltChamberlainLakers = new Jugador((short) 91, "Wilton Norman", "Chamberlain", (byte) 13,
				"Wilt the Stilt", (byte) 21);
		Jugador elginBaylor = new Jugador((short) 92, "Elgin Gay", "Baylor ", (byte) 22, "Elgin Baylor", (byte) 21);
		Jugador kobe24 = new Jugador((short) 93, "Kobe ", "Bryant", (byte) 24, "Black mamba", (byte) 21);
		Jugador gailGoodrich = new Jugador((short) 94, "Gail Charles", "Goodrich", (byte) 25, "The Stump", (byte) 21);
		Jugador magicJhonson = new Jugador((short) 95, "Earvin", "Jhonson", (byte) 32, "Magic Jhonson", (byte) 21);
		Jugador kareemAbdulJabbar = new Jugador((short) 96, "Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook",
				(byte) 21);
		Jugador shaquilleOneal = new Jugador((short) 97, "Shaquille Rashaun", "O Neal ", (byte) 34, "Shaq Attack",
				(byte) 21);
		Jugador jamesWorthy = new Jugador((short) 98, "James Ager ", "Worthy", (byte) 42, "Big Game James", (byte) 21);
		Jugador jerryWest = new Jugador((short) 99, "Jerome Alan", "West", (byte) 44, "The Logo", (byte) 21);
		Jugador jamalWilkes = new Jugador((short) 100, "Jamaal Abdul-Lateef", "Wilkes", (byte) 52, "Smooth as Silk",
				(byte) 21);
		Jugador jimPollard = new Jugador((short) 101, "James Clifford", "Pollard", (byte) 17, "The Kangaroo Kid",
				(byte) 21);
		Jugador vernMikelsen = new Jugador((short) 102, "Arild Verner Agerskov", "Mikkelsen", (byte) 19,
				"Ven Mikkelsen", (byte) 21);
		Jugador slaterMartin = new Jugador((short) 103, "Slater Nelson", "Martin", (byte) 22, "Dugie", (byte) 21);
		Jugador clydeLovellete = new Jugador((short) 104, "Clyde Edward", "Lovellette", (byte) 34, "Clyde Lovellette",
				(byte) 21);
		Jugador georgeMikan = new Jugador((short) 105, "George Lawrence", "Mikan", (byte) 99, "Mr. Basketball",
				(byte) 21);

		Jugador zachRandolph = new Jugador((short) 106, "Zachary McKenley", "Randolph", (byte) 50, "Z-Bo", (byte) 24);

		Jugador chrisBosh = new Jugador((short) 107, "Christopher Wesson ", "Bosh", (byte) 1, "Boshasaurus", (byte) 9);
		Jugador dwayneWade = new Jugador((short) 108, "Dwyane Tyrone", "Wade ", (byte) 3, "Flash", (byte) 9);
		Jugador timHardaway = new Jugador((short) 109, "Timothy Duane", "Hardaway", (byte) 10, "Tim Bug", (byte) 9);
		Jugador danMarino = new Jugador((short) 110, "Daniel Constantine ", "Marino", (byte) 13, (byte) 9);
		Jugador michaelJordanHeat = new Jugador((short) 111, "Michael", "Jordan", (byte) 23, "Air Jordan", (byte) 9);
		Jugador shaquilleOnealHeat = new Jugador((short) 112, "Shaquille Rashaun", "O Neal ", (byte) 32, "Shaq Attack",
				(byte) 9);
		Jugador alonzoMourning = new Jugador((short) 113, "Alonzo Harding ", "Mourning", (byte) 33, "Zo", (byte) 9);

		Jugador oscarRobertson = new Jugador((short) 114, "Oscar Palmer", "Robertson", (byte) 1, "Mr.Triple-Double",
				(byte) 10);
		Jugador juniorBridgeman = new Jugador((short) 115, "Ulysses Lee", "Bridgeman ", (byte) 2, "Junior Bridgeman",
				(byte) 10);
		Jugador sidneyMoncrief = new Jugador((short) 116, "Sidney Alvin", "Moncrief", (byte) 4, "The squid", (byte) 10);
		Jugador marquesJhonson = new Jugador((short) 117, "Marques Kevin", "Johnson", (byte) 8, "Slammer", (byte) 10);
		Jugador jonMcGlockin = new Jugador((short) 118, "Jon P.", "McGlockin", (byte) 14, "Jonny Mac", (byte) 10);
		Jugador bobLanierBucks = new Jugador((short) 119, "Robert Jerry", "Lanier", (byte) 16, "Bob Lanier", (byte) 10);
		Jugador brianWinters = new Jugador((short) 120, "Brian Joseph", "Winters", (byte) 32, "Lurch", (byte) 10);
		Jugador kareemAbdulJabbarBucks = new Jugador((short) 121, "Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook",
				(byte) 10);

		Jugador malikSealy = new Jugador((short) 122, "Malik", "Sealy", (byte) 2, "Silk", (byte) 22);

		Jugador peteMaravichPelicans = new Jugador((short) 123, "Pete", "Maravich", (byte) 7, "Pistol Pete", (byte) 23);

		Jugador waltFrazier = new Jugador((short) 124, "Walter", "Frazier", (byte) 10, "Clyde", (byte) 11);
		Jugador dickBarnet = new Jugador((short) 125, "Richard", "Barnett ", (byte) 12, "Dick Barnett", (byte) 11);
		Jugador earlMonroe = new Jugador((short) 126, "Vernon Earl", "Monroe", (byte) 15, "The Pearl", (byte) 11);
		Jugador dickMcGuire = new Jugador((short) 127, "Richard Josephn", "McGuire", (byte) 15, "Dick the Knick",
				(byte) 11);
		Jugador willisReed = new Jugador((short) 128, "Willis", "Reed", (byte) 19, (byte) 11);
		Jugador daveDeBusschere = new Jugador((short) 129, "David Albert", "DeBusschere", (byte) 22, "Big D",
				(byte) 11);
		Jugador billBradley = new Jugador((short) 130, "William Warren ", "Bradley", (byte) 24, "Bill Bradley",
				(byte) 11);
		Jugador patrickEwing = new Jugador((short) 131, "Patrick Aloysius", "Ewing", (byte) 33, "Big Pat", (byte) 11);
		Jugador redHolzman = new Jugador((short) 132, "William", "Holzman", (byte) 613, "Big D", (byte) 11);

		Jugador aficion = new Jugador((short) 133, "Afición", "", (byte) 6, (byte) 12);

		Jugador mosesMalonePhilly = new Jugador((short) 134, "Moses Eugene", "Malone", (byte) 2, "Moses Malone",
				(byte) 13);
		Jugador allenIverson = new Jugador((short) 135, "Allen Ezail", "Iverson ", (byte) 3, "The Answer", (byte) 13);
		Jugador juliusErvingPhilly = new Jugador((short) 136, "Julius Winfield", "Earving ||", (byte) 6, "Dr J",
				(byte) 13);
		Jugador mauriceCheeks = new Jugador((short) 137, "Maurice Edward", "Cheeks", (byte) 10, "Little Mo", (byte) 13);
		Jugador wiltChamberlainSixers = new Jugador((short) 138, "Wilton Norman", "Chamberlain", (byte) 13,
				"Wilt the Stilt", (byte) 13);
		Jugador halGreer = new Jugador((short) 139, "Harold Everett", "Greer", (byte) 15, "Hal Greer", (byte) 13);
		Jugador bobbyJones = new Jugador((short) 140, "Robert Clyde", "Jones", (byte) 22, "Bobby Jones", (byte) 13);
		Jugador billyChunningham = new Jugador((short) 141, "William John", "Cunningham ", (byte) 32, "Bily Cunningham",
				(byte) 13);
		Jugador charlesBarkley = new Jugador((short) 142, "Charles Wade", "Barkley", (byte) 34, "El Gordo", (byte) 13);

		Jugador dickVanArsdale = new Jugador((short) 143, "Richard Albert", "Van Arsdale", (byte) 5, "Dick Van Arsdale",
				(byte) 26);
		Jugador walterDavis = new Jugador((short) 144, "Walter Paul", "Davis ", (byte) 6, "Sweet D", (byte) 26);
		Jugador kevinJhonson = new Jugador((short) 145, "Kevin Maurice", "Jhonson", (byte) 7, "K.J", (byte) 26);
		Jugador danMajerle = new Jugador((short) 146, "Daniel Lewis", "Majerle", (byte) 9, "Thunder Dan", (byte) 26);
		Jugador steveNash = new Jugador((short) 147, "Stephen John", "Nash", (byte) 13, "Nasty Nash", (byte) 26);
		Jugador tomChambers = new Jugador((short) 148, "Thomas Doane", "Chambers ", (byte) 24, "Tommy Gun", (byte) 26);
		Jugador alvanAdams = new Jugador((short) 149, "Alvan Leigh", "Adams  ", (byte) 33, "Double A", (byte) 26);
		Jugador charlesBarkleySuns = new Jugador((short) 150, "Charles Wade", "Barkley", (byte) 34, "El Gordo",
				(byte) 26);
		Jugador connieHawkins = new Jugador((short) 151, "Cornelius ", "Hawkins", (byte) 42, "The Hawk", (byte) 26);
		Jugador paulWestphal = new Jugador((short) 152, "Paul Douglas", "Westphal ", (byte) 44, "Paul Westphal",
				(byte) 26);
		Jugador cottonFitzsimmons = new Jugador((short) 153, "Lowell", "Fitzsimmons ", (byte) 42, "Cotton Fitzsimmons",
				(byte) 26);

		Jugador larryWeinberg = new Jugador((short) 154, "Larry", "Weinberg", (byte) 1, (byte) 27);
		Jugador davidTwardzik = new Jugador((short) 155, "David", "Twardzik", (byte) 13, (byte) 27);
		Jugador lionelHollins = new Jugador((short) 156, "Lionel Eugene", "Hollins", (byte) 14, "L-Train", (byte) 27);
		Jugador larrySteele = new Jugador((short) 157, "Maurice D.", "Steele ", (byte) 15, "Man of steele", (byte) 27);
		Jugador mauriceLucas = new Jugador((short) 158, "Stephen John", "Lucas", (byte) 20, "Mo Lucas", (byte) 27);
		Jugador clydeDrexlerBlazers = new Jugador((short) 159, "Clyde Austin", "Drexler ", (byte) 22, "The Glide",
				(byte) 27);
		Jugador bobGross = new Jugador((short) 160, "Robert Edwin", "Gross ", (byte) 30, "Bob Gross", (byte) 27);
		Jugador terryPorter = new Jugador((short) 161, "Terry", "Porter", (byte) 30, (byte) 27);
		Jugador billWalton = new Jugador((short) 162, "William Theodore", "Walton", (byte) 32, "Big Red-Head",
				(byte) 27);
		Jugador lloydNeal = new Jugador((short) 163, "Lloyd ", "Neal ", (byte) 36, (byte) 27);
		Jugador geoffPetrie = new Jugador((short) 164, "Geoffrey Michael", "Petrie ", (byte) 45, "Geoff Petrie",
				(byte) 27);
		Jugador jackRamsay = new Jugador((short) 165, "Dr. John T.", "Ramsay ", (byte) 77, (byte) 27);

		Jugador nateArchibal = new Jugador((short) 166, "Nathaniel", "Archibald", (byte) 1, "Nate Tiny Archibald",
				(byte) 28);
		Jugador mithcRichmond = new Jugador((short) 167, "Mitchell James", "Richmond", (byte) 2, "Hammer", (byte) 28);
		Jugador chrisWebber = new Jugador((short) 168, "Mayce Edward Christopher", "Webber ", (byte) 4, "Chris Webber",
				(byte) 28);
		Jugador aficionKings = new Jugador((short) 169, "Afición", "", (byte) 6, (byte) 28);
		Jugador bobDavies = new Jugador((short) 170, "Robert Edris", "Davies", (byte) 11, "The Harrisburg Houdini",
				(byte) 28);
		Jugador mauriceStokes = new Jugador((short) 171, "Maurice", "Stokes", (byte) 12, "Mo Stokes", (byte) 28);
		Jugador oscarRobertsonKings = new Jugador((short) 172, "Oscar Palmer", "Robertson", (byte) 14,
				"Mr.Triple-Double", (byte) 28);
		Jugador predragStojakovic = new Jugador((short) 173, "Predrag Peđa", "Stojaković", (byte) 16, "Peja Stojaković",
				(byte) 28);
		Jugador vladeDivac = new Jugador((short) 174, "Vlade", "Divac", (byte) 21, "Vittorio Gassman", (byte) 28);
		Jugador jackTwynam = new Jugador((short) 175, "John Kennedy", "Twyman", (byte) 27, "Jack Twyman", (byte) 28);
		Jugador samLacey = new Jugador((short) 176, "Samuel", "Lacey ", (byte) 44, "Slammin Sam", (byte) 28);

		Jugador jhonnyMoore = new Jugador((short) 177, "John Brian", "Moore", (byte) 00, "Johnny Moore", (byte) 29);
		Jugador averyJhonson = new Jugador((short) 178, "Avery", "Johnson", (byte) 6, "Taz", (byte) 29);
		Jugador tonyParker = new Jugador((short) 179, "William Anthony", "Parker ", (byte) 9, "Parisian Torpedo",
				(byte) 29);
		Jugador bruceBowen = new Jugador((short) 180, "Bruce Eric", "Bowen", (byte) 12, (byte) 29);
		Jugador jamesSilas = new Jugador((short) 181, "James Edward", "Silas", (byte) 13, "Captain Late", (byte) 29);
		Jugador manuGinobii = new Jugador((short) 182, "Emanuel David", "Ginóbili", (byte) 20, "Manu Ginóbili",
				(byte) 29);
		Jugador timDuncan = new Jugador((short) 183, "Timothy Theodore", "Duncan", (byte) 21, "The Big Fundamental",
				(byte) 29);
		Jugador seanElliot = new Jugador((short) 184, "Sean", "Elliott", (byte) 32, (byte) 29);
		Jugador georgeGervin = new Jugador((short) 185, "George", "Gervin", (byte) 44, "The Iceman", (byte) 29);
		Jugador davidRobinson = new Jugador((short) 186, "David Maurice", "Robinson", (byte) 50, "The Admiral",
				(byte) 29);

		Jugador gusWilliams = new Jugador((short) 187, "Gus", "Williams", (byte) 1, "The Wizard", (byte) 25);
		Jugador nickCollison = new Jugador((short) 188, "Nicholas John", "Collison", (byte) 4, (byte) 25);
		Jugador nateMcMillan = new Jugador((short) 189, "Nathaniel", "McMillan", (byte) 10, "Nate McMillan", (byte) 25);
		Jugador lennyWilkens = new Jugador((short) 190, "Leonard Randolph", "Wilkens", (byte) 19, "Lenny Wilkens",
				(byte) 25);
		Jugador spencerHaywood = new Jugador((short) 191, "Spencer", "Haywood", (byte) 24, (byte) 25);
		Jugador fredBrwon = new Jugador((short) 192, "Fred", "Brown", (byte) 32, "Downtown", (byte) 25);
		Jugador jackSikman = new Jugador((short) 193, "Jack Wayne", "Sikma", (byte) 44, "Goldilocks", (byte) 25);

		Jugador frankLayden = new Jugador((short) 194, "Frank", "Layden", (byte) 1, (byte) 30);
		Jugador adrianDantley = new Jugador((short) 195, "Adrian Delano", "Dantley", (byte) 4, "The teacher",
				(byte) 30);
		Jugador peteMaravichJazz = new Jugador((short) 196, "Pete", "Maravich", (byte) 7, "Pistol Pete", (byte) 30);
		Jugador johnStockton = new Jugador((short) 197, "John", "Stockton", (byte) 12, (byte) 30);
		Jugador jeffHornacek = new Jugador((short) 198, "Jeffrey John", "Hornacek", (byte) 14, "Horny", (byte) 30);
		Jugador karlMalone = new Jugador((short) 199, "Karl", "Malone", (byte) 32, "The Mailman", (byte) 30);
		Jugador darrelGriffith = new Jugador((short) 200, "Darrell Steven", "Griffith", (byte) 35, "Dr. Dunkenstein",
				(byte) 30);
		Jugador markEaton = new Jugador((short) 201, "Mark", "Eaton", (byte) 53, (byte) 30);
		Jugador geraldSloan = new Jugador((short) 202, "Gerald Eugene", "Sloan", (byte) 1223, "Jerry Sloan", (byte) 30);

		Jugador earlMonroeWizards = new Jugador((short) 203, "Vernon Earl", "Monroe", (byte) 10, "The Pearl",
				(byte) 15);
		Jugador elvinHayes = new Jugador((short) 204, "Elvin Ernest", "Hayes", (byte) 11, "The Big E", (byte) 15);
		Jugador gusJohnson = new Jugador((short) 205, "Gus", "Johnson", (byte) 25, "Honeycomb", (byte) 15);
		Jugador wesUnseld = new Jugador((short) 206, "Westley Sissel", "Unseld", (byte) 41, "Wes Unseld", (byte) 15);
		Jugador philChenier = new Jugador((short) 207, "Philip ", "Chenier ", (byte) 45, "Phil Chenier", (byte) 15);

		Jugador traeYoung = new Jugador((short) 208, "Trae", "Young", (byte) 11, "Ice Trae", Posicion.BASE, 8.32f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 1, (byte) 1);
		Jugador jhonCollins = new Jugador((short) 209, "Jhon", "Collins", (byte) 20, Posicion.PIVOT, 23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador bogdanBogdanovich = new Jugador((short) 210, "Bogdan", "Bogdanovich", (byte) 13, Posicion.ESCOLTA, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador deandreHunter = new Jugador((short) 211, "De Andre", "Hunter", (byte) 12, Posicion.ALAPIVOT, 7.75f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador kevinHuerter = new Jugador((short) 212, "Kevin", "Huerter", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 1, (byte) 1);

		Jugador jaysonTatum = new Jugador((short) 213, "Jason", "Tatum", (byte) 0, "JT", Posicion.ALERO, 28.2f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.A, Valores.B, Valores.B, (byte) 2, (byte) 1);
		Jugador jaylenBrown = new Jugador((short) 214, "Jaylen", "Brown", (byte) 7, Posicion.ESCOLTA, 26.76f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.A, Valores.C, Valores.B, (byte) 2, (byte) 1);
		Jugador marcusSmart = new Jugador((short) 215, "Marcus", "Smart", (byte) 16, Posicion.BASE, 14.36f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.A, (byte) 2, (byte) 1);
		Jugador alHorfort = new Jugador((short) 216, "Al", "Horford", (byte) 42, Posicion.ALAPIVOT, 27f, (byte) 5,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 29, Valores.C,
				Valores.B, Valores.C, Valores.A, (byte) 2, (byte) 1);
		Jugador robertWilliams = new Jugador((short) 217, "Robert", "Williams ||| ", (byte) 44, Posicion.PIVOT, 3.36f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 2, (byte) 1);

		Jugador kevinDurant = new Jugador((short) 218, "Kevin", "Durant", (byte) 7, "Durantula", Posicion.ALAPIVOT,
				42.01f, (byte) 12, (byte) 2, (byte) 1, (byte) 0, true, false, (byte) 2, (byte) 2, (byte) 4,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.A, Valores.A, Valores.A, Valores.B, (byte) 3, (byte) 1);
		Jugador sethCurry = new Jugador((short) 219, "Seth", "Curry", (byte) 30, Posicion.ESCOLTA, 8.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.C, (byte) 3, (byte) 1);
		Jugador bruceBrown = new Jugador((short) 220, "Bruce", "Brown", (byte) 1, Posicion.ALERO, 4.73f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 3, (byte) 1);
		Jugador kyrieIrving = new Jugador((short) 221, "Kyrie", "Irving", (byte) 11, "Uncle Drew", Posicion.BASE,
				35.34f, (byte) 7, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.B, Valores.D, (byte) 3, (byte) 1);
		Jugador lamarcusAldridge = new Jugador((short) 222, "Lamarcus", "Aldridge", (byte) 2, Posicion.PIVOT, 2.64f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 3, (byte) 1);

		Jugador lameloBall = new Jugador((short) 223, "LaMelo", "Ball", (byte) 2, Posicion.BASE, 8.32f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 4, (byte) 1);
		Jugador milesBridges = new Jugador((short) 224, "Miles", "Bridges", (byte) 0, Posicion.ALERO, 5.56f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.C, Valores.B, (byte) 4, (byte) 1);
		Jugador terryRozier = new Jugador((short) 225, "Terry", "Rozier", (byte) 13, "Scary Terry", Posicion.ESCOLTA,
				18f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.B, Valores.B, Valores.D, (byte) 4, (byte) 1);
		Jugador gordonHayward = new Jugador((short) 226, "Gordon", "Hayward", (byte) 20, Posicion.ALAPIVOT, 29.92f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 4, (byte) 1);
		Jugador montrezlHarrel = new Jugador((short) 227, "Montrezl", "Harrel", (byte) 8, "Trezz", Posicion.ALERO, 4.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 4, (byte) 1);

		Jugador lonzoBall = new Jugador((short) 228, "Lonzo", "Ball", (byte) 2, Posicion.BASE, 18.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.A, Valores.A, (byte) 5, (byte) 1);
		Jugador demarDeRozan = new Jugador((short) 229, "Demar", "DeRozan", (byte) 10, "King of the Fourth",
				Posicion.ALERO, 26f, (byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36,
				Valores.A, Valores.A, Valores.C, Valores.C, (byte) 5, (byte) 1);
		Jugador nikolaVucevic = new Jugador((short) 230, "Nikola", "Vucevic", (byte) 9, Posicion.PIVOT, 24f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 5, (byte) 1);
		Jugador zachLavine = new Jugador((short) 231, "Zach", "LaVine", (byte) 8, Posicion.ESCOLTA, 19.5f, (byte) 2,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.C, Valores.D, (byte) 5, (byte) 1);
		Jugador patrickWilliams = new Jugador((short) 232, "Patrick", "Williams", (byte) 44, Posicion.ALAPIVOT, 7.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 5, (byte) 1);

		Jugador jarretAllen = new Jugador((short) 233, "Jarret", "Allen", (byte) 31, Posicion.PIVOT, 20, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.D, Valores.D, Valores.A, (byte) 6, (byte) 1);
		Jugador dariusGarland = new Jugador((short) 234, "Darius", "Garland", (byte) 10, Posicion.BASE, 10, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 6, (byte) 1);
		Jugador evanMoblaey = new Jugador((short) 235, "Evan", "Mobley", (byte) 4, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 1);
		Jugador carisLeVert = new Jugador((short) 236, "Caris", "LeVert", (byte) 3, Posicion.ESCOLTA, 17.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 1);
		Jugador lauriMarkkanen = new Jugador((short) 237, "Lauri", "Markkanen", (byte) 24, Posicion.ALAPIVOT, 15.69f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 1);

		Jugador lukaDoncic = new Jugador((short) 238, "Luka", "Doncic", (byte) 77, "Luka Magic", Posicion.BASE, 10.74f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.A, Valores.C, (byte) 16, (byte) 1);
		Jugador jalenBrunson = new Jugador((short) 239, "Jalen", "Brunson", (byte) 13, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.B, Valores.C, (byte) 16, (byte) 1);
		Jugador spencerDinwiddie = new Jugador((short) 240, "Spencer", "Dinwiddie", (byte) 21, Posicion.ALERO, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 16, (byte) 1);
		Jugador dorianFinneySmith = new Jugador((short) 241, "Dorian", "Finney-Smith", (byte) 10, Posicion.PIVOT, 4,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.D, Valores.A, (byte) 16, (byte) 1);
		Jugador reggieBullock = new Jugador((short) 242, "Reggie", "Bulloc", (byte) 25, Posicion.ALAPIVOT, 9.53f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 16, (byte) 1);

		Jugador willBarton = new Jugador((short) 243, "William", "Barton", (byte) 5, "Will", Posicion.ALERO, 15.62f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.C, (byte) 17, (byte) 1);
		Jugador aaronGordon = new Jugador((short) 244, "Aaron", "Gordon", (byte) 50, Posicion.ALAPIVOT, 16.4f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.B, (byte) 17, (byte) 1);
		Jugador nikolaJokic = new Jugador((short) 245, "Nikola", "Jokic", (byte) 15, Posicion.PIVOT, 31.58f, (byte) 4,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.A, Valores.B, (byte) 17, (byte) 1);
		Jugador jamalMurray = new Jugador((short) 246, "Jamal", "Murray", (byte) 27, Posicion.ESCOLTA, 29.67F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.B, Valores.C, (byte) 17, (byte) 1);
		Jugador monteMorris = new Jugador((short) 247, "Monte", "Morris", (byte) 11, Posicion.BASE, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.D, (byte) 17, (byte) 1);

		Jugador cadeCunningham = new Jugador((short) 248, "Cade", "Cunningham", (byte) 2, Posicion.BASE, 10.05f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.C, Valores.B, Valores.D, (byte) 7, (byte) 1);
		Jugador marvinBagley = new Jugador((short) 249, "Marvin", "Bagley", (byte) 35, Posicion.PIVOT, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 7, (byte) 1);
		Jugador sadiqqBey = new Jugador((short) 250, "Sadiqq", "Bey", (byte) 41, Posicion.ALERO, 2.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 7, (byte) 1);
		Jugador hamidouDiallo = new Jugador((short) 251, "Hamidou", "Diallo", (byte) 6, Posicion.ESCOLTA, 5.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 7, (byte) 1);
		Jugador jeramiGrant = new Jugador((short) 252, "Jerami", "Grant", (byte) 9, Posicion.ALAPIVOT, 20f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 7, (byte) 1);

		Jugador stephenCurry = new Jugador((short) 253, "Stephen", "Curry", (byte) 30, "Chef Curry", Posicion.BASE,
				45.78f, (byte) 8, (byte) 3, (byte) 2, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34,
				Valores.A, Valores.A, Valores.A, Valores.D, (byte) 18, (byte) 1);
		Jugador klayThompson = new Jugador((short) 254, "Klay", "Thompson", (byte) 11, Posicion.ESCOLTA, 37.98f,
				(byte) 5, (byte) 3, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 18, (byte) 1);
		Jugador draymondGreen = new Jugador((short) 255, "Draymond", "Green", (byte) 13, Posicion.PIVOT, 24, (byte) 4,
				(byte) 3, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.A, Valores.A, (byte) 18, (byte) 1);
		Jugador andrewWiggins = new Jugador((short) 256, "Andrew", "Wiggins", (byte) 22, Posicion.ALAPIVOT, 31.57F,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 18, (byte) 1);
		Jugador jordanPoole = new Jugador((short) 257, "Jordan", "Poole", (byte) 3, Posicion.ALERO, 2.16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 18, (byte) 1);

		Jugador christianWood = new Jugador((short) 258, "Christian", "Wood", (byte) 35, Posicion.PIVOT, 13.6F,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 19, (byte) 1);
		Jugador jalenGreen = new Jugador((short) 259, "Jalen", "Green", (byte) 0, Posicion.BASE, 23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.D, Valores.D, (byte) 19, (byte) 1);
		Jugador kpj = new Jugador((short) 260, "Kevin", "Porter Jr", (byte) 3, Posicion.ALERO, 1.78F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.D, Valores.C, (byte) 19, (byte) 1);
		Jugador ericGordon = new Jugador((short) 261, "Eric", "Gordon", (byte) 10, Posicion.ESCOLTA, 18.12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.B, (byte) 19, (byte) 1);
		Jugador jaseanTate = new Jugador((short) 262, "Jae Sean", "Tate", (byte) 8, Posicion.ALAPIVOT, 1.57f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 19, (byte) 1);

		Jugador malcomBrogdon = new Jugador((short) 263, "Malcom", "Brogdon", (byte) 7, Posicion.BASE, 21.7f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 8, (byte) 1);
		Jugador tyreseHaliburton = new Jugador((short) 264, "Tyrese", "halliburton", (byte) 0, Posicion.ESCOLTA, 4.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.A, Valores.C, Valores.C, (byte) 8, (byte) 1);
		Jugador buddyHield = new Jugador((short) 265, "Chavano Rainier", "Hield", (byte) 24, "Buddy Hield",
				Posicion.ALERO, 23.08F, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.B, Valores.A, Valores.C, Valores.B, (byte) 8, (byte) 1);
		Jugador jalenSmith = new Jugador((short) 266, "Jalen", "Smith", (byte) 25, Posicion.ALAPIVOT, 4.48f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.C, (byte) 8, (byte) 1);
		Jugador mylesTurner = new Jugador((short) 267, "Myles", "Turner", (byte) 33, Posicion.PIVOT, 18, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 8, (byte) 1);

		Jugador russelWestbrook = new Jugador((short) 268, "Russel", "Westbrook", (byte) 0, "Westbrick", Posicion.BASE,
				44.21f, (byte) 9, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 2, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.D, Valores.A, Valores.D, (byte) 21, (byte) 1);
		Jugador carmeloAnthony = new Jugador((short) 269, "Carmelo Kyam", "Anthony", (byte) 7, "Melo", Posicion.ALERO,
				2.64f, (byte) 10, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26,
				Valores.B, Valores.A, Valores.C, Valores.D, (byte) 21, (byte) 1);
		Jugador malikMonk = new Jugador((short) 270, "Malik", "Monk", (byte) 11, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.D, (byte) 21, (byte) 1);
		Jugador leBronJames = new Jugador((short) 271, "LeBron", "James", (byte) 6, "King James", Posicion.ALAPIVOT,
				41.18f, (byte) 18, (byte) 4, (byte) 4, (byte) 0, true, false, (byte) 3, (byte) 4, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.A, Valores.A, (byte) 21, (byte) 1);
		Jugador anthonyDavis = new Jugador((short) 272, "Anthony", "Davis", (byte) 3, "The Brow", Posicion.ALAPIVOT,
				35.36f, (byte) 8, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.A, Valores.B, Valores.C, Valores.A, (byte) 21, (byte) 1);

		Jugador dilonBrooks = new Jugador((short) 273, "Dilon", "Brooks", (byte) 24, Posicion.ALAPIVOT, 12.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.A,
				Valores.B, Valores.C, Valores.A, (byte) 24, (byte) 1);
		Jugador desmondBane = new Jugador((short) 274, "Desmond Michael", "Bane", (byte) 22, Posicion.ESCOLTA, 2.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 30, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 24, (byte) 1);
		Jugador jaMorant = new Jugador((short) 275, "Temetrius Jamel", "Morant", (byte) 12, "Ja Morant", Posicion.BASE,
				.603f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, true, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.B, Valores.C, Valores.C, (byte) 24, (byte) 1);
		Jugador brandonClarke = new Jugador((short) 276, "Brandon", "Clarke", (byte) 15, Posicion.ALERO, 2.72f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 19, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 24, (byte) 1);
		Jugador stevenAdams = new Jugador((short) 277, "Steven", "Adams", (byte) 4, Posicion.PIVOT, 17, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B,
				Valores.D, Valores.C, Valores.A, (byte) 24, (byte) 1);

		Jugador jimmyButler = new Jugador((short) 278, "Jimmy", "Butler", (byte) 22, "Jimmy Buckets", Posicion.ALERO,
				36.01f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 39,
				Valores.A, Valores.C, Valores.B, Valores.A, (byte) 9, (byte) 1);
		Jugador bamAdebayo = new Jugador((short) 279, "Edrice Femi", "Adebayo", (byte) 5, "Bam", Posicion.PIVOT, 28.1f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.A, (byte) 9, (byte) 1);
		Jugador kyleLowry = new Jugador((short) 280, "Kyle", "Lowry", (byte) 7, Posicion.BASE, 26.98f, (byte) 6,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 9, (byte) 1);
		Jugador maxStrus = new Jugador((short) 281, "Max", "Strus", (byte) 31, Posicion.ESCOLTA, 1.67f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 9, (byte) 1);
		Jugador pjTucker = new Jugador((short) 282, "Anthony Leon", "Huerter", (byte) 3, "PJ Tucker", Posicion.ALAPIVOT,
				7f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.C, Valores.C, Valores.C, Valores.A, (byte) 9, (byte) 1);

		Jugador giannisAntetokoumpo = new Jugador((short) 283, "Giannis Ougko", "Antetokounmpo", (byte) 34,
				"The Greek Freak", Posicion.ALAPIVOT, 39.34f, (byte) 6, (byte) 1, (byte) 2, (byte) 1, false, true,
				(byte) 1, (byte) 1, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
				r.nextInt(5) + 1, (byte) 32, Valores.A, Valores.C, Valores.B, Valores.A, (byte) 10, (byte) 1);
		Jugador graysonAllen = new Jugador((short) 284, "Grayson", "Allen", (byte) 7, Posicion.ESCOLTA, 4, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.B, Valores.B, (byte) 10, (byte) 1);
		Jugador brookLopez = new Jugador((short) 285, "Brook", "Lopez", (byte) 11, Posicion.PIVOT, 13.3F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 10, (byte) 1);
		Jugador jrueHoliday = new Jugador((short) 286, "Jrue", "Holiday", (byte) 12, Posicion.BASE, 32.43f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.B, Valores.A, (byte) 10, (byte) 1);
		Jugador khrisMiddleton = new Jugador((short) 287, "Khris", "Middleton", (byte) 22, Posicion.ALERO, 33.5f,
				(byte) 3, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 10, (byte) 1);

		Jugador anthonyEdwards = new Jugador((short) 288, "Anthony", "Edwards", (byte) 1, "Ant", Posicion.ALERO, 10.25f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.B, (byte) 22, (byte) 1);
		Jugador malikBeasly = new Jugador((short) 289, "Malik", "Beasly", (byte) 5, Posicion.ESCOLTA, 14.91f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 22, (byte) 1);
		Jugador patrickBeverly = new Jugador((short) 290, "Patrick", "Beverly", (byte) 22, Posicion.BASE, 14.32f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 22, (byte) 1);
		Jugador kat = new Jugador((short) 291, "Karl-Anthony", "Towns Cruz", (byte) 32, Posicion.PIVOT, 31.65f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.D, Valores.B, (byte) 22, (byte) 1);
		Jugador jadenMcDanields = new Jugador((short) 293, "Jaden", "McDanields", (byte) 3, Posicion.ALAPIVOT, 2.06f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 22, (byte) 1);

		Jugador cjMcCollum = new Jugador((short) 294, "Christian James", "McCollum", (byte) 3, "CJ McCollum",
				Posicion.ESCOLTA, 30.86f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 35, Valores.B, Valores.B, Valores.C, Valores.D, (byte) 23, (byte) 1);
		Jugador jaxsonHayes = new Jugador((short) 295, "Jaxon", "hayes", (byte) 10, Posicion.PIVOT, 5.34f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.D, Valores.C, Valores.B, (byte) 23, (byte) 1);
		Jugador herbertJones = new Jugador((short) 296, "Herbert", "Jones", (byte) 5, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 23, (byte) 1);
		Jugador devonteGraham = new Jugador((short) 297, "Devonte", "Graham", (byte) 4, Posicion.BASE, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.D, (byte) 23, (byte) 1);
		Jugador jonasValanciunas = new Jugador((short) 298, "Jonas", "Valanciunas", (byte) 17, Posicion.ALERO, 14.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 23, (byte) 1);

		Jugador rjBarret = new Jugador((short) 299, "Rowan Alexander", "Barret", (byte) 9, "R.J.", Posicion.ALERO,
				8.63f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34,
				Valores.B, Valores.A, Valores.C, Valores.B, (byte) 11, (byte) 1);
		Jugador evanFournier = new Jugador((short) 300, "Evan", "Fournier", (byte) 13, Posicion.ESCOLTA, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.C, (byte) 11, (byte) 1);
		Jugador alecBurks = new Jugador((short) 301, "Alec", "Burks", (byte) 18, Posicion.BASE, 9.35f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 11, (byte) 1);
		Jugador mitchellRobinson = new Jugador((short) 302, "Mitchell", "Robinson", (byte) 23, Posicion.PIVOT, 1.8f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 11, (byte) 1);
		Jugador juliusRande = new Jugador((short) 303, "Julius", "Randle", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 11, (byte) 1);

		Jugador coleAnthony = new Jugador((short) 304, "Cole", "Anthony", (byte) 50, Posicion.BASE, 3.45f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.C, Valores.B, Valores.C, (byte) 12, (byte) 1);
		Jugador jalenSuggs = new Jugador((short) 305, "Jalen", "Suggs", (byte) 4, Posicion.ESCOLTA, 6.59f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.D, (byte) 12, (byte) 1);
		Jugador moBamba = new Jugador((short) 306, "Mohamed Fakaba", "Bamba", (byte) 5, "Mo Bamba", Posicion.BASE,
				7.56f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.B, Valores.B, Valores.D, Valores.B, (byte) 12, (byte) 1);
		Jugador franzWagner = new Jugador((short) 307, "Franz", "wagner", (byte) 22, Posicion.ALERO, 5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 12, (byte) 1);
		Jugador jonathanIsaac = new Jugador((short) 308, "Jonathan", "isaac", (byte) 1, Posicion.ALAPIVOT, .17f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 12, (byte) 1);

		Jugador joelEmbiid = new Jugador((short) 309, "Joel", "Embiid", (byte) 21, "Jojo", Posicion.PIVOT, 31.54f,
				(byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.B, Valores.B, Valores.A, (byte) 13, (byte) 1);
		Jugador jamesHarden = new Jugador((short) 310, "James", "Harden", (byte) 13, "The Beard", Posicion.BASE, 44.31f,
				(byte) 10, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 3, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 13, (byte) 1);
		Jugador tyreseMaxey = new Jugador((short) 311, "Tyrese", "Maxey", (byte) 0, Posicion.ESCOLTA, 2.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 13, (byte) 1);
		Jugador tobiasHarris = new Jugador((short) 312, "Tobias", "Harris", (byte) 12, Posicion.ALAPIVOT, 35.95f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 13, (byte) 1);
		Jugador matisseThybulle = new Jugador((short) 313, "Mathisse", "Thybulle", (byte) 22, Posicion.ALERO, 2.84f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 13, (byte) 1);

		Jugador deandreAyton = new Jugador((short) 314, "Deandre", "Ayton", (byte) 22, Posicion.PIVOT, 12.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.D, Valores.D, Valores.A, (byte) 26, (byte) 1);
		Jugador mikalBridges = new Jugador((short) 315, "Mikal", "Bridges", (byte) 25, Posicion.ALERO, 5.57F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.B, Valores.A, (byte) 26, (byte) 1);
		Jugador devinBooker = new Jugador((short) 316, "Devin", "Booker", (byte) 1, "D-Book", Posicion.ESCOLTA, 31.65f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.B, Valores.C, (byte) 26, (byte) 1);
		Jugador jaeCrowder = new Jugador((short) 317, "Jae", "Crowder", (byte) 99, Posicion.ALAPIVOT, 9.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 26, (byte) 1);
		Jugador chrisPaul = new Jugador((short) 318, "Chris", "Paul", (byte) 3, "CP3", Posicion.BASE, 30.8f, (byte) 12,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.A, Valores.A, (byte) 26, (byte) 1);

		Jugador damianLillard = new Jugador((short) 319, "Damian", "Lillard", (byte) 0, "Dame Time", Posicion.BASE,
				39.34f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.A, Valores.A, Valores.D, (byte) 27, (byte) 1);
		Jugador anferneeSimons = new Jugador((short) 320, "Anfernee", "Simons", (byte) 1, Posicion.ESCOLTA, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 27, (byte) 1);
		Jugador cjjElleby = new Jugador((short) 321, "CJ", "Elleby", (byte) 16, Posicion.ALERO, 1.15f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 20, Valores.C,
				Valores.C, Valores.D, Valores.C, (byte) 27, (byte) 1);
		Jugador justiceWinslow = new Jugador((short) 322, "Justice", "Winslow", (byte) 26, Posicion.ALAPIVOT, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.C, (byte) 27, (byte) 1);
		Jugador jusufNurkic = new Jugador((short) 323, "Jusuf", "Nurkic", (byte) 27, Posicion.PIVOT, 12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.C, Valores.B, (byte) 27, (byte) 1);

		Jugador deAaronFox = new Jugador((short) 324, "De Aaron", "Fox", (byte) 5, Posicion.BASE, 28.1f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.D, (byte) 28, (byte) 1);
		Jugador harrisonBarnes = new Jugador((short) 325, "Harrison", "Barnes", (byte) 40, Posicion.ALERO, 20.29f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.C, (byte) 28, (byte) 1);
		Jugador justinHoliday = new Jugador((short) 326, "Justin", "Holiday", (byte) 9, Posicion.ESCOLTA, 6f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.D, Valores.B, (byte) 28, (byte) 1);
		Jugador domantasSabonis = new Jugador((short) 327, "Domantas", "Sabonis", (byte) 10, Posicion.PIVOT, 19.8f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 28, (byte) 1);
		Jugador mauriceHarkless = new Jugador((short) 328, "Maurice", "Harkless", (byte) 8, "Moe Harkless",
				Posicion.ALAPIVOT, 4.2f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.C, Valores.D, Valores.C, Valores.B, (byte) 28, (byte) 1);

		Jugador dejounteMurray = new Jugador((short) 329, "Dejounte", "Murray", (byte) 5, Posicion.BASE, 15.24f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.B, Valores.B, Valores.B, (byte) 29, (byte) 1);
		Jugador lonnieWalker = new Jugador((short) 330, "Lonnie", "Walker IV", (byte) 1, Posicion.ESCOLTA, 4.47f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 29, (byte) 1);
		Jugador keldonJhonson = new Jugador((short) 331, "Keldon", "Jhonson", (byte) 3, Posicion.ALAPIVOT, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 29, (byte) 1);
		Jugador douMcDermott = new Jugador((short) 332, "Doug", "McDermott", (byte) 17, Posicion.ALERO, 7.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 29, (byte) 1);
		Jugador jakobPoeltl = new Jugador((short) 333, "Jakob", "Poeltl", (byte) 25, Posicion.PIVOT, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 29, (byte) 1);

		Jugador luguentzDortz = new Jugador((short) 334, "Luguentz", "Dortz", (byte) 5, "Lu Dortz", Posicion.ALERO,
				1.78f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.B, Valores.B, Valores.C, Valores.A, (byte) 25, (byte) 1);
		Jugador dariusBazley = new Jugador((short) 335, "Darius", "Bazley", (byte) 7, Posicion.ALAPIVOT, 2.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 25, (byte) 1);
		Jugador joshGiddey = new Jugador((short) 336, "josh", "Giddey", (byte) 3, Posicion.ESCOLTA, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.C, (byte) 25, (byte) 1);
		Jugador kenrichWilliams = new Jugador((short) 337, "Kenrich", "Williams", (byte) 34, Posicion.PIVOT, 2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.D, Valores.D, Valores.C, (byte) 25, (byte) 1);
		Jugador sga = new Jugador((short) 338, "Shai", "Gilgeous-Alexander", (byte) 2, Posicion.BASE, 5.49f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D, (byte) 25, (byte) 1);

		Jugador mikeConley = new Jugador((short) 339, "Mike", "Conley", (byte) 11, Posicion.BASE, 21f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 30, (byte) 1);
		Jugador bojanBogdanovich = new Jugador((short) 340, "Bojan", "Bogdanovich", (byte) 44, Posicion.ALAPIVOT, 18.7f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 30, (byte) 1);
		Jugador donovanMitchell = new Jugador((short) 341, "Donovan", "Mitchell", (byte) 45, "Spida Mitchell",
				Posicion.ESCOLTA, 28.1f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.A, Valores.A, Valores.C, Valores.C, (byte) 30, (byte) 1);
		Jugador jordanClarkson = new Jugador((short) 342, "Jordan", "Clarkson", (byte) 00, Posicion.ALERO, 12.42f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 30, (byte) 1);
		Jugador rudyGobert = new Jugador((short) 343, "Rudy", "Gobert", (byte) 27, "The French Bulldog", Posicion.PIVOT,
				35.34f, (byte) 3, (byte) 0, (byte) 0, (byte) 3, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.D, Valores.D, Valores.A, (byte) 30, (byte) 1);

		Jugador bradleyBeal = new Jugador((short) 344, "Bradley", "Beal", (byte) 3, Posicion.BASE, 33.72F, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.B, Valores.C, (byte) 15, (byte) 1);
		Jugador daniAvdija = new Jugador((short) 345, "Deni", "Advija", (byte) 9, Posicion.ALERO, 4.69f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 24, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 15, (byte) 1);
		Jugador kcp = new Jugador((short) 346, "kentavius", "Cadwell-Pope", (byte) 1, "KCP", Posicion.ESCOLTA, 13.03f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 15, (byte) 1);
		Jugador thomasBryant = new Jugador((short) 347, "Thomas", "Bryant", (byte) 13, Posicion.PIVOT, 8.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.B,
				Valores.C, Valores.D, Valores.B, (byte) 15, (byte) 1);
		Jugador kristapsPorzingis = new Jugador((short) 348, "Kristaps", "Porzingis", (byte) 6, Posicion.ALAPIVOT,
				31.65f, (byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.B, Valores.D, Valores.C, (byte) 15, (byte) 1);

		Jugador scottieBarnes = new Jugador((short) 349, "Scott Wayne", "Barnes", (byte) 4, "Scottie", Posicion.ALERO,
				7.28f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.C, Valores.C, Valores.B, (byte) 14, (byte) 1);
		Jugador ogAnunoby = new Jugador((short) 350, "Ogugua", "Anunoby", (byte) 3, "OG", Posicion.ALAPIVOT, 16,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.B, Valores.B, Valores.A, (byte) 14, (byte) 1);
		Jugador fredVanVleet = new Jugador((short) 351, "Fred", "VanVleet", (byte) 23, Posicion.BASE, 19.67f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.D, (byte) 14, (byte) 1);
		Jugador pascalSiakam = new Jugador((short) 352, "Pascal", "Siakam", (byte) 43, "Spicy P", Posicion.PIVOT, 33f,
				(byte) 1, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.A, (byte) 14, (byte) 1);
		Jugador garyTrentJr = new Jugador((short) 353, "Gary", "Trent Jr", (byte) 33, Posicion.ALERO, 16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 14, (byte) 1);

		Jugador reggieJackson = new Jugador((short) 354, "Reggie", "Jackson", (byte) 1, Posicion.BASE, 10.38f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 20, (byte) 1);
		Jugador paulGeorge = new Jugador((short) 355, "Paul", "George", (byte) 13, "PG13", Posicion.ESCOLTA, 39.34f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B, (byte) 20, (byte) 1);
		Jugador kawhiLeonard = new Jugador((short) 356, "Kawhi", "Leonard", (byte) 2, "Mr Fun Guy", Posicion.ALERO,
				39.34f, (byte) 5, (byte) 2, (byte) 0, (byte) 2, false, false, (byte) 1, (byte) 2, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.C, Valores.A, (byte) 20, (byte) 1);
		Jugador ivicaZubac = new Jugador((short) 357, "Ivica", "Zubac", (byte) 40, Posicion.PIVOT, 7.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 20, (byte) 1);
		Jugador robertCovington = new Jugador((short) 358, "Robert", "Covington", (byte) 23, Posicion.PIVOT, 12.98f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.C, Valores.D, Valores.A, (byte) 20, (byte) 1);

	}

	private static ArrayList<Jugador> getJugadores() {
		Statement smt = utilsDB.conectarBBDD();
		// Inicializamos un ArrayList para devolver.
		ArrayList<Jugador> ret = new ArrayList<Jugador>();

		try {
			ResultSet cursor = smt.executeQuery("select * from jugador WHERE salario>0");
			while (cursor.next()) {
				Jugador actual = new Jugador();

				actual.setNombre(cursor.getString("nombre"));
				actual.setApellido(cursor.getString("apellido"));
				actual.setDorsal(cursor.getByte("dorsal"));
				actual.setApodo(cursor.getString("apodo"));
				// actual.setPosicion(cursor.getString("posicion "));
				actual.setSalario(cursor.getFloat("salario"));
				actual.setNominacionesAllStar(cursor.getByte("nominacionesallstar"));
				actual.setAnillosDeCampeon(cursor.getByte("anillosdecampeon"));
				actual.setMVPs(cursor.getByte("mvp"));
				actual.setDefensorDelAño(cursor.getByte("dpoy"));
				actual.setRookieDelAño(cursor.getBoolean("roty"));
				actual.setMIP(cursor.getBoolean("mip"));
				actual.setMVPAllStar(cursor.getByte("mvpallstar"));
				actual.setFMVP(cursor.getByte("fmvp"));
				actual.setPremioAnotador(cursor.getByte("premioanotador"));
				actual.setPPG(cursor.getFloat("ppg"));
				actual.setAPG(cursor.getFloat("apg"));
				actual.setRBG(cursor.getFloat("rbg"));
				actual.setSPG(cursor.getFloat("spg"));
				actual.setBPG(cursor.getFloat("bpg"));
				actual.setBPG(cursor.getFloat("bpg"));
				actual.setMPG(cursor.getByte("mpg"));
				/*
				 * actual.setFinalizacion(cursor.getString("finalizacion"));
				 * actual.setTiro(cursor.getString("tiro"));
				 * actual.setOrganizacion(cursor.getString("organizacion"));
				 * actual.setDefensas(cursor.getString("defensa"));
				 */
				actual.setEquipo_id(cursor.getByte("equipo_eq_id"));
				actual.setPlayoffs_Playoff_id(cursor.getByte("playoffs_playoff_id"));

				ret.add(actual);
			}
		} catch (SQLException e) {
			// Si la conuslta falla no hay nada que devolver.
			e.printStackTrace();
			return null;
		}
		// Si no hay usuarios en la tabla, va a devolver un arraylist vacio.
		// Si la consulta fue erronea se devuelve un arraylist null, que son cosas
		// distintas.
		// utilsDB.desconectarBBDD();
		return ret;
	}

	public static Jugador devolverMVP() {

		ArrayList<Jugador> jugadoresNormalesNBA = getJugadores();

		Jugador max_jugador = jugadoresNormalesNBA.get(0);
		float max = max_jugador.getAPG() + max_jugador.getPPG() + max_jugador.getRBG() + max_jugador.getSPG()
				+ max_jugador.getBPG();
		float statsJugador = 0;

		for (short i = 1; i < jugadoresNormalesNBA.size(); i++) {

			statsJugador = jugadoresNormalesNBA.get(i).getAPG() + jugadoresNormalesNBA.get(i).getPPG()
					+ jugadoresNormalesNBA.get(i).getRBG() + jugadoresNormalesNBA.get(i).getSPG()
					+ jugadoresNormalesNBA.get(i).getBPG();

			if (statsJugador > max) {
				max_jugador = jugadoresNormalesNBA.get(i);
				max = statsJugador;
			}
		}

		return max_jugador;

	}

	public static Jugador devolverDPOY() {

		ArrayList<Jugador> jugadoresNormalesNBA = getJugadores();

		Jugador max_jugador = jugadoresNormalesNBA.get(0);
		float max = max_jugador.getRBG() + max_jugador.getSPG() + max_jugador.getBPG();
		float statsJugador = 0;

		for (short i = 1; i < jugadoresNormalesNBA.size(); i++) {

			statsJugador = +jugadoresNormalesNBA.get(i).getRBG() + jugadoresNormalesNBA.get(i).getSPG()
					+ jugadoresNormalesNBA.get(i).getBPG();

			if (statsJugador > max) {
				max_jugador = jugadoresNormalesNBA.get(i);
				max = statsJugador;
			}
		}

		return max_jugador;

	}

	public static Jugador devolverPremioAnotador() {

		ArrayList<Jugador> jugadoresNormalesNBA = getJugadores();

		Jugador max_jugador = jugadoresNormalesNBA.get(0);
		float max = max_jugador.getPPG();
		float statsJugador = 0;

		for (short i = 1; i < jugadoresNormalesNBA.size(); i++) {

			statsJugador = jugadoresNormalesNBA.get(i).getPPG();

			if (statsJugador > max) {
				max_jugador = jugadoresNormalesNBA.get(i);
				max = statsJugador;
			}
		}

		return max_jugador;
	}

	public static void imprimeTicket() throws IOException {

		File archivo = new File("./ticket.txt");
		if (archivo.exists()) {
			archivo.delete();
		}
		archivo.createNewFile();
		FileWriter escritor = new FileWriter(archivo);
		escritor.write("---------------------------------------------------------------------------\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                    EL MVP DE LA TEMPORADA HA SIDO                       |\n");
		escritor.write("" + funcionesUtiles.devolverMVP().getNombre() + " "
				+ funcionesUtiles.devolverMVP().getApellido() + " ha anotado " + funcionesUtiles.devolverMVP().getPPG()
				+ " puntos por partido,ha repartido " + funcionesUtiles.devolverMVP().getAPG()
				+ " asistencias por partido,ha recogido " + funcionesUtiles.devolverMVP().getRBG()
				+ " rebotes por partido,ha robado " + funcionesUtiles.devolverMVP().getSPG() + " y ha taponado "
				+ funcionesUtiles.devolverMVP().getBPG() + " balones por partido" + "\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                    EL DEFENSOR  DE LA TEMPORADA HA SIDO                 |\n");
		escritor.write(
				"" + funcionesUtiles.devolverDPOY().getNombre() + " " + funcionesUtiles.devolverDPOY().getApellido()
						+ " ha anotado " + funcionesUtiles.devolverDPOY().getRBG() + " rebotes por partido,ha robado "
						+ funcionesUtiles.devolverDPOY().getSPG() + " balones por partido y ha taponado "
						+ funcionesUtiles.devolverDPOY().getBPG() + " balones por partido" + "\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|            EL PREMIO DEL MEJOR ANOTADOR DE LA TEMPORADA HA SIDO         |\n");
		escritor.write("" + funcionesUtiles.devolverPremioAnotador().getNombre() + " "
				+ funcionesUtiles.devolverPremioAnotador().getApellido() + " ha anotado "
				+ funcionesUtiles.devolverPremioAnotador().getPPG() + " puntos por partido" + "\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("---------------------------------------------------------------------------\n");
		escritor.flush();
		escritor.close();
	}

	public static ArrayList<Jugador> getTitularesAllStar() {
		ArrayList<Jugador> jugadores = funcionesUtiles.getJugadores();

		Collections.sort(jugadores, new Comparator<Jugador>() {

			public int compare(Jugador o1, Jugador o2) {

				if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) > (o2.getPPG() + o2.getAPG()
						+ o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return 1;
				} else if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) < (o2.getPPG()
						+ o2.getAPG() + o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return -1;
				} else {
					return 0;
				}

			}

		});

		ArrayList<Jugador> allStars = new ArrayList<Jugador>();

		for (short i = 0; i < jugadores.size(); i++) {
			if (i >= 140) {
				allStars.add(jugadores.get(i));
			}
		}

		return allStars;
	}

	public static ArrayList<Jugador> getJugadoresEquipo1() {
		ArrayList<Jugador> jugadores = funcionesUtiles.getJugadores();

		Collections.sort(jugadores, new Comparator<Jugador>() {

			public int compare(Jugador o1, Jugador o2) {

				if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) > (o2.getPPG() + o2.getAPG()
						+ o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return 1;
				} else if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) < (o2.getPPG()
						+ o2.getAPG() + o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return -1;
				} else {
					return 0;
				}

			}

		});

		ArrayList<Jugador> allStarsEquipo1 = new ArrayList<Jugador>();

		for (short i = 0; i < jugadores.size(); i++) {
			if (i >= 130 && i <= 134) {
				allStarsEquipo1.add(jugadores.get(i));
			}
			if (i >= 140 && i <= 145) {
				allStarsEquipo1.add(jugadores.get(i));
			}
		}

		return allStarsEquipo1;
	}

	public static ArrayList<Jugador> getJugadoresEquipo2() {
		ArrayList<Jugador> jugadores = funcionesUtiles.getJugadores();

		Collections.sort(jugadores, new Comparator<Jugador>() {

			public int compare(Jugador o1, Jugador o2) {

				if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) > (o2.getPPG() + o2.getAPG()
						+ o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return 1;
				} else if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) < (o2.getPPG()
						+ o2.getAPG() + o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return -1;
				} else {
					return 0;
				}

			}

		});

		ArrayList<Jugador> allStarsEquipo2 = new ArrayList<Jugador>();

		for (short i = 0; i < jugadores.size(); i++) {
			if (i >= 135 && i <= 139) {
				allStarsEquipo2.add(jugadores.get(i));
			}
			if (i >= 146 && i <= 150) {
				allStarsEquipo2.add(jugadores.get(i));
			}
		}

		return allStarsEquipo2;
	}

	public static Jugador getAllStarMVP() {
		ArrayList<Jugador> jugadores = funcionesUtiles.getJugadores();

		Collections.sort(jugadores, new Comparator<Jugador>() {

			public int compare(Jugador o1, Jugador o2) {

				if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) > (o2.getPPG() + o2.getAPG()
						+ o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return 1;
				} else if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) < (o2.getPPG()
						+ o2.getAPG() + o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return -1;
				} else {
					return 0;
				}

			}

		});

		Jugador maximo = null;

		for (short i = 0; i < jugadores.size(); i++) {
			if (i == 149) {
				maximo = jugadores.get(i);
			}

		}

		return maximo;
	}

	public static PartidoAllStar partidoAllStar() throws SQLException {

		Random r = new Random();

		PartidoAllStar allStar = new PartidoAllStar((byte) 1, (short) ((short) r.nextInt(160) + 1),
				(short) ((short) r.nextInt(160) + 1), LocalDateTime.of(2022, 02, 17, 21, 30), "Equipow 1", "Equipo 2",
				"Titulares");
		Equipo equipo1 = new Equipo("Equipo Este", (byte) 31, (byte) 1);
		Equipo equipo2 = new Equipo("Equipo Oeste", (byte) 32, (byte) 1);
		return allStar;
	}

}
