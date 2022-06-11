package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

import enums.Posicion;
import enums.Valores;
import exceptions.EquipoMalIntroduciodoException;
import exceptions.JugadorMalIntroduciodoException;
import exceptions.SetterJugadorNoFuncionaAsiException;
import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a un jugador
 * 
 * @author jcorr
 *
 */
public class Jugador extends ObjetoConNombre {

	/* id del jugador */
	private short jugador_id;
	/* apellido del jugador */
	private String apellido;
	/* dorsal del jugador */
	private byte dorsal;
	/* apodo del jugador */
	private String apodo;
	/* posicion del jugador */
	private Posicion posicion;
	/* salario del jugador */
	private float salario;
	/*
	 * todas las nominaciones del AllStar que ha tenido el jugador a lo largo de su
	 * carrera
	 */
	private byte nominacionesAllStar;
	/*
	 * todos los anillos de campeón que ha tenido el jugador a lo largo de su
	 * carrera
	 */
	private byte anillosDeCampeon;
	/*
	 * todos los premios de mejor jugador de la temporada que ha tenido el jugador a
	 * lo largo de su carrera
	 */
	private byte MVPs;
	/*
	 * todos los premios de defensor del año que ha tenido el jugador a lo largo de
	 * su carrera
	 */
	private byte defensorDelAño;
	/*
	 * *indica si el jugador fue el mejor novato de su año del draft
	 */
	private boolean rookieDelAño;
	/*
	 * indica si el jugador ha sido galardonado con el premio al jugador más
	 * mejorado a lo largo de su carrera
	 */
	private boolean MIP;
	/*
	 * todas los premios al mejor jugador del partido de las estrellas que ha tenido
	 * el jugador a lo largo de su carrera
	 */
	private byte MVPAllStar;
	/*
	 * todas los premios al mejor jugador durante las finales de la NBA que ha
	 * tenido el jugador a lo largo de su carrera
	 */
	private byte FMVP;
	/*
	 * todas los premios al mejor anotador que ha tenido el jugador a lo largo de su
	 * carrera
	 */
	private byte premioAnotador;
	/* indica los puntos por partido que mete el jugador */
	private float PPG;
	/* indica las asistencias por partido que reparte el jugador */
	private float APG;
	/* indica los rebotes por partido que atrapa el jugador */
	private float RBG;
	/* indica los robos por partido que consigue el jugador */
	private float SPG;
	/* indica los balones que el jugador tapona por partido */
	private float BPG;
	/* indica los minutos por partido que juega el jugador */
	private byte MPG;
	/* indica la nota que tiene el jugador como finalizador */
	private Valores finalizacion;
	/* indica la nota que tiene el jugador como tirador */
	private Valores tiro;
	/*
	 * indica la nota que tiene el jugador como organizador(incluye dribbling y
	 * asistencias)
	 */
	private Valores organizacion;
	/* indica la nota que tiene el jugador como finalizador */
	private Valores defensas;
	/*
	 * indica mediante la foreign key del equipo,el equipo al que pertenece el
	 * jugador
	 */
	private byte equipo_id;
	/* indica la edición de playoffs a la que pertenece el jugador */
	private byte playoffs_Playoff_id;

	/**
	 * Constructor de un jugador cuyo dorsal está retirado por un equipo y tenía u
	 * apodo/mote cuando jugaba,inserta el jugador directamente en la base de datos
	 * 
	 * @param jugador_id id del jugador
	 * @param nombre     nombre del jugador
	 * @param apellido   apellido del jugador
	 * @param dorsal     dorsal del jugador
	 * @param apodo      apodo del jugador
	 * @param equipo_id  id del equipo del jugador
	 * @throws SQLException                    lanza una SQL exception porque el
	 *                                         constructor inserta directamente el
	 *                                         objeto en bbdd
	 * @throws JugadorMalIntroduciodoException excepcion que avisa si no se ha
	 *                                         podido introducir el jugador,la idea
	 *                                         es que no salte
	 */
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

	/**
	 * Constructor de un jugador cuyo dorsal está retirado por un equipo y no tenía
	 * u apodo/mote cuando jugaba,inserta el jugador directamente en la base de
	 * datos
	 * 
	 * @param jugador_id id del jugador
	 * @param nombre     nombre del jugador
	 * @param apellido   apellido del jugador
	 * @param dorsal     dorsal del jugador
	 * @param equipo_id  id del equipo del jugador
	 * @throws SQLException                    lanza una SQL exception porque el
	 *                                         constructor inserta directamente el
	 *                                         objeto en bbdd
	 * @throws JugadorMalIntroduciodoException excepcion que avisa si no se ha
	 *                                         podido introducir el jugador,la idea
	 *                                         es que no salte
	 */
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

	/**
	 * Constructor que inserta un jugador(sin mote) en activo directamente en bbdd
	 * 
	 * @param jugador_id          id del jugador
	 * @param nombre              nombre del jugador
	 * @param apellido            apellidos del jugador
	 * @param dorsal              dorsal del jugador
	 * @param posicion            posicion del jugador
	 * @param salario             salario del jugador
	 * @param nominacionesAllStar veces que el jugador ha sido nominado al AllStar
	 * @param anillosDeCampeon    veces que el jugador ha ganado el anillo
	 * @param mVPs                veces que el jugador ha ganado el MVP
	 * @param defensorDelAño      veces que el jugador ha ganado el DPOY
	 * @param rookieDelAño        indica si ganó el roty
	 * @param mIP                 indica si ganó el premio al jugador más mejorado
	 * @param mVPAllStar          veces que el jugador ha ganado el MVP del AllStar
	 * @param fMVP                veces que el jugador ha ganado el MVP de las
	 *                            finales
	 * @param premioAnotador      veces que el jugador ha ganado el premio al mejor
	 *                            anotadoe
	 * @param pPG                 puntos por partido
	 * @param aPG                 asistencias por partido
	 * @param rBG                 rebotes por partido
	 * @param sPG                 robos por partido
	 * @param bPG                 tapones por partido
	 * @param mPG                 minutos por partido
	 * @param finalizacion        nota que tiene en finalización
	 * @param tiro                nota que tiene en tiro
	 * @param organizacion        nota que tiene en organización
	 * @param defensas            nota que tiene en defensa
	 * @param equipo_id           id del equipo al que pertenece el jugador
	 * @param playoffs_Playoff_id edición de Playoffs en la que participa el jugador
	 * @throws SQLException                    lanza una SQL exception porque el
	 *                                         constructor inserta directamente el
	 *                                         objeto en bbdd
	 * @throws JugadorMalIntroduciodoException excepcion que avisa si no se ha
	 *                                         podido introducir el jugador,la idea
	 *                                         es que no salte
	 */
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

	/**
	 * Constructor que inserta un jugador(con mote) en activo directamente en bbdd
	 * 
	 * @param jugador_id          id del jugador
	 * @param nombre              nombre del jugador
	 * @param apellido            apellidos del jugador
	 * @param dorsal              dorsal del jugador
	 * @param apodo               apodo del jugador
	 * @param posicion            posicion del jugador
	 * @param salario             salario del jugador
	 * @param nominacionesAllStar veces que el jugador ha sido nominado al AllStar
	 * @param anillosDeCampeon    veces que el jugador ha ganado el anillo
	 * @param mVPs                veces que el jugador ha ganado el MVP
	 * @param defensorDelAño      veces que el jugador ha ganado el DPOY
	 * @param rookieDelAño        indica si ganó el roty
	 * @param mIP                 indica si ganó el premio al jugador más mejorado
	 * @param mVPAllStar          veces que el jugador ha ganado el MVP del AllStar
	 * @param fMVP                veces que el jugador ha ganado el MVP de las
	 *                            finales
	 * @param premioAnotador      veces que el jugador ha ganado el premio al mejor
	 *                            anotadoe
	 * @param pPG                 puntos por partido
	 * @param aPG                 asistencias por partido
	 * @param rBG                 rebotes por partido
	 * @param sPG                 robos por partido
	 * @param bPG                 tapones por partido
	 * @param mPG                 minutos por partido
	 * @param finalizacion        nota que tiene en finalización
	 * @param tiro                nota que tiene en tiro
	 * @param organizacion        nota que tiene en organización
	 * @param defensas            nota que tiene en defensa
	 * @param equipo_id           id del equipo al que pertenece el jugador
	 * @param playoffs_Playoff_id edición de Playoffs en la que participa el jugador
	 * @throws SQLException                    lanza una SQL exception porque el
	 *                                         constructor inserta directamente el
	 *                                         objeto en bbdd
	 * @throws JugadorMalIntroduciodoException excepcion que avisa si no se ha
	 *                                         podido introducir el jugador,la idea
	 *                                         es que no salte
	 */
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

	/**
	 * Constructor vacío de jugador
	 */
	public Jugador() {

	}

	/**
	 * Getter de jugador_id, devuelve el jugador_id de los jugadores
	 * 
	 * @return el id de los jugadores
	 */
	public short getJugador_id() {
		return jugador_id;
	}

	/**
	 * Setter de jugador_id
	 * 
	 * @param jugador_id id del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege el id para que solo
	 *                                             escoja jugadores ya existentes
	 */
	public void setJugador_id(short jugador_id) throws SetterJugadorNoFuncionaAsiException {

		if (jugador_id <= 358 && jugador_id >= 1) {
			this.jugador_id = jugador_id;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No hay jugador con ese id");
		}
	}

	/**
	 * Getter de apellido, devuelve el apellido de los jugadores
	 * 
	 * @return apellido el apellido de los jugadores
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Setter de apellido
	 * 
	 * @param apellido apellido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege el apellido para que no
	 *                                             sea nulo
	 */
	public void setApellido(String apellido) throws SetterJugadorNoFuncionaAsiException {

		if (!apellido.isBlank()) {
			this.apellido = apellido;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("El apellido no puede ser nulo");
		}

	}

	/**
	 * Getter de dorsal, devuelve el dorsal de los jugadores
	 * 
	 * @return dorsal el dorsal de los jugadores
	 */
	public byte getDorsal() {
		return dorsal;
	}

	/**
	 * Setter de dorsal
	 * 
	 * @param dorsal dorsal del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege el id para que el dorsal
	 *                                             esté entre 0 y 99
	 */
	public void setDorsal(byte dorsal) throws SetterJugadorNoFuncionaAsiException {
		if (dorsal >= 0 && dorsal <= 99) {
			this.dorsal = dorsal;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No se puede poner ese dorsal");
		}

	}

	/**
	 * Getter de apodo, devuelve el apodo de los jugadores
	 * 
	 * @return apodo el apodo de los jugadores
	 */
	public String getApodo() {
		return apodo;
	}

	/**
	 * setter de apodo
	 * 
	 * @param apodo apodo del jugador
	 */
	public void setApodo(String apodo) {

		this.apodo = apodo;

	}

	/**
	 * Getter de posicion
	 * 
	 * @return posicion del jugador
	 */
	public Posicion getPosicion() {
		return posicion;
	}

	/**
	 * setter de jugador
	 * 
	 * @param posicion posicion del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege al constructor para que
	 *                                             las posiciones solo sean los
	 *                                             valores del Enum
	 */
	public void setPosicion(Posicion posicion) throws SetterJugadorNoFuncionaAsiException {

		if (posicion.valueOf("BASE") != null || posicion.valueOf("ESCOLTA") != null || posicion.valueOf("ALERO") != null
				|| posicion.valueOf("ALAPIVOT") != null || posicion.valueOf("PIVOT") != null) {
			this.posicion = posicion;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No te inventes una posición nueva");
		}
	}

	/**
	 * getter de salario
	 * 
	 * @return salario del jugador
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * setter de salario
	 * 
	 * @param salario del jugador
	 */
	public void setSalario(float salario) {

		this.salario = salario;
	}

	/**
	 * Getter de nominacionesAllStar, devuelve las nominacionesAllStar de los
	 * jugadores
	 * 
	 * @return el nominacionesAllStar de los jugadores
	 */
	public byte getNominacionesAllStar() {
		return nominacionesAllStar;
	}

	/**
	 * Setter de nominacionesAllStar
	 * 
	 * @param nominacionesAllStar nominacionesAllStar del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege las nominacionesAllStar
	 *                                             para que el valor no sea negativo
	 */
	public void setNominacionesAllStar(byte nominacionesAllStar) throws SetterJugadorNoFuncionaAsiException {
		if (nominacionesAllStar >= 0) {
			this.nominacionesAllStar = nominacionesAllStar;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * getter de nominacionesAllStar, devuelve los anillosDeCampeon de los jugadores
	 * 
	 * @return los anillosDeCampeon de los jugadores
	 */
	public byte getAnillosDeCampeon() {
		return anillosDeCampeon;
	}

	/**
	 * Setter de anillosDeCampeon
	 * 
	 * @param anillosDeCampeon anillosDeCampeon del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege las anillosDeCampeon para
	 *                                             que el valor no sea negativo
	 */
	public void setAnillosDeCampeon(byte anillosDeCampeon) throws SetterJugadorNoFuncionaAsiException {

		if (anillosDeCampeon >= 0) {
			this.anillosDeCampeon = anillosDeCampeon;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * getter de MVPs, devuelve los MVPs de los jugadores
	 * 
	 * @return los MVPs de los jugadores
	 */
	public byte getMVPs() {
		return MVPs;
	}

	/**
	 * Setter de mVPs
	 * 
	 * @param mVPs mVPs del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege las mVPs para que el
	 *                                             valor no sea negativo
	 */
	public void setMVPs(byte mVPs) throws SetterJugadorNoFuncionaAsiException {

		if (mVPs >= 0) {
			this.MVPs = mVPs;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de defensorDelAño, devuelve los premios de defensorDelAño de los
	 * jugadores
	 * 
	 * @return los defensorDelAño de los jugadores
	 */
	public byte getDefensorDelAño() {
		return defensorDelAño;
	}

	/**
	 * Setter de defensorDelAño
	 * 
	 * @param defensorDelAño defensorDelAño del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege las defensorDelAño para
	 *                                             que el valor no sea negativo
	 */
	public void setDefensorDelAño(byte defensorDelAño) throws SetterJugadorNoFuncionaAsiException {

		if (defensorDelAño >= 0) {
			this.defensorDelAño = defensorDelAño;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * 
	 * getter del rookie del año
	 * 
	 * @return indica si el jugador ganó el rookie del año
	 */
	public boolean isRookieDelAño() {
		return rookieDelAño;
	}

	/**
	 * setter de rookieDelAño
	 * 
	 * @param rookieDelAño indica si el jugador ganó el rookie del año
	 */
	public void setRookieDelAño(boolean rookieDelAño) {

		this.rookieDelAño = rookieDelAño;

	}

	/**
	 * 
	 * getter del jugador más mejorado
	 * 
	 * @return indica si el jugador ganó el MIP
	 */
	public boolean isMIP() {
		return MIP;
	}

	/**
	 * setter de MIP
	 * 
	 * @param MIP indica si el jugador ganó el MIP
	 */
	public void setMIP(boolean mIP) throws SetterJugadorNoFuncionaAsiException {

		this.MIP = mIP;

	}

	/**
	 * getter de MVPAllStar, devuelve los premios de MVPAllStar de los jugadores
	 * 
	 * @return los MVPAllStar de los jugadores
	 */
	public byte getMVPAllStar() {
		return MVPAllStar;
	}

	/**
	 * Setter de MVPAllStar
	 * 
	 * @param MVPAllStar premios de MVP del AllStar del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los MVPAllStar para que
	 *                                             el valor no sea negativo
	 */
	public void setMVPAllStar(byte mVPAllStar) throws SetterJugadorNoFuncionaAsiException {
		if (mVPAllStar >= 0) {
			this.MVPAllStar = mVPAllStar;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de FMVP, devuelve los premios de MVP de las finales de los jugadores
	 * 
	 * @return los FMVP de los jugadores
	 */
	public byte getFMVP() {
		return FMVP;
	}

	/**
	 * Setter de FMVP
	 * 
	 * @param FMVP premios de MVP de las finales del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los MVPAllStar para que
	 *                                             el valor no sea negativo
	 */
	public void setFMVP(byte fMVP) throws SetterJugadorNoFuncionaAsiException {
		if (fMVP >= 0) {
			this.FMVP = fMVP;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de premioAnotador, devuelve los premios de mejor anotador de los
	 * jugadores
	 * 
	 * @return los premioAnotador de los jugadores
	 */
	public byte getPremioAnotador() {
		return premioAnotador;
	}

	/**
	 * Setter de premioAnotador
	 * 
	 * @param premioAnotador premios de mejor anotador del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los premioAnotador para
	 *                                             que el valor no sea negativo
	 */
	public void setPremioAnotador(byte premioAnotador) throws SetterJugadorNoFuncionaAsiException {
		if (premioAnotador >= 0) {
			this.premioAnotador = premioAnotador;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * getter de PPG
	 * 
	 * @return los puntos por partido
	 */
	public float getPPG() {
		return PPG;
	}

	/**
	 * setter de ppg
	 * 
	 * @param pPG los puntos por partido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los pPG para que el valor
	 *                                             no sea negativo
	 */
	public void setPPG(float pPG) throws SetterJugadorNoFuncionaAsiException {
		if (pPG >= 0) {
			this.PPG = pPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de APG
	 * 
	 * @return las asistencias por partido
	 */
	public float getAPG() {
		return APG;
	}

	/**
	 * setter de aPG
	 * 
	 * @param aPG las asistencias por partido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los aPG para que el valor
	 *                                             no sea negativo
	 */
	public void setAPG(float aPG) throws SetterJugadorNoFuncionaAsiException {

		if (aPG >= 0) {
			this.APG = aPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de RBG
	 * 
	 * @return los rebotes por partido
	 */
	public float getRBG() {
		return RBG;
	}

	/**
	 * setter de RBG
	 * 
	 * @param RBG los rebotes por partido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los RBG para que el valor
	 *                                             no sea negativo
	 */
	public void setRBG(float rBG) throws SetterJugadorNoFuncionaAsiException {

		if (rBG >= 0) {
			this.RBG = rBG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de SPG
	 * 
	 * @return los robos por partido
	 */
	public float getSPG() {
		return SPG;
	}

	/**
	 * setter de sPG
	 * 
	 * @param sPG los robos por partido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los sPG para que el valor
	 *                                             no sea negativo
	 */
	public void setSPG(float sPG) throws SetterJugadorNoFuncionaAsiException {

		if (sPG >= 0) {
			this.SPG = sPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de BPG
	 * 
	 * @return los tapones por partido
	 */
	public float getBPG() {
		return BPG;
	}

	/**
	 * setter de bPG
	 * 
	 * @param bPG los tapones por partido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los bPG para que el valor
	 *                                             no sea negativo
	 */
	public void setBPG(float bPG) throws SetterJugadorNoFuncionaAsiException {

		if (bPG >= 0) {
			this.BPG = bPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de MPG
	 * 
	 * @return los minutos por partido
	 */
	public byte getMPG() {
		return MPG;
	}

	/**
	 * setter de MPG
	 * 
	 * @param MPG los minutos por partido del jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege los MPG para que el valor
	 *                                             no sea negativo
	 */
	public void setMPG(byte mPG) throws SetterJugadorNoFuncionaAsiException {

		if (mPG >= 0) {
			this.MPG = mPG;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * getter de finalización
	 * 
	 * @return la nota que tiene en finalización
	 */
	public Valores getFinalizacion() {
		return finalizacion;
	}

	/**
	 * setter de finalización
	 * 
	 * @param finalizacion nota que tiene en finalización
	 * @throws SetterJugadorNoFuncionaAsiException protege el setter para que solo
	 *                                             se puedan introducir los valores
	 *                                             dentro del enum
	 */
	public void setFinalizacion(Valores finalizacion) throws SetterJugadorNoFuncionaAsiException {
		if (finalizacion.valueOf("A") != null || finalizacion.valueOf("B") != null || finalizacion.valueOf("C") != null
				|| finalizacion.valueOf("D") != null) {
			this.finalizacion = finalizacion;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	/**
	 * getter de tiro
	 * 
	 * @return la nota que tiene en tiro
	 */
	public Valores getTiro() {
		return tiro;
	}

	/**
	 * setter de tiro
	 * 
	 * @param tiro nota que tiene en tiro
	 * @throws SetterJugadorNoFuncionaAsiException protege el setter para que solo
	 *                                             se puedan introducir los valores
	 *                                             dentro del enum
	 */
	public void setTiro(Valores tiro) throws SetterJugadorNoFuncionaAsiException {
		if (tiro.valueOf("A") != null || tiro.valueOf("B") != null || tiro.valueOf("C") != null
				|| tiro.valueOf("D") != null) {
			this.tiro = tiro;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	/**
	 * getter de organizacion
	 * 
	 * @return la nota que tiene en organizacion
	 */
	public Valores getOrganizacion() {
		return organizacion;
	}

	/**
	 * setter de organizacion
	 * 
	 * @param organizacion nota que tiene en organizacion
	 * @throws SetterJugadorNoFuncionaAsiException protege el setter para que solo
	 *                                             se puedan introducir los valores
	 *                                             dentro del enum
	 */
	public void setOrganizacion(Valores organizacion) throws SetterJugadorNoFuncionaAsiException {
		if (organizacion.valueOf("A") != null || organizacion.valueOf("B") != null || organizacion.valueOf("C") != null
				|| organizacion.valueOf("D") != null) {
			this.organizacion = organizacion;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	/**
	 * getter de defensas
	 * 
	 * @return la nota que tiene en defensas
	 */
	public Valores getDefensas() {
		return defensas;
	}

	/**
	 * setter de defensas
	 * 
	 * @param defensas nota que tiene en orgadefensasnizacion
	 * @throws SetterJugadorNoFuncionaAsiException protege el setter para que solo
	 *                                             se puedan introducir los valores
	 *                                             dentro del enum
	 */
	public void setDefensas(Valores defensas) throws SetterJugadorNoFuncionaAsiException {
		if (defensas.valueOf("A") != null || defensas.valueOf("B") != null || defensas.valueOf("C") != null
				|| defensas.valueOf("D") != null) {
			this.defensas = defensas;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puedes poner otra nota que sean A,B,C,D");
		}
	}

	/**
	 * getter de equipo_id
	 * 
	 * @return el id del equipo en el que juega el jugador
	 */
	public byte getEquipo_id() {
		return equipo_id;
	}

	/**
	 * setter de equipo_id
	 * 
	 * @param equipo_id el id del equipo en el que juega el jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege el equipo_id para que el
	 *                                             valor no sea negativo
	 */
	public void setEquipo_id(byte equipo_id) throws SetterJugadorNoFuncionaAsiException {

		if (equipo_id >= 0) {
			this.equipo_id = equipo_id;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * getter de playoffs_Playoff_id
	 * 
	 * @return el id del playoff en el que juega el jugador
	 */
	public byte getPlayoffs_Playoff_id() {
		return playoffs_Playoff_id;
	}

	/**
	 * setter de playoffs_Playoff_id
	 * 
	 * @param playoffs_Playoff_id el id del playoff en el que juega el jugador
	 * @throws SetterJugadorNoFuncionaAsiException protege el playoffs_Playoff_id
	 *                                             para que el valor no sea negativo
	 */
	public void setPlayoffs_Playoff_id(byte playoffs_Playoff_id) throws SetterJugadorNoFuncionaAsiException {
		if (playoffs_Playoff_id >= 0) {
			this.playoffs_Playoff_id = equipo_id;
		} else {
			throw new SetterJugadorNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * Función que recorre la bbdd y consigue los jugadores retirados
	 * 
	 * @param nombre
	 * @return
	 */
	public static ArrayList<Jugador> getJugadoresReitrados(String nombre) {

		Statement smt = UtilsDB.conectarBBDD();
		// Inicializamos un ArrayList para devolver.
		ArrayList<Jugador> ret = new ArrayList<Jugador>();

		try {
			ResultSet cursor = smt.executeQuery(
					"SELECT * FROM jugador j JOIN equipo e ON j.equipo_eq_id=e.eq_id WHERE j.salario IS NULL AND e.nombre='"
							+ nombre + "';");
			while (cursor.next()) {
				Jugador actual = new Jugador();

				actual.setNombre(cursor.getString("nombre"));
				actual.setApellido(cursor.getString("apellido"));
				actual.setDorsal(cursor.getByte("dorsal"));
				actual.setApodo(cursor.getString("apodo"));

				ret.add(actual);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (SetterJugadorNoFuncionaAsiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UtilsDB.desconectarBBDD();
		return ret;
	}

	public static ArrayList<Jugador> getJugadores() {
		Statement smt = UtilsDB.conectarBBDD();
		// Inicializamos un ArrayList para devolver.
		ArrayList<Jugador> ret = new ArrayList<Jugador>();

		try {
			ResultSet cursor = smt.executeQuery("select * from jugador WHERE salario>0");
			while (cursor.next()) {
				Jugador actual = new Jugador();

				actual.setNombre(cursor.getString("nombre"));
				actual.setApellido(cursor.getString("apellido"));
				actual.setDorsal(cursor.getByte("dorsal"));
				actual.setApodo(cursor.getString("apodo"));
				// actual.setPosicion(cursor.getString("posicion "));
				actual.setSalario(cursor.getFloat("salario"));
				actual.setNominacionesAllStar(cursor.getByte("nominacionesallstar"));
				actual.setAnillosDeCampeon(cursor.getByte("anillosdecampeon"));
				actual.setMVPs(cursor.getByte("mvp"));
				actual.setDefensorDelAño(cursor.getByte("dpoy"));
				actual.setRookieDelAño(cursor.getBoolean("roty"));
				actual.setMIP(cursor.getBoolean("mip"));
				actual.setMVPAllStar(cursor.getByte("mvpallstar"));
				actual.setFMVP(cursor.getByte("fmvp"));
				actual.setPremioAnotador(cursor.getByte("premioanotador"));
				actual.setPPG(cursor.getFloat("ppg"));
				actual.setAPG(cursor.getFloat("apg"));
				actual.setRBG(cursor.getFloat("rbg"));
				actual.setSPG(cursor.getFloat("spg"));
				actual.setBPG(cursor.getFloat("bpg"));
				actual.setBPG(cursor.getFloat("bpg"));
				actual.setMPG(cursor.getByte("mpg"));

				actual.setEquipo_id(cursor.getByte("equipo_eq_id"));
				actual.setPlayoffs_Playoff_id(cursor.getByte("playoffs_playoff_id"));

				ret.add(actual);
			}
		} catch (SQLException e) {
			// Si la conuslta falla no hay nada que devolver.
			e.printStackTrace();
			return null;
		} catch (SetterJugadorNoFuncionaAsiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UtilsDB.desconectarBBDD();
		return ret;
	}

	public static HashMap<String, Jugador> buscaJugadores() throws SQLException, JugadorMalIntroduciodoException {

		Liga liga = new Liga((byte) 1);

		Conferencia confEste = new Conferencia("Conferencia Este", (byte) 1, (byte) 1);
		Conferencia confOeste = new Conferencia("Conferencia Oeste", (byte) 2, (byte) 1);

		Playoff playoff = new Playoff("Playoffs 2022", (byte) 1, (byte) 3, (byte) 3);

		RondaPlayoffs ronda = new RondaPlayoffs("Primera Ronda", (byte) 1, (byte) 2, (byte) 1);
		RondaPlayoffs ronda2 = new RondaPlayoffs("Semifinales de conferencia", (byte) 2, (byte) 2, (byte) 1);
		RondaPlayoffs ronda3 = new RondaPlayoffs("Finales de conferencia", (byte) 3, (byte) 2, (byte) 1);
		RondaPlayoffs ronda4 = new RondaPlayoffs("Finales NBA", (byte) 4, (byte) 2, (byte) 1);

		Equipo.declararEquiposEste();
		Equipo.declararEquiposOeste();
		Random r = new Random();
		Jugador bobCousy = new Jugador((short) 1, "Bob", "Cousy", (byte) 9, (byte) 1);
		Jugador tedTurner = new Jugador((short) 2, "Ted", "Turner", (byte) 17, (byte) 1);
		Jugador dominiqueWilkins = new Jugador((short) 3, "Dominique", "Wilkins", (byte) 21, (byte) 1);
		Jugador louHudson = new Jugador((short) 4, "Lou", "Hudson", (byte) 23, (byte) 1);
		Jugador jasonColler = new Jugador((short) 5, "Jason", "Collier", (byte) 40, (byte) 1);
		Jugador peteMaravich = new Jugador((short) 6, "Pete", "Maravich", (byte) 44, "Pistol Pete", (byte) 1);
		Jugador dikembeMutombo = new Jugador((short) 7, "Dikembe", "Mutombo", (byte) 55, (byte) 1);

		Jugador robertparish = new Jugador((short) 8, "Robert", "Parish", (byte) 00, (byte) 2);
		Jugador walterBrown = new Jugador((short) 9, "Walter", "brown", (byte) 1, (byte) 9);
		Jugador arnoldAuerbach = new Jugador((short) 10, "Arnold", "Auerbach", (byte) 2, "Red", (byte) 2);
		Jugador dennisJhonson = new Jugador((short) 11, "Dennis", "Jhonson", (byte) 3, (byte) 2);
		Jugador kevinGarnet = new Jugador((short) 12, "Kevin", "Garnet", (byte) 5, "Big Ticket", (byte) 2);
		Jugador billRussel = new Jugador((short) 13, "Bill", "Russel", (byte) 6, "Lord of the Rings", (byte) 2);
		Jugador jojoWhite = new Jugador((short) 14, "Jo Jo", "White", (byte) 10, (byte) 2);
		Jugador bobCousyCeltics = new Jugador((short) 15, "Bob", "Cousy", (byte) 14, (byte) 2);
		Jugador tomHeison = new Jugador((short) 16, "Tom", "Heison", (byte) 15, (byte) 2);
		Jugador tomSanders = new Jugador((short) 17, "Tom", "Sanders", (byte) 16, "Satch", (byte) 2);
		Jugador jhonHavliceK = new Jugador((short) 18, "Jhon", "Havlicek", (byte) 17, (byte) 2);
		Jugador jimLoscutoff = new Jugador((short) 19, "Bob", "Cousy", (byte) 18, (byte) 2);
		Jugador daveCowens = new Jugador((short) 20, "Dave", "Cowens", (byte) 18, (byte) 2);
		Jugador donaldNelson = new Jugador((short) 21, "Donald", "Nelson", (byte) 19, "Don Nelson", (byte) 2);
		Jugador billSharman = new Jugador((short) 22, "Bill", "Sharman", (byte) 21, (byte) 2);
		Jugador edMacauley = new Jugador((short) 23, "Edward", "Macauley", (byte) 22, "Ed Macauley", (byte) 2);
		Jugador frankRamsey = new Jugador((short) 24, "Frank Vernon", "Ramsey", (byte) 23, "Frank Ramsey", (byte) 2);
		Jugador samJones = new Jugador((short) 25, "Sam", "Jones", (byte) 24, (byte) 2);
		Jugador kcJones = new Jugador((short) 26, "K.C.", "Jones", (byte) 25, (byte) 2);
		Jugador cedricMaxwell = new Jugador((short) 27, "Cedric", "Maxwell", (byte) 31, "Cornbread", (byte) 2);
		Jugador kevinMcHale = new Jugador((short) 28, "Kevin Edward", "McHale", (byte) 32, "Kevin McHale", (byte) 2);
		Jugador larryBird = new Jugador((short) 29, "Larry Joe", "Bird", (byte) 33, "Larry Bird", (byte) 2);
		Jugador paulPierce = new Jugador((short) 30, "Paul", "Pierce", (byte) 34, "the truth", (byte) 2);
		Jugador reggieLewis = new Jugador((short) 31, "Reginald", "Lewis", (byte) 35, "Reggie Lewis", (byte) 2);

		Jugador drazenPetrovich = new Jugador((short) 32, "DraÅ¾en ", "PetroviÄ‡", (byte) 3, (byte) 3);
		Jugador wendellLadner = new Jugador((short) 33, "Wendell", "Ladner", (byte) 4, (byte) 3);
		Jugador jasonKidd = new Jugador((short) 34, "Jason", "Kidd", (byte) 5, (byte) 3);
		Jugador jhonWilliamson = new Jugador((short) 35, "Jhon Lee", "Williamson", (byte) 23, "John Williamson",
				(byte) 3);
		Jugador billMelchionni = new Jugador((short) 36, "William P", "Melchionni", (byte) 25, "Bill Melchionni",
				(byte) 3);
		Jugador juliusErving = new Jugador((short) 37, "Julius Winfield", "Earving ||", (byte) 32, "Dr J", (byte) 3);
		Jugador buckWilliams = new Jugador((short) 38, "Dikembe", "Mutombo", (byte) 55, (byte) 3);

		Jugador bobbyPhills = new Jugador((short) 39, "Bobby Ray ", "Phills ||", (byte) 13, "Bobby Phills", (byte) 4);

		Jugador michaelJordan = new Jugador((short) 40, "Michael", "Jordan", (byte) 23, "Air Jordan", (byte) 5);
		Jugador scottiePippen = new Jugador((short) 41, "Scottie", "Pippen", (byte) 33, "Pip", (byte) 5);
		Jugador bobLove = new Jugador((short) 42, "Bob", "Love", (byte) 10, (byte) 5);
		Jugador jerrySloan = new Jugador((byte) 43, "Jerry", "Sloan", (byte) 4, (byte) 5);

		Jugador bingoSmith = new Jugador((short) 44, "Robert", "Smith", (byte) 7, "Bingo Smith", (byte) 6);
		Jugador zydrunasilgaukas = new Jugador((short) 45, "Å½ydrÅ«nas ", "Ilgauskas", (byte) 11, (byte) 6);
		Jugador larryNance = new Jugador((short) 46, "Larry Donnel", "Nance Sr", (byte) 2, "Larry Nance", (byte) 6);
		Jugador markPrice = new Jugador((short) (byte) 47, "William Mark", "Price", (byte) 25, "Mark Price", (byte) 6);
		Jugador austinCarr = new Jugador((short) 48, "Austin George ", "Carr", (byte) 34, "Austin Carr", (byte) 6);
		Jugador nateThurmond = new Jugador((short) 49, "Nathaniel", "Thurmond", (byte) 42, "Nate the Great", (byte) 6);
		Jugador bradDaugherty = new Jugador((short) 50, "Bradley Lee", "Daugherty", (byte) 43, "Brad Daugherty",
				(byte) 6);

		Jugador derekHarper = new Jugador((short) 51, "Derek ", "Harper", (byte) 12, (byte) 16);
		Jugador bradDavis = new Jugador((short) 52, "Bradley Ernest ", "Davis", (byte) 15, "Brad Davis", (byte) 16);
		Jugador rolandoBlackman = new Jugador((short) 53, "Rolando  Antonio", "Price", (byte) 22, "Ro Blackman",
				(byte) 16);
		Jugador dirkNowitzki = new Jugador((short) 54, "Dirk", "Werner Nowitzki", (byte) 41, "Wunderkind", (byte) 16);

		Jugador alexEnglish = new Jugador((short) 55, "Alexander", "English", (byte) 2, "Alex English", (byte) 17);
		Jugador fatLever = new Jugador((short) 56, "Lafayette ", "Lever", (byte) 12, "Fat Lever", (byte) 17);
		Jugador davidThompson = new Jugador((short) 57, "David ONeil", "Thompson", (byte) 33, (byte) 17);
		Jugador byronbeck = new Jugador((short) 58, "Byrin", "Beck", (byte) 40, (byte) 17);
		Jugador danIssel = new Jugador((short) 59, "Daniel Paul ", "Issel", (byte) 44, "Dan Issel", (byte) 17);
		Jugador dikembeMutomboNuggets = new Jugador((short) 60, "Dikembe", "Mutombo", (byte) 55, (byte) 17);
		Jugador dougMoe = new Jugador((short) 61, "Douglas Edwin", "Moe", (byte) 43, "Doug Moe", (byte) 17);

		Jugador chaunceyBillups = new Jugador((short) 62, "Chauncey", "Billups", (byte) 1, "Mr. Big Shot", (byte) 7);
		Jugador chuckDaily = new Jugador((short) 63, "Charles Jerome ", "Daily", (byte) 2, "Chuck Daly", (byte) 7);
		Jugador benWallace = new Jugador((short) 64, "Ben", "Wallace", (byte) 6, "Big Ben", (byte) 7);
		Jugador joeDumars = new Jugador((short) 65, "Joe", "Dumars", (byte) 4, "Joe-D", (byte) 7);
		Jugador dennisRodman = new Jugador((short) 66, "Dennis Keith", "Rodman", (byte) 10, "The Worm", (byte) 7);
		Jugador isaiahThomas = new Jugador((short) 67, "Isiah Lord", "Thomas", (byte) 11, "Zeke", (byte) 7);
		Jugador vinnieJhonson = new Jugador((short) 68, "Vincent", "Jhonson", (byte) 15, "Microwave", (byte) 7);
		Jugador bobLanier = new Jugador((short) 69, "Robert Jerry", "Lanier", (byte) 16, "Bob Lanier", (byte) 7);
		Jugador daveBing = new Jugador((short) 70, "David ", "Bing", (byte) 21, "Duke", (byte) 7);
		Jugador richardHamilton = new Jugador((short) 71, "Richard Clay", "Hamilton", (byte) 32, "The Man in the Mask",
				(byte) 7);
		Jugador billLaimbeer = new Jugador((short) 72, "William J.", "Laimbeer", (byte) 40, "Bill Laimbeer", (byte) 7);

		Jugador wiltChamberlain = new Jugador((short) 73, "Wilton Norman", "Chamberlain", (byte) 13, "Wilt the Stilt",
				(byte) 18);
		Jugador thomMeschery = new Jugador((short) 74, "Thomas Nicholas  ", "Meschery", (byte) 14, "Thom Meschery",
				(byte) 18);
		Jugador alAttles = new Jugador((short) 75, "Alvin", "Attles", (byte) 16, "Destroyer", (byte) 18);
		Jugador chrisMullin = new Jugador((short) 76, "Christopher Paul", "Dumars", (byte) 17, "Chris Mullin",
				(byte) 18);
		Jugador rickBarry = new Jugador((short) 77, "Richard Francis Dennis", "Barry |||", (byte) 24, "Greyhound",
				(byte) 18);
		Jugador nateThurmondWarriors = new Jugador((short) 78, "Nathaniel", "Thurmond", (byte) 42, "Nate the Great",
				(byte) 18);

		Jugador yaoMing = new Jugador((short) 79, "Yao", "Ming", (byte) 11, "Yaos dinasty", (byte) 19);
		Jugador clydeDrexler = new Jugador((short) 80, "Clyde Austin", "Drexler ", (byte) 22, "The Glide", (byte) 19);
		Jugador calvinMurphy = new Jugador((short) 81, "Calvin Jerome", "Murphy ", (byte) 23, "Destroyer", (byte) 19);
		Jugador mosesMalone = new Jugador((short) 82, "Moses Eugene", "Malone", (byte) 24, "Moses Malone", (byte) 19);
		Jugador hakeemOlajuwon = new Jugador((short) 83, "Hakeem Abdul", "Olajuwon", (byte) 34, "The Dream", (byte) 19);
		Jugador rudyTomjanovich = new Jugador((short) 84, "Rudolph ", "Tomjanovich", (byte) 45, "Rudy Tomjanovich",
				(byte) 19);

		Jugador georgemcGinnis = new Jugador((short) 85, "George", "McGinnis", (byte) 30, (byte) 8);
		Jugador reggieMiller = new Jugador((short) 86, "Reginald Wayne", "Miller ", (byte) 31, "Miller Time", (byte) 8);
		Jugador melDaniels = new Jugador((short) 87, "Melvin Joe", "Daniels ", (byte) 34, "Melvin Joe", (byte) 8);
		Jugador rogerBrown = new Jugador((short) 88, "Roger William", "Brown", (byte) 35, "The Rajah", (byte) 8);
		Jugador slickLeonard = new Jugador((short) 89, "William Robert", "Leonard", (byte) 52, "Slick Leonard",
				(byte) 8);

		Jugador kobe8 = new Jugador((short) 90, "Kobe ", "Bryant", (byte) 8, "Black mamba", (byte) 21);
		Jugador wiltChamberlainLakers = new Jugador((short) 91, "Wilton Norman", "Chamberlain", (byte) 13,
				"Wilt the Stilt", (byte) 21);
		Jugador elginBaylor = new Jugador((short) 92, "Elgin Gay", "Baylor ", (byte) 22, "Elgin Baylor", (byte) 21);
		Jugador kobe24 = new Jugador((short) 93, "Kobe ", "Bryant", (byte) 24, "Black mamba", (byte) 21);
		Jugador gailGoodrich = new Jugador((short) 94, "Gail Charles", "Goodrich", (byte) 25, "The Stump", (byte) 21);
		Jugador magicJhonson = new Jugador((short) 95, "Earvin", "Jhonson", (byte) 32, "Magic Jhonson", (byte) 21);
		Jugador kareemAbdulJabbar = new Jugador((short) 96, "Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook",
				(byte) 21);
		Jugador shaquilleOneal = new Jugador((short) 97, "Shaquille Rashaun", "O Neal ", (byte) 34, "Shaq Attack",
				(byte) 21);
		Jugador jamesWorthy = new Jugador((short) 98, "James Ager ", "Worthy", (byte) 42, "Big Game James", (byte) 21);
		Jugador jerryWest = new Jugador((short) 99, "Jerome Alan", "West", (byte) 44, "The Logo", (byte) 21);
		Jugador jamalWilkes = new Jugador((short) 100, "Jamaal Abdul-Lateef", "Wilkes", (byte) 52, "Smooth as Silk",
				(byte) 21);
		Jugador jimPollard = new Jugador((short) 101, "James Clifford", "Pollard", (byte) 17, "The Kangaroo Kid",
				(byte) 21);
		Jugador vernMikelsen = new Jugador((short) 102, "Arild Verner Agerskov", "Mikkelsen", (byte) 19,
				"Ven Mikkelsen", (byte) 21);
		Jugador slaterMartin = new Jugador((short) 103, "Slater Nelson", "Martin", (byte) 22, "Dugie", (byte) 21);
		Jugador clydeLovellete = new Jugador((short) 104, "Clyde Edward", "Lovellette", (byte) 34, "Clyde Lovellette",
				(byte) 21);
		Jugador georgeMikan = new Jugador((short) 105, "George Lawrence", "Mikan", (byte) 99, "Mr. Basketball",
				(byte) 21);

		Jugador zachRandolph = new Jugador((short) 106, "Zachary McKenley", "Randolph", (byte) 50, "Z-Bo", (byte) 24);

		Jugador chrisBosh = new Jugador((short) 107, "Christopher Wesson ", "Bosh", (byte) 1, "Boshasaurus", (byte) 9);
		Jugador dwayneWade = new Jugador((short) 108, "Dwyane Tyrone", "Wade ", (byte) 3, "Flash", (byte) 9);
		Jugador timHardaway = new Jugador((short) 109, "Timothy Duane", "Hardaway", (byte) 10, "Tim Bug", (byte) 9);
		Jugador danMarino = new Jugador((short) 110, "Daniel Constantine ", "Marino", (byte) 13, (byte) 9);
		Jugador michaelJordanHeat = new Jugador((short) 111, "Michael", "Jordan", (byte) 23, "Air Jordan", (byte) 9);
		Jugador shaquilleOnealHeat = new Jugador((short) 112, "Shaquille Rashaun", "O Neal ", (byte) 32, "Shaq Attack",
				(byte) 9);
		Jugador alonzoMourning = new Jugador((short) 113, "Alonzo Harding ", "Mourning", (byte) 33, "Zo", (byte) 9);

		Jugador oscarRobertson = new Jugador((short) 114, "Oscar Palmer", "Robertson", (byte) 1, "Mr.Triple-Double",
				(byte) 10);
		Jugador juniorBridgeman = new Jugador((short) 115, "Ulysses Lee", "Bridgeman ", (byte) 2, "Junior Bridgeman",
				(byte) 10);
		Jugador sidneyMoncrief = new Jugador((short) 116, "Sidney Alvin", "Moncrief", (byte) 4, "The squid", (byte) 10);
		Jugador marquesJhonson = new Jugador((short) 117, "Marques Kevin", "Johnson", (byte) 8, "Slammer", (byte) 10);
		Jugador jonMcGlockin = new Jugador((short) 118, "Jon P.", "McGlockin", (byte) 14, "Jonny Mac", (byte) 10);
		Jugador bobLanierBucks = new Jugador((short) 119, "Robert Jerry", "Lanier", (byte) 16, "Bob Lanier", (byte) 10);
		Jugador brianWinters = new Jugador((short) 120, "Brian Joseph", "Winters", (byte) 32, "Lurch", (byte) 10);
		Jugador kareemAbdulJabbarBucks = new Jugador((short) 121, "Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook",
				(byte) 10);

		Jugador malikSealy = new Jugador((short) 122, "Malik", "Sealy", (byte) 2, "Silk", (byte) 22);

		Jugador peteMaravichPelicans = new Jugador((short) 123, "Pete", "Maravich", (byte) 7, "Pistol Pete", (byte) 23);

		Jugador waltFrazier = new Jugador((short) 124, "Walter", "Frazier", (byte) 10, "Clyde", (byte) 11);
		Jugador dickBarnet = new Jugador((short) 125, "Richard", "Barnett ", (byte) 12, "Dick Barnett", (byte) 11);
		Jugador earlMonroe = new Jugador((short) 126, "Vernon Earl", "Monroe", (byte) 15, "The Pearl", (byte) 11);
		Jugador dickMcGuire = new Jugador((short) 127, "Richard Josephn", "McGuire", (byte) 15, "Dick the Knick",
				(byte) 11);
		Jugador willisReed = new Jugador((short) 128, "Willis", "Reed", (byte) 19, (byte) 11);
		Jugador daveDeBusschere = new Jugador((short) 129, "David Albert", "DeBusschere", (byte) 22, "Big D",
				(byte) 11);
		Jugador billBradley = new Jugador((short) 130, "William Warren ", "Bradley", (byte) 24, "Bill Bradley",
				(byte) 11);
		Jugador patrickEwing = new Jugador((short) 131, "Patrick Aloysius", "Ewing", (byte) 33, "Big Pat", (byte) 11);
		Jugador redHolzman = new Jugador((short) 132, "William", "Holzman", (byte) 61, "Big D", (byte) 11);

		Jugador aficion = new Jugador((short) 133, "AficiÃ³n", "", (byte) 6, (byte) 12);

		Jugador mosesMalonePhilly = new Jugador((short) 134, "Moses Eugene", "Malone", (byte) 2, "Moses Malone",
				(byte) 13);
		Jugador allenIverson = new Jugador((short) 135, "Allen Ezail", "Iverson ", (byte) 3, "The Answer", (byte) 13);
		Jugador juliusErvingPhilly = new Jugador((short) 136, "Julius Winfield", "Earving ||", (byte) 6, "Dr J",
				(byte) 13);
		Jugador mauriceCheeks = new Jugador((short) 137, "Maurice Edward", "Cheeks", (byte) 10, "Little Mo", (byte) 13);
		Jugador wiltChamberlainSixers = new Jugador((short) 138, "Wilton Norman", "Chamberlain", (byte) 13,
				"Wilt the Stilt", (byte) 13);
		Jugador halGreer = new Jugador((short) 139, "Harold Everett", "Greer", (byte) 15, "Hal Greer", (byte) 13);
		Jugador bobbyJones = new Jugador((short) 140, "Robert Clyde", "Jones", (byte) 22, "Bobby Jones", (byte) 13);
		Jugador billyChunningham = new Jugador((short) 141, "William John", "Cunningham ", (byte) 32, "Bily Cunningham",
				(byte) 13);
		Jugador charlesBarkley = new Jugador((short) 142, "Charles Wade", "Barkley", (byte) 34, "El Gordo", (byte) 13);

		Jugador dickVanArsdale = new Jugador((short) 143, "Richard Albert", "Van Arsdale", (byte) 5, "Dick Van Arsdale",
				(byte) 26);
		Jugador walterDavis = new Jugador((short) 144, "Walter Paul", "Davis ", (byte) 6, "Sweet D", (byte) 26);
		Jugador kevinJhonson = new Jugador((short) 145, "Kevin Maurice", "Jhonson", (byte) 7, "K.J", (byte) 26);
		Jugador danMajerle = new Jugador((short) 146, "Daniel Lewis", "Majerle", (byte) 9, "Thunder Dan", (byte) 26);
		Jugador steveNash = new Jugador((short) 147, "Stephen John", "Nash", (byte) 13, "Nasty Nash", (byte) 26);
		Jugador tomChambers = new Jugador((short) 148, "Thomas Doane", "Chambers ", (byte) 24, "Tommy Gun", (byte) 26);
		Jugador alvanAdams = new Jugador((short) 149, "Alvan Leigh", "Adams  ", (byte) 33, "Double A", (byte) 26);
		Jugador charlesBarkleySuns = new Jugador((short) 150, "Charles Wade", "Barkley", (byte) 34, "El Gordo",
				(byte) 26);
		Jugador connieHawkins = new Jugador((short) 151, "Cornelius ", "Hawkins", (byte) 42, "The Hawk", (byte) 26);
		Jugador paulWestphal = new Jugador((short) 152, "Paul Douglas", "Westphal ", (byte) 44, "Paul Westphal",
				(byte) 26);
		Jugador cottonFitzsimmons = new Jugador((short) 153, "Lowell", "Fitzsimmons ", (byte) 42, "Cotton Fitzsimmons",
				(byte) 26);

		Jugador larryWeinberg = new Jugador((short) 154, "Larry", "Weinberg", (byte) 1, (byte) 27);
		Jugador davidTwardzik = new Jugador((short) 155, "David", "Twardzik", (byte) 13, (byte) 27);
		Jugador lionelHollins = new Jugador((short) 156, "Lionel Eugene", "Hollins", (byte) 14, "L-Train", (byte) 27);
		Jugador larrySteele = new Jugador((short) 157, "Maurice D.", "Steele ", (byte) 15, "Man of steele", (byte) 27);
		Jugador mauriceLucas = new Jugador((short) 158, "Stephen John", "Lucas", (byte) 20, "Mo Lucas", (byte) 27);
		Jugador clydeDrexlerBlazers = new Jugador((short) 159, "Clyde Austin", "Drexler ", (byte) 22, "The Glide",
				(byte) 27);
		Jugador bobGross = new Jugador((short) 160, "Robert Edwin", "Gross ", (byte) 30, "Bob Gross", (byte) 27);
		Jugador terryPorter = new Jugador((short) 161, "Terry", "Porter", (byte) 30, (byte) 27);
		Jugador billWalton = new Jugador((short) 162, "William Theodore", "Walton", (byte) 32, "Big Red-Head",
				(byte) 27);
		Jugador lloydNeal = new Jugador((short) 163, "Lloyd ", "Neal ", (byte) 36, (byte) 27);
		Jugador geoffPetrie = new Jugador((short) 164, "Geoffrey Michael", "Petrie ", (byte) 45, "Geoff Petrie",
				(byte) 27);
		Jugador jackRamsay = new Jugador((short) 165, "Dr. John T.", "Ramsay ", (byte) 77, (byte) 27);

		Jugador nateArchibal = new Jugador((short) 166, "Nathaniel", "Archibald", (byte) 1, "Nate Tiny Archibald",
				(byte) 28);
		Jugador mithcRichmond = new Jugador((short) 167, "Mitchell James", "Richmond", (byte) 2, "Hammer", (byte) 28);
		Jugador chrisWebber = new Jugador((short) 168, "Mayce Edward Christopher", "Webber ", (byte) 4, "Chris Webber",
				(byte) 28);
		Jugador aficionKings = new Jugador((short) 169, "AficiÃ³n", "", (byte) 6, (byte) 28);
		Jugador bobDavies = new Jugador((short) 170, "Robert Edris", "Davies", (byte) 11, "The Harrisburg Houdini",
				(byte) 28);
		Jugador mauriceStokes = new Jugador((short) 171, "Maurice", "Stokes", (byte) 12, "Mo Stokes", (byte) 28);
		Jugador oscarRobertsonKings = new Jugador((short) 172, "Oscar Palmer", "Robertson", (byte) 14,
				"Mr.Triple-Double", (byte) 28);
		Jugador predragStojakovic = new Jugador((short) 173, "Predrag PeÄ‘a", "StojakoviÄ‡", (byte) 16,
				"Peja StojakoviÄ‡", (byte) 28);
		Jugador vladeDivac = new Jugador((short) 174, "Vlade", "Divac", (byte) 21, "Vittorio Gassman", (byte) 28);
		Jugador jackTwynam = new Jugador((short) 175, "John Kennedy", "Twyman", (byte) 27, "Jack Twyman", (byte) 28);
		Jugador samLacey = new Jugador((short) 176, "Samuel", "Lacey ", (byte) 44, "Slammin Sam", (byte) 28);

		Jugador jhonnyMoore = new Jugador((short) 177, "John Brian", "Moore", (byte) 00, "Johnny Moore", (byte) 29);
		Jugador averyJhonson = new Jugador((short) 178, "Avery", "Johnson", (byte) 6, "Taz", (byte) 29);
		Jugador tonyParker = new Jugador((short) 179, "William Anthony", "Parker ", (byte) 9, "Parisian Torpedo",
				(byte) 29);
		Jugador bruceBowen = new Jugador((short) 180, "Bruce Eric", "Bowen", (byte) 12, (byte) 29);
		Jugador jamesSilas = new Jugador((short) 181, "James Edward", "Silas", (byte) 13, "Captain Late", (byte) 29);
		Jugador manuGinobii = new Jugador((short) 182, "Emanuel David", "GinÃ³bili", (byte) 20, "Manu GinÃ³bili",
				(byte) 29);
		Jugador timDuncan = new Jugador((short) 183, "Timothy Theodore", "Duncan", (byte) 21, "The Big Fundamental",
				(byte) 29);
		Jugador seanElliot = new Jugador((short) 184, "Sean", "Elliott", (byte) 32, (byte) 29);
		Jugador georgeGervin = new Jugador((short) 185, "George", "Gervin", (byte) 44, "The Iceman", (byte) 29);
		Jugador davidRobinson = new Jugador((short) 186, "David Maurice", "Robinson", (byte) 50, "The Admiral",
				(byte) 29);

		Jugador gusWilliams = new Jugador((short) 187, "Gus", "Williams", (byte) 1, "The Wizard", (byte) 25);
		Jugador nickCollison = new Jugador((short) 188, "Nicholas John", "Collison", (byte) 4, (byte) 25);
		Jugador nateMcMillan = new Jugador((short) 189, "Nathaniel", "McMillan", (byte) 10, "Nate McMillan", (byte) 25);
		Jugador lennyWilkens = new Jugador((short) 190, "Leonard Randolph", "Wilkens", (byte) 19, "Lenny Wilkens",
				(byte) 25);
		Jugador spencerHaywood = new Jugador((short) 191, "Spencer", "Haywood", (byte) 24, (byte) 25);
		Jugador fredBrwon = new Jugador((short) 192, "Fred", "Brown", (byte) 32, "Downtown", (byte) 25);
		Jugador jackSikman = new Jugador((short) 193, "Jack Wayne", "Sikma", (byte) 44, "Goldilocks", (byte) 25);

		Jugador frankLayden = new Jugador((short) 194, "Frank", "Layden", (byte) 1, (byte) 30);
		Jugador adrianDantley = new Jugador((short) 195, "Adrian Delano", "Dantley", (byte) 4, "The teacher",
				(byte) 30);
		Jugador peteMaravichJazz = new Jugador((short) 196, "Pete", "Maravich", (byte) 7, "Pistol Pete", (byte) 30);
		Jugador johnStockton = new Jugador((short) 197, "John", "Stockton", (byte) 12, (byte) 30);
		Jugador jeffHornacek = new Jugador((short) 198, "Jeffrey John", "Hornacek", (byte) 14, "Horny", (byte) 30);
		Jugador karlMalone = new Jugador((short) 199, "Karl", "Malone", (byte) 32, "The Mailman", (byte) 30);
		Jugador darrelGriffith = new Jugador((short) 200, "Darrell Steven", "Griffith", (byte) 35, "Dr. Dunkenstein",
				(byte) 30);
		Jugador markEaton = new Jugador((short) 201, "Mark", "Eaton", (byte) 53, (byte) 30);
		Jugador geraldSloan = new Jugador((short) 202, "Gerald Eugene", "Sloan", (byte) 99, "Jerry Sloan", (byte) 30);

		Jugador earlMonroeWizards = new Jugador((short) 203, "Vernon Earl", "Monroe", (byte) 10, "The Pearl",
				(byte) 15);
		Jugador elvinHayes = new Jugador((short) 204, "Elvin Ernest", "Hayes", (byte) 11, "The Big E", (byte) 15);
		Jugador gusJohnson = new Jugador((short) 205, "Gus", "Johnson", (byte) 25, "Honeycomb", (byte) 15);
		Jugador wesUnseld = new Jugador((short) 206, "Westley Sissel", "Unseld", (byte) 41, "Wes Unseld", (byte) 15);
		Jugador philChenier = new Jugador((short) 207, "Philip ", "Chenier ", (byte) 45, "Phil Chenier", (byte) 15);

		HashMap<String, Jugador> mapa = new HashMap<String, Jugador>();

		Jugador traeYoung = new Jugador((short) 208, "Trae", "Young", (byte) 11, "Ice Trae", Posicion.BASE, 8.32f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 1, (byte) 1);
		Jugador jhonCollins = new Jugador((short) 209, "Jhon", "Collins", (byte) 20, Posicion.PIVOT, 23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador bogdanBogdanovich = new Jugador((short) 210, "Bogdan", "Bogdanovich", (byte) 13, Posicion.ESCOLTA, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador deandreHunter = new Jugador((short) 211, "De Andre", "Hunter", (byte) 12, Posicion.ALAPIVOT, 7.75f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 1, (byte) 1);
		Jugador kevinHuerter = new Jugador((short) 212, "Kevin", "Huerter", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 1, (byte) 1);
		mapa.put(traeYoung.getNombre() + " " + traeYoung.getApellido(), traeYoung);
		mapa.put(jhonCollins.getNombre() + " " + jhonCollins.getApellido(), jhonCollins);
		mapa.put(bogdanBogdanovich.getNombre() + " " + bogdanBogdanovich.getApellido(), bogdanBogdanovich);
		mapa.put(deandreHunter.getNombre() + " " + deandreHunter.getApellido(), deandreHunter);
		mapa.put(kevinHuerter.getNombre() + " " + kevinHuerter.getApellido(), kevinHuerter);

		Jugador jaysonTatum = new Jugador((short) 213, "Jason", "Tatum", (byte) 0, "JT", Posicion.ALERO, 28.2f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.A, Valores.B, Valores.B, (byte) 2, (byte) 1);
		Jugador jaylenBrown = new Jugador((short) 214, "Jaylen", "Brown", (byte) 7, Posicion.ESCOLTA, 26.76f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.A, Valores.C, Valores.B, (byte) 2, (byte) 1);
		Jugador marcusSmart = new Jugador((short) 215, "Marcus", "Smart", (byte) 16, Posicion.BASE, 14.36f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.A, (byte) 2, (byte) 1);
		Jugador alHorfort = new Jugador((short) 216, "Al", "Horford", (byte) 42, Posicion.ALAPIVOT, 27f, (byte) 5,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 29, Valores.C,
				Valores.B, Valores.C, Valores.A, (byte) 2, (byte) 1);
		Jugador robertWilliams = new Jugador((short) 217, "Robert", "Williams ||| ", (byte) 44, Posicion.PIVOT, 3.36f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 2, (byte) 1);

		mapa.put(jaysonTatum.getNombre() + " " + jaysonTatum.getApellido(), jaysonTatum);
		mapa.put(jaylenBrown.getNombre() + " " + jaylenBrown.getApellido(), jaylenBrown);
		mapa.put(marcusSmart.getNombre() + " " + marcusSmart.getApellido(), marcusSmart);
		mapa.put(alHorfort.getNombre() + " " + alHorfort.getApellido(), alHorfort);
		mapa.put(robertWilliams.getNombre() + " " + robertWilliams.getApellido(), robertWilliams);

		Jugador kevinDurant = new Jugador((short) 218, "Kevin", "Durant", (byte) 7, "Durantula", Posicion.ALAPIVOT,
				42.01f, (byte) 12, (byte) 2, (byte) 1, (byte) 0, true, false, (byte) 2, (byte) 2, (byte) 4,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.A, Valores.A, Valores.A, Valores.B, (byte) 3, (byte) 1);
		Jugador sethCurry = new Jugador((short) 219, "Seth", "Curry", (byte) 30, Posicion.ESCOLTA, 8.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.C, (byte) 3, (byte) 1);
		Jugador bruceBrown = new Jugador((short) 220, "Bruce", "Brown", (byte) 1, Posicion.ALERO, 4.73f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 3, (byte) 1);
		Jugador kyrieIrving = new Jugador((short) 221, "Kyrie", "Irving", (byte) 11, "Uncle Drew", Posicion.BASE,
				35.34f, (byte) 7, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.B, Valores.D, (byte) 3, (byte) 1);
		Jugador lamarcusAldridge = new Jugador((short) 222, "Lamarcus", "Aldridge", (byte) 2, Posicion.PIVOT, 2.64f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 3, (byte) 1);

		mapa.put(kevinDurant.getNombre() + " " + kevinDurant.getApellido(), kevinDurant);
		mapa.put(sethCurry.getNombre() + " " + sethCurry.getApellido(), sethCurry);
		mapa.put(bruceBrown.getNombre() + " " + bruceBrown.getApellido(), bruceBrown);
		mapa.put(kyrieIrving.getNombre() + " " + kyrieIrving.getApellido(), kyrieIrving);
		mapa.put(lamarcusAldridge.getNombre() + " " + lamarcusAldridge.getApellido(), lamarcusAldridge);

		Jugador lameloBall = new Jugador((short) 223, "LaMelo", "Ball", (byte) 2, Posicion.BASE, 8.32f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 4, (byte) 1);
		Jugador milesBridges = new Jugador((short) 224, "Miles", "Bridges", (byte) 0, Posicion.ALERO, 5.56f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.C, Valores.B, (byte) 4, (byte) 1);
		Jugador terryRozier = new Jugador((short) 225, "Terry", "Rozier", (byte) 13, "Scary Terry", Posicion.ESCOLTA,
				18f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.B, Valores.B, Valores.D, (byte) 4, (byte) 1);
		Jugador gordonHayward = new Jugador((short) 226, "Gordon", "Hayward", (byte) 20, Posicion.ALAPIVOT, 29.92f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 4, (byte) 1);
		Jugador montrezlHarrel = new Jugador((short) 227, "Montrezl", "Harrel", (byte) 8, "Trezz", Posicion.ALERO, 4.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 4, (byte) 1);

		mapa.put(lameloBall.getNombre() + " " + lameloBall.getApellido(), lameloBall);
		mapa.put(milesBridges.getNombre() + " " + milesBridges.getApellido(), milesBridges);
		mapa.put(terryRozier.getNombre() + " " + terryRozier.getApellido(), terryRozier);
		mapa.put(gordonHayward.getNombre() + " " + gordonHayward.getApellido(), gordonHayward);
		mapa.put(montrezlHarrel.getNombre() + " " + montrezlHarrel.getApellido(), montrezlHarrel);

		Jugador lonzoBall = new Jugador((short) 228, "Lonzo", "Ball", (byte) 2, Posicion.BASE, 18.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.A, Valores.A, (byte) 5, (byte) 1);
		Jugador demarDeRozan = new Jugador((short) 229, "Demar", "DeRozan", (byte) 10, "King of the Fourth",
				Posicion.ALERO, 26f, (byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36,
				Valores.A, Valores.A, Valores.C, Valores.C, (byte) 5, (byte) 1);
		Jugador nikolaVucevic = new Jugador((short) 230, "Nikola", "Vucevic", (byte) 9, Posicion.PIVOT, 24f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 5, (byte) 1);
		Jugador zachLavine = new Jugador((short) 231, "Zach", "LaVine", (byte) 8, Posicion.ESCOLTA, 19.5f, (byte) 2,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.C, Valores.D, (byte) 5, (byte) 1);
		Jugador patrickWilliams = new Jugador((short) 232, "Patrick", "Williams", (byte) 44, Posicion.ALAPIVOT, 7.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 5, (byte) 1);

		mapa.put(lonzoBall.getNombre() + " " + lonzoBall.getApellido(), lonzoBall);
		mapa.put(demarDeRozan.getNombre() + " " + demarDeRozan.getApellido(), demarDeRozan);
		mapa.put(nikolaVucevic.getNombre() + " " + nikolaVucevic.getApellido(), nikolaVucevic);
		mapa.put(zachLavine.getNombre() + " " + zachLavine.getApellido(), zachLavine);
		mapa.put(patrickWilliams.getNombre() + " " + patrickWilliams.getApellido(), patrickWilliams);

		Jugador jarretAllen = new Jugador((short) 233, "Jarret", "Allen", (byte) 31, Posicion.PIVOT, 20, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.D, Valores.D, Valores.A, (byte) 6, (byte) 1);
		Jugador dariusGarland = new Jugador((short) 234, "Darius", "Garland", (byte) 10, Posicion.BASE, 10, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 6, (byte) 1);
		Jugador evanMoblaey = new Jugador((short) 235, "Evan", "Mobley", (byte) 4, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 6, (byte) 1);
		Jugador carisLeVert = new Jugador((short) 236, "Caris", "LeVert", (byte) 3, Posicion.ESCOLTA, 17.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D, (byte) 6, (byte) 1);
		Jugador lauriMarkkanen = new Jugador((short) 237, "Lauri", "Markkanen", (byte) 24, Posicion.ALAPIVOT, 15.69f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 6, (byte) 1);

		mapa.put(jarretAllen.getNombre() + " " + jarretAllen.getApellido(), jarretAllen);
		mapa.put(dariusGarland.getNombre() + " " + dariusGarland.getApellido(), dariusGarland);
		mapa.put(evanMoblaey.getNombre() + " " + evanMoblaey.getApellido(), evanMoblaey);
		mapa.put(carisLeVert.getNombre() + " " + carisLeVert.getApellido(), carisLeVert);
		mapa.put(lauriMarkkanen.getNombre() + " " + lauriMarkkanen.getApellido(), lauriMarkkanen);

		Jugador lukaDoncic = new Jugador((short) 238, "Luka", "Doncic", (byte) 77, "Luka Magic", Posicion.BASE, 10.74f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.A, Valores.C, (byte) 16, (byte) 1);
		Jugador jalenBrunson = new Jugador((short) 239, "Jalen", "Brunson", (byte) 13, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.B, Valores.C, (byte) 16, (byte) 1);
		Jugador spencerDinwiddie = new Jugador((short) 240, "Spencer", "Dinwiddie", (byte) 21, Posicion.ALERO, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 16, (byte) 1);
		Jugador dorianFinneySmith = new Jugador((short) 241, "Dorian", "Finney-Smith", (byte) 10, Posicion.PIVOT, 4,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.D, Valores.A, (byte) 16, (byte) 1);
		Jugador reggieBullock = new Jugador((short) 242, "Reggie", "Bulloc", (byte) 25, Posicion.ALAPIVOT, 9.53f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 16, (byte) 1);

		mapa.put(lukaDoncic.getNombre() + " " + lukaDoncic.getApellido(), lukaDoncic);
		mapa.put(jalenBrunson.getNombre() + " " + jalenBrunson.getApellido(), jalenBrunson);
		mapa.put(spencerDinwiddie.getNombre() + " " + spencerDinwiddie.getApellido(), spencerDinwiddie);
		mapa.put(dorianFinneySmith.getNombre() + " " + dorianFinneySmith.getApellido(), dorianFinneySmith);
		mapa.put(reggieBullock.getNombre() + " " + reggieBullock.getApellido(), reggieBullock);

		Jugador willBarton = new Jugador((short) 243, "William", "Barton", (byte) 5, "Will", Posicion.ALERO, 15.62f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.C, (byte) 17, (byte) 1);
		Jugador aaronGordon = new Jugador((short) 244, "Aaron", "Gordon", (byte) 50, Posicion.ALAPIVOT, 16.4f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.B, (byte) 17, (byte) 1);
		Jugador nikolaJokic = new Jugador((short) 245, "Nikola", "Jokic", (byte) 15, Posicion.PIVOT, 31.58f, (byte) 4,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.A, Valores.B, (byte) 17, (byte) 1);
		Jugador jamalMurray = new Jugador((short) 246, "Jamal", "Murray", (byte) 27, Posicion.ESCOLTA, 29.67F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.B, Valores.C, (byte) 17, (byte) 1);
		Jugador monteMorris = new Jugador((short) 247, "Monte", "Morris", (byte) 11, Posicion.BASE, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.D, (byte) 17, (byte) 1);

		mapa.put(willBarton.getNombre() + " " + willBarton.getApellido(), willBarton);
		mapa.put(aaronGordon.getNombre() + " " + aaronGordon.getApellido(), aaronGordon);
		mapa.put(nikolaJokic.getNombre() + " " + nikolaJokic.getApellido(), nikolaJokic);
		mapa.put(jamalMurray.getNombre() + " " + jamalMurray.getApellido(), jamalMurray);
		mapa.put(monteMorris.getNombre() + " " + monteMorris.getApellido(), monteMorris);

		Jugador cadeCunningham = new Jugador((short) 248, "Cade", "Cunningham", (byte) 2, Posicion.BASE, 10.05f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.C, Valores.B, Valores.D, (byte) 7, (byte) 1);
		Jugador marvinBagley = new Jugador((short) 249, "Marvin", "Bagley", (byte) 35, Posicion.PIVOT, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 7, (byte) 1);
		Jugador sadiqqBey = new Jugador((short) 250, "Sadiqq", "Bey", (byte) 41, Posicion.ALERO, 2.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 7, (byte) 1);
		Jugador hamidouDiallo = new Jugador((short) 251, "Hamidou", "Diallo", (byte) 6, Posicion.ESCOLTA, 5.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 7, (byte) 1);
		Jugador jeramiGrant = new Jugador((short) 252, "Jerami", "Grant", (byte) 9, Posicion.ALAPIVOT, 20f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 7, (byte) 1);

		mapa.put(cadeCunningham.getNombre() + " " + cadeCunningham.getApellido(), cadeCunningham);
		mapa.put(marvinBagley.getNombre() + " " + marvinBagley.getApellido(), marvinBagley);
		mapa.put(sadiqqBey.getNombre() + " " + sadiqqBey.getApellido(), sadiqqBey);
		mapa.put(hamidouDiallo.getNombre() + " " + hamidouDiallo.getApellido(), hamidouDiallo);
		mapa.put(jeramiGrant.getNombre() + " " + jeramiGrant.getApellido(), jeramiGrant);

		Jugador stephenCurry = new Jugador((short) 253, "Stephen", "Curry", (byte) 30, "Chef Curry", Posicion.BASE,
				45.78f, (byte) 8, (byte) 3, (byte) 2, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34,
				Valores.A, Valores.A, Valores.A, Valores.D, (byte) 18, (byte) 1);
		Jugador klayThompson = new Jugador((short) 254, "Klay", "Thompson", (byte) 11, Posicion.ESCOLTA, 37.98f,
				(byte) 5, (byte) 3, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 18, (byte) 1);
		Jugador draymondGreen = new Jugador((short) 255, "Draymond", "Green", (byte) 13, Posicion.PIVOT, 24, (byte) 4,
				(byte) 3, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.A, Valores.A, (byte) 18, (byte) 1);
		Jugador andrewWiggins = new Jugador((short) 256, "Andrew", "Wiggins", (byte) 22, Posicion.ALAPIVOT, 31.57F,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 18, (byte) 1);
		Jugador jordanPoole = new Jugador((short) 257, "Jordan", "Poole", (byte) 3, Posicion.ALERO, 2.16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 18, (byte) 1);

		mapa.put(stephenCurry.getNombre() + " " + stephenCurry.getApellido(), stephenCurry);
		mapa.put(klayThompson.getNombre() + " " + klayThompson.getApellido(), klayThompson);
		mapa.put(draymondGreen.getNombre() + " " + draymondGreen.getApellido(), draymondGreen);
		mapa.put(andrewWiggins.getNombre() + " " + andrewWiggins.getApellido(), andrewWiggins);
		mapa.put(jordanPoole.getNombre() + " " + jordanPoole.getApellido(), jordanPoole);

		Jugador christianWood = new Jugador((short) 258, "Christian", "Wood", (byte) 35, Posicion.PIVOT, 13.6F,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 19, (byte) 1);
		Jugador jalenGreen = new Jugador((short) 259, "Jalen", "Green", (byte) 0, Posicion.BASE, 23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.D, Valores.D, (byte) 19, (byte) 1);
		Jugador kpj = new Jugador((short) 260, "Kevin", "Porter Jr", (byte) 3, Posicion.ALERO, 1.78F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.D, Valores.C, (byte) 19, (byte) 1);
		Jugador ericGordon = new Jugador((short) 261, "Eric", "Gordon", (byte) 10, Posicion.ESCOLTA, 18.12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.B, (byte) 19, (byte) 1);
		Jugador jaseanTate = new Jugador((short) 262, "Jae Sean", "Tate", (byte) 8, Posicion.ALAPIVOT, 1.57f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 19, (byte) 1);

		mapa.put(christianWood.getNombre() + " " + christianWood.getApellido(), christianWood);
		mapa.put(jalenGreen.getNombre() + " " + jalenGreen.getApellido(), jalenGreen);
		mapa.put(kpj.getNombre() + " " + kpj.getApellido(), kpj);
		mapa.put(ericGordon.getNombre() + " " + ericGordon.getApellido(), ericGordon);
		mapa.put(jaseanTate.getNombre() + " " + jaseanTate.getApellido(), jaseanTate);

		Jugador malcomBrogdon = new Jugador((short) 263, "Malcom", "Brogdon", (byte) 7, Posicion.BASE, 21.7f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.A, Valores.C, (byte) 8, (byte) 1);
		Jugador tyreseHaliburton = new Jugador((short) 264, "Tyrese", "halliburton", (byte) 0, Posicion.ESCOLTA, 4.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.A, Valores.C, Valores.C, (byte) 8, (byte) 1);
		Jugador buddyHield = new Jugador((short) 265, "Chavano Rainier", "Hield", (byte) 24, "Buddy Hield",
				Posicion.ALERO, 23.08F, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.B, Valores.A, Valores.C, Valores.B, (byte) 8, (byte) 1);
		Jugador jalenSmith = new Jugador((short) 266, "Jalen", "Smith", (byte) 25, Posicion.ALAPIVOT, 4.48f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.C, (byte) 8, (byte) 1);
		Jugador mylesTurner = new Jugador((short) 267, "Myles", "Turner", (byte) 33, Posicion.PIVOT, 18, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 8, (byte) 1);

		mapa.put(malcomBrogdon.getNombre() + " " + malcomBrogdon.getApellido(), malcomBrogdon);
		mapa.put(tyreseHaliburton.getNombre() + " " + tyreseHaliburton.getApellido(), tyreseHaliburton);
		mapa.put(buddyHield.getNombre() + " " + buddyHield.getApellido(), buddyHield);
		mapa.put(jalenSmith.getNombre() + " " + jalenSmith.getApellido(), jalenSmith);
		mapa.put(mylesTurner.getNombre() + " " + mylesTurner.getApellido(), mylesTurner);

		Jugador russelWestbrook = new Jugador((short) 268, "Russel", "Westbrook", (byte) 0, "Westbrick", Posicion.BASE,
				44.21f, (byte) 9, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 2, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.D, Valores.A, Valores.D, (byte) 21, (byte) 1);
		Jugador carmeloAnthony = new Jugador((short) 269, "Carmelo Kyam", "Anthony", (byte) 7, "Melo", Posicion.ALERO,
				2.64f, (byte) 10, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26,
				Valores.B, Valores.A, Valores.C, Valores.D, (byte) 21, (byte) 1);
		Jugador malikMonk = new Jugador((short) 270, "Malik", "Monk", (byte) 11, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.D, (byte) 21, (byte) 1);
		Jugador leBronJames = new Jugador((short) 271, "LeBron", "James", (byte) 6, "King James", Posicion.ALAPIVOT,
				41.18f, (byte) 18, (byte) 4, (byte) 4, (byte) 0, true, false, (byte) 3, (byte) 4, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.A, Valores.A, (byte) 21, (byte) 1);
		Jugador anthonyDavis = new Jugador((short) 272, "Anthony", "Davis", (byte) 3, "The Brow", Posicion.ALAPIVOT,
				35.36f, (byte) 8, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.A, Valores.B, Valores.C, Valores.A, (byte) 21, (byte) 1);

		mapa.put(russelWestbrook.getNombre() + " " + russelWestbrook.getApellido(), russelWestbrook);
		mapa.put(carmeloAnthony.getNombre() + " " + carmeloAnthony.getApellido(), carmeloAnthony);
		mapa.put(malikMonk.getNombre() + " " + malikMonk.getApellido(), malikMonk);
		mapa.put(leBronJames.getNombre() + " " + leBronJames.getApellido(), leBronJames);
		mapa.put(anthonyDavis.getNombre() + " " + anthonyDavis.getApellido(), anthonyDavis);

		Jugador dilonBrooks = new Jugador((short) 273, "Dilon", "Brooks", (byte) 24, Posicion.ALAPIVOT, 12.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.A,
				Valores.B, Valores.C, Valores.A, (byte) 24, (byte) 1);
		Jugador desmondBane = new Jugador((short) 274, "Desmond Michael", "Bane", (byte) 22, Posicion.ESCOLTA, 2.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 30, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 24, (byte) 1);
		Jugador jaMorant = new Jugador((short) 275, "Temetrius Jamel", "Morant", (byte) 12, "Ja Morant", Posicion.BASE,
				.603f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, true, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.B, Valores.C, Valores.C, (byte) 24, (byte) 1);
		Jugador brandonClarke = new Jugador((short) 276, "Brandon", "Clarke", (byte) 15, Posicion.ALERO, 2.72f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 19, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 24, (byte) 1);
		Jugador stevenAdams = new Jugador((short) 277, "Steven", "Adams", (byte) 4, Posicion.PIVOT, 17, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B,
				Valores.D, Valores.C, Valores.A, (byte) 24, (byte) 1);

		mapa.put(dilonBrooks.getNombre() + " " + dilonBrooks.getApellido(), dilonBrooks);
		mapa.put(jaMorant.getNombre() + " " + jaMorant.getApellido(), jaMorant);
		mapa.put(brandonClarke.getNombre() + " " + brandonClarke.getApellido(), brandonClarke);
		mapa.put(desmondBane.getNombre() + " " + desmondBane.getApellido(), desmondBane);
		mapa.put(stevenAdams.getNombre() + " " + stevenAdams.getApellido(), stevenAdams);

		Jugador jimmyButler = new Jugador((short) 278, "Jimmy", "Butler", (byte) 22, "Jimmy Buckets", Posicion.ALERO,
				36.01f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 39,
				Valores.A, Valores.C, Valores.B, Valores.A, (byte) 9, (byte) 1);
		Jugador bamAdebayo = new Jugador((short) 279, "Edrice Femi", "Adebayo", (byte) 5, "Bam", Posicion.PIVOT, 28.1f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.A, (byte) 9, (byte) 1);
		Jugador kyleLowry = new Jugador((short) 280, "Kyle", "Lowry", (byte) 7, Posicion.BASE, 26.98f, (byte) 6,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 9, (byte) 1);
		Jugador maxStrus = new Jugador((short) 281, "Max", "Strus", (byte) 31, Posicion.ESCOLTA, 1.67f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 9, (byte) 1);
		Jugador pjTucker = new Jugador((short) 282, "Anthony Leon", "Huerter", (byte) 3, "PJ Tucker", Posicion.ALAPIVOT,
				7f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.C, Valores.C, Valores.C, Valores.A, (byte) 9, (byte) 1);

		mapa.put(jimmyButler.getNombre() + " " + jimmyButler.getApellido(), jimmyButler);
		mapa.put(bamAdebayo.getNombre() + " " + bamAdebayo.getApellido(), bamAdebayo);
		mapa.put(kyleLowry.getNombre() + " " + kyleLowry.getApellido(), kyleLowry);
		mapa.put(maxStrus.getNombre() + " " + maxStrus.getApellido(), maxStrus);
		mapa.put(pjTucker.getNombre() + " " + pjTucker.getApellido(), pjTucker);

		Jugador giannisAntetokoumpo = new Jugador((short) 283, "Giannis", "Antetokounmpo", (byte) 34, "The Greek Freak",
				Posicion.ALAPIVOT, 39.34f, (byte) 6, (byte) 1, (byte) 2, (byte) 1, false, true, (byte) 1, (byte) 1,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 32, Valores.A, Valores.C, Valores.B, Valores.A, (byte) 10, (byte) 1);
		Jugador graysonAllen = new Jugador((short) 284, "Grayson", "Allen", (byte) 7, Posicion.ESCOLTA, 4, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.B, Valores.B, (byte) 10, (byte) 1);
		Jugador brookLopez = new Jugador((short) 285, "Brook", "Lopez", (byte) 11, Posicion.PIVOT, 13.3F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 10, (byte) 1);
		Jugador jrueHoliday = new Jugador((short) 286, "Jrue", "Holiday", (byte) 12, Posicion.BASE, 32.43f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.B, Valores.A, (byte) 10, (byte) 1);
		Jugador khrisMiddleton = new Jugador((short) 287, "Khris", "Middleton", (byte) 22, Posicion.ALERO, 33.5f,
				(byte) 3, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 10, (byte) 1);

		mapa.put(giannisAntetokoumpo.getNombre() + " " + giannisAntetokoumpo.getApellido(), giannisAntetokoumpo);
		mapa.put(graysonAllen.getNombre() + " " + graysonAllen.getApellido(), graysonAllen);
		mapa.put(brookLopez.getNombre() + " " + brookLopez.getApellido(), brookLopez);
		mapa.put(jrueHoliday.getNombre() + " " + jrueHoliday.getApellido(), jrueHoliday);
		mapa.put(khrisMiddleton.getNombre() + " " + khrisMiddleton.getApellido(), khrisMiddleton);

		Jugador anthonyEdwards = new Jugador((short) 288, "Anthony", "Edwards", (byte) 1, "Ant", Posicion.ALERO, 10.25f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.B, (byte) 22, (byte) 1);
		Jugador malikBeasly = new Jugador((short) 289, "Malik", "Beasly", (byte) 5, Posicion.ESCOLTA, 14.91f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 22, (byte) 1);
		Jugador patrickBeverly = new Jugador((short) 290, "Patrick", "Beverly", (byte) 22, Posicion.BASE, 14.32f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 22, (byte) 1);
		Jugador kat = new Jugador((short) 291, "Karl-Anthony", "Towns Cruz", (byte) 32, Posicion.PIVOT, 31.65f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.D, Valores.B, (byte) 22, (byte) 1);
		Jugador jadenMcDanields = new Jugador((short) 293, "Jaden", "McDanields", (byte) 3, Posicion.ALAPIVOT, 2.06f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 22, (byte) 1);

		mapa.put(anthonyEdwards.getNombre() + " " + anthonyEdwards.getApellido(), anthonyEdwards);
		mapa.put(malikBeasly.getNombre() + " " + malikBeasly.getApellido(), malikBeasly);
		mapa.put(patrickBeverly.getNombre() + " " + patrickBeverly.getApellido(), patrickBeverly);
		mapa.put(kat.getNombre() + " " + kat.getApellido(), kat);
		mapa.put(jadenMcDanields.getNombre() + " " + jadenMcDanields.getApellido(), jadenMcDanields);

		Jugador cjMcCollum = new Jugador((short) 294, "Christian James", "McCollum", (byte) 3, "CJ McCollum",
				Posicion.ESCOLTA, 30.86f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 35, Valores.B, Valores.B, Valores.C, Valores.D, (byte) 23, (byte) 1);
		Jugador jaxsonHayes = new Jugador((short) 295, "Jaxon", "hayes", (byte) 10, Posicion.PIVOT, 5.34f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.D, Valores.C, Valores.B, (byte) 23, (byte) 1);
		Jugador herbertJones = new Jugador((short) 296, "Herbert", "Jones", (byte) 5, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 23, (byte) 1);
		Jugador devonteGraham = new Jugador((short) 297, "Devonte", "Graham", (byte) 4, Posicion.BASE, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.D, (byte) 23, (byte) 1);
		Jugador jonasValanciunas = new Jugador((short) 298, "Jonas", "Valanciunas", (byte) 17, Posicion.ALERO, 14.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 23, (byte) 1);

		mapa.put(cjMcCollum.getNombre() + " " + cjMcCollum.getApellido(), cjMcCollum);
		mapa.put(jaxsonHayes.getNombre() + " " + jaxsonHayes.getApellido(), jaxsonHayes);
		mapa.put(herbertJones.getNombre() + " " + herbertJones.getApellido(), herbertJones);
		mapa.put(devonteGraham.getNombre() + " " + devonteGraham.getApellido(), devonteGraham);
		mapa.put(jonasValanciunas.getNombre() + " " + jonasValanciunas.getApellido(), jonasValanciunas);

		Jugador rjBarret = new Jugador((short) 299, "Rowan Alexander", "Barret", (byte) 9, "R.J.", Posicion.ALERO,
				8.63f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34,
				Valores.B, Valores.A, Valores.C, Valores.B, (byte) 11, (byte) 1);
		Jugador evanFournier = new Jugador((short) 300, "Evan", "Fournier", (byte) 13, Posicion.ESCOLTA, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.C, (byte) 11, (byte) 1);
		Jugador alecBurks = new Jugador((short) 301, "Alec", "Burks", (byte) 18, Posicion.BASE, 9.35f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 11, (byte) 1);
		Jugador mitchellRobinson = new Jugador((short) 302, "Mitchell", "Robinson", (byte) 23, Posicion.PIVOT, 1.8f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B, (byte) 11, (byte) 1);
		Jugador juliusRande = new Jugador((short) 303, "Julius", "Randle", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 11, (byte) 1);

		mapa.put(rjBarret.getNombre() + " " + rjBarret.getApellido(), rjBarret);
		mapa.put(evanFournier.getNombre() + " " + evanFournier.getApellido(), evanFournier);
		mapa.put(alecBurks.getNombre() + " " + alecBurks.getApellido(), alecBurks);
		mapa.put(mitchellRobinson.getNombre() + " " + mitchellRobinson.getApellido(), mitchellRobinson);
		mapa.put(juliusRande.getNombre() + " " + juliusRande.getApellido(), juliusRande);

		Jugador coleAnthony = new Jugador((short) 304, "Cole", "Anthony", (byte) 50, Posicion.BASE, 3.45f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.C, Valores.B, Valores.C, (byte) 12, (byte) 1);
		Jugador jalenSuggs = new Jugador((short) 305, "Jalen", "Suggs", (byte) 4, Posicion.ESCOLTA, 6.59f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.D, (byte) 12, (byte) 1);
		Jugador moBamba = new Jugador((short) 306, "Mohamed Fakaba", "Bamba", (byte) 5, "Mo Bamba", Posicion.BASE,
				7.56f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.B, Valores.B, Valores.D, Valores.B, (byte) 12, (byte) 1);
		Jugador franzWagner = new Jugador((short) 307, "Franz", "wagner", (byte) 22, Posicion.ALERO, 5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B, (byte) 12, (byte) 1);
		Jugador jonathanIsaac = new Jugador((short) 308, "Jonathan", "isaac", (byte) 1, Posicion.ALAPIVOT, .17f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 12, (byte) 1);

		mapa.put(coleAnthony.getNombre() + " " + coleAnthony.getApellido(), coleAnthony);
		mapa.put(jalenSuggs.getNombre() + " " + jalenSuggs.getApellido(), jalenSuggs);
		mapa.put(moBamba.getNombre() + " " + moBamba.getApellido(), moBamba);
		mapa.put(franzWagner.getNombre() + " " + franzWagner.getApellido(), franzWagner);
		mapa.put(jonathanIsaac.getNombre() + " " + jonathanIsaac.getApellido(), jonathanIsaac);

		Jugador joelEmbiid = new Jugador((short) 309, "Joel", "Embiid", (byte) 21, "Jojo", Posicion.PIVOT, 31.54f,
				(byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.B, Valores.B, Valores.A, (byte) 13, (byte) 1);
		Jugador jamesHarden = new Jugador((short) 310, "James", "Harden", (byte) 13, "The Beard", Posicion.BASE, 44.31f,
				(byte) 10, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 3, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 13, (byte) 1);
		Jugador tyreseMaxey = new Jugador((short) 311, "Tyrese", "Maxey", (byte) 0, Posicion.ESCOLTA, 2.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 13, (byte) 1);
		Jugador tobiasHarris = new Jugador((short) 312, "Tobias", "Harris", (byte) 12, Posicion.ALAPIVOT, 35.95f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B, (byte) 13, (byte) 1);
		Jugador matisseThybulle = new Jugador((short) 313, "Mathisse", "Thybulle", (byte) 22, Posicion.ALERO, 2.84f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A, (byte) 13, (byte) 1);

		mapa.put(joelEmbiid.getNombre() + " " + joelEmbiid.getApellido(), joelEmbiid);
		mapa.put(jamesHarden.getNombre() + " " + jamesHarden.getApellido(), jamesHarden);
		mapa.put(tyreseMaxey.getNombre() + " " + tyreseMaxey.getApellido(), tyreseMaxey);
		mapa.put(tobiasHarris.getNombre() + " " + tobiasHarris.getApellido(), tobiasHarris);
		mapa.put(matisseThybulle.getNombre() + " " + matisseThybulle.getApellido(), matisseThybulle);

		Jugador deandreAyton = new Jugador((short) 314, "Deandre", "Ayton", (byte) 22, Posicion.PIVOT, 12.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.D, Valores.D, Valores.A, (byte) 26, (byte) 1);
		Jugador mikalBridges = new Jugador((short) 315, "Mikal", "Bridges", (byte) 25, Posicion.ALERO, 5.57F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.B, Valores.A, (byte) 26, (byte) 1);
		Jugador devinBooker = new Jugador((short) 316, "Devin", "Booker", (byte) 1, "D-Book", Posicion.ESCOLTA, 31.65f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.B, Valores.C, (byte) 26, (byte) 1);
		Jugador jaeCrowder = new Jugador((short) 317, "Jae", "Crowder", (byte) 99, Posicion.ALAPIVOT, 9.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 26, (byte) 1);
		Jugador chrisPaul = new Jugador((short) 318, "Chris", "Paul", (byte) 3, "CP3", Posicion.BASE, 30.8f, (byte) 12,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.A, Valores.A, (byte) 26, (byte) 1);

		mapa.put(deandreAyton.getNombre() + " " + deandreAyton.getApellido(), deandreAyton);
		mapa.put(mikalBridges.getNombre() + " " + mikalBridges.getApellido(), mikalBridges);
		mapa.put(devinBooker.getNombre() + " " + devinBooker.getApellido(), devinBooker);
		mapa.put(jaeCrowder.getNombre() + " " + jaeCrowder.getApellido(), jaeCrowder);
		mapa.put(chrisPaul.getNombre() + " " + chrisPaul.getApellido(), chrisPaul);

		Jugador damianLillard = new Jugador((short) 319, "Damian", "Lillard", (byte) 0, "Dame Time", Posicion.BASE,
				39.34f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.A, Valores.A, Valores.D, (byte) 27, (byte) 1);
		Jugador anferneeSimons = new Jugador((short) 320, "Anfernee", "Simons", (byte) 1, Posicion.ESCOLTA, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 27, (byte) 1);
		Jugador cjjElleby = new Jugador((short) 321, "CJ", "Elleby", (byte) 16, Posicion.ALERO, 1.15f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 20, Valores.C,
				Valores.C, Valores.D, Valores.C, (byte) 27, (byte) 1);
		Jugador justiceWinslow = new Jugador((short) 322, "Justice", "Winslow", (byte) 26, Posicion.ALAPIVOT, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.C, (byte) 27, (byte) 1);
		Jugador jusufNurkic = new Jugador((short) 323, "Jusuf", "Nurkic", (byte) 27, Posicion.PIVOT, 12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.C, Valores.B, (byte) 27, (byte) 1);

		mapa.put(damianLillard.getNombre() + " " + damianLillard.getApellido(), damianLillard);
		mapa.put(anferneeSimons.getNombre() + " " + anferneeSimons.getApellido(), anferneeSimons);
		mapa.put(cjjElleby.getNombre() + " " + cjjElleby.getApellido(), cjjElleby);
		mapa.put(justiceWinslow.getNombre() + " " + justiceWinslow.getApellido(), justiceWinslow);
		mapa.put(jusufNurkic.getNombre() + " " + jusufNurkic.getApellido(), jusufNurkic);

		Jugador deAaronFox = new Jugador((short) 324, "De Aaron", "Fox", (byte) 5, Posicion.BASE, 28.1f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.D, (byte) 28, (byte) 1);
		Jugador harrisonBarnes = new Jugador((short) 325, "Harrison", "Barnes", (byte) 40, Posicion.ALERO, 20.29f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.C, (byte) 28, (byte) 1);
		Jugador justinHoliday = new Jugador((short) 326, "Justin", "Holiday", (byte) 9, Posicion.ESCOLTA, 6f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.D, Valores.B, (byte) 28, (byte) 1);
		Jugador domantasSabonis = new Jugador((short) 327, "Domantas", "Sabonis", (byte) 10, Posicion.PIVOT, 19.8f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 28, (byte) 1);
		Jugador mauriceHarkless = new Jugador((short) 328, "Maurice", "Harkless", (byte) 8, "Moe Harkless",
				Posicion.ALAPIVOT, 4.2f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.C, Valores.D, Valores.C, Valores.B, (byte) 28, (byte) 1);

		mapa.put(deAaronFox.getNombre() + " " + deAaronFox.getApellido(), deAaronFox);
		mapa.put(harrisonBarnes.getNombre() + " " + harrisonBarnes.getApellido(), harrisonBarnes);
		mapa.put(justinHoliday.getNombre() + " " + justinHoliday.getApellido(), justinHoliday);
		mapa.put(domantasSabonis.getNombre() + " " + domantasSabonis.getApellido(), domantasSabonis);
		mapa.put(mauriceHarkless.getNombre() + " " + mauriceHarkless.getApellido(), mauriceHarkless);

		Jugador dejounteMurray = new Jugador((short) 329, "Dejounte", "Murray", (byte) 5, Posicion.BASE, 15.24f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.B, Valores.B, Valores.B, (byte) 29, (byte) 1);
		Jugador lonnieWalker = new Jugador((short) 330, "Lonnie", "Walker IV", (byte) 1, Posicion.ESCOLTA, 4.47f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 29, (byte) 1);
		Jugador keldonJhonson = new Jugador((short) 331, "Keldon", "Jhonson", (byte) 3, Posicion.ALAPIVOT, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B, (byte) 29, (byte) 1);
		Jugador douMcDermott = new Jugador((short) 332, "Doug", "McDermott", (byte) 17, Posicion.ALERO, 7.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 29, (byte) 1);
		Jugador jakobPoeltl = new Jugador((short) 333, "Jakob", "Poeltl", (byte) 25, Posicion.PIVOT, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 29, (byte) 1);

		mapa.put(dejounteMurray.getNombre() + " " + dejounteMurray.getApellido(), dejounteMurray);
		mapa.put(lonnieWalker.getNombre() + " " + lonnieWalker.getApellido(), lonnieWalker);
		mapa.put(keldonJhonson.getNombre() + " " + keldonJhonson.getApellido(), keldonJhonson);
		mapa.put(douMcDermott.getNombre() + " " + douMcDermott.getApellido(), douMcDermott);
		mapa.put(jakobPoeltl.getNombre() + " " + jakobPoeltl.getApellido(), jakobPoeltl);

		Jugador luguentzDortz = new Jugador((short) 334, "Luguentz", "Dortz", (byte) 5, "Lu Dortz", Posicion.ALERO,
				1.78f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.B, Valores.B, Valores.C, Valores.A, (byte) 25, (byte) 1);
		Jugador dariusBazley = new Jugador((short) 335, "Darius", "Bazley", (byte) 7, Posicion.ALAPIVOT, 2.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.C,
				Valores.C, Valores.C, Valores.B, (byte) 25, (byte) 1);
		Jugador joshGiddey = new Jugador((short) 336, "josh", "Giddey", (byte) 3, Posicion.ESCOLTA, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.C, (byte) 25, (byte) 1);
		Jugador kenrichWilliams = new Jugador((short) 337, "Kenrich", "Williams", (byte) 34, Posicion.PIVOT, 2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.D, Valores.D, Valores.C, (byte) 25, (byte) 1);
		Jugador sga = new Jugador((short) 338, "Shai", "Gilgeous-Alexander", (byte) 2, Posicion.BASE, 5.49f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D, (byte) 25, (byte) 1);

		mapa.put(luguentzDortz.getNombre() + " " + luguentzDortz.getApellido(), luguentzDortz);
		mapa.put(dariusBazley.getNombre() + " " + dariusBazley.getApellido(), dariusBazley);
		mapa.put(joshGiddey.getNombre() + " " + joshGiddey.getApellido(), joshGiddey);
		mapa.put(kenrichWilliams.getNombre() + " " + kenrichWilliams.getApellido(), kenrichWilliams);
		mapa.put(sga.getNombre() + " " + sga.getApellido(), sga);

		Jugador mikeConley = new Jugador((short) 339, "Mike", "Conley", (byte) 11, Posicion.BASE, 21f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B,
				Valores.A, Valores.A, Valores.D, (byte) 30, (byte) 1);
		Jugador bojanBogdanovich = new Jugador((short) 340, "Bojan", "Bogdanovich", (byte) 44, Posicion.ALAPIVOT, 18.7f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 30, (byte) 1);
		Jugador donovanMitchell = new Jugador((short) 341, "Donovan", "Mitchell", (byte) 45, "Spida Mitchell",
				Posicion.ESCOLTA, 28.1f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.A, Valores.A, Valores.C, Valores.C, (byte) 30, (byte) 1);
		Jugador jordanClarkson = new Jugador((short) 342, "Jordan", "Clarkson", (byte) 00, Posicion.ALERO, 12.42f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.C, Valores.B, (byte) 30, (byte) 1);
		Jugador rudyGobert = new Jugador((short) 343, "Rudy", "Gobert", (byte) 27, "The French Bulldog", Posicion.PIVOT,
				35.34f, (byte) 3, (byte) 0, (byte) 0, (byte) 3, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.D, Valores.D, Valores.A, (byte) 30, (byte) 1);

		mapa.put(mikeConley.getNombre() + " " + mikeConley.getApellido(), mikeConley);
		mapa.put(bojanBogdanovich.getNombre() + " " + bojanBogdanovich.getApellido(), bojanBogdanovich);
		mapa.put(donovanMitchell.getNombre() + " " + donovanMitchell.getApellido(), donovanMitchell);
		mapa.put(jordanClarkson.getNombre() + " " + jordanClarkson.getApellido(), jordanClarkson);
		mapa.put(rudyGobert.getNombre() + " " + rudyGobert.getApellido(), rudyGobert);

		Jugador bradleyBeal = new Jugador((short) 344, "Bradley", "Beal", (byte) 3, Posicion.BASE, 33.72F, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.B, Valores.C, (byte) 15, (byte) 1);
		Jugador daniAvdija = new Jugador((short) 345, "Deni", "Advija", (byte) 9, Posicion.ALERO, 4.69f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 24, Valores.B,
				Valores.A, Valores.C, Valores.A, (byte) 15, (byte) 1);
		Jugador kcp = new Jugador((short) 346, "kentavius", "Cadwell-Pope", (byte) 1, "KCP", Posicion.ESCOLTA, 13.03f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A, (byte) 15, (byte) 1);
		Jugador thomasBryant = new Jugador((short) 347, "Thomas", "Bryant", (byte) 13, Posicion.PIVOT, 8.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.B,
				Valores.C, Valores.D, Valores.B, (byte) 15, (byte) 1);
		Jugador kristapsPorzingis = new Jugador((short) 348, "Kristaps", "Porzingis", (byte) 6, Posicion.ALAPIVOT,
				31.65f, (byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.B, Valores.D, Valores.C, (byte) 15, (byte) 1);

		mapa.put(bradleyBeal.getNombre() + " " + bradleyBeal.getApellido(), bradleyBeal);
		mapa.put(daniAvdija.getNombre() + " " + daniAvdija.getApellido(), daniAvdija);
		mapa.put(kcp.getNombre() + " " + kcp.getApellido(), kcp);
		mapa.put(thomasBryant.getNombre() + " " + thomasBryant.getApellido(), thomasBryant);
		mapa.put(kristapsPorzingis.getNombre() + " " + kristapsPorzingis.getApellido(), kristapsPorzingis);

		Jugador scottieBarnes = new Jugador((short) 349, "Scott Wayne", "Barnes", (byte) 4, "Scottie", Posicion.ALERO,
				7.28f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.C, Valores.C, Valores.B, (byte) 14, (byte) 1);
		Jugador ogAnunoby = new Jugador((short) 350, "Ogugua", "Anunoby", (byte) 3, "OG", Posicion.ALAPIVOT, 16,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.B, Valores.B, Valores.A, (byte) 14, (byte) 1);
		Jugador fredVanVleet = new Jugador((short) 351, "Fred", "VanVleet", (byte) 23, Posicion.BASE, 19.67f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.D, (byte) 14, (byte) 1);
		Jugador pascalSiakam = new Jugador((short) 352, "Pascal", "Siakam", (byte) 43, "Spicy P", Posicion.PIVOT, 33f,
				(byte) 1, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.A, (byte) 14, (byte) 1);
		Jugador garyTrentJr = new Jugador((short) 353, "Gary", "Trent Jr", (byte) 33, Posicion.ALERO, 16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C, (byte) 14, (byte) 1);

		mapa.put(scottieBarnes.getNombre() + " " + scottieBarnes.getApellido(), scottieBarnes);
		mapa.put(ogAnunoby.getNombre() + " " + ogAnunoby.getApellido(), ogAnunoby);
		mapa.put(fredVanVleet.getNombre() + " " + fredVanVleet.getApellido(), fredVanVleet);
		mapa.put(pascalSiakam.getNombre() + " " + pascalSiakam.getApellido(), pascalSiakam);
		mapa.put(garyTrentJr.getNombre() + " " + garyTrentJr.getApellido(), garyTrentJr);

		Jugador reggieJackson = new Jugador((short) 354, "Reggie", "Jackson", (byte) 1, Posicion.BASE, 10.38f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.C,
				Valores.B, Valores.C, Valores.C, (byte) 20, (byte) 1);
		Jugador paulGeorge = new Jugador((short) 355, "Paul", "George", (byte) 13, "PG13", Posicion.ESCOLTA, 39.34f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B, (byte) 20, (byte) 1);
		Jugador kawhiLeonard = new Jugador((short) 356, "Kawhi", "Leonard", (byte) 2, "Mr Fun Guy", Posicion.ALERO,
				39.34f, (byte) 5, (byte) 2, (byte) 0, (byte) 2, false, false, (byte) 1, (byte) 2, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.C, Valores.A, (byte) 20, (byte) 1);
		Jugador ivicaZubac = new Jugador((short) 357, "Ivica", "Zubac", (byte) 40, Posicion.PIVOT, 7.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B, (byte) 20, (byte) 1);
		Jugador robertCovington = new Jugador((short) 358, "Robert", "Covington", (byte) 23, Posicion.PIVOT, 12.98f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.C, Valores.D, Valores.A, (byte) 20, (byte) 1);

		mapa.put(reggieJackson.getNombre() + " " + reggieJackson.getApellido(), reggieJackson);
		mapa.put(paulGeorge.getNombre() + " " + paulGeorge.getApellido(), paulGeorge);
		mapa.put(kawhiLeonard.getNombre() + " " + kawhiLeonard.getApellido(), kawhiLeonard);
		mapa.put(ivicaZubac.getNombre() + " " + ivicaZubac.getApellido(), ivicaZubac);
		mapa.put(robertCovington.getNombre() + " " + robertCovington.getApellido(), robertCovington);

		return mapa;

	}

	@Override
	public String toString() {
		return  getNombre() + apodo+" "+apellido;
	}

}
