package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import superClases.ObjetoConNombre;
import utils.utilsDB;

public class Estadio extends ObjetoConNombre {
	private byte estadio_id;
	private short capacidad;
	private byte equipo_id;

	public Estadio(byte estadio_id, String nombre, short capacidad, byte equipo_id) throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO estadio VALUES(" + estadio_id + ",'" + nombre + "'," + capacidad + ","
				+ equipo_id + ");") > 0) {
			this.estadio_id = estadio_id;
			this.capacidad = capacidad;
			this.equipo_id = equipo_id;
		}
		utilsDB.desconectarBBDD();
	}

	public Estadio(byte equipo_eq_id) {
		Statement smt = utilsDB.conectarBBDD();

		try {
			ResultSet cursor = smt.executeQuery("SELECT * FROM estadio WHERE equipo_eq_id='" + equipo_eq_id + "';");
			while (cursor.next()) {

				this.setNombre(cursor.getString("nombre"));
				this.setCapacidad(cursor.getShort("capacidad"));
			}
		} catch (SQLException e) {

			e.printStackTrace();

		}

		utilsDB.desconectarBBDD();

	}

	public byte getEstadio_id() {
		return estadio_id;
	}

	public void setEstadio_id(byte estadio_id) {
		this.estadio_id = estadio_id;
	}

	public short getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(short capacidad) {
		this.capacidad = capacidad;
	}

	public byte getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(byte equipo_id) {
		this.equipo_id = equipo_id;
	}

}
