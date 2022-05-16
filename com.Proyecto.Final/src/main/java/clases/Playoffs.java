package clases;

import java.util.ArrayList;

import superClases.Equipo;
import superClases.ObjetoConNombre;

public class Playoffs extends ObjetoConNombre {

private ArrayList<Equipo> listaEquiposPlayoffs;

public Playoffs(String nombre, ArrayList<Equipo> listaEquiposPlayoffs) {
	super(nombre);
	this.listaEquiposPlayoffs = listaEquiposPlayoffs;
}

public ArrayList<Equipo> getListaEquiposPlayoffs() {
	return listaEquiposPlayoffs;
}

public void setListaEquiposPlayoffs(ArrayList<Equipo> listaEquiposPlayoffs) {
	this.listaEquiposPlayoffs = listaEquiposPlayoffs;
}


}
