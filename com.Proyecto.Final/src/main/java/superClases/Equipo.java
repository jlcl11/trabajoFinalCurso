package superClases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import clases.Conferencia;
import clases.Estadio;
import clases.JugadorNormal;
import exceptions.EquipoSinDorsalesRetiradosException;
import utlis.funcionesUtiles;
import utlis.utilsDB;

public class Equipo extends ObjetoConNombre {
	private Conferencia conferencia;
	private String CiudadLocal;
	private String dorsalesRetirados;
	private String propietario;
	private String GM;
	private float limiteSalarial;
	private Estadio estadio;

	public Equipo(String nombre, Conferencia conferencia, String ciudadLocal, String dorsalesRetirados,
			String propietario, String gM, float limiteSalarial, Estadio estadio) {
		super(nombre);
		this.conferencia = conferencia;
		CiudadLocal = ciudadLocal;
		this.dorsalesRetirados = dorsalesRetirados;
		this.propietario = propietario;
		GM = gM;
		this.limiteSalarial = limiteSalarial;
		this.estadio = estadio;
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

	public Conferencia getConferencia() {
		return conferencia;
	}

	public void setConferencia(Conferencia conferencia) {
		this.conferencia = conferencia;
	}

	public String getCiudadLocal() {
		return CiudadLocal;
	}

	public void setCiudadLocal(String ciudadLocal) {
		CiudadLocal = ciudadLocal;
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
		return "Equipo [conferencia=" + conferencia + ", CiudadLocal=" + CiudadLocal + ", dorsalesRetirados="
				+dorsalesRetirados + ", propietario=" + propietario + ", GM=" + GM
				+ ", limiteSalarial=" + limiteSalarial + "]";
	}

}
