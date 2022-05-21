package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import exceptions.LigaInvalidaException;
import exceptions.PartidoAllStarMalHechoException;
import superClases.Partido;
import utlis.funcionesUtiles;
import utlis.utilsDB;

public class PartidoAllStar extends Partido {
	private ArrayList<JugadorNormal> equipo1;
	private ArrayList<JugadorNormal> equipo2;
	private ArrayList<JugadorNormal> titulares;

	public PartidoAllStar(short marcadorLocal, short marcadorVisitante, LocalDateTime fecha, EquipoAllStar equipo1,
			EquipoAllStar equipo2, ArrayList<JugadorNormal> arrayList)
			throws SQLException, PartidoAllStarMalHechoException {
		super(marcadorLocal, marcadorVisitante, fecha);

		Statement query = utilsDB.conectarBBDD();

		if (query.executeUpdate(
				"INSERT INTO partidoallstar(equipo1,equipo2,marcadorequipo1,marcadorequipo2,fecha,titulares) VALUES('A','B',999,999,now(),'EJEMPLO');") > 0) {

			this.equipo1 = funcionesUtiles.getJugadoresEquipo1();
			this.equipo2 = funcionesUtiles.getJugadoresEquipo2();
			this.titulares = funcionesUtiles.getTitularesAllStar();
		} else {
			throw new PartidoAllStarMalHechoException("El equipo del All Star se ha introducido de manera incorrecta");
		}
		utilsDB.desconectarBBDD();
	}

	public ArrayList<JugadorNormal> getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(ArrayList<JugadorNormal> equipo1) {
		this.equipo1 = equipo1;
	}

	public ArrayList<JugadorNormal> getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(ArrayList<JugadorNormal> equipo2) {
		this.equipo2 = equipo2;
	}

	public ArrayList<JugadorNormal> getTitulares() {
		return titulares;
	}

	public void setTitulares(ArrayList<JugadorNormal> titulares) {
		this.titulares = titulares;
	}

	@Override
	public String toString() {
		return "PartidoAllStar [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", titulares=" + titulares + "]";
	}

}
