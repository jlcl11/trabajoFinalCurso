package clases;

import java.sql.SQLException;
import java.sql.Statement;

import superClases.ObjetoConNombre;
import utils.UtilsDB;
import utils.UtilsDB;

public class Conferencia extends ObjetoConNombre {

	private int partidos_fk;
	private short liga_conferencias;

	public Conferencia(String nombre, int partidos_fk, short liga_conferencias) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO conferencia(partidos,nombre,liga_conferencias) VALUES(" + partidos_fk
				+ ",'" + nombre + "'," + liga_conferencias + ");") > 0) {
			this.partidos_fk = partidos_fk;
			this.liga_conferencias = liga_conferencias;

		}
		UtilsDB.desconectarBBDD();

	}

	public int getPartidos_fk() {
		return partidos_fk;
	}

	public void setPartidos_fk(int partidos_fk) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE conferencia SET partidos = " + partidos_fk + "WHERE partidos=" + this.partidos_fk + ";") > 0) {
			this.partidos_fk = partidos_fk;
		}
		UtilsDB.desconectarBBDD();

	}

	public short getLiga_conferencias() {
		return liga_conferencias;
	}

	public void setLiga_conferencias(short liga_conferencias) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE conferencia SET liga_conferencias = " + liga_conferencias + "WHERE partidos="
				+ this.partidos_fk + ";") > 0) {
			this.liga_conferencias = liga_conferencias;
		}
		UtilsDB.desconectarBBDD();
	}

	@Override
	public String toString() {
		return "Conferencia [partidos_fk=" + partidos_fk + ", liga_conferencias=" + liga_conferencias + "]";
	}

}
