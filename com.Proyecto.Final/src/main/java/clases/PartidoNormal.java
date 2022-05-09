package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import superClases.Partido;

public class PartidoNormal extends Partido {
	private EquipoNormal equipo1;
	private EquipoNormal equipo2;
	private ArrayList<JugadorNormal> titularesEquipo1;
	private ArrayList<JugadorNormal> titularesEquipo2;
	
	public PartidoNormal(short marcadorLocal, short marcadorVisitante, LocalDateTime fecha, EquipoNormal equipo1,
			EquipoNormal equipo2, ArrayList<JugadorNormal> titularesEquipo1,
			ArrayList<JugadorNormal> titularesEquipo2) {
		super(marcadorLocal, marcadorVisitante, fecha);
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.titularesEquipo1 = titularesEquipo1;
		this.titularesEquipo2 = titularesEquipo2;
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

	public ArrayList<JugadorNormal> getTitularesEquipo1() {
		return titularesEquipo1;
	}

	public void setTitularesEquipo1(ArrayList<JugadorNormal> titularesEquipo1) {
		this.titularesEquipo1 = titularesEquipo1;
	}

	public ArrayList<JugadorNormal> getTitularesEquipo2() {
		return titularesEquipo2;
	}

	public void setTitularesEquipo2(ArrayList<JugadorNormal> titularesEquipo2) {
		this.titularesEquipo2 = titularesEquipo2;
	}


}
