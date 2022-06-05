package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import exceptions.SetterEquipoNoFuncionaAsiException;
import exceptions.SetterJugadorNoFuncionaAsiException;
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

		Statement smt = UtilsDB.conectarBBDD();

		try {
			ResultSet cursor = smt.executeQuery("SELECT * FROM equipo WHERE nombre='" + text + "';");
			while (cursor.next()) {

				this.setCiudadLocal(cursor.getString("ciudadLocal"));
				this.setGM(cursor.getString("gm"));
				this.setLimiteSalarial(cursor.getFloat("limitesalarial"));
				this.setPropietario(cursor.getString("propietario"));
				this.setNombre(cursor.getString("nombre"));
				this.setEq_id(cursor.getByte("eq_id"));
			}
		} catch (SQLException e) {

			e.printStackTrace();

		} catch (SetterEquipoNoFuncionaAsiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UtilsDB.desconectarBBDD();

	}

	public Equipo() {

	}

	public byte getEq_id() {
		return eq_id;
	}

	public void setEq_id(byte eq_id) throws SetterEquipoNoFuncionaAsiException {

		if (eq_id >= 0) {
			this.eq_id = eq_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public byte getConferencia_id() {
		return conferencia_id;
	}

	public void setConferencia_id(byte conferencia_id) throws SetterEquipoNoFuncionaAsiException {

		if (conferencia_id >= 0) {
			this.conferencia_id = conferencia_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public String getCiudadLocal() {
		return ciudadLocal;
	}

	public void setCiudadLocal(String ciudadLocal) throws SetterEquipoNoFuncionaAsiException {

		if (!ciudadLocal.isBlank()) {
			this.ciudadLocal = ciudadLocal;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede estar vacío");
		}
	}

	public String getGM() {
		return GM;
	}

	public void setGM(String gM) throws SetterEquipoNoFuncionaAsiException {

		if (!gM.isBlank()) {
			this.GM = gM;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede estar vacío");
		}
	}

	public float getLimiteSalarial() {
		return limiteSalarial;
	}

	public void setLimiteSalarial(float limiteSalarial) throws SetterEquipoNoFuncionaAsiException {

		if (limiteSalarial >= 0) {
			this.limiteSalarial = limiteSalarial;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) throws SetterEquipoNoFuncionaAsiException {

		if (!propietario.isBlank()) {
			this.propietario = propietario;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede estar vacío");
		}
	}

	public byte getPartidoAllStar_id() {
		return partidoAllStar_id;
	}

	public void setPartidoAllStar_id(byte partidoAllStar_id) throws SetterEquipoNoFuncionaAsiException {

		if (partidoAllStar_id >= 0) {
			this.partidoAllStar_id = partidoAllStar_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public byte getPlayoffs_playoff_id() {
		return playoffs_playoff_id;
	}

	public void setPlayoffs_playoff_id(byte playoffs_playoff_id) throws SetterEquipoNoFuncionaAsiException {

		if (playoffs_playoff_id >= 0) {
			this.playoffs_playoff_id = playoffs_playoff_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
