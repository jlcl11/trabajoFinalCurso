package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.utilsDB;

public class Playoff extends ObjetoConNombre {

	private byte playoff_id;
	private byte listaEquipos;
	private byte rondas;

	public Playoff(String nombre, byte playoff_id, byte listaEquipos, byte rondas)
			throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO playoffs VALUES(" + playoff_id + ",'" + nombre + "','" + listaEquipos
				+ "'," + rondas + ");") > 0) {
			this.playoff_id = playoff_id;
			this.listaEquipos = listaEquipos;
			this.rondas = rondas;

		}
		utilsDB.desconectarBBDD();
	}

	public byte getPlayoff_id() {
		return playoff_id;
	}

	public void setPlayoff_id(byte playoff_id) {
		this.playoff_id = playoff_id;
	}

	public byte getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(byte listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public byte getRondas() {
		return rondas;
	}

	public void setRondas(byte rondas) {
		this.rondas = rondas;
	}

}
