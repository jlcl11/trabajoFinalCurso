package clases;

import java.sql.SQLException;
import java.sql.Statement;

import superClases.ObjetoConNombre;
import utils.utilsDB;

public class Conferencia extends ObjetoConNombre {

	private int partidos_fk;
	private short liga_conferencias;

	public Conferencia(String nombre, int partidos_fk, short liga_conferencias) throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO conferencia(partidos,nombre,liga_conferencias) VALUES(" + partidos_fk + ",'" + nombre + "',"
				+ liga_conferencias + ");") > 0) {
			this.partidos_fk = partidos_fk;
			this.liga_conferencias = liga_conferencias;

		}
		utilsDB.desconectarBBDD();

	}

	public int getPartidos_fk() {
		return partidos_fk;
	}

	public void setPartidos_fk(int partidos_fk) {
		this.partidos_fk = partidos_fk;
	}

	public short getLiga_conferencias() {
		return liga_conferencias;
	}

	public void setLiga_conferencias(short liga_conferencias) {
		this.liga_conferencias = liga_conferencias;
	}

	@Override
	public String toString() {
		return "Conferencia [partidos_fk=" + partidos_fk + ", liga_conferencias=" + liga_conferencias + "]";
	}

}
