package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import superClases.Jugador;
import superClases.Partido;
import utils.utilsDB;

public class PartidoAllStar extends Partido {

	private byte allStar_id;
	private String equipo1;
	private String equipo2;
	private String titulares;

	public PartidoAllStar(byte allStar_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			String equipo1, String equipo2, String titulares) throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO partidoallStar VALUES(" + allStar_id + ",'" + equipo1 + "','" + equipo2
				+ "'," + marcadorLocal + "," + marcadorVisitante + ",'" + fecha + "','" + titulares + "');") > 0) {
			this.allStar_id = allStar_id;
			this.equipo1 = equipo1;
			this.equipo2 = equipo2;
			this.titulares = titulares;
		}
		utilsDB.desconectarBBDD();

	}

	public byte getAllStar_id() {
		return allStar_id;
	}

	public void setAllStar_id(byte allStar_id) {
		this.allStar_id = allStar_id;
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public String getTitulares() {
		return titulares;
	}

	public void setTitulares(String titulares) {
		this.titulares = titulares;
	}
	

}
