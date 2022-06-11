package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a una liga
 * 
 * @author jcorr
 *
 */
public class Liga {
	/* id de la liga */
	private byte liga_id;

	/**
	 * constructor que mete en bbdd a los objetos de liga
	 * 
	 * @param liga_id la primary key de liga
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
	public Liga(byte liga_id) throws SQLException {

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO liga VALUES(" + liga_id + ");") > 0) {

			this.liga_id = liga_id;

		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * Getter de liga_id, devuelve el liga_id de la liga
	 * 
	 * @return el id de la liga
	 */
	public byte getLiga_id() {
		return liga_id;
	}

	/**
	 * Setter de liga_id,mete el nuevo valor en bbdd
	 * 
	 * @param liga_id el nuevo id de la liga
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setLiga_id(byte liga_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE liga SET liga_id = " + liga_id + "WHERE liga_id=" + this.liga_id + ";") > 0) {
			this.liga_id = liga_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public static Jugador devolverMVP() {

		ArrayList<Jugador> jugadoresNormalesNBA = Jugador.getJugadores();

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

		ArrayList<Jugador> jugadoresNormalesNBA = Jugador.getJugadores();

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

		ArrayList<Jugador> jugadoresNormalesNBA = Jugador.getJugadores();

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
		escritor.write("" + devolverMVP().getNombre() + " " + devolverMVP().getApellido() + " ha anotado "
				+ devolverMVP().getPPG() + " puntos por partido \n,ha repartido " + devolverMVP().getAPG()
				+ " asistencias por partido,ha recogido " + devolverMVP().getRBG() + " rebotes por partido,ha robado "
				+ devolverMVP().getSPG() + " y ha taponado " + devolverMVP().getBPG() + " balones por partido" + "\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                    EL DEFENSOR  DE LA TEMPORADA HA SIDO                 |\n");
		escritor.write("" + devolverDPOY().getNombre() + " " + devolverDPOY().getApellido() + " ha anotado "
				+ devolverDPOY().getRBG() + " rebotes por partido,ha robado " + devolverDPOY().getSPG()
				+ " balones por partido y ha taponado " + devolverDPOY().getBPG() + " balones por partido" + "\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|            EL PREMIO DEL MEJOR ANOTADOR DE LA TEMPORADA HA SIDO         |\n");
		escritor.write("" + devolverPremioAnotador().getNombre() + " " + devolverPremioAnotador().getApellido()
				+ " ha anotado " + devolverPremioAnotador().getPPG() + " puntos por partido" + "\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("|                                                                         |\n");
		escritor.write("---------------------------------------------------------------------------\n");
		escritor.flush();
		escritor.close();
	}

}
