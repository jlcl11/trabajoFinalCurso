package utlis;

import java.util.ArrayList;

import clases.JugadorNormal;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.Equipo;
import superClases.Jugador;

public class funcionesUtiles {
	

/*
	public static String devolverPremioAnotador() {
		String ret = "";

		ArrayList<JugadorNormal> jugadoresNormalesNBA = JugadorNormal.JugadoresNormales();

		for (byte i = 1; i < jugadoresNormalesNBA.size(); i++) {

			if (jugadoresNormalesNBA.get(i).getPPG() > jugadoresNormalesNBA.get(i-1).getPPG()) {

				ret = "\n" + jugadoresNormalesNBA.get(i) + "\n";
				jugadoresNormalesNBA.remove(i-1);

			}
		

		}

		return ret;

	}

	public static String devolverMVP() {
		String ret = "";

		ArrayList<JugadorNormal> jugadoresNormalesNBA = JugadorNormal.JugadoresNormales();

		for (byte i = 0; i < jugadoresNormalesNBA.size(); i++) {

			if ((jugadoresNormalesNBA.get(i + 1).getPPG() + jugadoresNormalesNBA.get(i + 1).getAPG()
					+ jugadoresNormalesNBA.get(i + 1).getRBG() + jugadoresNormalesNBA.get(i + 1).getSPG()
					+ jugadoresNormalesNBA.get(i + 1).getBPG()) > (jugadoresNormalesNBA.get(i).getPPG()
							+ jugadoresNormalesNBA.get(i).getAPG() + jugadoresNormalesNBA.get(i).getRBG()
							+ jugadoresNormalesNBA.get(i).getSPG() + jugadoresNormalesNBA.get(i).getBPG())) {

				ret += "\n" + jugadoresNormalesNBA.get(i) + "\n";

			}
			jugadoresNormalesNBA.remove(i);

		}

		return ret;

	}

	public static String devolverDPOY() {
		String ret = "";

		ArrayList<JugadorNormal> jugadoresNormalesNBA = JugadorNormal.JugadoresNormales();

		for (byte i = 0; i < jugadoresNormalesNBA.size(); i++) {

			if ((jugadoresNormalesNBA.get(i + 1).getRBG() + jugadoresNormalesNBA.get(i + 1).getSPG()
					+ jugadoresNormalesNBA.get(i + 1).getBPG()) > (jugadoresNormalesNBA.get(i).getRBG()
							+ jugadoresNormalesNBA.get(i).getSPG() + jugadoresNormalesNBA.get(i).getBPG())) {

				ret += "\n" + jugadoresNormalesNBA.get(i) + "\n";

			}
			jugadoresNormalesNBA.remove(i);

		}

		return ret;

	}*/

	public static String getDorsalesRetirados(String nombre) throws EquipoSinDorsalesRetiradosException {
		String ret = "";

		if (nombre.equals("Hawks")) {
			Jugador bobCousy = new Jugador("Bob", "Cousy", (byte) 9);
			Jugador tedTurner = new Jugador("Ted", "Turner", (byte) 17);
			Jugador dominiqueWilkins = new Jugador("Dominique", "Wilkins", (byte) 21);
			Jugador louHudson = new Jugador("Lou", "Hudson", (byte) 23);
			Jugador jasonColler = new Jugador("Jason", "Collier", (byte) 40);
			Jugador peteMaravich = new Jugador("Pete", "Maravich", (byte) 44, "Pistol Pete");
			Jugador dikembeMutombo = new Jugador("Dikembe", "Mutombo", (byte) 55);

			Jugador[] dorsalesRetiradosHawks = { bobCousy, tedTurner, dominiqueWilkins, louHudson, jasonColler,
					peteMaravich, dikembeMutombo };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS HAWKS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosHawks.length; i++) {

				ret += dorsalesRetiradosHawks[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Celtics")) {

			Jugador robertparish = new Jugador("Robert", "Parish", (byte) 00);
			Jugador walterBrown = new Jugador("Walter", "brown", (byte) 1);
			Jugador arnoldAuerbach = new Jugador("Arnold", "Auerbach", (byte) 2, "Red");
			Jugador dennisJhonson = new Jugador("Dennis", "Jhonson", (byte) 3);
			Jugador kevinGarnet = new Jugador("Kevin", "Garnet", (byte) 5, "Big Ticket");
			Jugador billRussel = new Jugador("Bill", "Russel", (byte) 6, "Lord of the Rings");
			Jugador jojoWhite = new Jugador("Jo Jo", "White", (byte) 10);
			Jugador bobCousyCeltics = new Jugador("Bob", "Cousy", (byte) 14);
			Jugador tomHeison = new Jugador("Tom", "Heison", (byte) 15);
			Jugador tomSanders = new Jugador("Tom", "Sanders", (byte) 16, "Satch");
			Jugador jhonHavliceK = new Jugador("Jhon", "Havlicek", (byte) 17);
			Jugador jimLoscutoff = new Jugador("Bob", "Cousy", (byte) 18);
			Jugador daveCowens = new Jugador("Dave", "Cowens", (byte) 18);
			Jugador donaldNelson = new Jugador("Donald", "Nelson", (byte) 19, "Don Nelson");
			Jugador billSharman = new Jugador("Bill", "Sharman", (byte) 21);
			Jugador edMacauley = new Jugador("Edward", "Macauley", (byte) 22, "Ed Macauley");
			Jugador frankRamsey = new Jugador("Frank Vernon", "Ramsey", (byte) 23, "Frank Ramsey");
			Jugador samJones = new Jugador("Sam", "Jones", (byte) 24);
			Jugador kcJones = new Jugador("K.C.", "Jones", (byte) 25);
			Jugador cedricMaxwell = new Jugador("Cedric", "Maxwell", (byte) 31, "Cornbread");
			Jugador kevinMcHale = new Jugador("Kevin Edward", "McHale", (byte) 32, "Kevin McHale");
			Jugador larryBird = new Jugador("Larry Joe", "Bird", (byte) 33, "Larry Bird");
			Jugador paulPierce = new Jugador("Paul", "Pierce", (byte) 34, "the truth");
			Jugador reggieLewis = new Jugador("Reginald", "Lewis", (byte) 35, "Reggie Lewis");

			Jugador[] dorsalesRetiradosCeltics = { robertparish, walterBrown, arnoldAuerbach, dennisJhonson,
					kevinGarnet, billRussel, jojoWhite, bobCousyCeltics, tomHeison, tomSanders, jhonHavliceK,
					jimLoscutoff, daveCowens, donaldNelson, billSharman, edMacauley, frankRamsey, samJones, kcJones,
					cedricMaxwell, kevinMcHale, larryBird, paulPierce, reggieLewis };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS CELTICS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosCeltics.length; i++) {

				ret += dorsalesRetiradosCeltics[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}
		if (nombre.equals("Nets")) {

			Jugador drazenPetrovich = new Jugador("Dražen ", "Petrović", (byte) 3);
			Jugador wendellLadner = new Jugador("Wendell", "Ladner", (byte) 4);
			Jugador jasonKidd = new Jugador("Jason", "Kidd", (byte) 5);
			Jugador jhonWilliamson = new Jugador("Jhon Lee", "Williamson", (byte) 23, "John Williamson");
			Jugador billMelchionni = new Jugador("William P", "Melchionni", (byte) 25, "Bill Melchionni");
			Jugador juliusErving = new Jugador("Julius Winfield", "Earving ||", (byte) 32, "Dr J");
			Jugador buckWilliams = new Jugador("Dikembe", "Mutombo", (byte) 55);

			Jugador[] dorsalesRetiradosNets = { drazenPetrovich, wendellLadner, jasonKidd, jhonWilliamson,
					billMelchionni, juliusErving, buckWilliams };

			ret += "-----------------------------------------" + "\n";
			ret += " -----DORSALES RETIRADOS DE LOS NETS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosNets.length; i++) {

				ret += dorsalesRetiradosNets[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Hornets")) {

			Jugador bobbyPhills = new Jugador("Bobby Ray ", "Phills ||", (byte) 13, "Bobby Phills");
			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS HORNETS----" + "\n";
			ret += "|                                       |" + "\n";
			ret += bobbyPhills + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Bulls")) {

			Jugador michaelJordan = new Jugador("Michael", "Jordan", (byte) 23, "Air Jordan");
			Jugador scottiePippen = new Jugador("Scottie", "Pippen", (byte) 33, "Pip");
			Jugador bobLove = new Jugador("Bob", "Love", (byte) 10);
			Jugador jerrySloan = new Jugador("Jerry", "Sloan", (byte) 4);

			Jugador[] dorsalesRetiradosBulls = { michaelJordan, scottiePippen, bobLove, jerrySloan };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS BULLS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosBulls.length; i++) {

				ret += dorsalesRetiradosBulls[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Cavaliers")) {

			Jugador bingoSmith = new Jugador("Robert", "Smith", (byte) 7, "Bingo Smith");
			Jugador zydrunasilgaukas = new Jugador("Žydrūnas ", "Ilgauskas", (byte) 11);
			Jugador larryNance = new Jugador("Larry Donnel", "Nance Sr", (byte) 2, "Larry Nance");
			Jugador markPrice = new Jugador("William Mark", "Price", (byte) 25, "Mark Price");
			Jugador austinCarr = new Jugador("Austin George ", "Carr", (byte) 34, "Austin Carr");
			Jugador nateThurmond = new Jugador("Nathaniel", "Thurmond", (byte) 42, "Nate the Great");
			Jugador bradDaugherty = new Jugador("Bradley Lee", "Daugherty", (byte) 43, "Brad Daugherty");

			Jugador[] dorsalesRetiradosCavs = { bingoSmith, zydrunasilgaukas, larryNance, markPrice, austinCarr,
					nateThurmond, bradDaugherty };

			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS CAVALIERS---" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosCavs.length; i++) {

				ret += dorsalesRetiradosCavs[i];
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Mavericks")) {

			Jugador derekHarper = new Jugador("Derek ", "Harper", (byte) 12);
			Jugador bradDavis = new Jugador("Bradley Ernest ", "Davis", (byte) 15, "Brad Davis");
			Jugador rolandoBlackman = new Jugador("Rolando  Antonio", "Price", (byte) 22, "Ro Blackman");
			Jugador dirkNowitzki = new Jugador("Dirk", "Werner Nowitzki", (byte) 41, "Wunderkind");

			Jugador[] dorsalesRetiradosMavs = { derekHarper, bradDavis, rolandoBlackman, dirkNowitzki };

			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS MAVERICKS---" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosMavs.length; i++) {

				ret += dorsalesRetiradosMavs[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals(("Nuggets"))) {
			Jugador alexEnglish = new Jugador("Alexander", "English", (byte) 2, "Alex English");
			Jugador fatLever = new Jugador("Lafayette ", "Lever", (byte) 12, "Fat Lever");
			Jugador davidThompson = new Jugador("David O'Neil", "Thompson", (byte) 33);
			Jugador byronbeck = new Jugador("Byrin", "Beck", (byte) 40);
			Jugador danIssel = new Jugador("Daniel Paul ", "Issel", (byte) 44, "Dan Issel");
			Jugador dikembeMutomboNuggets = new Jugador("Dikembe", "Mutombo", (byte) 55);
			Jugador dougMoe = new Jugador("Douglas Edwin", "Moe", (byte) 432, "Doug Moe");

			Jugador[] dorsalesRetiradosNuggets = { alexEnglish, fatLever, davidThompson, byronbeck, danIssel,
					dikembeMutomboNuggets, dougMoe };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS NUGGETS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosNuggets.length; i++) {

				ret += dorsalesRetiradosNuggets[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Pistons")) {

			Jugador chaunceyBillups = new Jugador("Chauncey", "Billups", (byte) 1, "Mr. Big Shot");
			Jugador chuckDaily = new Jugador("Charles Jerome ", "Daily", (byte) 2, "Chuck Daly");
			Jugador benWallace = new Jugador("Ben", "Wallace", (byte) 6, "Big Ben");
			Jugador joeDumars = new Jugador("Joe", "Dumars", (byte) 4, "Joe-D");
			Jugador dennisRodman = new Jugador("Dennis Keith", "Rodman", (byte) 10, "The Worm");
			Jugador isaiahThomas = new Jugador("Isiah Lord", "Thomas", (byte) 11, "Zeke");
			Jugador vinnieJhonson = new Jugador("Vincent", "Jhonson", (byte) 15, "Microwave");
			Jugador bobLanier = new Jugador("Robert Jerry", "Lanier", (byte) 16, "Bob Lanier");
			Jugador daveBing = new Jugador("David ", "Bing", (byte) 21, "Duke");
			Jugador richardHamilton = new Jugador("Richard Clay", "Hamilton", (byte) 32, "The Man in the Mask");
			Jugador billLaimbeer = new Jugador("William J.", "Laimbeer", (byte) 40, "Bill Laimbeer");

			Jugador[] dorsalesRetiradosPistons = { chaunceyBillups, chuckDaily, benWallace, joeDumars, dennisRodman,
					isaiahThomas, vinnieJhonson, bobLanier, daveBing, richardHamilton, billLaimbeer };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS PISTONS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosPistons.length; i++) {

				ret += dorsalesRetiradosPistons[i] + "\n";
			}

			ret += "|                                       |";
			ret += "-----------------------------------------";
		}

		if (nombre.equals("Warriors")) {

			Jugador wiltChamberlain = new Jugador("Wilton Norman", "Chamberlain", (byte) 13, "Wilt the Stilt");
			Jugador thomMeschery = new Jugador("Thomas Nicholas  ", "Meschery", (byte) 14, "Thom Meschery");
			Jugador alAttles = new Jugador("Alvin", "Attles", (byte) 16, "Destroyer");
			Jugador chrisMullin = new Jugador("Christopher Paul", "Dumars", (byte) 17, "Chris Mullin");
			Jugador rickBarry = new Jugador("Richard Francis Dennis", "Barry |||", (byte) 24, "Greyhound");
			Jugador nateThurmondWarriors = new Jugador("Nathaniel", "Thurmond", (byte) 42, "Nate the Great");

			Jugador[] dorsalesRetiradosWarriors = { wiltChamberlain, thomMeschery, alAttles, chrisMullin, rickBarry,
					nateThurmondWarriors };

			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS WARRIORS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosWarriors.length; i++) {

				ret += dorsalesRetiradosWarriors[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Rockets")) {

			Jugador yaoMing = new Jugador("Yao", "Ming", (byte) 11, "Yao's dinasty");
			Jugador clydeDrexler = new Jugador("Clyde Austin", "Drexler ", (byte) 22, "The Glide");
			Jugador calvinMurphy = new Jugador("Calvin Jerome", "Murphy ", (byte) 23, "Destroyer");
			Jugador mosesMalone = new Jugador("Moses Eugene", "Malone", (byte) 24, "Moses Malone");
			Jugador hakeemOlajuwon = new Jugador("Hakeem Abdul", "Olajuwon", (byte) 34, "The Dream");
			Jugador rudyTomjanovich = new Jugador("Rudolph ", "Tomjanovich", (byte) 45, "Rudy Tomjanovich");

			Jugador[] dorsalesRetiradosRockets = { yaoMing, clydeDrexler, calvinMurphy, mosesMalone, hakeemOlajuwon,
					rudyTomjanovich };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS ROCKETS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosRockets.length; i++) {

				ret += dorsalesRetiradosRockets[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Pacers")) {

			Jugador georgemcGinnis = new Jugador("George", "McGinnis", (byte) 30);
			Jugador reggieMiller = new Jugador("Reginald Wayne", "Miller ", (byte) 31, "Miller Time");
			Jugador melDaniels = new Jugador("Melvin Joe", "Daniels ", (byte) 34, "Melvin Joe");
			Jugador rogerBrown = new Jugador("Roger William", "Brown", (byte) 35, "The Rajah");
			Jugador slickLeonard = new Jugador("William Robert", "Leonard", (byte) 529, "Slick Leonard");

			Jugador[] dorsalesRetiradosPacers = { georgemcGinnis, reggieMiller, melDaniels, rogerBrown, slickLeonard, };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS PACERS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosPacers.length; i++) {

				ret += dorsalesRetiradosPacers[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Lakers")) {

			Jugador kobe8 = new Jugador("Kobe ", "Bryant", (byte) 8, "Black mamba");
			Jugador wiltChamberlain = new Jugador("Wilton Norman", "Chamberlain", (byte) 13, "Wilt the Stilt");
			Jugador elginBaylor = new Jugador("Elgin Gay", "Baylor ", (byte) 22, "Elgin Baylor");
			Jugador kobe24 = new Jugador("Kobe ", "Bryant", (byte) 24, "Black mamba");
			Jugador gailGoodrich = new Jugador("Gail Charles", "Goodrich", (byte) 25, "The Stump");
			Jugador magicJhonson = new Jugador("Earvin", "Jhonson", (byte) 32, "Magic Jhonson");
			Jugador kareemAbdulJabbar = new Jugador("Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook");
			Jugador shaquilleOneal = new Jugador("Shaquille Rashaun", "O'Neal ", (byte) 34, "Shaq Attack");
			Jugador jamesWorthy = new Jugador("James Ager ", "Worthy", (byte) 42, "Big Game James");
			Jugador jerryWest = new Jugador("Jerome Alan", "West", (byte) 44, "The Logo");
			Jugador jamalWilkes = new Jugador("Jamaal Abdul-Lateef", "Wilkes", (byte) 52, "Smooth as Silk");
			Jugador jimPollard = new Jugador("James Clifford", "Pollard", (byte) 17, "The Kangaroo Kid");
			Jugador vernMikelsen = new Jugador("Arild Verner Agerskov", "Mikkelsen", (byte) 19, "Ven Mikkelsen");
			Jugador slaterMartin = new Jugador("Slater Nelson", "Martin", (byte) 22, "Dugie");
			Jugador clydeLovellete = new Jugador("Clyde Edward", "Lovellette", (byte) 34, "Clyde Lovellette");
			Jugador georgeMikan = new Jugador("George Lawrence", "Mikan", (byte) 99, "Mr. Basketball");

			Jugador[] dorsalesRetiradosLaKers = { kobe8, wiltChamberlain, elginBaylor, kobe24, gailGoodrich,
					magicJhonson, kareemAbdulJabbar, shaquilleOneal, jamesWorthy, jerryWest, jamalWilkes, jimPollard,
					vernMikelsen, slaterMartin, clydeLovellete, georgeMikan };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS LAKERS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosLaKers.length; i++) {

				ret += dorsalesRetiradosLaKers[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Grizzlies")) {

			Jugador zachRandolph = new Jugador("Zachary McKenley", "Randolph", (byte) 50, "Z-Bo");
			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS GRIZZLIES---" + "\n";
			ret += "|                                       |" + "\n";
			ret += zachRandolph + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Heat")) {
			Jugador chrisBosh = new Jugador("Christopher Wesson ", "Bosh", (byte) 1, "Boshasaurus");
			Jugador dwayneWade = new Jugador("Dwyane Tyrone", "Wade ", (byte) 3, "Flash");
			Jugador timHardaway = new Jugador("Timothy Duane", "Hardaway", (byte) 10, "Tim Bug");
			Jugador danMarino = new Jugador("Daniel Constantine ", "Marino", (byte) 13);
			Jugador michaelJordan = new Jugador("Michael", "Jordan", (byte) 23, "Air Jordan");
			Jugador shaquilleOnealHeat = new Jugador("Shaquille Rashaun", "O'Neal ", (byte) 32, "Shaq Attack");
			Jugador alonzoMourning = new Jugador("Alonzo Harding ", "Mourning", (byte) 33, "Zo");

			Jugador[] dorsalesRetiradosHeat = { chrisBosh, dwayneWade, timHardaway, danMarino, michaelJordan,
					shaquilleOnealHeat, alonzoMourning };

			ret += "-----------------------------------------" + "\n";
			ret += "------DORSALES RETIRADOS DE LOS HEAT-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosHeat.length; i++) {

				ret += dorsalesRetiradosHeat[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Bucks")) {

			Jugador oscarRobertson = new Jugador("Oscar Palmer", "Robertson", (byte) 1, "Mr.Triple-Double");
			Jugador juniorBridgeman = new Jugador("Ulysses Lee", "Bridgeman ", (byte) 2, "Junior Bridgeman");
			Jugador sidneyMoncrief = new Jugador("Sidney Alvin", "Moncrief", (byte) 4, "The squid");
			Jugador marquesJhonson = new Jugador("Marques Kevin", "Johnson", (byte) 8, "Slammer");
			Jugador jonMcGlockin = new Jugador("Jon P.", "McGlockin", (byte) 14, "Jonny Mac");
			Jugador bobLanier = new Jugador("Robert Jerry", "Lanier", (byte) 16, "Bob Lanier");
			Jugador brianWinters = new Jugador("Brian Joseph", "Winters", (byte) 32, "Lurch");
			Jugador kareemAbdulJabbar = new Jugador("Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook");

			Jugador[] dorsalesRetiradosBucks = { oscarRobertson, juniorBridgeman, sidneyMoncrief, marquesJhonson,
					jonMcGlockin, bobLanier, brianWinters, kareemAbdulJabbar };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS BUCKS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosBucks.length; i++) {

				ret += dorsalesRetiradosBucks[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Timberwolves")) {
			Jugador malikSealy = new Jugador("Malik", "Sealy", (byte) 2, "Silk");
			ret += "-----------------------------------------" + "\n";
			ret += "--DORSALES RETIRADOS DE LOS TIMBERWOLVES-" + "\n";
			ret += "|                                       |" + "\n";
			ret += malikSealy + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Pelicans")) {

			Jugador peteMaravichPelicans = new Jugador("Pete", "Maravich", (byte) 7, "Pistol Pete");
			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS PELICANS---" + "\n";
			ret += "|                                       |" + "\n";
			ret += peteMaravichPelicans + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Knicks")) {

			Jugador waltFrazier = new Jugador("Walter", "Frazier", (byte) 10, "Clyde");
			Jugador dickBarnet = new Jugador("Richard", "Barnett ", (byte) 12, "Dick Barnett");
			Jugador earlMonroe = new Jugador("Vernon Earl", "Monroe", (byte) 15, "The Pearl");
			Jugador dickMcGuire = new Jugador("Richard Josephn", "McGuire", (byte) 15, "Dick the Knick");
			Jugador willisReed = new Jugador("Willis", "Reed", (byte) 19);
			Jugador daveDeBusschere = new Jugador("David Albert", "DeBusschere", (byte) 22, "Big D");
			Jugador billBradley = new Jugador("William Warren ", "Bradley", (byte) 24, "Bill Bradley");
			Jugador patrickEwing = new Jugador("Patrick Aloysius", "Ewing", (byte) 33, "Big Pat");
			Jugador redHolzman = new Jugador("William", "Holzman", (byte) 613, "Big D");

			Jugador[] dorsalesRetiradosKnicks = { waltFrazier, dickBarnet, earlMonroe, dickMcGuire, willisReed,
					daveDeBusschere, billBradley, patrickEwing, redHolzman };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS KNICKS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosKnicks.length; i++) {

				ret += dorsalesRetiradosKnicks[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Magic")) {

			Jugador aficion = new Jugador("Afición", "", (byte) 6);
			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS MAGIC-----" + "\n";
			ret += "|                                       |" + "\n";
			ret += aficion + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("76ers")) {

			Jugador mosesMalonePhilly = new Jugador("Moses Eugene", "Malone", (byte) 2, "Moses Malone");
			Jugador allenIverson = new Jugador("Allen Ezail", "Iverson ", (byte) 3, "The Answer");
			Jugador juliusErvingPhilly = new Jugador("Julius Winfield", "Earving ||", (byte) 6, "Dr J");
			Jugador mauriceCheeks = new Jugador("Maurice Edward", "Cheeks", (byte) 10, "Little Mo");
			Jugador wiltChamberlain = new Jugador("Wilton Norman", "Chamberlain", (byte) 13, "Wilt the Stilt");
			Jugador halGreer = new Jugador("Harold Everett", "Greer", (byte) 15, "Hal Greer");
			Jugador bobbyJones = new Jugador("Robert Clyde", "Jones", (byte) 22, "Bobby Jones");
			Jugador billyChunningham = new Jugador("William John", "Cunningham ", (byte) 32, "Bily Cunningham");
			Jugador charlesBarkley = new Jugador("Charles Wade", "Barkley", (byte) 34, "El Gordo");

			Jugador[] dorsalesRetirados76ers = { mosesMalonePhilly, allenIverson, juliusErvingPhilly, mauriceCheeks,
					wiltChamberlain, halGreer, bobbyJones, billyChunningham, charlesBarkley };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS 76ERS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetirados76ers.length; i++) {

				ret += dorsalesRetirados76ers[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Suns")) {

			Jugador dickVanArsdale = new Jugador("Richard Albert", "Van Arsdale", (byte) 5, "Dick Van Arsdale");
			Jugador walterDavis = new Jugador("Walter Paul", "Davis ", (byte) 6, "Sweet D");
			Jugador kevinJhonson = new Jugador("Kevin Maurice", "Jhonson", (byte) 7, "K.J");
			Jugador danMajerle = new Jugador("Daniel Lewis", "Majerle", (byte) 9, "Thunder Dan");
			Jugador steveNash = new Jugador("Stephen John", "Nash", (byte) 13, "Nasty Nash");
			Jugador tomChambers = new Jugador("Thomas Doane", "Chambers ", (byte) 24, "Tommy Gun");
			Jugador alvanAdams = new Jugador("Alvan Leigh", "Adams  ", (byte) 33, "Double A");
			Jugador charlesBarkley = new Jugador("Charles Wade", "Barkley", (byte) 34, "El Gordo");
			Jugador connieHawkins = new Jugador("Cornelius ", "Hawkins", (byte) 42, "The Hawk");
			Jugador paulWestphal = new Jugador("Paul Douglas", "Westphal ", (byte) 44, "Paul Westphal");
			Jugador cottonFitzsimmons = new Jugador("Lowell", "Lowell ", (byte) 42, "Cotton Fitzsimmons");

			Jugador[] dorsalesRetiradosSuns = { dickVanArsdale, walterDavis, kevinJhonson, danMajerle, steveNash,
					tomChambers, alvanAdams, charlesBarkley, connieHawkins, paulWestphal, cottonFitzsimmons };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS SUNS------" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosSuns.length; i++) {

				ret += dorsalesRetiradosSuns[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Trail Blazers")) {

			Jugador larryWeinberg = new Jugador("Larry", "Weinberg", (byte) 1);
			Jugador davidTwardzik = new Jugador("David", "Twardzik", (byte) 13);
			Jugador lionelHollins = new Jugador("Lionel Eugene", "Hollins", (byte) 14, "L-Train");
			Jugador larrySteele = new Jugador("Maurice D.", "Steele ", (byte) 15, "Man of steele");
			Jugador mauriceLucas = new Jugador("Stephen John", "Lucas", (byte) 20, "Mo Lucas");
			Jugador clydeDrexler = new Jugador("Clyde Austin", "Drexler ", (byte) 22, "The Glide");
			Jugador bobGross = new Jugador("Robert Edwin", "Gross ", (byte) 30, "Bob Gross");
			Jugador terryPorter = new Jugador("Terry", "Porter", (byte) 30);
			Jugador billWalton = new Jugador("William Theodore", "Walton", (byte) 32, "Big Red-Head");
			Jugador lloydNeal = new Jugador("Lloyd ", "Neal ", (byte) 36);
			Jugador geoffPetrie = new Jugador("Geoffrey Michael", "Petrie ", (byte) 45, "Geoff Petrie");
			Jugador jackRamsay = new Jugador("Dr. John T.", "Ramsay ", (byte) 77);

			Jugador[] dorsalesRetiradosBlazers = { larryWeinberg, davidTwardzik, lionelHollins, larrySteele,
					mauriceLucas, clydeDrexler, bobGross, terryPorter, billWalton, lloydNeal, geoffPetrie, jackRamsay };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS BLAZERS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosBlazers.length; i++) {

				ret += dorsalesRetiradosBlazers[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}
		if (nombre.equals("Kings")) {

			Jugador nateArchibal = new Jugador("Nathaniel", "Archibald", (byte) 1, "Nate Tiny Archibald");
			Jugador mithcRichmond = new Jugador("Mitchell James", "Richmond", (byte) 2, "Hammer");
			Jugador chrisWebber = new Jugador("Mayce Edward Christopher", "Webber ", (byte) 4, "Chris Webber");
			Jugador aficion = new Jugador("Afición", "", (byte) 6);
			Jugador bobDavies = new Jugador("Robert Edris", "Davies", (byte) 11, "The Harrisburg Houdini");
			Jugador mauriceStokes = new Jugador("Maurice", "Stokes", (byte) 12, "Mo Stokes");
			Jugador oscarRobertsonKings = new Jugador("Oscar Palmer", "Robertson", (byte) 14, "Mr.Triple-Double");
			Jugador predragStojakovic = new Jugador("Predrag Peđa", "Stojaković", (byte) 16, "Peja Stojaković");
			Jugador vladeDivac = new Jugador("Vlade", "Divac", (byte) 21, "Vittorio Gassman");
			Jugador jackTwynam = new Jugador("John Kennedy", "Twyman", (byte) 27, "Jack Twyman");
			Jugador samLacey = new Jugador("Samuel", "Lacey ", (byte) 44, "Slammin' Sam");

			Jugador[] dorsalesRetiradosKings = { nateArchibal, mithcRichmond, chrisWebber, aficion, bobDavies,
					mauriceStokes, oscarRobertsonKings, predragStojakovic, vladeDivac, jackTwynam, samLacey };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS KINGS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosKings.length; i++) {

				ret += dorsalesRetiradosKings[i];
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Spurs")) {

			Jugador jhonnyMoore = new Jugador("John Brian", "Moore", (byte) 00, "Johnny Moore");
			Jugador averyJhonson = new Jugador("Avery", "Johnson", (byte) 6, "Taz");
			Jugador tonyParker = new Jugador("William Anthony", "Parker ", (byte) 9, "Parisian Torpedo");
			Jugador bruceBowen = new Jugador("Bruce Eric", "Bowen", (byte) 12);
			Jugador jamesSilas = new Jugador("James Edward", "Silas", (byte) 13, "Captain Late");
			Jugador manuGinobii = new Jugador("Emanuel David", "Ginóbili", (byte) 20, "Manu Ginóbili");
			Jugador timDuncan = new Jugador("Timothy Theodore", "Duncan", (byte) 21, "The Big Fundamental");
			Jugador seanElliot = new Jugador("Sean", "Elliott", (byte) 32);
			Jugador georgeGervin = new Jugador("George", "Gervin", (byte) 44, "The Iceman");
			Jugador davidRobinson = new Jugador("David Maurice", "Robinson", (byte) 50, "The Admiral");

			Jugador[] dorsalesRetiradosSpurs = { jhonnyMoore, averyJhonson, tonyParker, bruceBowen, jamesSilas,
					manuGinobii, timDuncan, seanElliot, georgeGervin, davidRobinson };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS SPURS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosSpurs.length; i++) {

				ret += dorsalesRetiradosSpurs[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Thunder")) {

			Jugador gusWilliams = new Jugador("Gus", "Williams", (byte) 1, "The Wizard");
			Jugador nickCollison = new Jugador("Nicholas John", "Collison", (byte) 4);
			Jugador nateMcMillan = new Jugador("Nathaniel", "McMillan", (byte) 10, "Nate McMillan");
			Jugador lennyWilkens = new Jugador("Leonard Randolph", "Wilkens", (byte) 19, "Lenny Wilkens");
			Jugador spencerHaywood = new Jugador("Spencer", "Haywood", (byte) 24);
			Jugador fredBrwon = new Jugador("Fred", "Brown", (byte) 32, "Downtown");
			Jugador jackSikman = new Jugador("Jack Wayne", "Sikma", (byte) 44, "Goldilocks");

			Jugador[] dorsalesRetiradosThunder = { gusWilliams, nickCollison, nateMcMillan, lennyWilkens,
					spencerHaywood, fredBrwon, jackSikman };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS THUNDER----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosThunder.length; i++) {

				ret += dorsalesRetiradosThunder[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Jazz")) {
			Jugador frankLayden = new Jugador("Frank", "Layden", (byte) 1);
			Jugador adrianDantley = new Jugador("Adrian Delano", "Dantley", (byte) 4, "The teacher");
			Jugador peteMaravichPelicans = new Jugador("Pete", "Maravich", (byte) 7, "Pistol Pete");
			Jugador johnStockton = new Jugador("John", "Stockton", (byte) 12);
			Jugador jeffHornacek = new Jugador("Jeffrey John", "Hornacek", (byte) 14, "Horny");
			Jugador karlMalone = new Jugador("Karl", "Malone", (byte) 32, "The Mailman");
			Jugador darrelGriffith = new Jugador("Darrell Steven", "Griffith", (byte) 35, "Dr. Dunkenstein");
			Jugador markEaton = new Jugador("Mark", "Eaton", (byte) 53);
			Jugador geraldSloan = new Jugador("Gerald Eugene", "Sloan", (byte) 1223, "Jerry Sloan");

			Jugador[] dorsalesRetiradosJazz = { frankLayden, adrianDantley, peteMaravichPelicans, johnStockton,
					jeffHornacek, karlMalone, darrelGriffith, markEaton, geraldSloan };

			ret += "-----------------------------------------" + "\n";
			ret += "------DORSALES RETIRADOS DE LOS JAZZ-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosJazz.length; i++) {

				ret += dorsalesRetiradosJazz[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}
		if (nombre.equals("Wizards")) {
			Jugador earlMonroeWizards = new Jugador("Vernon Earl", "Monroe", (byte) 10, "The Pearl");
			Jugador elvinHayes = new Jugador("Elvin Ernest", "Hayes", (byte) 11, "The Big E");
			Jugador gusJohnson = new Jugador("Gus", "Johnson", (byte) 25, "Honeycomb");
			Jugador wesUnseld = new Jugador("Westley Sissel", "Unseld", (byte) 41, "Wes Unseld");
			Jugador philChenier = new Jugador("Philip ", "Chenier ", (byte) 45, "Phil Chenier");

			Jugador[] dorsalesRetiradosWizards = { earlMonroeWizards, elvinHayes, gusJohnson, wesUnseld, philChenier };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS WIZARDS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosWizards.length; i++) {

				ret += dorsalesRetiradosWizards[i];
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}
		if (nombre.equals("Raptors")) {
			throw new EquipoSinDorsalesRetiradosException(
					"Los Raptors son un equipo relativamente reciente y no tiene dorsales retirados todavía,pero hay unos pocos jugadores que puede que su caso esté en trámite");
		}
		if (nombre.equals("Clippers")) {
			throw new EquipoSinDorsalesRetiradosException(
					"Los Clippers siempre han sido un mal equipo pero retirarán los dorsales del equipo de la época de Lob City");
		}

		return ret;
	}

}
