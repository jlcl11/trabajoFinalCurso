package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.Jugador;
import superClases.ObjetoConNombre;
import utils.utilsDB;

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

		Statement query = utilsDB.conectarBBDD();
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
		utilsDB.desconectarBBDD();
	}

	public Equipo(byte eq_id, String nombre, byte conferencia_id, String ciudadLocal, String gM, float limiteSalarial,
			String propietario, byte playoffs_playoff_id) throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
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
		utilsDB.desconectarBBDD();
	}

	public Equipo(String nombre, byte eq_id, byte partidoAllStar_id) throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO equipo(eq_id,nombre,partidoallstar_parta_id) VALUES(" + eq_id + ",'"
				+ nombre + "'," + partidoAllStar_id + ");\r\n" + "") > 0) {
			this.eq_id = eq_id;
			this.partidoAllStar_id = partidoAllStar_id;
		}
		utilsDB.desconectarBBDD();

	}

	public Equipo(String text) throws SQLException {
		// esto es un constructor en la clase equipo
		Statement smt = utilsDB.conectarBBDD();
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
		utilsDB.desconectarBBDD();

	}

	public Equipo() {

	}

	

	public byte getEq_id() {
		return eq_id;
	}

	public void setEq_id(byte eq_id) {
		this.eq_id = eq_id;
	}

	public byte getConferencia_id() {
		return conferencia_id;
	}

	public void setConferencia_id(byte conferencia_id) {
		this.conferencia_id = conferencia_id;
	}

	public String getCiudadLocal() {
		return ciudadLocal;
	}

	public void setCiudadLocal(String ciudadLocal) {
		this.ciudadLocal = ciudadLocal;
	}

	public String getGM() {
		return GM;
	}

	public void setGM(String gM) {
		GM = gM;
	}

	public float getLimiteSalarial() {
		return limiteSalarial;
	}

	public void setLimiteSalarial(float limiteSalarial) {
		this.limiteSalarial = limiteSalarial;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public byte getPartidoAllStar_id() {
		return partidoAllStar_id;
	}

	public void setPartidoAllStar_id(byte partidoAllStar_id) {
		this.partidoAllStar_id = partidoAllStar_id;
	}

	public byte getPlayoffs_playoff_id() {
		return playoffs_playoff_id;
	}

	public void setPlayoffs_playoff_id(byte playoffs_playoff_id) {
		this.playoffs_playoff_id = playoffs_playoff_id;
	}

	@Override
	public String toString() {
		return "Equipo [eq_id=" + eq_id + ", conferencia_id=" + conferencia_id + ", ciudadLocal=" + ciudadLocal
				+ ", GM=" + GM + ", limiteSalarial=" + limiteSalarial + ", propietario=" + propietario
				+ ", partidoAllStar_id=" + partidoAllStar_id + ", playoffs_playoff_id=" + playoffs_playoff_id + "]";
	}

}
