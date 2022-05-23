package superClases;

import java.sql.SQLException;
import java.sql.Statement;

import enums.Posicion;
import enums.Valores;
import exceptions.EquipoMalIntroduciodoException;
import utils.utilsDB;

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

		Statement query = utilsDB.conectarBBDD();

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

		utilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, byte equipo_id)
			throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO jugador(jugador_id,nombre,apellido,dorsal,equipo_eq_id) VALUES("
				+ jugador_id + ",'" + nombre + "','" + apellido + "'," + dorsal + "," + equipo_id + ");") > 0) {
			this.jugador_id = jugador_id;
			this.apellido = apellido;
			this.dorsal = dorsal;
			this.equipo_id = equipo_id;

		} else {
			throw new EquipoMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		utilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas,
			byte equipo_id, byte playoffs_Playoff_id) throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
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
		utilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, String apodo, Posicion posicion,
			float salario, byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño,
			boolean rookieDelAño, boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG,
			float rBG, float sPG, float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion,
			Valores defensas, byte equipo_id, byte playoffs_Playoff_id)
			throws SQLException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();
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
		utilsDB.desconectarBBDD();
	}

	public short getJugador_id() {
		return jugador_id;
	}

	public void setJugador_id(short jugador_id) {
		this.jugador_id = jugador_id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public byte getNominacionesAllStar() {
		return nominacionesAllStar;
	}

	public void setNominacionesAllStar(byte nominacionesAllStar) {
		this.nominacionesAllStar = nominacionesAllStar;
	}

	public byte getAnillosDeCampeon() {
		return anillosDeCampeon;
	}

	public void setAnillosDeCampeon(byte anillosDeCampeon) {
		this.anillosDeCampeon = anillosDeCampeon;
	}

	public byte getMVPs() {
		return MVPs;
	}

	public void setMVPs(byte mVPs) {
		MVPs = mVPs;
	}

	public byte getDefensorDelAño() {
		return defensorDelAño;
	}

	public void setDefensorDelAño(byte defensorDelAño) {
		this.defensorDelAño = defensorDelAño;
	}

	public boolean isRookieDelAño() {
		return rookieDelAño;
	}

	public void setRookieDelAño(boolean rookieDelAño) {
		this.rookieDelAño = rookieDelAño;
	}

	public boolean isMIP() {
		return MIP;
	}

	public void setMIP(boolean mIP) {
		MIP = mIP;
	}

	public byte getMVPAllStar() {
		return MVPAllStar;
	}

	public void setMVPAllStar(byte mVPAllStar) {
		MVPAllStar = mVPAllStar;
	}

	public byte getFMVP() {
		return FMVP;
	}

	public void setFMVP(byte fMVP) {
		FMVP = fMVP;
	}

	public byte getPremioAnotador() {
		return premioAnotador;
	}

	public void setPremioAnotador(byte premioAnotador) {
		this.premioAnotador = premioAnotador;
	}

	public float getPPG() {
		return PPG;
	}

	public void setPPG(float pPG) {
		PPG = pPG;
	}

	public float getAPG() {
		return APG;
	}

	public void setAPG(float aPG) {
		APG = aPG;
	}

	public float getRBG() {
		return RBG;
	}

	public void setRBG(float rBG) {
		RBG = rBG;
	}

	public float getSPG() {
		return SPG;
	}

	public void setSPG(float sPG) {
		SPG = sPG;
	}

	public float getBPG() {
		return BPG;
	}

	public void setBPG(float bPG) {
		BPG = bPG;
	}

	public byte getMPG() {
		return MPG;
	}

	public void setMPG(byte mPG) {
		MPG = mPG;
	}

	public Valores getFinalizacion() {
		return finalizacion;
	}

	public void setFinalizacion(Valores finalizacion) {
		this.finalizacion = finalizacion;
	}

	public Valores getTiro() {
		return tiro;
	}

	public void setTiro(Valores tiro) {
		this.tiro = tiro;
	}

	public Valores getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Valores organizacion) {
		this.organizacion = organizacion;
	}

	public Valores getDefensas() {
		return defensas;
	}

	public void setDefensas(Valores defensas) {
		this.defensas = defensas;
	}

	public byte getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(byte equipo_id) {
		this.equipo_id = equipo_id;
	}

	public byte getPlayoffs_Playoff_id() {
		return playoffs_Playoff_id;
	}

	public void setPlayoffs_Playoff_id(byte playoffs_Playoff_id) {
		this.playoffs_Playoff_id = playoffs_Playoff_id;
	}

}
