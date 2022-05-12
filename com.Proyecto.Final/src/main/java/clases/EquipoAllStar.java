package clases;

import java.util.ArrayList;

import superClases.Equipo;
import superClases.Jugador;

public class EquipoAllStar extends Equipo {

	private ArrayList<JugadorNormal> plantilla;

	public EquipoAllStar(ArrayList<JugadorNormal> plantilla) {
		super();
		this.plantilla = plantilla;
	}

	public ArrayList<JugadorNormal> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(ArrayList<JugadorNormal> plantilla) {
		this.plantilla = plantilla;
	}

}
