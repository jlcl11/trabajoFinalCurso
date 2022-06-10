package clases;

import java.sql.SQLException;
import java.sql.Statement;

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

}
