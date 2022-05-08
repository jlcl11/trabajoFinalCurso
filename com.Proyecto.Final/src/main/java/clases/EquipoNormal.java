package clases;

import java.util.ArrayList;

import superClases.Equipo;
import superClases.Jugador;

public class EquipoNormal extends Equipo {

	private ArrayList<JugadorNormal> plantilla;

	public EquipoNormal(String nombre, Conferencia conferencia, String ciudadLocal, String dorsalesRetirados,
			String propietario, String gM, float limiteSalarial, Estadio estadio, ArrayList<JugadorNormal> plantilla) {
		super(nombre, conferencia, ciudadLocal, dorsalesRetirados, propietario, gM, limiteSalarial, estadio);
		this.plantilla = plantilla;
	}

	public EquipoNormal(String nombre, Conferencia conferencia, String ciudadLocal, String dorsalesRetirados,
			String propietario, String gM, float limiteSalarial, Estadio estadio) {
		super(nombre, conferencia, ciudadLocal, dorsalesRetirados, propietario, gM, limiteSalarial, estadio);
	}

	public EquipoNormal(String nombre) {
		super(nombre);
	}

	public ArrayList<JugadorNormal> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(ArrayList<JugadorNormal> plantilla) {
		this.plantilla = plantilla;
	}

}
