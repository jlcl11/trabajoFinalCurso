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

}
