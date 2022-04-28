package clases;

import java.util.ArrayList;

import superClases.Equipo;
import superClases.Jugador;

public class EquipoAllStar extends Equipo {

private ArrayList<JugadorAllStar> plantilla;

public EquipoAllStar(String nombre, Conferencia conferencia, String ciudadLocal, Jugador[] dorsalesRetirados,
		String propietario, String gM, float limiteSalarial, ArrayList<JugadorAllStar> plantilla) {
	super(nombre, conferencia, ciudadLocal, dorsalesRetirados, propietario, gM, limiteSalarial);
	this.plantilla = plantilla;
}

public ArrayList<JugadorAllStar> getPlantilla() {
	return plantilla;
}

public void setPlantilla(ArrayList<JugadorAllStar> plantilla) {
	this.plantilla = plantilla;
}


}
