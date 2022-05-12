package principal;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Conferencia;
import clases.EquipoNormal;
import clases.Estadio;
import clases.JugadorNormal;
import exceptions.EquipoSinDorsalesRetiradosException;
import pantalla.Ventana;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.Equipo;
import superClases.Jugador;
import utlis.funcionesUtiles;

public class Main {

	public static void main(String[] args) {

		// Ventana ventana=new Ventana();

		Scanner sc = new Scanner(System.in);
		int opcionEquipo = 0;
		int opcionMenuses = 0;
		int opcionMenusesDatosFranquicia = 0;
		int opcionMenusesPremiosTemporada = 0;

		do {
			System.out.println("Bienvenido al mejor juego indie de NBA,con que équipo NBA quieres jugar?");
			System.out.println("1 Atlanta Hawks \n2 Boston Celtics\n3 Brooklyn Nets\n4 Charlotte Hornets\n"
					+ "5 Chicago Bulls\n6 Cleveland Cavaliers\n7 Detroit Pistons\n8 Indiana Pacers\n9 Miami Heat\n10 Milwaukee Bucks"
					+ "\n11 New York Knicks\n12 Orlando Magic\n13 Philladelphia 76ers\n14 Toronto Raptors\n15 Washinton Wizards"
					+ "\n16 Dallas Mavericks\n17 Denver Nuggets\n18 Golden State Warriors\n19 Houston Rockets\n20 Los Angeles Clippers"
					+ "\n21 Los Angeles Lakers\n22 Minnesota Timberwolves\n23 New Orleans Pelicans\n24 Memphis Grizzlies\n25 Oklahoma City Thunder"
					+ "\n26 Phoenix Suns\n27 Portland Trail Blazers\n28 Sacramento Kings\n29 San Antonio Spurs\n30 Utah Jazz ");

			opcionEquipo = Integer.parseInt(sc.nextLine());

			try {
				System.out.println(
						"Enhorabuena has escogido los " + funcionesUtiles.escogerEquipo(opcionEquipo).getCiudadLocal()
								+ " " + funcionesUtiles.escogerEquipo(opcionEquipo).getNombre());
			} catch (EquipoSinDorsalesRetiradosException e) {
				// TODO Auto-generated catch block
			}

			do {
				System.out.println("¿Qué quieres hacer?"
						+ "\n1 Ver datos de franquicia\n2 ver premios de temporada\n3 Simular los playoffs\n4 Ver el AllStar\n5 Salir");
				opcionMenuses = Integer.parseInt(sc.nextLine());

				switch (opcionMenuses) {
				case 1:
					System.out.println("-------------------------");
					System.out.println("Datos de franquicia");
					System.out.println("------------------------");

					do {
						System.out.println(" que quieres hacer?"
								+ "\n1 Ver datos del estadio\n2 Ver propietario del equipo\n3 Ver el gm del equipo\n4 Ver el límite salarial del equipo"
								+ "\n5 Ver los dorsales retirados\n6 Ver la plantilla\n7 salir");
						opcionMenusesDatosFranquicia = Integer.parseInt(sc.nextLine());
						switch (opcionMenusesDatosFranquicia) {

						case 1:
							try {
								System.out.println(
										"El estadio de los " + funcionesUtiles.escogerEquipo(opcionEquipo).getNombre()
												+ " es " + funcionesUtiles.escogerEquipo(opcionEquipo).getEstadio());
							} catch (EquipoSinDorsalesRetiradosException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 2:
							try {
								System.out.println("El propietario de los "
										+ funcionesUtiles.escogerEquipo(opcionEquipo).getNombre() + " es "
										+ funcionesUtiles.escogerEquipo(opcionEquipo).getPropietario());
							} catch (EquipoSinDorsalesRetiradosException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 3:
							try {
								System.out.println("El general manager de los "
										+ funcionesUtiles.escogerEquipo(opcionEquipo).getNombre() + " es "
										+ funcionesUtiles.escogerEquipo(opcionEquipo).getGM());
							} catch (EquipoSinDorsalesRetiradosException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 4:
							try {
								System.out.println("El límite salarial de los "
										+ funcionesUtiles.escogerEquipo(opcionEquipo).getNombre()
										+ " \" habiendo pagado el impuesto de lujo es de \" "
										+ funcionesUtiles.escogerEquipo(opcionEquipo).getLimiteSalarial()
										+ " millones de dólares");
							} catch (EquipoSinDorsalesRetiradosException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 5:
							try {
								System.out.println(funcionesUtiles
										.getDorsalesRetirados(funcionesUtiles.escogerEquipo(opcionEquipo).getNombre()));
							} catch (EquipoSinDorsalesRetiradosException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 6:
							try {
								ArrayList<JugadorNormal> plantillas = funcionesUtiles
										.getPlantilla(funcionesUtiles.escogerEquipo(opcionEquipo).getNombre());
								System.out.println(plantillas);
							} catch (EquipoSinDorsalesRetiradosException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 7:
							System.out.println("salir");
							break;
						}

					} while (opcionMenusesDatosFranquicia >= 1 && opcionMenusesDatosFranquicia <= 6);

					break;
				case 2:
					System.out.println("-------------------------");
					System.out.println("Premios de temporada");
					System.out.println("-------------------------");

					do {
						System.out.println(
								"¿Qué quieres hacer?\n1 Ver MVP\n2 Ver DPOY\n3 Ver máximo anotador\n4 Salir\n");
						opcionMenusesPremiosTemporada = Integer.parseInt(sc.nextLine());
						switch (opcionMenusesPremiosTemporada) {
						case 1:

							System.out.println(funcionesUtiles.devolverMVP());

							break;
						case 2:

							System.out.println(funcionesUtiles.devolverDPOY());

							break;
						case 3:
							System.out.println(funcionesUtiles.devolverPremioAnotador());
							break;
						case 4:
							System.out.println("salir");

							break;

						}

					} while (opcionMenusesPremiosTemporada >= 1 && opcionMenusesPremiosTemporada <= 3);
					break;

				case 3:
					System.out.println("-------------------------");
					System.out.println("Playoffs");
					System.out.println("-------------------------");
					break;

				case 4:

					System.out.println("-------------------------");
					System.out.println("All Star");
					System.out.println("-------------------------");
					System.out.println("Los jugadores all star son :");
					System.out.println(funcionesUtiles.getJugadoresAllStar());

					break;

				}

			} while (opcionMenuses >= 1 && opcionMenuses <= 4);

		} while (opcionEquipo >= 1 && opcionEquipo <= 30);

	}

}
