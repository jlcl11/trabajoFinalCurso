package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import superClases.ObjetoConNombre;
import utils.utilsDB;

public class Equipo extends ObjetoConNombre {
	private byte eq_id;
	private byte conferencia_id;
	private String ciudadLocal;
	private String dorsalesJugadoresRetirados_id;
	private String GM;
	private float limiteSalarial;
	private String estadio;
	private String propietario;
	private byte partidoAllStar_id;
	private String plantilla;
	private byte playoffs_playoff_id;

	public Equipo(String nombre, byte eq_id, byte conferencia_id, String ciudadLocal,
			String dorsalesJugadoresRetirados_id, String gM, float limiteSalarial, String estadio, String propietario,
			byte partidoAllStar_id, String plantilla, byte playoffs_playoff_id) throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO EQUIPO VALUES(" + eq_id + "," + conferencia_id + ",'" + ciudadLocal + "','"
				+ dorsalesJugadoresRetirados_id + "','" + gM + "'," + limiteSalarial + ",'" + estadio + "','"
				+ propietario + "'," + partidoAllStar_id + ",'" + plantilla + "'," + playoffs_playoff_id + ",'" + nombre
				+ "');") > 0) {
			this.eq_id = eq_id;
			this.conferencia_id = conferencia_id;
			this.ciudadLocal = ciudadLocal;
			this.dorsalesJugadoresRetirados_id = dorsalesJugadoresRetirados_id;
			GM = gM;
			this.limiteSalarial = limiteSalarial;
			this.estadio = estadio;
			this.propietario = propietario;
			this.partidoAllStar_id = partidoAllStar_id;
			this.plantilla = plantilla;
			this.playoffs_playoff_id = playoffs_playoff_id;
		}
		utilsDB.desconectarBBDD();
	}

	public Equipo(byte eq_id, String nombre, byte conferencia_id, String ciudadLocal,
			String dorsalesJugadoresRetirados_id, String gM, float limiteSalarial, String estadio, String propietario,
			String plantilla, byte playoffs_playoff_id) throws SQLException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate(
				"INSERT INTO equipo(eq_id,conferencia,ciudadlocal,dorsalesretirados,gm,limitesalarial,estadio,propietario,jugadores,nombre) \r\n"
						+ "VALUES(" + eq_id + "," + conferencia_id + ",'" + ciudadLocal + "','"
						+ dorsalesJugadoresRetirados_id + "','" + gM + "'," + limiteSalarial + ",'" + estadio + "','"
						+ propietario + "','" + plantilla + "','" + nombre + "');") > 0) {
			this.eq_id = eq_id;
			this.conferencia_id = conferencia_id;
			this.ciudadLocal = ciudadLocal;
			this.dorsalesJugadoresRetirados_id = dorsalesJugadoresRetirados_id;
			GM = gM;
			this.limiteSalarial = limiteSalarial;
			this.estadio = estadio;
			this.propietario = propietario;
			this.plantilla = plantilla;
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

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
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

	public String getDorsalesJugadoresRetirados_id() {
		return dorsalesJugadoresRetirados_id;
	}

	public void setDorsalesJugadoresRetirados_id(String dorsalesJugadoresRetirados_id) {
		this.dorsalesJugadoresRetirados_id = dorsalesJugadoresRetirados_id;
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

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}

	public byte getPlayoffs_playoff_id() {
		return playoffs_playoff_id;
	}

	public void setPlayoffs_playoff_id(byte playoffs_playoff_id) {
		this.playoffs_playoff_id = playoffs_playoff_id;
	}

}
