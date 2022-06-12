package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import exceptions.SetterEquipoNoFuncionaAsiException;
import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a una edición de playoffs
 * 
 * @author jcorr
 *
 */
public class Playoff extends ObjetoConNombre {
	/* id del playoff */
	private byte playoff_id;
	/* lista de los equipos de playoff */
	private byte listaEquipos;
	/* lista de las rondas de playoff */
	private byte rondas;

	/**
	 * Constructor que mete cada instancia de playoff en bbdd
	 * 
	 * @param nombre       nombre de la edición de playoff
	 * @param playoff_id   id de los playoff
	 * @param listaEquipos id de cada equipo que va a participar en los playoffs,se
	 *                     hacen varios inserts por cada objeto con un mismo
	 *                     playoff_id
	 * @param rondas       id de cada ronda que va a participar en los playoffs,se
	 *                     hacen varios inserts por cada objeto con un mismo
	 *                     playoff_id
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
	public Playoff(String nombre, byte playoff_id, byte listaEquipos, byte rondas) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO playoffs VALUES(" + playoff_id + ",'" + nombre + "','" + listaEquipos
				+ "'," + rondas + ");") > 0) {
			this.playoff_id = playoff_id;
			this.listaEquipos = listaEquipos;
			this.rondas = rondas;

		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de playoff_id
	 * 
	 * @return el id de los playoffs
	 */
	public byte getPlayoff_id() {

		return playoff_id;
	}

	/**
	 * setter de playoff_id,mete el nuevo valor en bbdd
	 * 
	 * @param playoff_id id del playoff
	 * @throws SQLException SQLException lanza la excepción porque inserta
	 *                      directamente el nuevo valor en bbdd
	 */
	public void setPlayoff_id(byte playoff_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE playoffs SET playoff_id=" + playoff_id + " WHERE playoff_id=" + this.playoff_id + ";") > 0) {
			this.playoff_id = playoff_id;
		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * getter de listaEquipos
	 * 
	 * @return los equipos de esta edición de playoff
	 */
	public byte getListaEquipos() {
		return listaEquipos;
	}

	/**
	 * setter de listaEquipos,mete el nuevo valor en bbdd
	 * 
	 * @param listaEquipos ids de los equipos de playoff
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setListaEquipos(byte listaEquipos) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE playoffs SET listaequipos=" + listaEquipos + " WHERE playoff_id="
				+ this.playoff_id + ";") > 0) {
			this.listaEquipos = listaEquipos;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de rondas
	 * 
	 * @return las rondas de esta edición de playoff
	 */
	public byte getRondas() {
		return rondas;
	}

	/**
	 * setter de listaEquipos,mete el nuevo valor en bbdd
	 * 
	 * @param rondas
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setRondas(byte rondas) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE playoffs SET lista_rondas=" + rondas + " WHERE playoff_id=" + this.playoff_id + ";") > 0) {
			this.rondas = rondas;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Función que recoge los equipos de la conferencia este
	 * 
	 * @return devuelve un ArrayList de equipos de la conferencia este
	 */
	public static ArrayList<Equipo> getEquiposEste() {
		Statement smt = UtilsDB.conectarBBDD();

		ArrayList<Equipo> ret = new ArrayList<Equipo>();

		try {
			ResultSet cursor = smt.executeQuery("select * from equipo where conferencia=1 ");
			while (cursor.next()) {
				Equipo actual = new Equipo();

				actual.setEq_id(cursor.getByte("eq_id"));
				actual.setNombre(cursor.getString("nombre"));
				actual.setCiudadLocal(cursor.getString("ciudadlocal"));
				actual.setGM(cursor.getString("gm"));
				actual.setLimiteSalarial(cursor.getFloat("limitesalarial"));
				actual.setPropietario(cursor.getString("propietario"));
				actual.setConferencia_id(cursor.getByte("conferencia"));

				ret.add(actual);
			}
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} catch (SetterEquipoNoFuncionaAsiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UtilsDB.desconectarBBDD();
		return ret;
	}

	/**
	 * Función que recoge los equipos de la conferencia oeste
	 * 
	 * @return devuelve un ArrayList de equipos de la conferencia oeste
	 */
	public static ArrayList<Equipo> getEquiposOeste() {
		Statement smt = UtilsDB.conectarBBDD();

		ArrayList<Equipo> ret = new ArrayList<Equipo>();

		try {
			ResultSet cursor = smt.executeQuery("select * from equipo where conferencia=2 ");
			while (cursor.next()) {
				Equipo actual = new Equipo();

				actual.setEq_id(cursor.getByte("eq_id"));
				actual.setNombre(cursor.getString("nombre"));
				actual.setCiudadLocal(cursor.getString("ciudadlocal"));
				actual.setGM(cursor.getString("gm"));
				actual.setLimiteSalarial(cursor.getFloat("limitesalarial"));
				actual.setPropietario(cursor.getString("propietario"));
				actual.setConferencia_id(cursor.getByte("conferencia"));

				ret.add(actual);
			}
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} catch (SetterEquipoNoFuncionaAsiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UtilsDB.desconectarBBDD();
		return ret;
	}

	/**
	 * Función que aprovecha el ArrayList que devuelve la función getEquiposEste y
	 * devuelve de manera aleatoria 8 posiciones aleatorias
	 * 
	 * @return devuelve un ArarayList que contiene 8 equipos aleatorios
	 */
	public static ArrayList<Equipo> devolverPrimeraRondaEste() {
		ArrayList<Equipo> todos = getEquiposEste();
		ArrayList<Equipo> ret = new ArrayList<Equipo>();
		int limite = todos.size() - 1;
		int[] indicesAleatorios = new Random().ints(0, limite).distinct().limit(8).toArray();

		for (byte i = 0; i < indicesAleatorios.length; i++) {
			ret.add(todos.get(indicesAleatorios[i]));
		}

		return ret;
	}

	/**
	 * Función que aprovecha el ArrayList que devuelve la función getEquiposOeste y
	 * devuelve de manera aleatoria 8 posiciones aleatorias
	 * 
	 * @return devuelve un ArarayList que contiene 8 equipos aleatorios
	 */
	public static ArrayList<Equipo> devolverPrimeraRondaOeste() {
		ArrayList<Equipo> todos = getEquiposOeste();
		ArrayList<Equipo> ret = new ArrayList<Equipo>();
		int limite = todos.size() - 1;
		int[] indicesAleatorios = new Random().ints(0, limite).distinct().limit(8).toArray();

		for (byte i = 0; i < indicesAleatorios.length; i++) {
			ret.add(todos.get(indicesAleatorios[i]));
		}
		return ret;
	}

	/**
	 * Función que aprovecha el ArrayList que devuelve la función
	 * devolverPrimeraRondaEste y devuelve 4 posiciones aleatorias para crear
	 * emparejamientos
	 * 
	 * @return ArrayList de Equipos que avazan en los playoff
	 */
	public static ArrayList<Equipo> devolverSegundaRondaEste() {
		Random r = new Random();

		ArrayList<Equipo> todos = devolverPrimeraRondaEste();
		ArrayList<Equipo> ret = new ArrayList<Equipo>();

		int n1 = r.nextInt(2 - 1);
		int n2 = (r.nextInt(4 - 2) + 2);
		int n3 = (r.nextInt(6 - 4) + 4);
		int n4 = (r.nextInt(8 - 6) + 6);

		ret.add(todos.get(n1));
		ret.add(todos.get(n2));
		ret.add(todos.get(n3));
		ret.add(todos.get(n4));

		return ret;
	}

	/**
	 * Función que aprovecha el ArrayList que devuelve la función
	 * devolverPrimeraRondaOeste y devuelve 4 posiciones aleatorias para crear
	 * emparejamientos
	 * 
	 * @return ArrayList de Equipos que avazan en los playoff
	 */
	public static ArrayList<Equipo> devolverSegundaRondaOeste() {
		Random r = new Random();
		ArrayList<Equipo> todos = devolverPrimeraRondaOeste();
		ArrayList<Equipo> ret = new ArrayList<Equipo>();
		int n1 = r.nextInt(2 - 1);
		int n2 = (r.nextInt(4 - 2) + 2);
		int n3 = (r.nextInt(6 - 4) + 4);
		int n4 = (r.nextInt(8 - 6) + 6);

		ret.add(todos.get(n1));
		ret.add(todos.get(n2));
		ret.add(todos.get(n3));
		ret.add(todos.get(n4));
		return ret;
	}

	/**
	 * Función que aprovecha el ArrayList que devuelve la función
	 * devolverSegundaRondaEste y devuelve 2 posiciones aleatorias para crear
	 * emparejamientos
	 * 
	 * @return ArrayList de Equipos que avazan en los playoff
	 */
	public static ArrayList<Equipo> devolverFinalEste() {
		Random r = new Random();
		ArrayList<Equipo> todos = devolverSegundaRondaEste();
		ArrayList<Equipo> ret = new ArrayList<Equipo>();

		int n1 = r.nextInt(2 - 1);
		int n2 = (r.nextInt(4 - 2) + 2);
		ret.add(todos.get(n1));
		ret.add(todos.get(n2));
		return ret;
	}

	/**
	 * Función que aprovecha el ArrayList que devuelve la función
	 * devolverSegundaRondaOeste y devuelve 2 posiciones aleatorias para crear
	 * emparejamientos
	 * 
	 * @return ArrayList de Equipos que avazan en los playoff
	 */
	public static ArrayList<Equipo> devolverFinalOeste() {
		Random r = new Random();
		ArrayList<Equipo> todos = devolverSegundaRondaOeste();
		ArrayList<Equipo> ret = new ArrayList<Equipo>();
		int n1 = r.nextInt(2 - 1);
		int n2 = (r.nextInt(4 - 2) + 2);
		ret.add(todos.get(n1));
		ret.add(todos.get(n2));
		return ret;
	}

	/**
	 * Función que escoge una posición aleatoria del AraryList devolverFinalEste
	 * para devolver el finalista del ESte
	 * 
	 * @return el equipo finalista del este
	 */
	public static Equipo devolverFinalistaEste() {
		ArrayList<Equipo> todos = devolverFinalEste();
		Random r = new Random();
		Equipo ret = todos.get(r.nextInt(2 - 1));

		return ret;
	}

	/**
	 * Función que escoge una posición aleatoria del AraryList devolverFinalOeste
	 * para devolver el finalista del ESte
	 * 
	 * @return el equipo finalista del oeste
	 */
	public static Equipo devolverFinalistaOeste() {
		ArrayList<Equipo> todos = devolverFinalOeste();
		Random r = new Random();

		return todos.get(r.nextInt(1));
	}

	/**
	 * Esta función añade los finalistas de ambas conferencias para que en su
	 * resprectiva pantalla se puedan mostrar como un elemento visual
	 * 
	 * @return
	 */
	public static ArrayList<Equipo> finalistasParaMostrarlos() {
		ArrayList<Equipo> ret = new ArrayList<Equipo>();
		ret.add(devolverFinalistaEste());
		ret.add(devolverFinalistaOeste());

		return ret;
	}

	/**
	 * Esta función devuelve una posición aleatoria del ArrayList que devuelve la
	 * función dwdwdw para poder conseguir un campeón resultado de la batalla
	 * aleatoria entre los finalistas de cada conferencia
	 * 
	 * @return el equipo ganador
	 */
	public static Equipo devolverCampeon() {
		ArrayList<Equipo> todos = finalistasParaMostrarlos();
		Random r = new Random();
		Equipo ret = todos.get(r.nextInt(2 - 1));

		return ret;
	}

}
