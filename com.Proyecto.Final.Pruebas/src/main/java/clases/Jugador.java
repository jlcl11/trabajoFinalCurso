package clases;

import java.sql.SQLException;
import java.sql.Statement;

import enums.Posicion;
import enums.Valores;
import exceptions.EquipoMalIntroduciodoException;
import superClases.ObjetoConNombre;
import utils.UtilsDB;

public class Jugador extends ObjetoConNombre {

	private short jugador_id;
	private String apellido;
	private byte dorsal;
	private String apodo;
	private Posicion posicion;
	private float salario;
	private byte nominacionesAllStar;
	private byte anillosDeCampeon;
	private byte MVPs;
	private byte defensorDelAño;
	private boolean rookieDelAño;
	private boolean MIP;
	private byte MVPAllStar;
	private byte FMVP;
	private byte premioAnotador;
	private float PPG;
	private float APG;
	private float RBG;
	private float SPG;
	private float BPG;
	private byte MPG;// minutos por partido
	private Valores finalizacion;
	private Valores tiro;
	private Valores organizacion;
	private Valores defensas;
	private byte equipo_id;
	private byte playoffs_Playoff_id;

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, String apodo, byte equipo_id)
			throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();

		if (query.executeUpdate(
				"INSERT INTO jugador(jugador_id,nombre,apellido,apodo,dorsal,equipo_eq_id) VALUES(" + jugador_id + ",'"
						+ nombre + "','" + apellido + "','" + apodo + "'," + dorsal + "," + equipo_id + ");") > 0) {
			this.jugador_id = jugador_id;
			this.apellido = apellido;
			this.dorsal = dorsal;
			this.apodo = apodo;
			this.equipo_id = equipo_id;

		} else {
			throw new EquipoMalIntroduciodoException("El jugador no se ha introducido bien");
		}

		UtilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, byte equipo_id)
			throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO jugador(jugador_id,nombre,apellido,dorsal,equipo_eq_id) VALUES("
				+ jugador_id + ",'" + nombre + "','" + apellido + "'," + dorsal + "," + equipo_id + ");") > 0) {
			this.jugador_id = jugador_id;
			this.apellido = apellido;
			this.dorsal = dorsal;
			this.equipo_id = equipo_id;

		} else {
			throw new EquipoMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		UtilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas,
			byte equipo_id, byte playoffs_Playoff_id) throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate(
				" INSERT INTO jugador(jugador_id,nombre,apellido,dorsal,posicion,salario,nominacionesallstar,anillosdecampeon,mvp,dpoy,roty,mip,mvpallstar,fmvp,premioanotador,ppg,apg,rbg,spg,bpg,mpg,finalizacion,tiro,organizacion,defensa,equipo_eq_id,playoffs_playoff_id) \r\n"
						+ "VALUES(" + jugador_id + ",'" + nombre + "','" + apellido + "'," + dorsal + ",'" + posicion
						+ "'," + salario + "," + nominacionesAllStar + "," + anillosDeCampeon + "," + mVPs + ","
						+ defensorDelAño + "," + rookieDelAño + "," + mIP + "," + mVPAllStar + "," + fMVP + ","
						+ premioAnotador + "," + pPG + "," + aPG + "," + rBG + "," + sPG + "," + bPG + "," + mPG + ",'"
						+ finalizacion + "','" + tiro + "','" + organizacion + "','" + defensas + "'," + equipo_id + ","
						+ playoffs_Playoff_id + ");") > 0) {

			this.jugador_id = jugador_id;
			this.apellido = apellido;
			this.dorsal = dorsal;
			this.posicion = posicion;
			this.salario = salario;
			this.nominacionesAllStar = nominacionesAllStar;
			this.anillosDeCampeon = anillosDeCampeon;
			MVPs = mVPs;
			this.defensorDelAño = defensorDelAño;
			this.rookieDelAño = rookieDelAño;
			MIP = mIP;
			MVPAllStar = mVPAllStar;
			FMVP = fMVP;
			this.premioAnotador = premioAnotador;
			PPG = pPG;
			APG = aPG;
			RBG = rBG;
			SPG = sPG;
			BPG = bPG;
			MPG = mPG;
			this.finalizacion = finalizacion;
			this.tiro = tiro;
			this.organizacion = organizacion;
			this.defensas = defensas;
			this.equipo_id = equipo_id;
			this.playoffs_Playoff_id = playoffs_Playoff_id;

		} else {
			throw new EquipoMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		UtilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, String apodo, Posicion posicion,
			float salario, byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño,
			boolean rookieDelAño, boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG,
			float rBG, float sPG, float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion,
			Valores defensas, byte equipo_id, byte playoffs_Playoff_id)
			throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate(" INSERT INTO jugador VALUES(" + jugador_id + ",'" + nombre + "','" + apellido + "',"
				+ dorsal + ",'" + apodo + "','" + posicion + "'," + salario + "," + nominacionesAllStar + ","
				+ anillosDeCampeon + "," + mVPs + "," + defensorDelAño + "," + rookieDelAño + "," + mIP + ","
				+ mVPAllStar + "," + fMVP + "," + premioAnotador + "," + pPG + "," + aPG + "," + rBG + "," + sPG + ","
				+ bPG + "," + mPG + ",'" + finalizacion + "','" + tiro + "','" + organizacion + "','" + defensas + "',"
				+ equipo_id + "," + playoffs_Playoff_id + ");") > 0) {

			this.jugador_id = jugador_id;
			this.apellido = apellido;
			this.dorsal = dorsal;
			this.apodo = apodo;
			this.posicion = posicion;
			this.salario = salario;
			this.nominacionesAllStar = nominacionesAllStar;
			this.anillosDeCampeon = anillosDeCampeon;
			MVPs = mVPs;
			this.defensorDelAño = defensorDelAño;
			this.rookieDelAño = rookieDelAño;
			MIP = mIP;
			MVPAllStar = mVPAllStar;
			FMVP = fMVP;
			this.premioAnotador = premioAnotador;
			PPG = pPG;
			APG = aPG;
			RBG = rBG;
			SPG = sPG;
			BPG = bPG;
			MPG = mPG;
			this.finalizacion = finalizacion;
			this.tiro = tiro;
			this.organizacion = organizacion;
			this.defensas = defensas;
			this.equipo_id = equipo_id;
			this.playoffs_Playoff_id = playoffs_Playoff_id;

		} else {
			throw new EquipoMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		UtilsDB.desconectarBBDD();
	}

	public Jugador() {

	}

	public short getJugador_id() {
		return jugador_id;
	}

	public void setJugador_id(short jugador_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set jugador_id=" + jugador_id + " where jugador_id=" + jugador_id
				+ ";\r\n" + ";") > 0) {
			this.jugador_id = jugador_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set apellido='" + apellido + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.apellido = apellido;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set dorsal=" + dorsal + " where jugador_id=" + jugador_id + ";\r\n" + ";") > 0) {
			this.dorsal = dorsal;
		}
		UtilsDB.desconectarBBDD();
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set apodo='" + apodo + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.apodo = apodo;
		}
		UtilsDB.desconectarBBDD();
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set posicion='" + posicion + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.posicion = posicion;
		}
		UtilsDB.desconectarBBDD();
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set salario=" + salario + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.salario = salario;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getNominacionesAllStar() {
		return nominacionesAllStar;
	}

	public void setNominacionesAllStar(byte nominacionesAllStar) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set nominacionesAllStar=" + nominacionesAllStar + " where jugador_id="
				+ this.jugador_id + ";\r\n" + ";") > 0) {
			this.nominacionesAllStar = nominacionesAllStar;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getAnillosDeCampeon() {
		return anillosDeCampeon;
	}

	public void setAnillosDeCampeon(byte anillosDeCampeon) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set anillosDeCampeon=" + anillosDeCampeon + " where jugador_id="
				+ this.jugador_id + ";\r\n" + ";") > 0) {
			this.anillosDeCampeon = anillosDeCampeon;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getMVPs() {
		return MVPs;
	}

	public void setMVPs(byte mVPs) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set MVPs=" + MVPs + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.MVPs = mVPs;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getDefensorDelAño() {
		return defensorDelAño;
	}

	public void setDefensorDelAño(byte defensorDelAño) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set defensorDelAño=" + defensorDelAño + " where jugador_id="
				+ this.jugador_id + ";\r\n" + ";") > 0) {
			this.defensorDelAño = defensorDelAño;
		}
		UtilsDB.desconectarBBDD();
	}

	public boolean isRookieDelAño() {
		return rookieDelAño;
	}

	public void setRookieDelAño(boolean rookieDelAño) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set roty='" + rookieDelAño + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.rookieDelAño = rookieDelAño;
		}
		UtilsDB.desconectarBBDD();
	}

	public boolean isMIP() {
		return MIP;
	}

	public void setMIP(boolean mIP) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set roty='" + mIP + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.MIP = mIP;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getMVPAllStar() {
		return MVPAllStar;
	}

	public void setMVPAllStar(byte mVPAllStar) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set mVPAllStar=" + mVPAllStar + " where jugador_id=" + this.jugador_id
				+ ";\r\n" + ";") > 0) {
			MVPAllStar = mVPAllStar;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getFMVP() {
		return FMVP;
	}

	public void setFMVP(byte fMVP) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set fMVP=" + fMVP + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			FMVP = fMVP;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getPremioAnotador() {
		return premioAnotador;
	}

	public void setPremioAnotador(byte premioAnotador) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set premioAnotador=" + premioAnotador + " where jugador_id="
				+ this.jugador_id + ";\r\n" + ";") > 0) {
			this.premioAnotador = premioAnotador;
		}
		UtilsDB.desconectarBBDD();

	}

	public float getPPG() {
		return PPG;
	}

	public void setPPG(float pPG) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set pPG=" + pPG + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.PPG = pPG;
		}
		UtilsDB.desconectarBBDD();
	}

	public float getAPG() {
		return APG;
	}

	public void setAPG(float aPG) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set aPG=" + aPG + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.APG = aPG;
		}
		UtilsDB.desconectarBBDD();
	}

	public float getRBG() {
		return RBG;
	}

	public void setRBG(float rBG) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set rBG=" + rBG + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.RBG = rBG;
		}
		UtilsDB.desconectarBBDD();
	}

	public float getSPG() {
		return SPG;
	}

	public void setSPG(float sPG) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set sPG=" + sPG + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.SPG = sPG;
		}
		UtilsDB.desconectarBBDD();
	}

	public float getBPG() {
		return BPG;
	}

	public void setBPG(float bPG) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set bPG=" + bPG + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.BPG = bPG;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getMPG() {
		return MPG;
	}

	public void setMPG(byte mPG) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set mPG=" + mPG + " where jugador_id=" + this.jugador_id + ";\r\n" + ";") > 0) {
			this.MPG = mPG;
		}
		UtilsDB.desconectarBBDD();
	}

	public Valores getFinalizacion() {
		return finalizacion;
	}

	public void setFinalizacion(Valores finalizacion) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set finalizacion='" + finalizacion + "' where jugador_id="
				+ this.jugador_id + ";") > 0) {
			this.finalizacion = finalizacion;
		}
		UtilsDB.desconectarBBDD();
	}

	public Valores getTiro() {
		return tiro;
	}

	public void setTiro(Valores tiro) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set tiro='" + tiro + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.tiro = tiro;
		}
		UtilsDB.desconectarBBDD();
	}

	public Valores getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Valores organizacion) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set organizacion='" + organizacion + "' where jugador_id="
				+ this.jugador_id + ";") > 0) {
			this.organizacion = organizacion;
		}
		UtilsDB.desconectarBBDD();
	}

	public Valores getDefensas() {
		return defensas;
	}

	public void setDefensas(Valores defensas) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE jugador set defensas='" + defensas + "' where jugador_id=" + this.jugador_id + ";") > 0) {
			this.defensas = defensas;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(byte equipo_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set equipo_id=" + equipo_id + " where jugador_id=" + this.jugador_id
				+ ";\r\n" + ";") > 0) {
			this.equipo_id = equipo_id;
		}
		UtilsDB.desconectarBBDD();
	}

	public byte getPlayoffs_Playoff_id() {
		return playoffs_Playoff_id;
	}

	public void setPlayoffs_Playoff_id(byte playoffs_Playoff_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE jugador set playoffs_Playoff_id=" + playoffs_Playoff_id + " where jugador_id="
				+ this.jugador_id + ";\r\n" + ";") > 0) {
			this.playoffs_Playoff_id = playoffs_Playoff_id;
		}
		UtilsDB.desconectarBBDD();
	}

}
