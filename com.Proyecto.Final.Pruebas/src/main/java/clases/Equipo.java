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
	private byte eq_id;
	private byte conferencia_id;
	private String ciudadLocal;
	private String GM;
	private float limiteSalarial;
	private String propietario;
	private byte partidoAllStar_id;
	private byte playoffs_playoff_id;

	/**
	 * Constructor que declara los equipos normales,los que no son del All Star y
	 * los inserta directamente en base de datos
	 * 
	 * @param eq_id               atribuye el id del equipo
	 * @param nombre              pone el nombre al equipo
	 * @param conferencia_id      diferencia el equipo en conferencia este u oeste
	 * @param ciudadLocal         asigna la ciudad local
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

}
