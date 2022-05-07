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
	private Jugador[] dorsalesRetirados;
	private String propietario;
	private String GM;
	private float limiteSalarial;
	private Estadio estadio;

	public Equipo(String nombre, Conferencia conferencia, String ciudadLocal, Jugador[] dorsalesRetirados,
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

	public Jugador[] getDorsalesRetirados() {
		return dorsalesRetirados;
	}

	public void setDorsalesRetirados(Jugador[] dorsalesRetirados) {
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

	public String getDatosFranquicia(int opcion, Equipo equipo) throws EquipoSinDorsalesRetiradosException {
		String ret = "";

		switch (opcion) {
		case 1:

			ret += "El estadio de los " + equipo.getNombre() + " es " + equipo.getEstadio();

			break;
		case 2:
			ret += "El propietario de los " + equipo.getNombre() + " es " + equipo.getPropietario();

			break;
		case 3:
			ret += "El general manager de los " + equipo.getNombre() + " es " + equipo.getGM();

			break;
		case 4:
			ret += "El límite salarial de los " + equipo.getNombre() + " habiendo pagado el impuesto de lujo es de "
					+ equipo.getLimiteSalarial() + " millones de dólares";
			break;
		case 5:

			ret += funcionesUtiles.getDorsalesRetirados(equipo.getNombre());

			break;
		case 6:
			//ret += Equipo.getPremiosDeTemporada(opcion, equipo);
			ArrayList<JugadorNormal> plantillas=JugadorNormal.JugadoresNormales(equipo.getNombre());
			ret+=plantillas;

		}

		return ret;
	}

	/*
	public static String getPremiosDeTemporada(int opcion, Equipo equipo) {
		String ret = "";

		switch (opcion) {
		case 1:

			ret += "El MVP de la temporada es " + funcionesUtiles.devolverMVP();

			break;
		case 2:
			ret += "El defensor del año es " + funcionesUtiles.devolverDPOY();

			break;
		case 3:
			ret += "El premio anotador de la temporada es para " + funcionesUtiles.devolverPremioAnotador();

			break;

		}
		return ret;
	}
*/


	@Override
	public String toString() {
		return "Equipo [conferencia=" + conferencia + ", CiudadLocal=" + CiudadLocal + ", dorsalesRetirados="
				+ Arrays.toString(dorsalesRetirados) + ", propietario=" + propietario + ", GM=" + GM
				+ ", limiteSalarial=" + limiteSalarial + "]";
	}

}
