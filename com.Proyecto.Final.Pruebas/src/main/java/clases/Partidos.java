package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.utilsDB;

public class Partidos {
	private byte partidonormal_partidonl_id;
	private byte equipo_eq_id;

	public Partidos(byte partidonormal_partidonl_id, byte equipo_eq_id) throws SQLException {
		super();

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate(
				"INSERT INTO partidos VALUES(" + partidonormal_partidonl_id + "," + equipo_eq_id + ");") > 0) {
			this.partidonormal_partidonl_id = partidonormal_partidonl_id;
			this.equipo_eq_id = equipo_eq_id;
			System.out.println("partidos introducidos con exito");
		}
		utilsDB.desconectarBBDD();
	}

	public byte getPartidonormal_partidonl_id() {
		return partidonormal_partidonl_id;
	}

	public void setPartidonormal_partidonl_id(byte partidonormal_partidonl_id) {
		this.partidonormal_partidonl_id = partidonormal_partidonl_id;
	}

	public byte getEquipo_eq_id() {
		return equipo_eq_id;
	}

	public void setEquipo_eq_id(byte equipo_eq_id) {
		this.equipo_eq_id = equipo_eq_id;
	}

}
