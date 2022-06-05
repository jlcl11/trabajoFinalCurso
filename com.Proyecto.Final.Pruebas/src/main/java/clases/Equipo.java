package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.UtilsDB;

public class Equipo extends ObjetoConNombre {
	private byte eq_id;
	private byte conferencia_id;
	private String ciudadLocal;
	private String GM;
	private float limiteSalarial;
	private String propietario;
	private byte partidoAllStar_id;
	private byte playoffs_playoff_id;

	public Equipo(String nombre, byte eq_id, byte conferencia_id, String ciudadLocal, String gM, float limiteSalarial,
			String propietario, byte partidoAllStar_id, byte playoffs_playoff_id) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO EQUIPO VALUES( " + eq_id + " , " + conferencia_id + ",'" + gM + " ',"
				+ limiteSalarial + ",'\r\n" + "				 " + propietario + "'," + partidoAllStar_id + ","
				+ playoffs_playoff_id + ",'" + nombre + "\r\n" + "				');") > 0) {
			this.eq_id = eq_id;
			this.conferencia_id = conferencia_id;
			this.ciudadLocal = ciudadLocal;
			GM = gM;
			this.limiteSalarial = limiteSalarial;
			this.propietario = propietario;
			this.partidoAllStar_id = partidoAllStar_id;
			this.playoffs_playoff_id = playoffs_playoff_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public Equipo(byte eq_id, String nombre, byte conferencia_id, String ciudadLocal, String gM, float limiteSalarial,
			String propietario, byte playoffs_playoff_id) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate(
				"INSERT INTO equipo(nombre,eq_id,conferencia,ciudadlocal,gm,limitesalarial,propietario,playoffs_playoff_id) VALUES('"
						+ nombre + "'," + eq_id + "," + conferencia_id + ",'" + ciudadLocal + "','" + gM + "',"
						+ limiteSalarial + ",'" + propietario + "'," + playoffs_playoff_id + ");") > 0) {
			this.eq_id = eq_id;
			this.conferencia_id = conferencia_id;
			this.ciudadLocal = ciudadLocal;

			GM = gM;
			this.limiteSalarial = limiteSalarial;

			this.propietario = propietario;

			this.playoffs_playoff_id = playoffs_playoff_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public Equipo(String nombre, byte eq_id, byte partidoAllStar_id) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO equipo(eq_id,nombre,partidoallstar_parta_id) VALUES(" + eq_id + ",'"
				+ nombre + "'," + partidoAllStar_id + ");\r\n" + "") > 0) {
			this.eq_id = eq_id;
			this.partidoAllStar_id = partidoAllStar_id;
		}
		UtilsDB.desconectarBBDD();

	}

	public Equipo(String text) throws SQLException {
		// esto es un constructor en la clase equipo
		Statement smt = UtilsDB.conectarBBDD();
		// Inicializamos un ArrayList para devolver.

		try {
			ResultSet cursor = smt.executeQuery("SELECT * FROM equipo WHERE nombre='" + text + "';");
			while (cursor.next()) {

				this.setCiudadLocal(cursor.getString("ciudadLocal"));
				this.setGM(cursor.getString("gm"));
				this.setLimiteSalarial(cursor.getFloat("limitesalarial"));
				this.setPropietario(cursor.getString("propietario"));
				this.setNombre(cursor.getString("nombre"));
				// this.setEq_id(cursor.getByte(conferencia_id));
			}
		} catch (SQLException e) {
			// Si la conuslta falla no hay nada que devolver.
			e.printStackTrace();

		}
		// Si no hay usuarios en la tabla, va a devolver un arraylist vacio.
		// Si la consulta fue erronea se devuelve un arraylist null, que son cosas
		// distintas.
		UtilsDB.desconectarBBDD();

	}

	public Equipo() {

	}

	public byte getEq_id() {
		return eq_id;
	}

	public void setEq_id(byte eq_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE equipo SET liga_conferencias = " + eq_id + "WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.eq_id = eq_id;
		}
		UtilsDB.desconectarBBDD();

	}

	public byte getConferencia_id() {
		return conferencia_id;
	}

	public void setConferencia_id(byte conferencia_id) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE equipo SET conferencia_id = " + conferencia_id + "WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.conferencia_id = conferencia_id;
		}
		UtilsDB.desconectarBBDD();

	}

	public String getCiudadLocal() {
		return ciudadLocal;
	}

	public void setCiudadLocal(String ciudadLocal) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE equipo set ciudadLocal='" + ciudadLocal + "' WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.ciudadLocal = ciudadLocal;
		}
		UtilsDB.desconectarBBDD();

	}

	public String getGM() {
		return GM;
	}

	public void setGM(String gM) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE equipo set GM='" + GM + "' WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.GM = gM;
		}
		UtilsDB.desconectarBBDD();
	}

	public float getLimiteSalarial() {
		return limiteSalarial;
	}

	public void setLimiteSalarial(float limiteSalarial) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE equipo SET limiteSalarial = " + limiteSalarial + "WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.limiteSalarial = limiteSalarial;
		}
		UtilsDB.desconectarBBDD();

	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE equipo set propietario='" + propietario + "' WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.propietario = propietario;
		}
		UtilsDB.desconectarBBDD();
		this.propietario = propietario;
	}

	public byte getPartidoAllStar_id() {
		return partidoAllStar_id;
	}

	public void setPartidoAllStar_id(byte partidoAllStar_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE equipo SET partidoAllStar_id = " + partidoAllStar_id + "WHERE eq_id=" + this.eq_id + ";") > 0) {
			this.partidoAllStar_id = partidoAllStar_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getPlayoffs_playoff_id() {
		return playoffs_playoff_id;
	}

	public void setPlayoffs_playoff_id(byte playoffs_playoff_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE equipo SET playoffs_playoff_id = " + playoffs_playoff_id + "WHERE eq_id="
				+ this.eq_id + ";") > 0) {
			this.playoffs_playoff_id = playoffs_playoff_id;
		}
		UtilsDB.desconectarBBDD();

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
