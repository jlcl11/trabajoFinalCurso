package clases;

import java.sql.SQLException;
import java.sql.Statement;

import superClases.ObjetoConNombre;
import utils.utilsDB;

public class Liga {

	private byte liga_id;

	public Liga(byte liga_id) throws SQLException {

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO liga VALUES(" + liga_id + ");") > 0) {

			this.liga_id = liga_id;

		}
		utilsDB.desconectarBBDD();

	}

	public byte getLiga_id() {
		return liga_id;
	}

	public void setLiga_id(byte liga_id) {
		this.liga_id = liga_id;
	}

}
