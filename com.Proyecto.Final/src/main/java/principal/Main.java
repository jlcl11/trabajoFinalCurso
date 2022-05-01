package principal;

import java.util.Scanner;

import exceptions.ClippersNoTieneDorsalesRetiradosException;
import exceptions.RaptorsNoTieneDorsalesRetiradosExceptions;
import superClases.Equipo;
import superClases.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
			Equipo hawks = new Equipo("HAWKS");
		
			try {
				System.out.println(hawks.getDorsalesRetirados(hawks.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			Equipo celtics = new Equipo("CELTICS");
			System.out.println(celtics);
			try {
				System.out.println(celtics.getDorsalesRetirados(celtics.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			Equipo nets = new Equipo("NETS");
			System.out.println(nets);
			try {
				System.out.println(nets.getDorsalesRetirados(nets.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			Equipo hornets = new Equipo("HORNETS");
			System.out.println(hornets);
			try {
				System.out.println(hornets.getDorsalesRetirados(hornets.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			Equipo bulls = new Equipo("BULLS");
			System.out.println(bulls);
			try {
				System.out.println(bulls.getDorsalesRetirados(bulls.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 6:
			Equipo cavs = new Equipo("CAVS");
			System.out.println(cavs);
			try {
				System.out.println(cavs.getDorsalesRetirados(cavs.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 7:
			Equipo pistons = new Equipo("PISTONS");
			System.out.println(pistons);
			try {
				System.out.println(pistons.getDorsalesRetirados(pistons.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 8:
			Equipo pacers = new Equipo("PACERS");
			System.out.println(pacers);
			try {
				System.out.println(pacers.getDorsalesRetirados(pacers.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 9:
			Equipo heat = new Equipo("HEAT");
			System.out.println(heat);
			try {
				System.out.println(heat.getDorsalesRetirados(heat.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 10:
			Equipo bucks = new Equipo("BUCKS");
			System.out.println(bucks);
			try {
				System.out.println(bucks.getDorsalesRetirados(bucks.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 11:
			Equipo knicks = new Equipo("KNICKS");
			System.out.println(knicks);
			try {
				System.out.println(knicks.getDorsalesRetirados(knicks.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 12:
			Equipo magic = new Equipo("MAGIC");
			System.out.println(magic);
			try {
				System.out.println(magic.getDorsalesRetirados(magic.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 13:
			Equipo sixers = new Equipo("76ERS");
			System.out.println(sixers);
			try {
				System.out.println(sixers.getDorsalesRetirados(sixers.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 14:
			Equipo raptors = new Equipo("RAPTORS");
			System.out.println(raptors);
			try {
				System.out.println(raptors.getDorsalesRetirados(raptors.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 15:
			Equipo wizards = new Equipo("WIZARDS");
			System.out.println(wizards);
			try {
				System.out.println(wizards.getDorsalesRetirados(wizards.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 16:
			Equipo mavs = new Equipo("MAVERICKS");
			System.out.println(mavs);
			try {
				System.out.println(mavs.getDorsalesRetirados(mavs.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 17:
			Equipo nuggets = new Equipo("NUGGETS");
			System.out.println(nuggets);
			try {
				System.out.println(nuggets.getDorsalesRetirados(nuggets.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 18:
			Equipo warriors = new Equipo("WARRIORS");
			System.out.println(warriors);
			try {
				System.out.println(warriors.getDorsalesRetirados(warriors.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 19:
			Equipo rockets = new Equipo("ROCKETS");
			System.out.println(rockets);
			try {
				System.out.println(rockets.getDorsalesRetirados(rockets.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 20:
			Equipo clippers = new Equipo("CLIPPERS");
			System.out.println(clippers);
			try {
				System.out.println(clippers.getDorsalesRetirados(clippers.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 21:
			Equipo lakers = new Equipo("LAKERS");
			System.out.println(lakers);
			try {
				System.out.println(lakers.getDorsalesRetirados(lakers.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 22:
			Equipo wolves = new Equipo("TIMBERWOLVES");
			System.out.println(wolves);
			try {
				System.out.println(wolves.getDorsalesRetirados(wolves.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 23:
			Equipo pelicans = new Equipo("PELICANS");
			System.out.println(pelicans);
			try {
				System.out.println(pelicans.getDorsalesRetirados(pelicans.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 24:
			Equipo grizzlies = new Equipo("GRIZZLIES");
			System.out.println(grizzlies);
			try {
				System.out.println(grizzlies.getDorsalesRetirados(grizzlies.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 25:
			Equipo okc = new Equipo("THUNDER");
			System.out.println(okc);
			try {
				System.out.println(okc.getDorsalesRetirados(okc.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 26:
			Equipo suns = new Equipo("SUNS");
			System.out.println(suns);
			try {
				System.out.println(suns.getDorsalesRetirados(suns.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 27:
			Equipo blazers = new Equipo("BLAZERS");
			System.out.println(blazers);
			try {
				System.out.println(blazers.getDorsalesRetirados(blazers.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 28:
			Equipo kings = new Equipo("KINGS");
			System.out.println(kings);
			try {
				System.out.println(kings.getDorsalesRetirados(kings.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 29:
			Equipo spurs = new Equipo("SPURS");
			System.out.println(spurs);
			try {
				System.out.println(spurs.getDorsalesRetirados(spurs.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block

				System.out.println(e.getMessage());
			}
			break;
		case 30:
			Equipo jazz = new Equipo("JAZZ");
			System.out.println(jazz);
			try {
				System.out.println(jazz.getDorsalesRetirados(jazz.getNombre()));
			} catch (RaptorsNoTieneDorsalesRetiradosExceptions e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ClippersNoTieneDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;

		}
		System.out.println("Fin del programa");
	}

}
