package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import superClases.Partido;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a un partido del AllStar
 * 
 * @author jcorr
 *
 */
public class PartidoAllStar extends Partido {

	/* id de un partido del AllStar */
	private byte allStar_id;
	/* el equipo 1 del AllStar */
	private String equipo1;
	/* el equipo 2 del AllStar */
	private String equipo2;
	/* titulares del AllStar */
	private String titulares;

	/**
	 * Constructor que mete el objeto partido all star directamente en bbdd
	 * 
	 * @param allStar_id        id del partido
	 * @param marcadorLocal     marcador del equipo local
	 * @param marcadorVisitante marcador del equipo local
	 * @param fecha             fecha en la que se hace el partido
	 * @param equipo1           equipo local
	 * @param equipo2           equipo visitante
	 * @param titulares         titulares en el partido
	 * @throws SQLException lanza la excepción porue mete el objeto directamente en
	 *                      bbdd
	 */
	public PartidoAllStar(byte allStar_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			String equipo1, String equipo2, String titulares) throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO partidoallStar VALUES(" + allStar_id + ",'" + equipo1 + "','" + equipo2
				+ "'," + marcadorLocal + "," + marcadorVisitante + ",'" + fecha + "','" + titulares + "');") > 0) {
			this.allStar_id = allStar_id;
			this.equipo1 = equipo1;
			this.equipo2 = equipo2;
			this.titulares = titulares;
		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * Getter de allStar_id, devuelve el allStar_id de los partidos
	 * 
	 * @return el id del partido
	 */
	public byte getAllStar_id() {
		return allStar_id;
	}

	/**
	 * Setter de allStar_id,mete el nuevo valor en bbdd
	 * 
	 * @param allStar_id el nuevo id de los partidos
	 * @throws SQLException lanza la excepci�n porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setAllStar_id(byte allStar_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set parta_id=" + allStar_id + " WHERE parta_id=" + this.allStar_id + ";") > 0) {
			this.allStar_id = allStar_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de equipo1, devuelve el equipo local
	 * 
	 * @return el equipo local
	 */
	public String getEquipo1() {
		return equipo1;
	}

	/**
	 * Setter de equipo1,mete el nuevo valor en bbdd
	 * 
	 * @param equipo1 el equipo local
	 * @throws SQLException lanza la excepci�n porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setEquipo1(String equipo1) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set equipo1='" + equipo1 + "' WHERE parta_id=" + allStar_id + ";") > 0) {
			this.equipo1 = equipo1;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de equipo2, devuelve el equipo visitante
	 * 
	 * @return el equipo local
	 */
	public String getEquipo2() {
		return equipo2;
	}

	/**
	 * Setter de equipo2,mete el nuevo valor en bbdd
	 * 
	 * @param equipo1 el equipo visitante
	 * @throws SQLException lanza la excepci�n porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setEquipo2(String equipo2) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set equipo1='" + equipo2 + "' WHERE parta_id=" + allStar_id + ";") > 0) {
			this.equipo2 = equipo2;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de titulares
	 * 
	 * @return los titulares
	 */
	public String getTitulares() {
		return titulares;
	}

	/**
	 * Setter de titulares,mete el nuevo valor en bbdd
	 * 
	 * @param titulares los titulares
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setTitulares(String titulares) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set titulares='" + titulares + "' WHERE parta_id=" + allStar_id + ";") > 0) {
			this.titulares = titulares;
		}
		UtilsDB.desconectarBBDD();
	}

}
