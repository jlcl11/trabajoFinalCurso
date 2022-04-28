package clases;

import java.util.ArrayList;

import superClases.ObjetoConNombre;
import superClases.Partido;

public class RondaPlayoffs extends ObjetoConNombre {

private ArrayList<Partido> partido;

public RondaPlayoffs(String nombre, ArrayList<Partido> partido) {
	super(nombre);
	this.partido = partido;
}

public ArrayList<Partido> getPartido() {
	return partido;
}

public void setPartido(ArrayList<Partido> partido) {
	this.partido = partido;
}


}
