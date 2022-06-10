package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exceptions.CapacidadImposibleException;
import superClases.ObjetoConNombre;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a un estadio
 * 
 * @author jcorr
 *
 */
public class Estadio extends ObjetoConNombre {

	/* la clave primaria del estadio en bbdd */
	private byte estadio_id;
	/* la capacidad del estadio */
	private short capacidad;
	/**/
	private byte equipo_id;

	/**
	 * Constructor que mete el objeto directamente en base de datos
	 * 
	 * @param estadio_id id del estadio
	 * @param nombre     nombre del estadio
	 * @param capacidad  capacidad del estadio
	 * @param equipo_id  id del equipo al que pertenece el estadio
	 * @throws SQLException lanza una SQL exception porque el constructor inserta
	 *                      directamente el objeto en bbdd
	 */
	public Estadio(byte estadio_id, String nombre, short capacidad, byte equipo_id) throws SQLException {
		super(nombre);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO estadio VALUES(" + estadio_id + ",'" + nombre + "'," + capacidad + ","
				+ equipo_id + ");") > 0) {
			this.estadio_id = estadio_id;
			this.capacidad = capacidad;
			this.equipo_id = equipo_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Constructor que rescata los datos de un estadio según el id de un equipo
	 * 
	 * @param equipo_eq_id el id del equipo al que pertenece el estadio
	 */
	public Estadio(byte equipo_eq_id) {
		Statement smt = UtilsDB.conectarBBDD();

		try {
			ResultSet cursor = smt.executeQuery("SELECT * FROM estadio WHERE equipo_eq_id='" + equipo_eq_id + "';");
			while (cursor.next()) {

				this.setNombre(cursor.getString("nombre"));
				this.setCapacidad(cursor.getShort("capacidad"));
			}
		} catch (SQLException e) {

			e.printStackTrace();

		} catch (CapacidadImposibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UtilsDB.desconectarBBDD();

	}

	/**
	 * Getter de getEstadio_id, devuelve el getEstadio_id de los estadio
	 * 
	 * @return el getEstadio_id de los estadio
	 */
	public byte getEstadio_id() {
		return estadio_id;
	}

	/**
	 * Setter de estadio_id,mete el nuevo valor en bbdd
	 * 
	 * @param estadio_id el nuevo id de los estadios
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setEstadio_id(byte estadio_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE estadio SET estadio_id = " + estadio_id + "WHERE eq_id=" + this.estadio_id + ";") > 0) {
			this.estadio_id = estadio_id;
		}
		UtilsDB.desconectarBBDD();

	}

	/**
	 * Getter de capacidad, devuelve la capacidad de los estadios
	 * 
	 * @return la capacidad de los estadios
	 */
	public short getCapacidad() {
		return capacidad;
	}

	/***
	 * setter de la capacidad,se asegura que la capacidad esté entre el valor menor
	 * y mayor
	 * 
	 * @param capacidad numero de butacas en el estadio
	 * @throws CapacidadImposibleException protege el setter para que la capacidad
	 *                                     no sea una que no esté ya introducida y
	 *                                     no se pueda poner un número ilógico
	 */
	public void setCapacidad(short capacidad) throws CapacidadImposibleException {

		if (capacidad > 15000 && capacidad < 22000) {
			this.capacidad = capacidad;
		} else {
			throw new CapacidadImposibleException("No ningún estadio de esa capacidad");
		}

	}

	/**
	 * consigue el valor de la foreign key del equipo al cual se le asigna el
	 * estadio *
	 * 
	 * @return devuelve el id del estadio
	 */
	public byte getEquipo_id() {
		return equipo_id;
	}

	/**
	 * setter del id del equipo ,actualiza el valor directamente en bbdd
	 * 
	 * @param equipo_id foreign key del equipo
	 * @throws SQLException devuelve esta excepción porque cambia el valor
	 *                      directamente en bbdd
	 */
	public void setEquipo_id(byte equipo_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate(
				"UPDATE estadio SET equipo_id = " + equipo_id + "WHERE eq_id=" + this.estadio_id + ";") > 0) {
			this.equipo_id = equipo_id;
		}
		UtilsDB.desconectarBBDD();

	}

}
