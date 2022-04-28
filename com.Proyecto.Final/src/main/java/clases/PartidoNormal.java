package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import superClases.Partido;

public class PartidoNormal extends Partido {
	private EquipoNormal equipo1;
	private EquipoNormal equipo2;
	private ArrayList<JugadorAllStar> titulares;

	public PartidoNormal(short marcadorLocal, short marcadorVisitante, LocalDateTime fecha, EquipoNormal equipo1,
			EquipoNormal equipo2, ArrayList<JugadorAllStar> titulares) {
		super(marcadorLocal, marcadorVisitante, fecha);
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.titulares = titulares;
	}

	public EquipoNormal getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(EquipoNormal equipo1) {
		this.equipo1 = equipo1;
	}

	public EquipoNormal getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(EquipoNormal equipo2) {
		this.equipo2 = equipo2;
	}

	public ArrayList<JugadorAllStar> getTitulares() {
		return titulares;
	}

	public void setTitulares(ArrayList<JugadorAllStar> titulares) {
		this.titulares = titulares;
	}

}
