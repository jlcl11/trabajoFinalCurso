package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import exceptions.SetterEquipoNoFuncionaAsiException;
import exceptions.SetterJugadorNoFuncionaAsiException;
import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a un equipo
 * 
 * @author jcorr
 */
public class Equipo extends ObjetoConNombre {
	/* atribuye el id del equipo */
	private byte eq_id;
	/* diferencia el equipo en conferencia este u oeste */
	private byte conferencia_id;
	/* asigna la ciudad local en la que juega el equipo */
	private String ciudadLocal;
	/*
	 * General Manager,básicamente es el señor trajeado que hace los fichajes y los
	 * traspasos
	 */
	private String GM;
	/* establece el límte salarial */
	private float limiteSalarial;
	/* establece el dueño del equipo */
	private String propietario;
	/*
	 * foreign key del partido del AllStar,solo usar si el equipo es uno de los 2
	 * del AllStar
	 */
	private byte partidoAllStar_id;
	/* foreign key de playoffs,solo usar si el equipo puede entrar a playoffs */
	private byte playoffs_playoff_id;

	/**
	 * Constructor que declara los equipos normales,los que no son del All Star y
	 * los inserta directamente en base de datos
	 * 
	 * @param eq_id               atribuye el id del equipo
	 * @param nombre              pone el nombre al equipo
	 * @param conferencia_id      diferencia el equipo en conferencia este u oeste
	 * @param ciudadLocal         asigna la ciudad local en la que juega el equipo
	 * @param gM                  General Manager,básicamente es el señor trajeado
	 *                            que hace los fichajes y los traspasos
	 * @param limiteSalarial      establece el límte salarial
	 * @param propietario         establece el dueño del equipo
	 * @param playoffs_playoff_id foreign key de playoffs,solo usar este constructor
	 *                            si el equipo puede entrar a playoffs
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
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

	/**
	 * Constructor que declara los equipos normales,los que no son del All Star y
	 * los inserta directamente en base de datos
	 * 
	 * @param eq_id             atribuye el id del equipo
	 * @param nombre            pone el nombre al equipo
	 * @param partidoAllStar_id foreign key del partido del AllStar,solo usar este
	 *                          constructor si el equipo es uno de los 2 del AllStar
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
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

	/**
	 * Constructor que rescata los datos de bbdd del objeto según el nombre del
	 * equipo
	 * 
	 * @param text Nombre del equipo cuyos datos vamos a rescatar
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
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

	/**
	 * Constructor vacío de equipo
	 */
	public Equipo() {

	}

	/**
	 * Getter del id de equipo
	 * 
	 * @return el id de los equipos
	 */
	public byte getEq_id() {
		return eq_id;
	}

	/**
	 * Setter de eq_id
	 * 
	 * @param eq_id el nuevo id de equipo
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el id no
	 *                                            sea negativo
	 */
	public void setEq_id(byte eq_id) throws SetterEquipoNoFuncionaAsiException {

		if (eq_id >= 0) {
			this.eq_id = eq_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * Getter del id de la conferencia
	 * 
	 * @return el id de las conferencia
	 */
	public byte getConferencia_id() {
		return conferencia_id;
	}

	/**
	 * Setter de eq_id
	 * 
	 * @param conferencia_id eq_id el nuevo id de equipo
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el id no
	 *                                            sea negativo
	 */
	public void setConferencia_id(byte conferencia_id) throws SetterEquipoNoFuncionaAsiException {

		if (conferencia_id >= 0) {
			this.conferencia_id = conferencia_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * Getter de la ciudad local
	 * 
	 * @return la ciudad local
	 */
	public String getCiudadLocal() {
		return ciudadLocal;
	}

	/**
	 * Setter de la ciudad local
	 * 
	 * @param ciudadLocal la nueva ciudad del equipo
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que la
	 *                                            ciudad local no esté vacío
	 */
	public void setCiudadLocal(String ciudadLocal) throws SetterEquipoNoFuncionaAsiException {

		if (!ciudadLocal.isBlank()) {
			this.ciudadLocal = ciudadLocal;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede estar vacío");
		}
	}

	/**
	 * getter del General Manager
	 * 
	 * @return el General Manager
	 */
	public String getGM() {
		return GM;
	}

	/**
	 * Setter del general manager
	 * 
	 * @param gM la nueva ciudad del equipo
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el
	 *                                            general manager no esté vacío
	 */
	public void setGM(String gM) throws SetterEquipoNoFuncionaAsiException {

		if (!gM.isBlank()) {
			this.GM = gM;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede estar vacío");
		}
	}

	/**
	 * getter del limite salarial
	 * 
	 * @return el limite salarial
	 */
	public float getLimiteSalarial() {
		return limiteSalarial;
	}

	/**
	 * Setter del limiteSalarial
	 * 
	 * @param limiteSalarial la nueva ciudad del equipo
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el
	 *                                            limite salarial no sea negativo
	 */
	public void setLimiteSalarial(float limiteSalarial) throws SetterEquipoNoFuncionaAsiException {

		if (limiteSalarial >= 0) {
			this.limiteSalarial = limiteSalarial;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	/**
	 * getter del propietario
	 * 
	 * @return el propietario
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * Setter del propietario
	 * 
	 * @param propietario del equipo
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el
	 *                                            propietario no sea nulo
	 */
	public void setPropietario(String propietario) throws SetterEquipoNoFuncionaAsiException {

		if (!propietario.isBlank()) {
			this.propietario = propietario;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede estar vacío");
		}
	}

	/**
	 * getter del id del partido AllStar
	 * 
	 * @return el id del partido AllStar
	 */
	public byte getPartidoAllStar_id() {
		return partidoAllStar_id;
	}

	/**
	 * Setter del partidoAllStar_id
	 * 
	 * @param partidoAllStar_id el nuevo id del partido del AllStar del equipo,hay
	 *                          que tener en cuenta que hay que actualizar antes la
	 *                          foreign key
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el
	 *                                            partidoAllStar_id no sea negativo
	 */
	public void setPartidoAllStar_id(byte partidoAllStar_id) throws SetterEquipoNoFuncionaAsiException {

		if (partidoAllStar_id >= 0) {
			this.partidoAllStar_id = partidoAllStar_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}
	}

	/**
	 * 
	 * getter del id del playoff
	 * 
	 * @return el id del playoff
	 */
	public byte getPlayoffs_playoff_id() {
		return playoffs_playoff_id;
	}

	/**
	 * Setter del playoffs_playoff_id
	 * 
	 * @param playoffs_playoff_id el nuevo id del partido del playoff del equipo,hay
	 *                            que tener en cuenta que hay que actualizar antes
	 *                            la foreign key
	 * @throws SetterEquipoNoFuncionaAsiException Excepcion que protege que el
	 *                                            partidoAllStar_id no sea negativo
	 */
	public void setPlayoffs_playoff_id(byte playoffs_playoff_id) throws SetterEquipoNoFuncionaAsiException {

		if (playoffs_playoff_id >= 0) {
			this.playoffs_playoff_id = playoffs_playoff_id;
		} else {
			throw new SetterEquipoNoFuncionaAsiException("No puede ser negativo");
		}

	}

	public static ArrayList<Jugador> getPlantilla(String nombre) {
		Statement smt = UtilsDB.conectarBBDD();
		// Inicializamos un ArrayList para devolver.
		ArrayList<Jugador> ret = new ArrayList<Jugador>();

		try {
			ResultSet cursor = smt.executeQuery(
					"SELECT * FROM jugador j JOIN equipo e ON j.equipo_eq_id=e.eq_id WHERE j.salario>0 AND e.nombre='"
							+ nombre + "';");
			while (cursor.next()) {
				Jugador actual = new Jugador();

				actual.setNombre(cursor.getString("nombre"));
				actual.setApellido(cursor.getString("apellido"));
				actual.setDorsal(cursor.getByte("dorsal"));
				actual.setApodo(cursor.getString("apodo"));
				actual.setPPG(cursor.getFloat("ppg"));
				actual.setAPG(cursor.getFloat("apg"));
				actual.setRBG(cursor.getFloat("rbg"));
				actual.setSPG(cursor.getFloat("spg"));
				actual.setBPG(cursor.getFloat("bpg"));
				actual.setBPG(cursor.getFloat("bpg"));
				actual.setMPG(cursor.getByte("mpg"));

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
		// Si no hay usuarios en la tabla, va a devolver un arraylist vacio.
		// Si la consulta fue erronea se devuelve un arraylist null, que son cosas
		// distintas.
		UtilsDB.desconectarBBDD();
		return ret;
	}

	public static void declararEquiposOeste() throws SQLException {

		Equipo mavs = new Equipo((byte) 16, "Mavericks", (byte) 2, "Dallas", "Nico Harrison", 109.4f, "Mark Cuban",
				(byte) 1);
		Estadio americanAirlinesCenter = new Estadio((byte) 16, "American Airlines Center", (short) 19200, (byte) 16);

		Equipo nuggets = new Equipo((byte) 17, "Nuggets", (byte) 2, "Denver", "Calvin Booth", 109.4f, "Kroenke Sports",
				(byte) 1);
		Estadio ballCenter = new Estadio((byte) 17, "Ball Center", (short) 19520, (byte) 17);

		Equipo warriors = new Equipo((byte) 18, "Golden State Warriors", (byte) 2, "San Francisco", "Bob Myers", 109.4f,
				"Joe Lacob", (byte) 1);
		Estadio chaseCenter = new Estadio((byte) 18, "Chase Center", (short) 18064, (byte) 18);

		Equipo rockets = new Equipo((byte) 19, "Rockets", (byte) 2, "Houston", "Rafael Stone", 109.4f,
				"Tilman Fertitta", (byte) 1);
		Estadio toyotaCenter = new Estadio((byte) 19, "Toyota Center", (short) 18055, (byte) 19);

		Equipo clippers = new Equipo((byte) 20, "Clippers", (byte) 2, "Los Ã�ngeles", "Michael Winger", 109.4f,
				"Steve Ballmer", (byte) 1);
		Estadio cryptocomArenaClippers = new Estadio((byte) 20, "Crypto.com Arena", (short) 19060, (byte) 20);

		Equipo lakers = new Equipo((byte) 21, "Lakers", (byte) 2, "Los Ã�ngeles", "Rob Pelinka", 109.4f, "Jeanie Buss",
				(byte) 1);
		Estadio cryptocomArena = new Estadio((byte) 21, "Crypto.com Arena", (short) 19060, (byte) 21);

		Equipo wolves = new Equipo((byte) 22, "Timberwolves", (byte) 2, "Minnesota", "Sachin Gupta", 109.4f,
				"Marc Lore", (byte) 1);
		Estadio targetCenter = new Estadio((byte) 22, "Target Center", (short) 18798, (byte) 22);

		Equipo pelicans = new Equipo((byte) 23, "Pelicans", (byte) 2, "New Orleans", "Trajan Langdon", 109.4f,
				"Gayle Benson", (byte) 1);
		Estadio smoothieKingCenter = new Estadio((byte) 23, "Smoothie King Center", (short) 16867, (byte) 23);

		Equipo grizzlies = new Equipo((byte) 24, "Grizzlies", (byte) 2, "Memphis", "Jason Wexler", 109.4f,
				"Robert Pera", (byte) 1);
		Estadio fedexForum = new Estadio((byte) 24, "FedEx Forum", (short) 18119, (byte) 24);

		Equipo okc = new Equipo((byte) 25, "Thunder", (byte) 2, "Oklahoma city", "Sam Presti", 109.4f,
				"Professional Basketball Club LLC", (byte) 1);
		Estadio paycomCenter = new Estadio((byte) 25, "Paycom Center", (short) 18203, (byte) 25);

		Equipo suns = new Equipo((byte) 26, "Suns", (byte) 2, "Phoenix", "James Andrew Jones", 109.4f, "Robert Sarver",
				(byte) 1);
		Estadio footprintCenter = new Estadio((byte) 26, "Footprint Center", (short) 18422, (byte) 26);

		Equipo blazers = new Equipo((byte) 27, "Trail Blazers", (byte) 2, "Portland", "Joe Cronin", 109.4f,
				"Paul Allen", (byte) 1);
		Estadio modaCenter = new Estadio((byte) 27, "Moda Center", (short) 19393, (byte) 27);

		Equipo kings = new Equipo((byte) 28, "Kings", (byte) 2, "Sacramento", "Monte McNair", 109.4f, "Vivek RanadivÃ©",
				(byte) 1);
		Estadio golden1Center = new Estadio((byte) 28, "Golden 1 Center", (short) 17608, (byte) 28);

		Equipo spurs = new Equipo((byte) 29, "Spurs", (byte) 2, "San Antonio", "Brian Wright", 109.4f,
				"Spurs Sports & Entertainment L.L.C.", (byte) 1);
		Estadio attcenter = new Estadio((byte) 29, "AT&T Center", (short) 18418, (byte) 29);

		Equipo jazz = new Equipo((byte) 30, "Jazz", (byte) 2, "Utah", "Justin Zanik", 109.4f, "Ryan Smith", (byte) 1);
		Estadio vivintArena = new Estadio((byte) 30, "Vivint Arena", (short) 18306, (byte) 30);

	}
	
	public static void declararEquiposEste() throws SQLException {

		Equipo hawks = new Equipo((byte) 1, "Hawks", (byte) 1, "Atlanta", "Anthony Ressler", 109.6f, "Travis Schlenk",
				(byte) 1);
		Estadio stateFarmArena = new Estadio((byte) 1, "State Farm Arena", (short) 16600, (byte) 1);

		Equipo celtics = new Equipo((byte) 2, "Celtics", (byte) 1, "Boston", "Brad Stevens", 109.6f,
				"Boston bball partners", (byte) 1);
		Estadio tdGarden = new Estadio((byte) 2, "TD Garden", (short) 18624, (byte) 2);

		Equipo nets = new Equipo((byte) 3, "Nets", (byte) 1, "Brooklyn", "Sean marks", 109.4f, "Joseph Tsai", (byte) 1);
		Estadio barclaysCenter = new Estadio((byte) 3, "Barclays Center", (short) 17732, (byte) 3);

		Equipo hornets = new Equipo((byte) 4, "Hornets", (byte) 1, "Charlotte", "Mitch Kupchak", 109.4f,
				"Michael Jordan", (byte) 1);
		Estadio spectrumCenter = new Estadio((byte) 4, "Spectrum center", (short) 19077, (byte) 4);

		Equipo bulls = new Equipo((byte) 5, "Bulls", (byte) 1, "Chicago", "Marc Eversley", 109.4f, "Jerry Reinsdorf",
				(byte) 1);
		Estadio unitedCenter = new Estadio((byte) 5, "United center", (short) 20917, (byte) 5);

		Equipo cavs = new Equipo((byte) 6, "Cavaliers", (byte) 1, "Cleveland", "Mike Gansey", 109.4f, "Dan Gilbert",
				(byte) 1);
		Estadio rocketMortageFieldHouse = new Estadio((byte) 6, "Rocket Mortgage FieldHouse", (short) 19432, (byte) 6);

		Equipo pistons = new Equipo((byte) 7, "Pistons", (byte) 1, "Detroit", "Troy Weaver", 109.4f, "Tom Gores",
				(byte) 1);
		Estadio littkeCaesarsArena = new Estadio((byte) 7, "Little Caesar Arena", (short) 20332, (byte) 7);

		Equipo pacers = new Equipo((byte) 8, "Pacers", (byte) 1, "Indiana", "Chad Buchanan", 109.4f, "Herbert Simon",
				(byte) 1);
		Estadio bankersLifeFieldHouse = new Estadio((byte) 8, "Bankers Life FieldHouse", (short) 17923, (byte) 8);

		Equipo heat = new Equipo((byte) 9, "Heat", (byte) 1, "Miami", "Pat Riley", 109.4f, "Micky Arison", (byte) 1);
		Estadio ftxArena = new Estadio((byte) 9, "FTX Arena", (short) 19600, (byte) 9);

		Equipo bucks = new Equipo((byte) 10, "Bucks", (byte) 1, "Milwaukee", "Jon Horst", 109.4f, "Los hermanos Edens",
				(byte) 1);
		Estadio fiservForum = new Estadio((byte) 10, "Fiserv Forum", (short) 17341, (byte) 10);

		Equipo knicks = new Equipo((byte) 11, "Knicks", (byte) 1, "New York", "Scott Perry", 109.4f, "James L Dolan",
				(byte) 1);
		Estadio madisonSquareGarde = new Estadio((byte) 11, "Madison Square Garden", (short) 19812, (byte) 11);

		Equipo magic = new Equipo((byte) 12, "Magic", (byte) 1, "Orlando", "John Hammond", 109.4f, "Richard DeVos",
				(byte) 1);
		Estadio amwayCenter = new Estadio((byte) 12, "Amway Center", (short) 18846, (byte) 12);

		Equipo sixers = new Equipo((byte) 13, "76ers", (byte) 1, "Philladelphia", "Elton Brand", 109.4f, "Josh Harris",
				(byte) 1);
		Estadio wellsFargoCenter = new Estadio((byte) 13, "Wells Fargo Center", (short) 20478, (byte) 13);

		Equipo raptors = new Equipo((byte) 14, "Raptors", (byte) 1, "Toronto", "Bobby Webster", 109.4f,
				"Maple Leaf Sports & Entertainment", (byte) 1);
		Estadio scotiaBankArena = new Estadio((byte) 14, "Scotia Bank Arena", (short) 19800, (byte) 14);

		Equipo wizards = new Equipo((byte) 15, "Wizards", (byte) 1, "Washinton", "Tommy Sheppard", 109.4f,
				"Ted Leonsis", (byte) 1);
		Estadio capitalOneArena = new Estadio((byte) 15, "Capital One Arena", (short) 20356, (byte) 15);

		

	}
	
	
	
	
}
