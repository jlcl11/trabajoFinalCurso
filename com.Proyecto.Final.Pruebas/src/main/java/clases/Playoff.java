package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a una edición de playoffs
 * 
 * @author jcorr
 *
 */
public class Playoff extends ObjetoConNombre {
	/* id del playoff */
	private byte playoff_id;
	/* lista de los equipos de playoff */
	private byte listaEquipos;
	/* lista de las rondas de playoff */
	private byte rondas;

	/**
	 * Constructor que mete cada instancia de playoff en bbdd
	 * 
	 * @param nombre       nombre de la edición de playoff
	 * @param playoff_id   id de los playoff
	 * @param listaEquipos id de cada equipo que va a participar en los playoffs,se
	 *                     hacen varios inserts por cada objeto con un mismo
	 *                     playoff_id
	 * @param rondas       id de cada ronda que va a participar en los playoffs,se
	 *                     hacen varios inserts por cada objeto con un mismo
	 *                     playoff_id
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
	public Playoff(String nombre, byte playoff_id, byte listaEquipos, byte rondas) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO playoffs VALUES(" + playoff_id + ",'" + nombre + "','" + listaEquipos
				+ "'," + rondas + ");") > 0) {
			this.playoff_id = playoff_id;
			this.listaEquipos = listaEquipos;
			this.rondas = rondas;

		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de playoff_id
	 * 
	 * @return el id de los playoffs
	 */
	public byte getPlayoff_id() {

		return playoff_id;
	}

	/**
	 * setter de playoff_id,mete el nuevo valor en bbdd
	 * 
	 * @param playoff_id id del playoff
	 * @throws SQLException SQLException lanza la excepción porque inserta
	 *                      directamente el nuevo valor en bbdd
	 */
	public void setPlayoff_id(byte playoff_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE playoffs SET playoff_id=" + playoff_id + " WHERE playoff_id=" + this.playoff_id + ";") > 0) {
			this.playoff_id = playoff_id;
		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * getter de listaEquipos
	 * 
	 * @return los equipos de esta edición de playoff
	 */
	public byte getListaEquipos() {
		return listaEquipos;
	}

	/**
	 * setter de listaEquipos,mete el nuevo valor en bbdd
	 * 
	 * @param listaEquipos ids de los equipos de playoff
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setListaEquipos(byte listaEquipos) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE playoffs SET listaequipos=" + listaEquipos + " WHERE playoff_id="
				+ this.playoff_id + ";") > 0) {
			this.listaEquipos = listaEquipos;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de rondas
	 * 
	 * @return las rondas de esta edición de playoff
	 */
	public byte getRondas() {
		return rondas;
	}

	/**
	 * setter de listaEquipos,mete el nuevo valor en bbdd
	 * 
	 * @param rondas
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setRondas(byte rondas) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE playoffs SET lista_rondas=" + rondas + " WHERE playoff_id=" + this.playoff_id + ";") > 0) {
			this.rondas = rondas;
		}
		UtilsDB.desconectarBBDD();
	}

}
