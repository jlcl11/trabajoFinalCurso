package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import superClases.Partido;

public class PartidoAllStar extends Partido {
	private EquipoAllStar equipo1;
	private EquipoAllStar equipo2;
	private ArrayList<JugadorAllStar> titulares;

	public PartidoAllStar(short marcadorLocal, short marcadorVisitante, LocalDateTime fecha, EquipoAllStar equipo1,
			EquipoAllStar equipo2, ArrayList<JugadorAllStar> titulares) {
		super(marcadorLocal, marcadorVisitante, fecha);
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.titulares = titulares;
	}

	public EquipoAllStar getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(EquipoAllStar equipo1) {
		this.equipo1 = equipo1;
	}

	public EquipoAllStar getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(EquipoAllStar equipo2) {
		this.equipo2 = equipo2;
	}

	public ArrayList<JugadorAllStar> getTitulares() {
		return titulares;
	}

	public void setTitulares(ArrayList<JugadorAllStar> titulares) {
		this.titulares = titulares;
	}

}
