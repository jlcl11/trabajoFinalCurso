package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import superClases.Partido;
import utils.UtilsDB;

/**
 * Clase cuyas instancias representan a un partido normal
 * 
 * @author jcorr
 */
public class PartidoNormal extends Partido {
	/* id del partido */
	private byte partido_id;
	/* id del equipo local */
	private byte equipo1_id;
	/* id del equipo visitante */
	private byte equipo2_id;
	/* id de la conferencia */
	private short conferencia_Partidos;
	/* id de la ronda de playoffs */
	private byte rondaPlayoffs_ronda_id;

	/**
	 * Contructor que mete un partido normal(sin playoffs) en bbdd
	 * 
	 * @param partido_id           id del partido
	 * @param marcadorLocal        puntos que ha metido el equipo local
	 * @param marcadorVisitante    puntos que ha metido el equipo visitante
	 * @param fecha                fecha en la que se juega el partido
	 * @param equipo1_id           id del equipo local
	 * @param equipo2_id           id del equipo visitante
	 * @param conferencia_Partidos conferencia de la que son los equipos
	 * @throws SQLException lanza la excepción porque mete los datos directamente en
	 *                      bbdd
	 */
	public PartidoNormal(byte partido_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			byte equipo1_id, byte equipo2_id, short conferencia_Partidos) throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate(
				"INSERT INTO partidonormal(partidonl_id,equipo1_id,equipo2_id,marcadorequipo1,marcadorequipo2,fecha,conferencia_partidos)\r\n"
						+ "VALUES(" + partido_id + "," + equipo1_id + "," + equipo2_id + "," + marcadorLocal + ","
						+ marcadorVisitante + ",'" + fecha + "'," + conferencia_Partidos + ");") > 0) {
			this.partido_id = partido_id;
			this.equipo1_id = equipo1_id;
			this.equipo2_id = equipo2_id;
			this.conferencia_Partidos = conferencia_Partidos;
			System.out.println("Partido introducido correctamente");
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Contructor que mete un partido normal(sin playoffs) en bbdd
	 * 
	 * @param partido_id             id del partido
	 * @param marcadorLocal          puntos que ha metido el equipo local
	 * @param marcadorVisitante      puntos que ha metido el equipo visitante
	 * @param fecha                  fecha en la que se juega el partido
	 * @param equipo1_id             id del equipo local
	 * @param equipo2_id             id del equipo visitante
	 * @param conferencia_Partidos   conferencia de la que son los equipos
	 * @param rondaPlayoffs_ronda_id ronda de playoffs que se está jugando
	 * @throws SQLException lanza la excepción porque mete los datos directamente en
	 *                      bbdd
	 */
	public PartidoNormal(byte partido_id, short marcadorLocal, short marcadorVisitante, LocalDateTime fecha,
			byte equipo1_id, byte equipo2_id, short conferencia_Partidos, byte rondaPlayoffs_ronda_id)
			throws SQLException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = UtilsDB.conectarBBDD();
		if (query.executeUpdate("INSERT INTO partidonormal() VALUES(" + partido_id + "," + equipo1_id + "," + equipo2_id
				+ "," + marcadorLocal + "," + marcadorVisitante + ",'" + fecha + "'," + conferencia_Partidos + ","
				+ rondaPlayoffs_ronda_id + ");") > 0) {
			this.partido_id = partido_id;
			this.equipo1_id = equipo1_id;
			this.equipo2_id = equipo2_id;
			this.conferencia_Partidos = conferencia_Partidos;
			this.rondaPlayoffs_ronda_id = rondaPlayoffs_ronda_id;
			System.out.println("Partido introducido con exito");
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de partido_id, devuelve el partido_id de los partidos
	 * 
	 * @return el id de los partidos
	 */
	public byte getPartido_id() {
		return partido_id;
	}

	/**
	 * Setter de partido_id,mete el nuevo valor en bbdd
	 * 
	 * @param partidos_fk el nuevo id de los partidos
	 * @throws SQLException lanza la excepción porque inserta directamente el nuevo
	 *                      valor en bbdd
	 */
	public void setPartido_id(byte partido_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET partidonl_id=" + partido_id + " WHERE partidonl_id="
				+ this.partido_id + ";") > 0) {
			this.partido_id = partido_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de equipo1_id, devuelve el id del equipo local
	 * 
	 * @return el id del equipo local
	 */
	public byte getEquipo1_id() {
		return equipo1_id;
	}

	/**
	 * setter de equipo1_id,mete el nuevo valor en bbdd
	 * 
	 * @param equipo1_id id del equipo local
	 * @throws SQLException salta la excepción porque trabaja con bbdd
	 */
	public void setEquipo1_id(byte equipo1_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET equipo1=" + equipo1_id + " WHERE partidonl_id="
				+ this.partido_id + ";") > 0) {
			this.equipo1_id = equipo1_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * Getter de equipo2_id, devuelve el id del equipo visitante
	 * 
	 * @return el id del equipo visitante
	 */
	public byte getEquipo2_id() {
		return equipo2_id;
	}

	/**
	 * setter de equipo2_id,mete el nuevo valor en bbdd
	 * 
	 * @param equipo2_id id del equipo visitante
	 * @throws SQLException salta la excepción porque trabaja con bbdd
	 */
	public void setEquipo2_id(byte equipo2_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET equipo2=" + equipo2_id + " WHERE partidonl_id="
				+ this.partido_id + ";") > 0) {
			this.equipo2_id = equipo2_id;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de conferencia_Partidos
	 * 
	 * @return el id de la conferencia en el que se juega el partido
	 */
	public short getConferencia_Partidos() {
		return conferencia_Partidos;
	}

	/**
	 * setter de conferencia_Partidos,mete el nuevo valor en bbdd
	 * 
	 * @param conferencia_Partidos id de la conferencia
	 * @throws SQLException salta la excepción porque trabaja con bbdd
	 */
	public void setConferencia_Partidos(short conferencia_Partidos) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET conferencia_partidos=" + conferencia_Partidos
				+ " WHERE partidonl_id=" + this.partido_id + ";") > 0) {
			this.conferencia_Partidos = conferencia_Partidos;
		}
		UtilsDB.desconectarBBDD();
	}

	/**
	 * getter de rondaPlayoffs_ronda_id
	 * 
	 * @return el id del id de la ronda de playoffs que se está jugando
	 */
	public byte getRondaPlayoffs_ronda_id() {
		return rondaPlayoffs_ronda_id;
	}

	/**
	 * setter de rondaPlayoffs_ronda_id ,mete el nuevo valor en bbdd
	 * 
	 * @param rondaPlayoffs_ronda_id id de la ronda de playoffs que se esté jugando
	 * @throws SQLException salta la excepción porque trabaja con bbdd
	 */
	public void setRondaPlayoffs_ronda_id(byte rondaPlayoffs_ronda_id) throws SQLException {
		Statement smt = UtilsDB.conectarBBDD();

		if (smt.executeUpdate("UPDATE partidonormal SET rondaplayoff_ronda_id=" + rondaPlayoffs_ronda_id
				+ " WHERE partidonl_id=" + this.partido_id + ";") > 0) {
			this.rondaPlayoffs_ronda_id = rondaPlayoffs_ronda_id;
		}
		UtilsDB.desconectarBBDD();
	}

}
