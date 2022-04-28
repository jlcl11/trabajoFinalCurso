package clases;

import java.util.ArrayList;

import superClases.ObjetoConNombre;
import superClases.Partido;

public class Conferencia extends ObjetoConNombre {

private ArrayList<Partido> partidos;

public Conferencia(String nombre, ArrayList<Partido> partidos) {
	super(nombre);
	this.partidos = partidos;
}

public ArrayList<Partido> getPartidos() {
	return partidos;
}

public void setPartidos(ArrayList<Partido> partidos) {
	this.partidos = partidos;
}


}
