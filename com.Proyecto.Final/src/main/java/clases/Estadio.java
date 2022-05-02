package clases;

import superClases.Equipo;
import superClases.ObjetoConNombre;

public class Estadio extends ObjetoConNombre {

	private short capacidad;

	public Estadio(String nombre, short capacidad) {
		super(nombre);
		this.capacidad = capacidad;

	}

	public short getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(short capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "El " + getNombre() + " tiene una capacidad de " + capacidad + " personas";
	}

}
