package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import superClases.Partido;
import utils.UtilsDB;

public class PartidoAllStar extends Partido {

	private byte allStar_id;
	private String equipo1;
	private String equipo2;
	private String titulares;

	public PartidoAllStar(byte allStar_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			String equipo1, String equipo2, String titulares) throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO partidoallStar VALUES(" + allStar_id + ",'" + equipo1 + "','" + equipo2
				+ "'," + marcadorLocal + "," + marcadorVisitante + ",'" + fecha + "','" + titulares + "');") > 0) {
			this.allStar_id = allStar_id;
			this.equipo1 = equipo1;
			this.equipo2 = equipo2;
			this.titulares = titulares;
		}
		UtilsDB.desconectarBBDD();

	}

	public byte getAllStar_id() {
		return allStar_id;
	}

	public void setAllStar_id(byte allStar_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set parta_id=" + allStar_id + " WHERE parta_id=" + this.allStar_id + ";") > 0) {
			this.allStar_id = allStar_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set equipo1='" + equipo1 + "' WHERE parta_id=" + allStar_id + ";") > 0) {
			this.equipo1 = equipo1;
		}
		UtilsDB.desconectarBBDD();
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set equipo1='" + equipo2 + "' WHERE parta_id=" + allStar_id + ";") > 0) {
			this.equipo2 = equipo2;
		}
		UtilsDB.desconectarBBDD();
	}

	public String getTitulares() {
		return titulares;
	}

	public void setTitulares(String titulares) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE partidoallstar set titulares='" + titulares + "' WHERE parta_id=" + allStar_id + ";") > 0) {
			this.titulares = titulares;
		}
		UtilsDB.desconectarBBDD();
	}

}
