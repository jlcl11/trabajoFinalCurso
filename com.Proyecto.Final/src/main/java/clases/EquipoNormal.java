package clases;

import java.util.ArrayList;

import superClases.Equipo;
import superClases.Jugador;

public class EquipoNormal extends Equipo{

private ArrayList<JugadorNormal> plantilla;

public EquipoNormal(String nombre, Conferencia conferencia, String ciudadLocal, Jugador[] dorsalesRetirados,
		String propietario, String gM, float limiteSalarial, ArrayList<JugadorNormal> plantilla) {
	super(nombre, conferencia, ciudadLocal, dorsalesRetirados, propietario, gM, limiteSalarial);
	this.plantilla = plantilla;
}

public ArrayList<JugadorNormal> getPlantilla() {
	return plantilla;
}

public void setPlantilla(ArrayList<JugadorNormal> plantilla) {
	this.plantilla = plantilla;
}	


	
}
