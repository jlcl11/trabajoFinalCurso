package clases;

import java.sql.SQLException;
import java.sql.Statement;

import enums.Posicion;
import enums.Valores;
import exceptions.EquipoMalIntroduciodoException;
import exceptions.JugadorMalIntroduciodoException;
import exceptions.SetterJugadorNoFuncionaAsiException;
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
			throws SQLException, JugadorMalIntroduciodoException {
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
			throw new JugadorMalIntroduciodoException("El jugador no se ha introducido bien");
		}

		UtilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, byte equipo_id)
			throws SQLException, JugadorMalIntroduciodoException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO jugador(jugador_id,nombre,apellido,dorsal,equipo_eq_id) VALUES("
				+ jugador_id + ",'" + nombre + "','" + apellido + "'," + dorsal + "," + equipo_id + ");") > 0) {
			this.jugador_id = jugador_id;
			this.apellido = apellido;
			this.dorsal = dorsal;
			this.equipo_id = equipo_id;

		} else {
			throw new JugadorMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		UtilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas,
			byte equipo_id, byte playoffs_Playoff_id) throws SQLException, JugadorMalIntroduciodoException {
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
			throw new JugadorMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		UtilsDB.desconectarBBDD();

	}

	public Jugador(short jugador_id, String nombre, String apellido, byte dorsal, String apodo, Posicion posicion,
			float salario, byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño,
			boolean rookieDelAño, boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG,
			float rBG, float sPG, float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion,
			Valores defensas, byte equipo_id, byte playoffs_Playoff_id)
			throws SQLException, JugadorMalIntroduciodoException {
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
			throw new JugadorMalIntroduciodoException("El jugador no se ha introducido bien");
		}
		UtilsDB.desconectarBBDD();
	}

	public Jugador() {

	}

	public short getJugador_id() {
		return jugador_id;
	}

	public void setJugador_id(short jugador_id) throws SetterJugadorNoFuncionaAsiException {

		if (jugador_id <= 358 && jugador_id >= 1) {
			this.jugador_id = jugador_id;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No hay jugador con ese id");
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws SetterJugadorNoFuncionaAsiException {

		if (!apellido.isBlank()) {
			this.apellido = apellido;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("El apellido no puede ser nulo");
		}

	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) throws SetterJugadorNoFuncionaAsiException {
		if (dorsal >= 0 && dorsal <= 99) {
			this.dorsal = dorsal;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No se puede poner ese dorsal");
		}

	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) throws SQLException, SetterJugadorNoFuncionaAsiException {

		this.apodo = apodo;

	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) throws SetterJugadorNoFuncionaAsiException {

		if (posicion.valueOf("BASE") != null || posicion.valueOf("ESCOLTA") != null || posicion.valueOf("ALERO") != null
				|| posicion.valueOf("ALAPIVOT") != null || posicion.valueOf("PIVOT") != null) {
			this.posicion = posicion;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No te inventes una posición nueva");
		}
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) throws SQLException {

		this.salario = salario;
	}

	public byte getNominacionesAllStar() {
		return nominacionesAllStar;
	}

	public void setNominacionesAllStar(byte nominacionesAllStar) throws SetterJugadorNoFuncionaAsiException {
		if (nominacionesAllStar >= 0) {
			this.nominacionesAllStar = nominacionesAllStar;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public byte getAnillosDeCampeon() {
		return anillosDeCampeon;
	}

	public void setAnillosDeCampeon(byte anillosDeCampeon) throws SetterJugadorNoFuncionaAsiException {

		if (anillosDeCampeon >= 0) {
			this.anillosDeCampeon = anillosDeCampeon;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public byte getMVPs() {
		return MVPs;
	}

	public void setMVPs(byte mVPs) throws SetterJugadorNoFuncionaAsiException {

		if (mVPs >= 0) {
			this.MVPs = mVPs;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public byte getDefensorDelAño() {
		return defensorDelAño;
	}

	public void setDefensorDelAño(byte defensorDelAño) throws SetterJugadorNoFuncionaAsiException {

		if (defensorDelAño >= 0) {
			this.defensorDelAño = defensorDelAño;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public boolean isRookieDelAño() {
		return rookieDelAño;
	}

	public void setRookieDelAño(boolean rookieDelAño) throws SetterJugadorNoFuncionaAsiException {

		this.rookieDelAño = rookieDelAño;

	}

	public boolean isMIP() {
		return MIP;
	}

	public void setMIP(boolean mIP) throws SetterJugadorNoFuncionaAsiException {

		this.MIP = mIP;

	}

	public byte getMVPAllStar() {
		return MVPAllStar;
	}

	public void setMVPAllStar(byte mVPAllStar) throws SetterJugadorNoFuncionaAsiException {
		if (mVPAllStar >= 0) {
			this.MVPAllStar = mVPAllStar;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public byte getFMVP() {
		return FMVP;
	}

	public void setFMVP(byte fMVP) throws SetterJugadorNoFuncionaAsiException {
		if (fMVP >= 0) {
			this.FMVP = fMVP;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public byte getPremioAnotador() {
		return premioAnotador;
	}

	public void setPremioAnotador(byte premioAnotador) throws SetterJugadorNoFuncionaAsiException {
		if (premioAnotador >= 0) {
			this.premioAnotador = premioAnotador;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public float getPPG() {
		return PPG;
	}

	public void setPPG(float pPG) throws SetterJugadorNoFuncionaAsiException {
		if (pPG >= 0) {
			this.PPG = pPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public float getAPG() {
		return APG;
	}

	public void setAPG(float aPG) throws SetterJugadorNoFuncionaAsiException {

		if (aPG >= 0) {
			this.APG = aPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public float getRBG() {
		return RBG;
	}

	public void setRBG(float rBG) throws SetterJugadorNoFuncionaAsiException {

		if (rBG >= 0) {
			this.RBG = rBG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public float getSPG() {
		return SPG;
	}

	public void setSPG(float sPG) throws SetterJugadorNoFuncionaAsiException {

		if (sPG >= 0) {
			this.SPG = sPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public float getBPG() {
		return BPG;
	}

	public void setBPG(float bPG) throws SetterJugadorNoFuncionaAsiException {

		if (bPG >= 0) {
			this.BPG = bPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public byte getMPG() {
		return MPG;
	}

	public void setMPG(byte mPG) throws SetterJugadorNoFuncionaAsiException {

		if (mPG >= 0) {
			this.MPG = mPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	public Valores getFinalizacion() {
		return finalizacion;
	}

	public void setFinalizacion(Valores finalizacion) throws SQLException, SetterJugadorNoFuncionaAsiException {
		if (finalizacion.valueOf("A") != null || finalizacion.valueOf("B") != null || finalizacion.valueOf("C") != null
				|| finalizacion.valueOf("D") != null) {
			this.finalizacion = finalizacion;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	public Valores getTiro() {
		return tiro;
	}

	public void setTiro(Valores tiro) throws SetterJugadorNoFuncionaAsiException {
		if (tiro.valueOf("A") != null || tiro.valueOf("B") != null || tiro.valueOf("C") != null
				|| tiro.valueOf("D") != null) {
			this.tiro = tiro;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	public Valores getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Valores organizacion) throws SetterJugadorNoFuncionaAsiException {
		if (organizacion.valueOf("A") != null || organizacion.valueOf("B") != null || organizacion.valueOf("C") != null
				|| organizacion.valueOf("D") != null) {
			this.organizacion = organizacion;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	public Valores getDefensas() {
		return defensas;
	}

	public void setDefensas(Valores defensas) throws SetterJugadorNoFuncionaAsiException {
		if (defensas.valueOf("A") != null || defensas.valueOf("B") != null || defensas.valueOf("C") != null
				|| defensas.valueOf("D") != null) {
			this.defensas = defensas;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	public byte getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(byte equipo_id) throws SetterJugadorNoFuncionaAsiException {

		if (equipo_id >= 0) {
			this.equipo_id = equipo_id;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public byte getPlayoffs_Playoff_id() {
		return playoffs_Playoff_id;
	}

	public void setPlayoffs_Playoff_id(byte playoffs_Playoff_id) throws SetterJugadorNoFuncionaAsiException {
		if (playoffs_Playoff_id >= 0) {
			this.playoffs_Playoff_id = equipo_id;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

}
