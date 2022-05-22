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

		Jugador bobCousy = new Jugador((byte) 1, "Bob", "Cousy", (byte) 9, (byte) 1);
		Jugador tedTurner = new Jugador((byte) 2, "Ted", "Turner", (byte) 17, (byte) 1);
		Jugador dominiqueWilkins = new Jugador((byte) 3, "Dominique", "Wilkins", (byte) 21, (byte) 1);
		Jugador louHudson = new Jugador((byte) 4, "Lou", "Hudson", (byte) 23, (byte) 1);
		Jugador jasonColler = new Jugador((byte) 5, "Jason", "Collier", (byte) 40, (byte) 1);
		Jugador peteMaravich = new Jugador((byte) 6, "Pete", "Maravich", (byte) 44, "Pistol Pete", (byte) 1);
		Jugador dikembeMutombo = new Jugador((byte) 7, "Dikembe", "Mutombo", (byte) 55, (byte) 1);

		Jugador robertparish = new Jugador((byte) 8, "Robert", "Parish", (byte) 00, (byte) 2);
		Jugador walterBrown = new Jugador((byte) 9, "Walter", "brown", (byte) 1, (byte) 9);
		Jugador arnoldAuerbach = new Jugador((byte) 10, "Arnold", "Auerbach", (byte) 2, "Red", (byte) 2);
		Jugador dennisJhonson = new Jugador((byte) 11, "Dennis", "Jhonson", (byte) 3, (byte) 2);
		Jugador kevinGarnet = new Jugador((byte) 12, "Kevin", "Garnet", (byte) 5, "Big Ticket", (byte) 2);
		Jugador billRussel = new Jugador((byte) 13, "Bill", "Russel", (byte) 6, "Lord of the Rings", (byte) 2);
		Jugador jojoWhite = new Jugador((byte) 14, "Jo Jo", "White", (byte) 10, (byte) 2);
		Jugador bobCousyCeltics = new Jugador((byte) 15, "Bob", "Cousy", (byte) 14, (byte) 2);
		Jugador tomHeison = new Jugador((byte) 16, "Tom", "Heison", (byte) 15, (byte) 2);
		Jugador tomSanders = new Jugador((byte) 17, "Tom", "Sanders", (byte) 16, "Satch", (byte) 2);
		Jugador jhonHavliceK = new Jugador((byte) 18, "Jhon", "Havlicek", (byte) 17, (byte) 2);
		Jugador jimLoscutoff = new Jugador((byte) 19, "Bob", "Cousy", (byte) 18, (byte) 2);
		Jugador daveCowens = new Jugador((byte) 20, "Dave", "Cowens", (byte) 18, (byte) 2);
		Jugador donaldNelson = new Jugador((byte) 21, "Donald", "Nelson", (byte) 19, "Don Nelson", (byte) 2);
		Jugador billSharman = new Jugador((byte) 22, "Bill", "Sharman", (byte) 21, (byte) 2);
		Jugador edMacauley = new Jugador((byte) 23, "Edward", "Macauley", (byte) 22, "Ed Macauley", (byte) 2);
		Jugador frankRamsey = new Jugador((byte) 24, "Frank Vernon", "Ramsey", (byte) 23, "Frank Ramsey", (byte) 2);
		Jugador samJones = new Jugador((byte) 25, "Sam", "Jones", (byte) 24, (byte) 2);
		Jugador kcJones = new Jugador((byte) 26, "K.C.", "Jones", (byte) 25, (byte) 2);
		Jugador cedricMaxwell = new Jugador((byte) 27, "Cedric", "Maxwell", (byte) 31, "Cornbread", (byte) 2);
		Jugador kevinMcHale = new Jugador((byte) 28, "Kevin Edward", "McHale", (byte) 32, "Kevin McHale", (byte) 2);
		Jugador larryBird = new Jugador((byte) 29, "Larry Joe", "Bird", (byte) 33, "Larry Bird", (byte) 2);
		Jugador paulPierce = new Jugador((byte) 30, "Paul", "Pierce", (byte) 34, "the truth", (byte) 2);
		Jugador reggieLewis = new Jugador((byte) 31, "Reginald", "Lewis", (byte) 35, "Reggie Lewis", (byte) 2);

		Jugador drazenPetrovich = new Jugador((byte) 32, "Dražen ", "Petrović", (byte) 3, (byte) 3);
		Jugador wendellLadner = new Jugador((byte) 33, "Wendell", "Ladner", (byte) 4, (byte) 3);
		Jugador jasonKidd = new Jugador((byte) 34, "Jason", "Kidd", (byte) 5, (byte) 3);
		Jugador jhonWilliamson = new Jugador((byte) 35, "Jhon Lee", "Williamson", (byte) 23, "John Williamson",
				(byte) 3);
		Jugador billMelchionni = new Jugador((byte) 36, "William P", "Melchionni", (byte) 25, "Bill Melchionni",
				(byte) 3);
		Jugador juliusErving = new Jugador((byte) 37, "Julius Winfield", "Earving ||", (byte) 32, "Dr J", (byte) 3);
		Jugador buckWilliams = new Jugador((byte) 38, "Dikembe", "Mutombo", (byte) 55, (byte) 3);

		Jugador bobbyPhills = new Jugador((byte) 39, "Bobby Ray ", "Phills ||", (byte) 13, "Bobby Phills", (byte) 4);

		Jugador michaelJordan = new Jugador((byte) 40, "Michael", "Jordan", (byte) 23, "Air Jordan", (byte) 5);
		Jugador scottiePippen = new Jugador((byte) 41, "Scottie", "Pippen", (byte) 33, "Pip", (byte) 5);
		Jugador bobLove = new Jugador((byte) 42, "Bob", "Love", (byte) 10, (byte) 5);
		Jugador jerrySloan = new Jugador((byte) 43, "Jerry", "Sloan", (byte) 4, (byte) 5);

		Jugador bingoSmith = new Jugador((byte) 44, "Robert", "Smith", (byte) 7, "Bingo Smith", (byte) 6);
		Jugador zydrunasilgaukas = new Jugador((byte) 45, "Žydrūnas ", "Ilgauskas", (byte) 11, (byte) 6);
		Jugador larryNance = new Jugador((byte) 46, "Larry Donnel", "Nance Sr", (byte) 2, "Larry Nance", (byte) 6);
		Jugador markPrice = new Jugador((byte) (byte) 47, "William Mark", "Price", (byte) 25, "Mark Price", (byte) 6);
		Jugador austinCarr = new Jugador((byte) 48, "Austin George ", "Carr", (byte) 34, "Austin Carr", (byte) 6);
		Jugador nateThurmond = new Jugador((byte) 49, "Nathaniel", "Thurmond", (byte) 42, "Nate the Great", (byte) 6);
		Jugador bradDaugherty = new Jugador((byte) 50, "Bradley Lee", "Daugherty", (byte) 43, "Brad Daugherty",
				(byte) 6);

		Jugador derekHarper = new Jugador((byte) 51, "Derek ", "Harper", (byte) 12, (byte) 16);
		Jugador bradDavis = new Jugador((byte) 52, "Bradley Ernest ", "Davis", (byte) 15, "Brad Davis", (byte) 16);
		Jugador rolandoBlackman = new Jugador((byte) 53, "Rolando  Antonio", "Price", (byte) 22, "Ro Blackman",
				(byte) 16);
		Jugador dirkNowitzki = new Jugador((byte) 54, "Dirk", "Werner Nowitzki", (byte) 41, "Wunderkind", (byte) 16);

		Jugador alexEnglish = new Jugador((byte) 55, "Alexander", "English", (byte) 2, "Alex English", (byte) 17);
		Jugador fatLever = new Jugador((byte) 56, "Lafayette ", "Lever", (byte) 12, "Fat Lever", (byte) 17);
		Jugador davidThompson = new Jugador((byte) 57, "David O'Neil", "Thompson", (byte) 33, (byte) 17);
		Jugador byronbeck = new Jugador((byte) 58, "Byrin", "Beck", (byte) 40, (byte) 17);
		Jugador danIssel = new Jugador((byte) 59, "Daniel Paul ", "Issel", (byte) 44, "Dan Issel", (byte) 17);
		Jugador dikembeMutomboNuggets = new Jugador((byte) 60, "Dikembe", "Mutombo", (byte) 55, (byte) 17);
		Jugador dougMoe = new Jugador((byte) 61, "Douglas Edwin", "Moe", (byte) 432, "Doug Moe", (byte) 17);

		Jugador chaunceyBillups = new Jugador((byte) 62, "Chauncey", "Billups", (byte) 1, "Mr. Big Shot", (byte) 7);
		Jugador chuckDaily = new Jugador((byte) 63, "Charles Jerome ", "Daily", (byte) 2, "Chuck Daly", (byte) 7);
		Jugador benWallace = new Jugador((byte) 64, "Ben", "Wallace", (byte) 6, "Big Ben", (byte) 7);
		Jugador joeDumars = new Jugador((byte) 65, "Joe", "Dumars", (byte) 4, "Joe-D", (byte) 7);
		Jugador dennisRodman = new Jugador((byte) 66, "Dennis Keith", "Rodman", (byte) 10, "The Worm", (byte) 7);
		Jugador isaiahThomas = new Jugador((byte) 67, "Isiah Lord", "Thomas", (byte) 11, "Zeke", (byte) 7);
		Jugador vinnieJhonson = new Jugador((byte) 68, "Vincent", "Jhonson", (byte) 15, "Microwave", (byte) 7);
		Jugador bobLanier = new Jugador((byte) 69, "Robert Jerry", "Lanier", (byte) 16, "Bob Lanier", (byte) 7);
		Jugador daveBing = new Jugador((byte) 70, "David ", "Bing", (byte) 21, "Duke", (byte) 7);
		Jugador richardHamilton = new Jugador((byte) 71, "Richard Clay", "Hamilton", (byte) 32, "The Man in the Mask",
				(byte) 7);
		Jugador billLaimbeer = new Jugador((byte) 72, "William J.", "Laimbeer", (byte) 40, "Bill Laimbeer", (byte) 7);

		Jugador wiltChamberlain = new Jugador((byte) 73, "Wilton Norman", "Chamberlain", (byte) 13, "Wilt the Stilt",
				(byte) 18);
		Jugador thomMeschery = new Jugador((byte) 74, "Thomas Nicholas  ", "Meschery", (byte) 14, "Thom Meschery",
				(byte) 18);
		Jugador alAttles = new Jugador((byte) 75, "Alvin", "Attles", (byte) 16, "Destroyer", (byte) 18);
		Jugador chrisMullin = new Jugador((byte) 76, "Christopher Paul", "Dumars", (byte) 17, "Chris Mullin",
				(byte) 18);
		Jugador rickBarry = new Jugador((byte) 77, "Richard Francis Dennis", "Barry |||", (byte) 24, "Greyhound",
				(byte) 18);
		Jugador nateThurmondWarriors = new Jugador((byte) 78, "Nathaniel", "Thurmond", (byte) 42, "Nate the Great",
				(byte) 18);

		Jugador yaoMing = new Jugador((byte) 79, "Yao", "Ming", (byte) 11, "Yao's dinasty", (byte) 19);
		Jugador clydeDrexler = new Jugador((byte) 80, "Clyde Austin", "Drexler ", (byte) 22, "The Glide", (byte) 19);
		Jugador calvinMurphy = new Jugador((byte) 81, "Calvin Jerome", "Murphy ", (byte) 23, "Destroyer", (byte) 19);
		Jugador mosesMalone = new Jugador((byte) 82, "Moses Eugene", "Malone", (byte) 24, "Moses Malone", (byte) 19);
		Jugador hakeemOlajuwon = new Jugador((byte) 83, "Hakeem Abdul", "Olajuwon", (byte) 34, "The Dream", (byte) 19);
		Jugador rudyTomjanovich = new Jugador((byte) 84, "Rudolph ", "Tomjanovich", (byte) 45, "Rudy Tomjanovich",
				(byte) 19);

		Jugador georgemcGinnis = new Jugador((byte) 85, "George", "McGinnis", (byte) 30, (byte) 8);
		Jugador reggieMiller = new Jugador((byte) 86, "Reginald Wayne", "Miller ", (byte) 31, "Miller Time", (byte) 8);
		Jugador melDaniels = new Jugador((byte) 87, "Melvin Joe", "Daniels ", (byte) 34, "Melvin Joe", (byte) 8);
		Jugador rogerBrown = new Jugador((byte) 88, "Roger William", "Brown", (byte) 35, "The Rajah", (byte) 8);
		Jugador slickLeonard = new Jugador((byte) 89, "William Robert", "Leonard", (byte) 529, "Slick Leonard",
				(byte) 8);

		Jugador kobe8 = new Jugador((byte) 90, "Kobe ", "Bryant", (byte) 8, "Black mamba", (byte) 21);
		Jugador wiltChamberlainLakers = new Jugador((byte) 91, "Wilton Norman", "Chamberlain", (byte) 13,
				"Wilt the Stilt", (byte) 21);
		Jugador elginBaylor = new Jugador((byte) 92, "Elgin Gay", "Baylor ", (byte) 22, "Elgin Baylor", (byte) 21);
		Jugador kobe24 = new Jugador((byte) 93, "Kobe ", "Bryant", (byte) 24, "Black mamba", (byte) 21);
		Jugador gailGoodrich = new Jugador((byte) 94, "Gail Charles", "Goodrich", (byte) 25, "The Stump", (byte) 21);
		Jugador magicJhonson = new Jugador((byte) 95, "Earvin", "Jhonson", (byte) 32, "Magic Jhonson", (byte) 21);
		Jugador kareemAbdulJabbar = new Jugador((byte) 96, "Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook",
				(byte) 21);
		Jugador shaquilleOneal = new Jugador((byte) 97, "Shaquille Rashaun", "O'Neal ", (byte) 34, "Shaq Attack",
				(byte) 21);
		Jugador jamesWorthy = new Jugador((byte) 98, "James Ager ", "Worthy", (byte) 42, "Big Game James", (byte) 21);
		Jugador jerryWest = new Jugador((byte) 99, "Jerome Alan", "West", (byte) 44, "The Logo", (byte) 21);
		Jugador jamalWilkes = new Jugador((byte) 100, "Jamaal Abdul-Lateef", "Wilkes", (byte) 52, "Smooth as Silk",
				(byte) 21);
		Jugador jimPollard = new Jugador((byte) 101, "James Clifford", "Pollard", (byte) 17, "The Kangaroo Kid",
				(byte) 21);
		Jugador vernMikelsen = new Jugador((byte) 102, "Arild Verner Agerskov", "Mikkelsen", (byte) 19, "Ven Mikkelsen",
				(byte) 21);
		Jugador slaterMartin = new Jugador((byte) 103, "Slater Nelson", "Martin", (byte) 22, "Dugie", (byte) 21);
		Jugador clydeLovellete = new Jugador((byte) 104, "Clyde Edward", "Lovellette", (byte) 34, "Clyde Lovellette",
				(byte) 21);
		Jugador georgeMikan = new Jugador((byte) 105, "George Lawrence", "Mikan", (byte) 99, "Mr. Basketball",
				(byte) 21);

		Jugador zachRandolph = new Jugador((byte) 106, "Zachary McKenley", "Randolph", (byte) 50, "Z-Bo", (byte) 24);

		Jugador chrisBosh = new Jugador((byte) 107, "Christopher Wesson ", "Bosh", (byte) 1, "Boshasaurus", (byte) 9);
		Jugador dwayneWade = new Jugador((byte) 108, "Dwyane Tyrone", "Wade ", (byte) 3, "Flash", (byte) 9);
		Jugador timHardaway = new Jugador((byte) 109, "Timothy Duane", "Hardaway", (byte) 10, "Tim Bug", (byte) 9);
		Jugador danMarino = new Jugador((byte) 110, "Daniel Constantine ", "Marino", (byte) 13, (byte) 9);
		Jugador michaelJordanHeat = new Jugador((byte) 111, "Michael", "Jordan", (byte) 23, "Air Jordan", (byte) 9);
		Jugador shaquilleOnealHeat = new Jugador((byte) 112, "Shaquille Rashaun", "O'Neal ", (byte) 32, "Shaq Attack",
				(byte) 9);
		Jugador alonzoMourning = new Jugador((byte) 113, "Alonzo Harding ", "Mourning", (byte) 33, "Zo", (byte) 9);

		Jugador oscarRobertson = new Jugador((byte) 114, "Oscar Palmer", "Robertson", (byte) 1, "Mr.Triple-Double",
				(byte) 10);
		Jugador juniorBridgeman = new Jugador((byte) 115, "Ulysses Lee", "Bridgeman ", (byte) 2, "Junior Bridgeman",
				(byte) 10);
		Jugador sidneyMoncrief = new Jugador((byte) 116, "Sidney Alvin", "Moncrief", (byte) 4, "The squid", (byte) 10);
		Jugador marquesJhonson = new Jugador((byte) 117, "Marques Kevin", "Johnson", (byte) 8, "Slammer", (byte) 10);
		Jugador jonMcGlockin = new Jugador((byte) 118, "Jon P.", "McGlockin", (byte) 14, "Jonny Mac", (byte) 10);
		Jugador bobLanierBucks = new Jugador((byte) 119, "Robert Jerry", "Lanier", (byte) 16, "Bob Lanier", (byte) 10);
		Jugador brianWinters = new Jugador((byte) 120, "Brian Joseph", "Winters", (byte) 32, "Lurch", (byte) 10);
		Jugador kareemAbdulJabbarBucks = new Jugador((byte) 121, "Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook",
				(byte) 10);

		Jugador malikSealy = new Jugador((byte) 122, "Malik", "Sealy", (byte) 2, "Silk", (byte) 22);

		Jugador peteMaravichPelicans = new Jugador((byte) 123, "Pete", "Maravich", (byte) 7, "Pistol Pete", (byte) 23);

		Jugador waltFrazier = new Jugador((byte) 124, "Walter", "Frazier", (byte) 10, "Clyde", (byte) 11);
		Jugador dickBarnet = new Jugador((byte) 125, "Richard", "Barnett ", (byte) 12, "Dick Barnett", (byte) 11);
		Jugador earlMonroe = new Jugador((byte) 126, "Vernon Earl", "Monroe", (byte) 15, "The Pearl", (byte) 11);
		Jugador dickMcGuire = new Jugador((byte) 127, "Richard Josephn", "McGuire", (byte) 15, "Dick the Knick",
				(byte) 11);
		Jugador willisReed = new Jugador((byte) 128, "Willis", "Reed", (byte) 19, (byte) 11);
		Jugador daveDeBusschere = new Jugador((byte) 129, "David Albert", "DeBusschere", (byte) 22, "Big D", (byte) 11);
		Jugador billBradley = new Jugador((byte) 130, "William Warren ", "Bradley", (byte) 24, "Bill Bradley",
				(byte) 11);
		Jugador patrickEwing = new Jugador((byte) 131, "Patrick Aloysius", "Ewing", (byte) 33, "Big Pat", (byte) 11);
		Jugador redHolzman = new Jugador((byte) 132, "William", "Holzman", (byte) 613, "Big D", (byte) 11);

		Jugador aficion = new Jugador((byte) 133, "Afición", "", (byte) 6, (byte) 12);

		Jugador mosesMalonePhilly = new Jugador((byte) 134, "Moses Eugene", "Malone", (byte) 2, "Moses Malone",
				(byte) 13);
		Jugador allenIverson = new Jugador((byte) 135, "Allen Ezail", "Iverson ", (byte) 3, "The Answer", (byte) 13);
		Jugador juliusErvingPhilly = new Jugador((byte) 136, "Julius Winfield", "Earving ||", (byte) 6, "Dr J",
				(byte) 13);
		Jugador mauriceCheeks = new Jugador((byte) 137, "Maurice Edward", "Cheeks", (byte) 10, "Little Mo", (byte) 13);
		Jugador wiltChamberlainSixers = new Jugador((byte) 138, "Wilton Norman", "Chamberlain", (byte) 13,
				"Wilt the Stilt", (byte) 13);
		Jugador halGreer = new Jugador((byte) 139, "Harold Everett", "Greer", (byte) 15, "Hal Greer", (byte) 13);
		Jugador bobbyJones = new Jugador((byte) 140, "Robert Clyde", "Jones", (byte) 22, "Bobby Jones", (byte) 13);
		Jugador billyChunningham = new Jugador((byte) 141, "William John", "Cunningham ", (byte) 32, "Bily Cunningham",
				(byte) 13);
		Jugador charlesBarkley = new Jugador((byte) 142, "Charles Wade", "Barkley", (byte) 34, "El Gordo", (byte) 13);

		Jugador dickVanArsdale = new Jugador((byte) 143, "Richard Albert", "Van Arsdale", (byte) 5, "Dick Van Arsdale",
				(byte) 26);
		Jugador walterDavis = new Jugador((byte) 144, "Walter Paul", "Davis ", (byte) 6, "Sweet D", (byte) 26);
		Jugador kevinJhonson = new Jugador((byte) 145, "Kevin Maurice", "Jhonson", (byte) 7, "K.J", (byte) 26);
		Jugador danMajerle = new Jugador((byte) 146, "Daniel Lewis", "Majerle", (byte) 9, "Thunder Dan", (byte) 26);
		Jugador steveNash = new Jugador((byte) 147, "Stephen John", "Nash", (byte) 13, "Nasty Nash", (byte) 26);
		Jugador tomChambers = new Jugador((byte) 148, "Thomas Doane", "Chambers ", (byte) 24, "Tommy Gun", (byte) 26);
		Jugador alvanAdams = new Jugador((byte) 149, "Alvan Leigh", "Adams  ", (byte) 33, "Double A", (byte) 26);
		Jugador charlesBarkleySuns = new Jugador((byte) 150, "Charles Wade", "Barkley", (byte) 34, "El Gordo",
				(byte) 26);
		Jugador connieHawkins = new Jugador((byte) 151, "Cornelius ", "Hawkins", (byte) 42, "The Hawk", (byte) 26);
		Jugador paulWestphal = new Jugador((byte) 152, "Paul Douglas", "Westphal ", (byte) 44, "Paul Westphal",
				(byte) 26);
		Jugador cottonFitzsimmons = new Jugador((byte) 153, "Lowell", "Fitzsimmons ", (byte) 42, "Cotton Fitzsimmons",
				(byte) 26);

		Jugador larryWeinberg = new Jugador((byte) 154, "Larry", "Weinberg", (byte) 1, (byte) 27);
		Jugador davidTwardzik = new Jugador((byte) 155, "David", "Twardzik", (byte) 13, (byte) 27);
		Jugador lionelHollins = new Jugador((byte) 156, "Lionel Eugene", "Hollins", (byte) 14, "L-Train", (byte) 27);
		Jugador larrySteele = new Jugador((byte) 157, "Maurice D.", "Steele ", (byte) 15, "Man of steele", (byte) 27);
		Jugador mauriceLucas = new Jugador((byte) 158, "Stephen John", "Lucas", (byte) 20, "Mo Lucas", (byte) 27);
		Jugador clydeDrexlerBlazers = new Jugador((byte) 159, "Clyde Austin", "Drexler ", (byte) 22, "The Glide",
				(byte) 27);
		Jugador bobGross = new Jugador((byte) 160, "Robert Edwin", "Gross ", (byte) 30, "Bob Gross", (byte) 27);
		Jugador terryPorter = new Jugador((byte) 161, "Terry", "Porter", (byte) 30, (byte) 27);
		Jugador billWalton = new Jugador((byte) 162, "William Theodore", "Walton", (byte) 32, "Big Red-Head",
				(byte) 27);
		Jugador lloydNeal = new Jugador((byte) 163, "Lloyd ", "Neal ", (byte) 36, (byte) 27);
		Jugador geoffPetrie = new Jugador((byte) 164, "Geoffrey Michael", "Petrie ", (byte) 45, "Geoff Petrie",
				(byte) 27);
		Jugador jackRamsay = new Jugador((byte) 165, "Dr. John T.", "Ramsay ", (byte) 77, (byte) 27);

		Jugador nateArchibal = new Jugador((byte) 166, "Nathaniel", "Archibald", (byte) 1, "Nate Tiny Archibald",
				(byte) 28);
		Jugador mithcRichmond = new Jugador((byte) 167, "Mitchell James", "Richmond", (byte) 2, "Hammer", (byte) 28);
		Jugador chrisWebber = new Jugador((byte) 168, "Mayce Edward Christopher", "Webber ", (byte) 4, "Chris Webber",
				(byte) 28);
		Jugador aficionKings = new Jugador((byte) 169, "Afición", "", (byte) 6, (byte) 28);
		Jugador bobDavies = new Jugador((byte) 170, "Robert Edris", "Davies", (byte) 11, "The Harrisburg Houdini",
				(byte) 28);
		Jugador mauriceStokes = new Jugador((byte) 171, "Maurice", "Stokes", (byte) 12, "Mo Stokes", (byte) 28);
		Jugador oscarRobertsonKings = new Jugador((byte) 172, "Oscar Palmer", "Robertson", (byte) 14,
				"Mr.Triple-Double", (byte) 28);
		Jugador predragStojakovic = new Jugador((byte) 173, "Predrag Peđa", "Stojaković", (byte) 16, "Peja Stojaković",
				(byte) 28);
		Jugador vladeDivac = new Jugador((byte) 174, "Vlade", "Divac", (byte) 21, "Vittorio Gassman", (byte) 28);
		Jugador jackTwynam = new Jugador((byte) 175, "John Kennedy", "Twyman", (byte) 27, "Jack Twyman", (byte) 28);
		Jugador samLacey = new Jugador((byte) 176, "Samuel", "Lacey ", (byte) 44, "Slammin' Sam", (byte) 28);

		Jugador jhonnyMoore = new Jugador((byte) 177, "John Brian", "Moore", (byte) 00, "Johnny Moore", (byte) 29);
		Jugador averyJhonson = new Jugador((byte) 178, "Avery", "Johnson", (byte) 6, "Taz", (byte) 29);
		Jugador tonyParker = new Jugador((byte) 179, "William Anthony", "Parker ", (byte) 9, "Parisian Torpedo",
				(byte) 29);
		Jugador bruceBowen = new Jugador((byte) 180, "Bruce Eric", "Bowen", (byte) 12, (byte) 29);
		Jugador jamesSilas = new Jugador((byte) 181, "James Edward", "Silas", (byte) 13, "Captain Late", (byte) 29);
		Jugador manuGinobii = new Jugador((byte) 182, "Emanuel David", "Ginóbili", (byte) 20, "Manu Ginóbili",
				(byte) 29);
		Jugador timDuncan = new Jugador((byte) 183, "Timothy Theodore", "Duncan", (byte) 21, "The Big Fundamental",
				(byte) 29);
		Jugador seanElliot = new Jugador((byte) 184, "Sean", "Elliott", (byte) 32, (byte) 29);
		Jugador georgeGervin = new Jugador((byte) 185, "George", "Gervin", (byte) 44, "The Iceman", (byte) 29);
		Jugador davidRobinson = new Jugador((byte) 186, "David Maurice", "Robinson", (byte) 50, "The Admiral",
				(byte) 29);

		Jugador gusWilliams = new Jugador((byte) 187, "Gus", "Williams", (byte) 1, "The Wizard", (byte) 25);
		Jugador nickCollison = new Jugador((byte) 188, "Nicholas John", "Collison", (byte) 4, (byte) 25);
		Jugador nateMcMillan = new Jugador((byte) 189, "Nathaniel", "McMillan", (byte) 10, "Nate McMillan", (byte) 25);
		Jugador lennyWilkens = new Jugador((byte) 190, "Leonard Randolph", "Wilkens", (byte) 19, "Lenny Wilkens",
				(byte) 25);
		Jugador spencerHaywood = new Jugador((byte) 191, "Spencer", "Haywood", (byte) 24, (byte) 25);
		Jugador fredBrwon = new Jugador((byte) 192, "Fred", "Brown", (byte) 32, "Downtown", (byte) 25);
		Jugador jackSikman = new Jugador((byte) 193, "Jack Wayne", "Sikma", (byte) 44, "Goldilocks", (byte) 25);

		Jugador frankLayden = new Jugador((byte) 194, "Frank", "Layden", (byte) 1, (byte) 30);
		Jugador adrianDantley = new Jugador((byte) 195, "Adrian Delano", "Dantley", (byte) 4, "The teacher", (byte) 30);
		Jugador peteMaravichJazz = new Jugador((byte) 196, "Pete", "Maravich", (byte) 7, "Pistol Pete", (byte) 30);
		Jugador johnStockton = new Jugador((byte) 197, "John", "Stockton", (byte) 12, (byte) 30);
		Jugador jeffHornacek = new Jugador((byte) 198, "Jeffrey John", "Hornacek", (byte) 14, "Horny", (byte) 30);
		Jugador karlMalone = new Jugador((byte) 199, "Karl", "Malone", (byte) 32, "The Mailman", (byte) 30);
		Jugador darrelGriffith = new Jugador((byte) 200, "Darrell Steven", "Griffith", (byte) 35, "Dr. Dunkenstein",
				(byte) 30);
		Jugador markEaton = new Jugador((byte) 200, "Mark", "Eaton", (byte) 53, (byte) 30);
		Jugador geraldSloan = new Jugador((byte) 201, "Gerald Eugene", "Sloan", (byte) 1223, "Jerry Sloan", (byte) 30);

		Jugador earlMonroeWizards = new Jugador((byte) 202, "Vernon Earl", "Monroe", (byte) 10, "The Pearl", (byte) 15);
		Jugador elvinHayes = new Jugador((byte) 203, "Elvin Ernest", "Hayes", (byte) 11, "The Big E", (byte) 15);
		Jugador gusJohnson = new Jugador((byte) 204, "Gus", "Johnson", (byte) 25, "Honeycomb", (byte) 15);
		Jugador wesUnseld = new Jugador((byte) 205, "Westley Sissel", "Unseld", (byte) 41, "Wes Unseld", (byte) 15);
		Jugador philChenier = new Jugador((byte) 206, "Philip ", "Chenier ", (byte) 45, "Phil Chenier", (byte) 15);

		Jugador traeYoung = new Jugador((byte) 207, "Trae", "Young", (byte) 11, "Ice Trae", Posicion.BASE, 8.32f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 1, (byte) 1);
		Jugador jhonCollins = new Jugador((byte) 1, "Jhon", "Collins", (byte) 20, Posicion.PIVOT, 23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador bogdanBogdanovich = new Jugador((byte) 1, "Bogdan", "Bogdanovich", (byte) 13, Posicion.ESCOLTA, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador deandreHunter = new Jugador((byte) 1, "De'Andre", "Hunter", (byte) 12, Posicion.ALAPIVOT, 7.75f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador kevinHuerter = new Jugador((byte) 1, "Kevin", "Huerter", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 1, (byte) 1);

		Jugador jaysonTatum = new Jugador((byte) 1, "Jason", "Tatum", (byte) 0, "JT", Posicion.ALERO, 28.2f, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.A, Valores.B, Valores.B, (byte) 2, (byte) 2);
		Jugador jaylenBrown = new Jugador((byte) 2, "Jaylen", "Brown", (byte) 7, Posicion.ESCOLTA, 26.76f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.A, Valores.C, Valores.B, (byte) 2, (byte) 2);
		Jugador marcusSmart = new Jugador((byte) 2, "Marcus", "Smart", (byte) 16, Posicion.BASE, 14.36f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.A, (byte) 2, (byte) 2);
		Jugador alHorfort = new Jugador((byte) 2, "Al", "Horford", (byte) 42, Posicion.ALAPIVOT, 27f, (byte) 5,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 29, Valores.C,
				Valores.B, Valores.C, Valores.A, (byte) 2, (byte) 2);
		Jugador robertWilliams = new Jugador((byte) 2, "Robert", "Williams ||| ", (byte) 44, Posicion.PIVOT, 3.36f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 2, (byte) 2);

		Jugador kevinDurant = new Jugador((byte) 2, "Kevin", "Durant", (byte) 7, "Durantula", Posicion.ALAPIVOT, 42.01f,
				(byte) 12, (byte) 2, (byte) 1, (byte) 0, true, false, (byte) 2, (byte) 2, (byte) 4, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.A, Valores.B, (byte) 3, (byte) 2);
		Jugador sethCurry = new Jugador((byte) 3, "Seth", "Curry", (byte) 30, Posicion.ESCOLTA, 8.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.C, (byte) 3, (byte) 3);
		Jugador bruceBrown = new Jugador((byte) 3, "Bruce", "Brown", (byte) 1, Posicion.ALERO, 4.73f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 3, (byte) 3);
		Jugador kyrieIrving = new Jugador((byte) 3, "Kyrie", "Irving", (byte) 11, "Uncle Drew", Posicion.BASE, 35.34f,
				(byte) 7, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.B, Valores.D, (byte) 3, (byte) 3);
		Jugador lamarcusAldridge = new Jugador((byte) 3, "Lamarcus", "Aldridge", (byte) 2, Posicion.PIVOT, 2.64f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 3, (byte) 3);

		Jugador lameloBall = new Jugador((byte) 3, "LaMelo", "Ball", (byte) 2, Posicion.BASE, 8.32f, (byte) 1, (byte) 0,
				(byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B, Valores.B, Valores.A,
				Valores.C, (byte) 4, (byte) 4);
		Jugador milesBridges = new Jugador((byte) 4, "Miles", "Bridges", (byte) 0, Posicion.ALERO, 5.56f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.C, Valores.B, (byte) 4, (byte) 4);
		Jugador terryRozier = new Jugador((byte) 4, "Terry", "Rozier", (byte) 13, "Scary Terry", Posicion.ESCOLTA, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.D, (byte) 4, (byte) 4);
		Jugador gordonHayward = new Jugador((byte) 4, "Gordon", "Hayward", (byte) 20, Posicion.ALAPIVOT, 29.92f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 4, (byte) 4);
		Jugador montrezlHarrel = new Jugador((byte) 4, "Montrezl", "Harrel", (byte) 8, "Trezz", Posicion.ALERO, 4.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 4, (byte) 4);

		Jugador lonzoBall = new Jugador((byte) 4, "Lonzo", "Ball", (byte) 2, Posicion.BASE, 18.6f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B, Valores.A, Valores.A,
				Valores.A, (byte) 5, (byte) 4);
		Jugador demarDeRozan = new Jugador((byte) 5, "Demar", "DeRozan", (byte) 10, "King of the Fourth",
				Posicion.ALERO, 26f, (byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36,
				Valores.A, Valores.A, Valores.C, Valores.C, (byte) 5, (byte) 5);
		Jugador nikolaVucevic = new Jugador((byte) 5, "Nikola", "Vucevic", (byte) 9, Posicion.PIVOT, 24f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 5, (byte) 5);
		Jugador zachLavine = new Jugador((byte) 5, "Zach", "LaVine", (byte) 8, Posicion.ESCOLTA, 19.5f, (byte) 2,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.C, Valores.D, (byte) 5, (byte) 5);
		Jugador patrickWilliams = new Jugador((byte) 5, "Patrick", "Williams", (byte) 44, Posicion.ALAPIVOT, 7.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 5, (byte) 5);

		Jugador jarretAllen = new Jugador((byte) 6, "Jarret", "Allen", (byte) 31, Posicion.PIVOT, 20, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.D, Valores.D, Valores.A, (byte) 6, (byte) 6);
		Jugador dariusGarland = new Jugador((byte) 6, "Darius", "Garland", (byte) 10, Posicion.BASE, 10, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 6, (byte) 6);
		Jugador evanMoblaey = new Jugador((byte) 6, "Evan", "Mobley", (byte) 4, Posicion.ALERO, 18f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B, Valores.A, Valores.C,
				Valores.B, (byte) 6, (byte) 6);
		Jugador carisLeVert = new Jugador((byte) 6, "Caris", "LeVert", (byte) 3, Posicion.ESCOLTA, 17.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 6);
		Jugador lauriMarkkanen = new Jugador((byte) 6, "Lauri", "Markkanen", (byte) 24, Posicion.ALAPIVOT, 15.69f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);

		Jugador lukaDoncic = new Jugador((byte) 6, "Luka", "Doncic", (byte) 77, "Luka Magic", Posicion.BASE, 10.74f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.A, Valores.C, (byte) 6, (byte) 6);
		Jugador jalenBrunson = new Jugador((byte) 6, "Jalen", "Brunson", (byte) 13, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador spencerDinwiddie = new Jugador((byte) 6, "Spencer", "Dinwiddie", (byte) 21, Posicion.ALERO, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador dorianFinneySmith = new Jugador((byte) 6, "Dorian", "Finney-Smith", (byte) 10, Posicion.PIVOT, 4,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.D, Valores.A, (byte) 6, (byte) 6);
		Jugador reggieBullock = new Jugador((byte) 6, "Reggie", "Bulloc", (byte) 25, Posicion.ALAPIVOT, 9.53f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);

		Jugador willBarton = new Jugador((byte) 6, "William", "Barton", (byte) 5, "Will", Posicion.ALERO, 15.62f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador aaronGordon = new Jugador((byte) 6, "Aaron", "Gordon", (byte) 50, Posicion.ALAPIVOT, 16.4f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador nikolaJokic = new Jugador((byte) 6, "Nikola", "Jokic", (byte) 15, Posicion.PIVOT, 31.58f, (byte) 4,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.A, Valores.B, (byte) 6, (byte) 6);
		Jugador jamalMurray = new Jugador((byte) 6, "Jamal", "Murray", (byte) 27, Posicion.ESCOLTA, 29.67F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador monteMorris = new Jugador((byte) 6, "Monte", "Morris", (byte) 11, Posicion.BASE, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.D, (byte) 6, (byte) 6);

		Jugador cadeCunningham = new Jugador((byte) 6, "Cade", "Cunningham", (byte) 2, Posicion.BASE, 10.05f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.C, Valores.B, Valores.D, (byte) 6, (byte) 6);
		Jugador marvinBagley = new Jugador((byte) 6, "Marvin", "Bagley", (byte) 35, Posicion.PIVOT, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador sadiqqBey = new Jugador((byte) 6, "Sadiqq", "Bey", (byte) 41, Posicion.ALERO, 2.8f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B, Valores.B, Valores.C,
				Valores.B, (byte) 6, (byte) 6);
		Jugador hamidouDiallo = new Jugador((byte) 6, "Hamidou", "Diallo", (byte) 6, Posicion.ESCOLTA, 5.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador jeramiGrant = new Jugador((byte) 6, "Jerami", "Grant", (byte) 9, Posicion.ALAPIVOT, 20f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);

		Jugador stephenCurry = new Jugador((byte) 6, "Stephen", "Curry", (byte) 30, "Chef Curry", Posicion.BASE, 45.78f,
				(byte) 8, (byte) 3, (byte) 2, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.A, Valores.A, Valores.D, (byte) 6, (byte) 6);
		Jugador klayThompson = new Jugador((byte) 6, "Klay", "Thompson", (byte) 11, Posicion.ESCOLTA, 37.98f, (byte) 5,
				(byte) 3, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador draymondGreen = new Jugador((byte) 6, "Draymond", "Green", (byte) 13, Posicion.PIVOT, 24, (byte) 4,
				(byte) 3, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.A, Valores.A, (byte) 6, (byte) 6);
		Jugador andrewWiggins = new Jugador((byte) 6, "Andrew", "Hunter", (byte) 22, Posicion.ALAPIVOT, 31.57F,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador jordanPoole = new Jugador((byte) 6, "Jordan", "Poole", (byte) 3, Posicion.ALERO, 2.16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);

		Jugador christianWood = new Jugador((byte) 6, "Christian", "Wood", (byte) 35, Posicion.PIVOT, 13.6F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador jalenGreen = new Jugador((byte) 6, "Jalen", "Green", (byte) 0, Posicion.BASE, 23f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A, Valores.B, Valores.D,
				Valores.D, (byte) 6, (byte) 6);
		Jugador kpj = new Jugador((byte) 6, "Kevin", "Porter Jr", (byte) 3, Posicion.ALERO, 1.78F, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B, Valores.C, Valores.D,
				Valores.C, (byte) 6, (byte) 6);
		Jugador ericGordon = new Jugador((byte) 6, "Eric", "Gordon", (byte) 10, Posicion.ESCOLTA, 18.12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador jaseanTate = new Jugador((byte) 6, "Jae'Sean", "Tate", (byte) 8, Posicion.ALAPIVOT, 1.57f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);

		Jugador malcomBrogdon = new Jugador((byte) 6, "Malcom", "Brogdon", (byte) 7, Posicion.BASE, 21.7f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 6, (byte) 6);
		Jugador tyreseHaliburton = new Jugador((byte) 6, "Tyrese", "halliburton", (byte) 0, Posicion.ESCOLTA, 4.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.A, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador buddyHield = new Jugador((byte) 6, "Chavano Rainier", "Hield", (byte) 24, "Buddy Hield", Posicion.ALERO,
				23.08F, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador jalenSmith = new Jugador((byte) 6, "Jalen", "Smith", (byte) 25, Posicion.ALAPIVOT, 4.48f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.C, (byte) 6, (byte) 6);
		Jugador mylesTurner = new Jugador((byte) 6, "Myles", "Turner", (byte) 33, Posicion.PIVOT, 18, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador russelWestbrook = new Jugador((byte) 6, "Russel", "Westbrook", (byte) 0, "Westbrick", Posicion.BASE,
				44.21f, (byte) 9, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 2, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.D, Valores.A, Valores.D, (byte) 6, (byte) 6);
		Jugador carmeloAnthony = new Jugador((byte) 6, "Carmelo Kyam", "Anthony", (byte) 7, "Melo", Posicion.ALERO,
				2.64f, (byte) 10, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26,
				Valores.B, Valores.A, Valores.C, Valores.D, (byte) 6, (byte) 6);
		Jugador malikMonk = new Jugador((byte) 6, "Malik", "Monk", (byte) 11, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.D, (byte) 6, (byte) 6);
		Jugador leBronJames = new Jugador((byte) 6, "LeBron", "James", (byte) 6, "King James", Posicion.ALAPIVOT,
				41.18f, (byte) 18, (byte) 4, (byte) 4, (byte) 0, true, false, (byte) 3, (byte) 4, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.A, Valores.A, (byte) 6, (byte) 6);
		Jugador anthonyDavis = new Jugador((byte) 6, "Anthony", "Davis", (byte) 3, "The Brow", Posicion.ALAPIVOT,
				35.36f, (byte) 8, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.A, Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador dilonBrooks = new Jugador((byte) 6, "Dilon", "Brooks", (byte) 24, Posicion.ALAPIVOT, 12.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.A,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador desmondBane = new Jugador((byte) 6, "Desmond Michael", "Bane", (byte) 22, Posicion.ESCOLTA, 2.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 30, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador jaMorant = new Jugador((byte) 6, "Temetrius Jamel", "Morant", (byte) 12, "Ja Morant", Posicion.BASE,
				.603f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador brandonClarke = new Jugador((byte) 6, "Brandon", "Clarke", (byte) 15, Posicion.ALERO, 2.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 19, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador stevenAdams = new Jugador((byte) 6, "Steven", "Adams", (byte) 4, Posicion.PIVOT, 17, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B, Valores.D, Valores.C,
				Valores.A, (byte) 6, (byte) 6);

		Jugador jimmyButler = new Jugador((byte) 6, "Jimmy", "Butler", (byte) 22, "Jimmy Buckets", Posicion.ALERO,
				36.01f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 39,
				Valores.A, Valores.C, Valores.B, Valores.A, (byte) 6, (byte) 6);
		Jugador bamAdebayo = new Jugador((byte) 6, "Edrice Femi", "Adebayo", (byte) 5, "Bam", Posicion.PIVOT, 28.1f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador kyleLowry = new Jugador((byte) 6, "Kyle", "Lowry", (byte) 7, Posicion.BASE, 26.98f, (byte) 6, (byte) 1,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C, Valores.B, Valores.C,
				Valores.B, (byte) 6, (byte) 6);
		Jugador maxStrus = new Jugador((byte) 6, "Max", "Strus", (byte) 31, Posicion.ESCOLTA, 1.67f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C, Valores.B, Valores.C,
				Valores.B, (byte) 6, (byte) 6);
		Jugador pjTucker = new Jugador((byte) 6, "Anthony Leon", "Huerter", (byte) 3, "PJ Tucker", Posicion.ALAPIVOT,
				7f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.C, Valores.C, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador giannisAntetokoumpo = new Jugador((byte) 6, "Giannis Ougko", "Antetokounmpo", (byte) 34,
				"The Greek Freak", Posicion.ALAPIVOT, 39.34f, (byte) 6, (byte) 1, (byte) 2, (byte) 1, false, true,
				(byte) 1, (byte) 1, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
				r.nextInt(5) + 1, (byte) 32, Valores.A, Valores.C, Valores.B, Valores.A, (byte) 6, (byte) 6);
		Jugador graysonAllen = new Jugador((byte) 6, "Grayson", "Allen", (byte) 7, Posicion.ESCOLTA, 4, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.B, Valores.B, (byte) 6, (byte) 6);
		Jugador brookLopez = new Jugador((byte) 6, "Brook", "Lopez", (byte) 11, Posicion.PIVOT, 13.3F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador jrueHoliday = new Jugador((byte) 6, "Jrue", "Holiday", (byte) 12, Posicion.BASE, 32.43f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.B, Valores.A, (byte) 6, (byte) 6);
		Jugador khrisMiddleton = new Jugador((byte) 6, "Khris", "Middleton", (byte) 22, Posicion.ALERO, 33.5f, (byte) 3,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);

		Jugador anthonyEdwards = new Jugador((byte) 6, "Anthony", "Edwards", (byte) 1, "Ant", Posicion.ALERO, 10.25f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.B, (byte) 6, (byte) 6);
		Jugador malikBeasly = new Jugador((byte) 6, "Malik", "Beasly", (byte) 5, Posicion.ESCOLTA, 14.91f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador patrickBeverly = new Jugador((byte) 6, "Patrick", "Beverly", (byte) 22, Posicion.BASE, 14.32f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador kat = new Jugador((byte) 6, "Karl-Anthony", "Towns Cruz", (byte) 32, Posicion.PIVOT, 31.65f, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador jadenMcDanields = new Jugador((byte) 6, "Jaden", "McDanields", (byte) 3, Posicion.ALAPIVOT, 2.06f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador cjMcCollum = new Jugador((byte) 6, "Christian James", "McCollum", (byte) 3, "CJ McCollum",
				Posicion.ESCOLTA, 30.86f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 35, Valores.B, Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 6);
		Jugador jaxsonHayes = new Jugador((byte) 6, "Jaxon", "hayes", (byte) 10, Posicion.PIVOT, 5.34f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.D, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador herbertJones = new Jugador((byte) 6, "Herbert", "Jones", (byte) 5, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador devonteGraham = new Jugador((byte) 6, "Devonte'", "Graham", (byte) 4, Posicion.BASE, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.D, (byte) 6, (byte) 6);
		Jugador jonasValanciunas = new Jugador((byte) 6, "Jonas", "Valanciunas", (byte) 17, Posicion.ALERO, 14.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador rjBarret = new Jugador((byte) 6, "Rowan Alexander", "Barret", (byte) 9, "R.J.", Posicion.ALERO, 8.63f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador evanFournier = new Jugador((byte) 6, "Evan", "Fournier", (byte) 13, Posicion.ESCOLTA, 17.14f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador alecBurks = new Jugador((byte) 6, "Alec", "Burks", (byte) 18, Posicion.ESCOLTA, 9.35f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador mitchellRobinson = new Jugador((byte) 6, "Mitchell", "Robinson", (byte) 23, Posicion.PIVOT, 1.8f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador juliusRande = new Jugador((byte) 6, "Julius", "The King", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador coleAnthony = new Jugador((byte) 6, "Cole", "Anthony", (byte) 50, Posicion.BASE, 3.45f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.C, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador jalenSuggs = new Jugador((byte) 6, "Jalen", "Suggs", (byte) 4, Posicion.ESCOLTA, 6.59f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 6);
		Jugador moBamba = new Jugador((byte) 6, "Mohamed Fakaba", "Bamba", (byte) 5, "Mo Bamba", Posicion.BASE, 7.56f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador franzWagner = new Jugador((byte) 6, "Franz", "wagner", (byte) 22, Posicion.ALERO, 5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador jonathanIsaac = new Jugador((byte) 6, "Jonathan", "isaac", (byte) 1, Posicion.ALAPIVOT, .17f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador joelEmbiid = new Jugador((byte) 6, "Joel", "Embiid", (byte) 21, "Jojo", Posicion.PIVOT, 31.54f,
				(byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.B, Valores.B, Valores.A, (byte) 6, (byte) 6);
		Jugador jamesHarden = new Jugador((byte) 6, "James", "Harden", (byte) 13, "The Beard", Posicion.BASE, 44.31f,
				(byte) 10, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 3, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 6, (byte) 6);
		Jugador tyreseMaxey = new Jugador((byte) 6, "Tyrese", "Maxey", (byte) 0, Posicion.ESCOLTA, 2.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador tobiasHarris = new Jugador((byte) 6, "Tobias", "Harris", (byte) 12, Posicion.ALAPIVOT, 35.95f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador matisseThybulle = new Jugador((byte) 6, "Mathisse", "Thybulle", (byte) 22, Posicion.ALERO, 2.84f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 6, (byte) 6);

		Jugador deandreAyton = new Jugador((byte) 6, "Deandre", "Ayton", (byte) 22, Posicion.PIVOT, 12.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.D, Valores.D, Valores.A, (byte) 6, (byte) 6);
		Jugador mikalBridges = new Jugador((byte) 6, "Mikal", "Bridges", (byte) 25, Posicion.ALERO, 5.57F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.B, Valores.A, (byte) 6, (byte) 6);
		Jugador devinBooker = new Jugador((byte) 6, "Devin", "Booker", (byte) 1, "D-Book", Posicion.ESCOLTA, 31.65f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador jaeCrowder = new Jugador((byte) 6, "Jae", "Crowder", (byte) 99, Posicion.ALAPIVOT, 9.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador chrisPaul = new Jugador((byte) 6, "Chris", "Paul", (byte) 3, Posicion.BASE, 30.8f, (byte) 12, (byte) 0,
				(byte) 0, (byte) 0, true, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B, Valores.B, Valores.A,
				Valores.A, (byte) 6, (byte) 6);

		Jugador damianLillard = new Jugador((byte) 6, "Damian", "Lillard", (byte) 0, "Dame Time", Posicion.BASE, 39.34f,
				(byte) 6, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 6, (byte) 6);
		Jugador anferneeSimons = new Jugador((byte) 6, "Anfernee", "Simons", (byte) 1, Posicion.ESCOLTA, 3.9f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador cjjElleby = new Jugador((byte) 6, "CJ", "Elleby", (byte) 16, Posicion.ALERO, 1.15f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 20, Valores.C, Valores.C, Valores.D,
				Valores.C, (byte) 6, (byte) 6);
		Jugador justiceWinslow = new Jugador((byte) 6, "Justice", "Winslow", (byte) 26, Posicion.ALAPIVOT, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador jusufNurkic = new Jugador((byte) 6, "Jusuf", "Nurkic", (byte) 27, Posicion.PIVOT, 12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.C, Valores.B, (byte) 6, (byte) 6);

		Jugador deAaronFox = new Jugador((byte) 6, "De'Aaron", "Fox", (byte) 5, Posicion.BASE, 28.1f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.D, (byte) 6, (byte) 6);
		Jugador harrisonBarnes = new Jugador((byte) 6, "Harrison", "Barnes", (byte) 40, Posicion.ALERO, 20.29f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador justinHoliday = new Jugador((byte) 6, "Justin", "Holiday", (byte) 9, Posicion.ESCOLTA, 6f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador domantasSabonis = new Jugador((byte) 6, "Domantas", "Sabonis", (byte) 10, Posicion.PIVOT, 19.8f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador mauriceHarkless = new Jugador((byte) 6, "Maurice", "Harkless", (byte) 8, "Moe Harkless",
				Posicion.ALAPIVOT, 4.2f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.C, Valores.D, Valores.C, Valores.B, (byte) 6, (byte) 6);

		Jugador dejounteMurray = new Jugador((byte) 6, "Dejounte", "Murray", (byte) 5, Posicion.BASE, 15.24f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.B, Valores.B, Valores.B, (byte) 6, (byte) 6);
		Jugador lonnieWalker = new Jugador((byte) 6, "Lonnie", "Walker IV", (byte) 1, Posicion.ESCOLTA, 4.47f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador keldonJhonson = new Jugador((byte) 6, "Keldon", "Jhonson", (byte) 3, Posicion.ALAPIVOT, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador douMcDermott = new Jugador((byte) 6, "Doug", "McDermott", (byte) 17, Posicion.ALERO, 7.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador jakobPoeltl = new Jugador((byte) 6, "Jakob", "Poeltl", (byte) 25, Posicion.PIVOT, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 6, (byte) 6);

		Jugador luguentzDortz = new Jugador((byte) 6, "Luguentz", "Dortz", (byte) 5, "Lu Dortz", Posicion.ALERO, 1.78f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador dariusBazley = new Jugador((byte) 6, "Darius", "Bazley", (byte) 7, Posicion.ALAPIVOT, 2.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador joshGiddey = new Jugador((byte) 6, "josh", "Giddey", (byte) 3, Posicion.ESCOLTA, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador kenrichWilliams = new Jugador((byte) 6, "Kenrich", "Williams", (byte) 34, Posicion.PIVOT, 2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.D, Valores.D, Valores.C, (byte) 6, (byte) 6);
		Jugador sga = new Jugador((byte) 6, "Shai", "Gilgeous-Alexander", (byte) 2, Posicion.BASE, 5.49f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 6);

		Jugador mikeConley = new Jugador((byte) 6, "Mike", "Conley", (byte) 11, Posicion.BASE, 21f, (byte) 1, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B, Valores.A, Valores.A,
				Valores.D, (byte) 6, (byte) 6);
		Jugador bojanBogdanovich = new Jugador((byte) 6, "Bojan", "Bogdanovich", (byte) 44, Posicion.ALAPIVOT, 18.7f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador donovanMitchell = new Jugador((byte) 6, "Donovan", "Mitchell", (byte) 45, "Spida Mitchell",
				Posicion.ESCOLTA, 28.1f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.A, Valores.A, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador jordanClarkson = new Jugador((byte) 6, "Jordan", "Clarkson", (byte) 00, Posicion.ALERO, 12.42f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador rudyGobert = new Jugador((byte) 6, "Rudy", "Gobert", (byte) 27, "The French Bulldog", Posicion.PIVOT,
				35.34f, (byte) 3, (byte) 0, (byte) 0, (byte) 3, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.D, Valores.D, Valores.A, (byte) 6, (byte) 6);

		Jugador bradleyBeal = new Jugador((byte) 6, "Bradley", "Beal", (byte) 3, Posicion.BASE, 33.72F, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.B, Valores.C, (byte) 6, (byte) 6);
		Jugador daniAvdija = new Jugador((byte) 6, "Deni", "Advija", (byte) 9, Posicion.ALERO, 4.69f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 24, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador kcp = new Jugador((byte) 6, "kentavius", "Cadwell-Pope", (byte) 1, "KCP", Posicion.ESCOLTA, 13.03f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador thomasBryant = new Jugador((byte) 6, "Thomas", "Bryant", (byte) 13, Posicion.PIVOT, 8.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.B,
				Valores.C, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador kristapsPorzingis = new Jugador((byte) 6, "Kristaps", "Porzingis", (byte) 6, Posicion.ALAPIVOT, 31.65f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.C, (byte) 6, (byte) 6);

		Jugador scottieBarnes = new Jugador((byte) 6, "Scott Wayne", "Barnes", (byte) 4, "Scottie", Posicion.ALERO,
				7.28f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.C, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador ogAnunoby = new Jugador((byte) 6, "Ogugua", "Anunoby", (byte) 3, "OG", Posicion.ALAPIVOT, 16, (byte) 0,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.B, Valores.B, Valores.A, (byte) 6, (byte) 6);
		Jugador fredVanVleet = new Jugador((byte) 6, "Fred", "VanVleet", (byte) 23, Posicion.BASE, 19.67f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 6);
		Jugador pascalSiakam = new Jugador((byte) 6, "Pascal", "Siakam", (byte) 43, "Spicy P", Posicion.PIVOT, 33f,
				(byte) 1, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.A, (byte) 6, (byte) 6);
		Jugador garyTrentJr = new Jugador((byte) 6, "Gary", "Trent Jr", (byte) 33, Posicion.ALERO, 16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);

		Jugador reggieJackson = new Jugador((byte) 6, "Reggie", "Jackson", (byte) 1, Posicion.BASE, 10.38f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 6, (byte) 6);
		Jugador paulGeorge = new Jugador((byte) 6, "Paul", "George", (byte) 13, "PG13", Posicion.ESCOLTA, 39.34f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 6);
		Jugador kawhiLeonard = new Jugador((byte) 6, "Kawhi", "Leonard", (byte) 2, "Mr Fun Guy", Posicion.ALERO, 39.34f,
				(byte) 5, (byte) 2, (byte) 0, (byte) 2, false, false, (byte) 1, (byte) 2, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.C, Valores.A, (byte) 6, (byte) 6);
		Jugador ivicaZubac = new Jugador((byte) 6, "Ivica", "Zubac", (byte) 40, Posicion.PIVOT, 7.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 6, (byte) 6);
		Jugador robertCovington = new Jugador((byte) 6, "Robert", "Covington", (byte) 23, Posicion.PIVOT, 12.98f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.C, Valores.D, Valores.A, (byte) 6, (byte) 6);

	}
}
