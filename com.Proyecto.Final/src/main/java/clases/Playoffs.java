package clases;

import superClases.Equipo;
import superClases.ObjetoConNombre;

public class Playoffs extends ObjetoConNombre {

private Equipo listaEquiposPlayoffs;

public Playoffs(String nombre, Equipo listaEquiposPlayoffs) {
	super(nombre);
	this.listaEquiposPlayoffs = listaEquiposPlayoffs;
}

public Equipo getListaEquiposPlayoffs() {
	return listaEquiposPlayoffs;
}

public void setListaEquiposPlayoffs(Equipo listaEquiposPlayoffs) {
	this.listaEquiposPlayoffs = listaEquiposPlayoffs;
}


}
