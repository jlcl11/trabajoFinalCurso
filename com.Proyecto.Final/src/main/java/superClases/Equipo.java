package superClases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import clases.Conferencia;
import clases.Estadio;
import clases.JugadorNormal;
import exceptions.EquipoMalIntroduciodoException;
import exceptions.EquipoSinDorsalesRetiradosException;
import exceptions.PartidoAllStarMalHechoException;
import utlis.funcionesUtiles;
import utlis.utilsDB;

public class Equipo extends ObjetoConNombre {
	private short equipoID;
	private Conferencia conferencia;
	private String ciudadLocal;
	private String dorsalesRetirados;
	private String propietario;
	private String GM;
	private float limiteSalarial;
	private Estadio estadio;

	public Equipo(String nombre, short equipoID, Conferencia conferencia, String ciudadLocal, String dorsalesRetirados,
			String propietario, String gM, float limiteSalarial, Estadio estadio)
			throws EquipoMalIntroduciodoException, SQLException, EquipoSinDorsalesRetiradosException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();

		if (query.executeUpdate(
				"INSERT INTO equipo("+equipoID+";"+nombre+","+conferencia+","+ciudadLocal+","+dorsalesRetirados+","+GM+",limitesalarial,estadio,propietario,partidoallstar_parta_id,jugadores,playoffs_playoff_id,nombre) VALUES (99,'ejemplo','ejemplo','ejemplo',999,'ejemplo','ejemplo',1,'ejemplo',1,'ejemplo');") > 0) {

			this.equipoID = equipoID;
			this.conferencia = conferencia;
			ciudadLocal = ciudadLocal;
			this.dorsalesRetirados = dorsalesRetirados;
			this.propietario = propietario;
			GM = gM;
			this.limiteSalarial = limiteSalarial;
			this.estadio = estadio;
		} else {
			throw new EquipoMalIntroduciodoException("El equipo del All Star se ha introducido de manera incorrecta");
		}
		utilsDB.desconectarBBDD();
	}

	public short getEquipoID() {
		return equipoID;
	}

	public void setEquipoID(short equipoID) {
		this.equipoID = equipoID;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Equipo(String nombre) {
		super(nombre);
	}

	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	public Conferencia getConferencia() {
		return conferencia;
	}

	public void setConferencia(Conferencia conferencia) {
		this.conferencia = conferencia;
	}

	public String getCiudadLocal() {
		return ciudadLocal;
	}

	public void setCiudadLocal(String ciudadLocal) {
		ciudadLocal = ciudadLocal;
	}

	public String getDorsalesRetirados() {
		return dorsalesRetirados;
	}

	public void setDorsalesRetirados(String dorsalesRetirados) {
		this.dorsalesRetirados = dorsalesRetirados;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
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

	@Override
	public String toString() {
		return "Equipo [conferencia=" + conferencia + ", CiudadLocal=" + ciudadLocal + ", dorsalesRetirados="
				+ dorsalesRetirados + ", propietario=" + propietario + ", GM=" + GM + ", limiteSalarial="
				+ limiteSalarial + "]";
	}

}
