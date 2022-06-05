package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.UtilsDB;

public class RondaPlayoffs extends ObjetoConNombre {

	private byte ronda_id;
	private byte lista;
	private byte playoffs_playoff_id;

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

	public byte getRonda_id() {
		return ronda_id;
	}

	public void setRonda_id(byte ronda_id) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE rondaplayoff SET ronda_id=" + ronda_id + " WHERE ronda_id=" + this.ronda_id + ";") > 0) {
			this.ronda_id = ronda_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getLista() {
		return lista;
	}

	public void setLista(byte lista) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE rondaplayoff SET listarondas=" + lista + " WHERE ronda_id=" + this.ronda_id + ";") > 0) {
			this.lista = lista;
		}
		UtilsDB.desconectarBBDD();
	}

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
