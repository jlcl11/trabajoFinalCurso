package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.UtilsDB;

public class Playoff extends ObjetoConNombre {

	private byte playoff_id;
	private byte listaEquipos;
	private byte rondas;

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

	public byte getPlayoff_id() {

		return playoff_id;
	}

	public void setPlayoff_id(byte playoff_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE playoffs SET playoff_id=" + playoff_id + " WHERE playoff_id=" + this.playoff_id + ";") > 0) {
			this.playoff_id = playoff_id;
		}
		UtilsDB.desconectarBBDD();

	}

	public byte getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(byte listaEquipos) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE playoffs SET listaequipos=" + listaEquipos + " WHERE playoff_id="
				+ this.playoff_id + ";") > 0) {
			this.listaEquipos = listaEquipos;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getRondas() {
		return rondas;
	}

	public void setRondas(byte rondas) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE playoffs SET lista_rondas=" + rondas + " WHERE playoff_id=" + this.playoff_id + ";") > 0) {
			this.rondas = rondas;
		}
		UtilsDB.desconectarBBDD();
	}

}
