package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import superClases.Partido;
import utils.UtilsDB;

public class PartidoNormal extends Partido {

	private byte partido_id;
	private byte equipo1_id;
	private byte equipo2_id;
	private short conferencia_Partidos;
	private byte rondaPlayoffs_ronda_id;

	public PartidoNormal(byte partido_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			byte equipo1_id, byte equipo2_id, short conferencia_Partidos) throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate(
				"INSERT INTO partidonormal(partidonl_id,equipo1_id,equipo2_id,marcadorequipo1,marcadorequipo2,fecha,conferencia_partidos)\r\n"
						+ "VALUES(" + partido_id + "," + equipo1_id + "," + equipo2_id + "," + marcadorLocal + ","
						+ marcadorVisitante + ",'" + fecha + "'," + conferencia_Partidos + ");") > 0) {
			this.partido_id = partido_id;
			this.equipo1_id = equipo1_id;
			this.equipo2_id = equipo2_id;
			this.conferencia_Partidos = conferencia_Partidos;
			System.out.println("Partido introducido correctamente");
		}
		UtilsDB.desconectarBBDD();
	}

	public PartidoNormal(byte partido_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			byte equipo1_id, byte equipo2_id, short conferencia_Partidos, byte rondaPlayoffs_ronda_id)
			throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO partidonormal() VALUES(" + partido_id + "," + equipo1_id + "," + equipo2_id
				+ "," + marcadorLocal + "," + marcadorVisitante + ",'" + fecha + "'," + conferencia_Partidos + ","
				+ rondaPlayoffs_ronda_id + ");") > 0) {
			this.partido_id = partido_id;
			this.equipo1_id = equipo1_id;
			this.equipo2_id = equipo2_id;
			this.conferencia_Partidos = conferencia_Partidos;
			this.rondaPlayoffs_ronda_id = rondaPlayoffs_ronda_id;
			System.out.println("Partido introducido con exito");
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getPartido_id() {
		return partido_id;
	}

	public void setPartido_id(byte partido_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET partidonl_id=" + partido_id + " WHERE partidonl_id="
				+ this.partido_id + ";") > 0) {
			this.partido_id = partido_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getEquipo1_id() {
		return equipo1_id;
	}

	public void setEquipo1_id(byte equipo1_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET equipo1=" + equipo1_id + " WHERE partidonl_id="
				+ this.partido_id + ";") > 0) {
			this.equipo1_id = equipo1_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getEquipo2_id() {
		return equipo2_id;
	}

	public void setEquipo2_id(byte equipo2_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET equipo2=" + equipo2_id + " WHERE partidonl_id="
				+ this.partido_id + ";") > 0) {
			this.equipo2_id = equipo2_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public short getConferencia_Partidos() {
		return conferencia_Partidos;
	}

	public void setConferencia_Partidos(short conferencia_Partidos) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET conferencia_partidos=" + conferencia_Partidos
				+ " WHERE partidonl_id=" + this.partido_id + ";") > 0) {
			this.conferencia_Partidos = conferencia_Partidos;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getRondaPlayoffs_ronda_id() {
		return rondaPlayoffs_ronda_id;
	}

	public void setRondaPlayoffs_ronda_id(byte rondaPlayoffs_ronda_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET rondaplayoff_ronda_id=" + rondaPlayoffs_ronda_id
				+ " WHERE partidonl_id=" + this.partido_id + ";") > 0) {
			this.rondaPlayoffs_ronda_id = rondaPlayoffs_ronda_id;
		}
		UtilsDB.desconectarBBDD();
	}

}
