package clases;

import java.sql.SQLException;
import java.sql.Statement;

import superClases.ObjetoConNombre;
import utils.UtilsDB;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a una conferencia, que se ocupa de
 * clasificar los equipos en 2
 * 
 * @author jcorr
 */
public class Conferencia extends ObjetoConNombre {

	/* La foreign key de partidos,que mediante inserts mete los partidos en bbdd */
	private int partidos_fk;
	/* La foreign key de liga que relaciona las tablas */
	private short liga_conferencias;

	/**
	 * Constructor que mete el objeto directamente en base de datos
	 * 
	 * @param nombre            Pone nombre a la conferencia
	 * @param partidos_fk       consigue el id de los partidos
	 * @param liga_conferencias consigue el id de liga para relacionar las tablas
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
	public Conferencia(String nombre, int partidos_fk, short liga_conferencias) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO conferencia(partidos,nombre,liga_conferencias) VALUES(" + partidos_fk
				+ ",'" + nombre + "'," + liga_conferencias + ");") > 0) {
			this.partidos_fk = partidos_fk;
			this.liga_conferencias = liga_conferencias;

		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * Getter de partidos_fk, devuelve el partidos_fk de los partidos
	 * 
	 * @return el id de los partidos
	 */
	public int getPartidos_fk() {
		return partidos_fk;
	}

	/**
	 * Setter de partidos_fk,mete el nuevo valor en bbdd
	 * 
	 * @param partidos_fk el nuevo id de los partidos
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setPartidos_fk(int partidos_fk) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE conferencia SET partidos = " + partidos_fk + "WHERE partidos=" + this.partidos_fk + ";") > 0) {
			this.partidos_fk = partidos_fk;
		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * Getter de liga_conferencias, devuelve el liga_conferencias de la liga
	 * 
	 * @return el id de liga
	 */
	public short getLiga_conferencias() {
		return liga_conferencias;
	}

	/**
	 * Setter de liga_conferencias,mete el nuevo valor en bbdd
	 * 
	 * @param liga_conferencias el nuevo id de la liga
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setLiga_conferencias(short liga_conferencias) throws SQLException {

		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE conferencia SET liga_conferencias = " + liga_conferencias + "WHERE partidos="
				+ this.partidos_fk + ";") > 0) {
			this.liga_conferencias = liga_conferencias;
		}
		UtilsDB.desconectarBBDD();
	}

}
