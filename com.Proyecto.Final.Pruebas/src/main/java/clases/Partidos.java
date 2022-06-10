package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.UtilsDB;

/**
 * Clase que sirve para meter los datos de la tabla intermedia entre partidos y
 * equipo
 * 
 * @author jcorr
 *
 */
public class Partidos {
	/* id del partido */
	private byte partidonormal_partidonl_id;
	/* id del equipo */
	private byte equipo_eq_id;

	/**
	 * Constructor que mete los valores de la tabla intermedia directamente en bbdd
	 * 
	 * @param partidonormal_partidonl_id id del partido
	 * @param equipo_eq_id               id de uno de los equipos
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public Partidos(byte partidonormal_partidonl_id, byte equipo_eq_id) throws SQLException {
		super();

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate(
				"INSERT INTO partidos VALUES(" + partidonormal_partidonl_id + "," + equipo_eq_id + ");") > 0) {
			this.partidonormal_partidonl_id = partidonormal_partidonl_id;
			this.equipo_eq_id = equipo_eq_id;
			System.out.println("partidos introducidos con exito");
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de partidonormal_partidonl_id
	 * 
	 * @return devuelve el id del partido
	 */
	public byte getPartidonormal_partidonl_id() {
		return partidonormal_partidonl_id;
	}

	/**
	 * setter de partidonormal_partidonl_id,mete el nuevo valor en bbdd
	 * 
	 * @param partidonormal_partidonl_id id del partido
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */

	public void setPartidonormal_partidonl_id(byte partidonormal_partidonl_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidos set partidonormal_partidonl_id=" + partidonormal_partidonl_id
				+ " WHERE partidonormal_partidonl_id=" + this.partidonormal_partidonl_id + " AND equipo_eq_id="
				+ this.equipo_eq_id + ";") > 0) {
			this.partidonormal_partidonl_id = partidonormal_partidonl_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de equipo_eq_id
	 * 
	 * @return devuelve el id de uno de los equipos
	 */
	public byte getEquipo_eq_id() {
		return equipo_eq_id;
	}

	/**
	 * setter de dsdsd,introduce el nuevo valor en bbdd
	 * @param equipo_eq_id id de uno de los equipos
	 * @throws  lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setEquipo_eq_id(byte equipo_eq_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidos set equipo_eq_id=" + equipo_eq_id + " WHERE partidonormal_partidonl_id="
				+ this.partidonormal_partidonl_id + " AND equipo_eq_id=" + this.equipo_eq_id + ";") > 0) {
			this.equipo_eq_id = equipo_eq_id;
		}
		UtilsDB.desconectarBBDD();
	}

}
