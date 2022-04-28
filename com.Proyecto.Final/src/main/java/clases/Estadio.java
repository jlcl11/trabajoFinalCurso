package clases;

import superClases.Equipo;
import superClases.ObjetoConNombre;

public class Estadio extends ObjetoConNombre {

	private short capacidad;
	private Equipo equipo;

	public Estadio(String nombre, short capacidad, Equipo equipo) {
		super(nombre);
		this.capacidad = capacidad;
		this.equipo = equipo;
	}

	public short getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(short capacidad) {
		this.capacidad = capacidad;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
