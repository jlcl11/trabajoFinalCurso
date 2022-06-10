package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a una ronda de playoffs
 * 
 * @author jcorr
 *
 */
public class RondaPlayoffs extends ObjetoConNombre {
	/* id de la ronda */
	private byte ronda_id;
	/* equipos involucrados en la ronda */
	private byte lista;
	/* id de la edición de playoffs en el que se juega esta ronda de playoff */
	private byte playoffs_playoff_id;

	/**
	 * Constructor que mete el objeto directamente en base de datos
	 * 
	 * @param nombre              nombre de la ronda de playoff
	 * @param ronda_id            id de la ronda
	 * @param lista               equipos paticipantes en la ronda de playoff
	 * @param playoffs_playoff_id id de la edición de playoff
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
	public RondaPlayoffs(String nombre, byte ronda_id, byte lista, byte playoffs_playoff_id) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("insert into rondaplayoff VALUES(" + ronda_id + ",'" + nombre + "'," + lista + ","
				+ playoffs_playoff_id + ");") > 0) {
			this.ronda_id = ronda_id;
			this.lista = lista;
			this.playoffs_playoff_id = playoffs_playoff_id;

		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de ronda_id, devuelve el ronda_id de la ronda
	 * 
	 * @return el id de la ronda
	 */
	public byte getRonda_id() {
		return ronda_id;
	}

	/**
	 * setter de ronda_id,mete el nuevo valor en bbdd
	 * 
	 * @param ronda_id id de la ronda
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setRonda_id(byte ronda_id) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE rondaplayoff SET ronda_id=" + ronda_id + " WHERE ronda_id=" + this.ronda_id + ";") > 0) {
			this.ronda_id = ronda_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de lista, devuelve los equipos paticipantes en la ronda de playoff
	 * 
	 * @return equipos paticipantes en la ronda de playoff
	 */
	public byte getLista() {
		return lista;
	}

	/**
	 * setter de lista,introduce el nuevo valor en bbdd
	 * 
	 * @param lista equipos paticipantes en la ronda de playoff
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setLista(byte lista) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE rondaplayoff SET listarondas=" + lista + " WHERE ronda_id=" + this.ronda_id + ";") > 0) {
			this.lista = lista;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de playoffs_playoff_id, devuelve el id de la edición de playoffs en el
	 * que se juega esta ronda de playoff
	 * 
	 * @return id de la edición de playoffs en el que se juega esta ronda de playoff
	 */
	public byte getPlayoffs_playoff_id() {
		return playoffs_playoff_id;
	}

	public void setPlayoffs_playoff_id(byte playoffs_playoff_id) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE rondaplayoff SET playoffs_playoff_id=" + playoffs_playoff_id + " WHERE ronda_id="
				+ this.ronda_id + ";") > 0) {
			this.playoffs_playoff_id = playoffs_playoff_id;
		}
		UtilsDB.desconectarBBDD();
	}

}
