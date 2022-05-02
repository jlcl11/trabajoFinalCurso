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
		int opcion;
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

		Equipo hawks = new Equipo("Hawks", este, "Atlanta", null, "Anthony Ressler", "Travis Schlenk", 109.1f,
				stateFarmArena);
		Equipo celtics = new Equipo("Celtics", este, "Boston", null, "Boston basketball partners", "Brad Stevens",
				109.1f, tdGarden);
		Equipo nets = new Equipo("Nets", este, "Brooklyn", null, "Joseph Tsai", "Sean marks", 109.1f, barclaysCenter);
		Equipo hornets = new Equipo("Hornets", este, "Charlotte", null, "Michael Jordan", "Mitch Kupchak", 109.1f,
				spectrumCenter);
		Equipo bulls = new Equipo("Bulls", este, "Chicago", null, "Jerry Reinsdorf", "Marc Eversley", 109.1f,
				unitedCenter);
		Equipo cavs = new Equipo("Cavaliers", este, "Cleveland", null, "Dan Gilbert", "Mike Gansey", 109.1f,
				rocketMortageFieldHouse);
		Equipo pistons = new Equipo("Pistons", este, "Detroit", null, "Tom Gores", "Troy Weaver", 109.1f,
				littkeCaesarsArena);
		Equipo pacers = new Equipo("Pacers", este, "Indiana", null, "Herbert Simon", "Chad Buchanan", 109.1f,
				bankersLifeFieldHouse);
		Equipo heat = new Equipo("Heat", este, "Miami", null, "Micky Arison", "Andy Elisburg", 109.1f, ftxArena);
		Equipo bucks = new Equipo("Bucks", este, "Milwaukee", null, "Los hermanos Edens", "Jon Horst", 109.1f,
				fiservForum);
		Equipo knicks = new Equipo("Knicks", este, "New York", null, "James L Dolan", "Scott Perry", 109.1f,
				madisonSquareGarde);
		Equipo magic = new Equipo("Magic", este, "Orlando", null, "Richard DeVos", "John Hammond", 109.1f, amwayCenter);
		Equipo sixers = new Equipo("76ers", este, "Philladelphia", null, "Josh Harris", "Elton Brand", 109.1f,
				wellsFargoCenter);
		Equipo raptors = new Equipo("Raptors", este, "Toronto", null, "Maple Leaf Sports & Entertainment",
				"Bobby Webster", 109.1f, scotiaBankArena);
		Equipo wizards = new Equipo("Wizards", este, "Washinton", null, "Ted Leonsis", "Tommy Sheppard", 109.1f,
				capitalOneArena);
		Equipo mavs = new Equipo("Mavericks", oeste, "Dallas", null, "Mark Cuban", "Nico Harrison", 109.1f,
				americanAirlinesCenter);
		Equipo nuggets = new Equipo("Nuggets", oeste, "Denver", null, "Kroenke Sports & Entertainment", "Calvin Booth",
				109.1f, ballCenter);
		Equipo warriors = new Equipo("Warriors", oeste, "San Francisco", null, "Joe Lacob,Peter Guber", "Bob Myers",
				109.1f, chaseCenter);
		Equipo rockets = new Equipo("Rockets", oeste, "Houston", null, "Tilman Fertitta", "Rafael Stone", 109.1f,
				toyotaCenter);
		Equipo clippers = new Equipo("Clippers", oeste, "Los Ángeles", null, "Steve Ballmer", "Michael Winger", 109.1f,
				cryptocomArena);
		Equipo lakers = new Equipo("Lakers", oeste, "Los Ángeles", null, "Jeanie Buss", "Rob Pelinka", 109.1f,
				cryptocomArena);
		Equipo wolves = new Equipo("Timberwolves", oeste, "Minnesota", null, "Marc Lore", "Sachin Gupta", 109.1f,
				targetCenter);
		Equipo pelicans = new Equipo("Pelicans", oeste, "New Orleans", null, "Gayle Benson", "Trajan Langdon", 109.1f,
				smoothieKingCenter);
		Equipo grizzlies = new Equipo("Grizzlies", este, "Memphis", null, "Robert Pera", "Jason Wexler", 109.1f,
				fedexForum);
		Equipo okc = new Equipo("Thunder", oeste, "Oklahoma city", null, "Professional Basketball Club LLC",
				"Sam Presti", 109.1f, paycomCenter);
		Equipo suns = new Equipo("Suns", oeste, "Phoenix", null, "Robert Sarver", "James Andrew Jones", 109.1f,
				footprintCenter);
		Equipo blazers = new Equipo("Trail Blazers", oeste, "Portland", null, "Paul Allen", "Joe Cronin", 109.1f,
				modaCenter);
		Equipo kings = new Equipo("Kings", oeste, "Sacramento", null, "Vivek Ranadivé", "Monte McNair", 109.1f,
				golden1Center);
		Equipo spurs = new Equipo("Spurs", oeste, "San Antonio", null, "Spurs Sports & Entertainment L.L.C.",
				"Brian Wright", 109.1f, attcenter);
		Equipo jazz = new Equipo("Jazz", oeste, "Utah", null, "Ryan Smith", "Justin Zanik", 109.1f, vivintArena);

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

			do {
				System.out.println("Enhorabuena has escogido los " + hawks.getCiudadLocal() + " " + hawks.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(hawks.getDatosFranquicia(opcion, hawks));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 2:

			do {
				System.out.println("Enhorabuena has escogido los " + celtics.getCiudadLocal() + " "
						+ celtics.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(celtics.getDatosFranquicia(opcion, celtics));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 3:

			do {
				System.out.println("Enhorabuena has escogido los " + nets.getCiudadLocal() + " " + nets.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(nets.getDatosFranquicia(opcion, nets));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 4:

			do {
				System.out.println("Enhorabuena has escogido los " + hornets.getCiudadLocal() + " "
						+ hornets.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(hornets.getDatosFranquicia(opcion, hornets));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 5:

			do {
				System.out.println("Enhorabuena has escogido los " + bulls.getCiudadLocal() + " " + bulls.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(bulls.getDatosFranquicia(opcion, bulls));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 6:

			do {
				System.out.println("Enhorabuena has escogido los " + cavs.getCiudadLocal() + " " + cavs.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(cavs.getDatosFranquicia(opcion, cavs));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 7:

			do {
				System.out.println("Enhorabuena has escogido los " + pistons.getCiudadLocal() + " "
						+ pistons.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(pistons.getDatosFranquicia(opcion, pistons));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 8:

			do {
				System.out.println("Enhorabuena has escogido los " + pacers.getCiudadLocal() + " " + pacers.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(pacers.getDatosFranquicia(opcion, pacers));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 9:

			do {
				System.out.println("Enhorabuena has escogido los " + heat.getCiudadLocal() + " " + heat.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(heat.getDatosFranquicia(opcion, heat));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 10:

			do {
				System.out.println("Enhorabuena has escogido los " + bucks.getCiudadLocal() + " " + bucks.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(bucks.getDatosFranquicia(opcion, bucks));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 11:

			do {
				System.out.println("Enhorabuena has escogido los " + knicks.getCiudadLocal() + " " + knicks.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(knicks.getDatosFranquicia(opcion, knicks));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 12:

			do {
				System.out.println("Enhorabuena has escogido los " + magic.getCiudadLocal() + " " + magic.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(magic.getDatosFranquicia(opcion, magic));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 13:

			do {
				System.out.println("Enhorabuena has escogido los " + sixers.getCiudadLocal() + " " + sixers.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(sixers.getDatosFranquicia(opcion, sixers));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 14:

			do {
				System.out.println("Enhorabuena has escogido los " + raptors.getCiudadLocal() + " "
						+ raptors.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(raptors.getDatosFranquicia(opcion, raptors));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 15:

			do {
				System.out.println("Enhorabuena has escogido los " + wizards.getCiudadLocal() + " "
						+ wizards.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(wizards.getDatosFranquicia(opcion, wizards));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 16:

			do {
				System.out.println("Enhorabuena has escogido los " + mavs.getCiudadLocal() + " " + mavs.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(mavs.getDatosFranquicia(opcion, mavs));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 17:

			do {
				System.out.println("Enhorabuena has escogido los " + nuggets.getCiudadLocal() + " "
						+ nuggets.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(nuggets.getDatosFranquicia(opcion, nuggets));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 18:

			do {
				System.out.println("Enhorabuena has escogido los " + warriors.getCiudadLocal() + " "
						+ warriors.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(warriors.getDatosFranquicia(opcion, warriors));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 19:

			do {
				System.out.println("Enhorabuena has escogido los " + rockets.getCiudadLocal() + " "
						+ rockets.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(rockets.getDatosFranquicia(opcion, rockets));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 20:

			do {
				System.out.println("Enhorabuena has escogido los " + clippers.getCiudadLocal() + " "
						+ clippers.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(clippers.getDatosFranquicia(opcion, clippers));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 21:

			do {
				System.out.println("Enhorabuena has escogido los " + lakers.getCiudadLocal() + " " + lakers.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(lakers.getDatosFranquicia(opcion, lakers));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 22:

			do {
				System.out.println("Enhorabuena has escogido los " + wolves.getCiudadLocal() + " " + wolves.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(wolves.getDatosFranquicia(opcion, wolves));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 23:

			do {
				System.out.println("Enhorabuena has escogido los " + pelicans.getCiudadLocal() + " "
						+ pelicans.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(pelicans.getDatosFranquicia(opcion, pelicans));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 24:

			do {
				System.out.println("Enhorabuena has escogido los " + grizzlies.getCiudadLocal() + " "
						+ grizzlies.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(grizzlies.getDatosFranquicia(opcion, grizzlies));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 25:

			do {
				System.out.println("Enhorabuena has escogido los " + okc.getCiudadLocal() + " " + okc.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(okc.getDatosFranquicia(opcion, okc));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 26:

			do {
				System.out.println("Enhorabuena has escogido los " + suns.getCiudadLocal() + " " + suns.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(suns.getDatosFranquicia(opcion, suns));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 27:

			do {
				System.out.println("Enhorabuena has escogido los " + blazers.getCiudadLocal() + " "
						+ blazers.getNombre() + " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(blazers.getDatosFranquicia(opcion, blazers));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 28:

			do {
				System.out.println("Enhorabuena has escogido los " + kings.getCiudadLocal() + " " + kings.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(kings.getDatosFranquicia(opcion, kings));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 29:

			do {
				System.out.println("Enhorabuena has escogido los " + spurs.getCiudadLocal() + " " + spurs.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(spurs.getDatosFranquicia(opcion, spurs));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;
		case 30:

			do {
				System.out.println("Enhorabuena has escogido los " + jazz.getCiudadLocal() + " " + jazz.getNombre()
						+ " que quieres hacer?"
						+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo\n5 Ver los dorsales retirados\n6 salir");
				opcion = Integer.parseInt(sc.nextLine());
				try {
					System.out.println(jazz.getDatosFranquicia(opcion, jazz));
				} catch (EquipoSinDorsalesRetiradosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (opcion <= 5);
			break;

		}
		System.out.println("Fin del programa");
	}

}
