package clases;

import java.sql.SQLException;
import java.util.ArrayList;

import exceptions.EquipoMalIntroduciodoException;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.Equipo;
import superClases.Jugador;

public class EquipoNormal extends Equipo {

	private ArrayList<JugadorNormal> plantilla;

	public EquipoNormal(String nombre, short equipoID, Conferencia conferencia, String ciudadLocal,
			String dorsalesRetirados, String propietario, String gM, float limiteSalarial, Estadio estadio,
			ArrayList<JugadorNormal> plantilla)
			throws EquipoMalIntroduciodoException, SQLException, EquipoSinDorsalesRetiradosException {
		super(nombre, equipoID, conferencia, ciudadLocal, dorsalesRetirados, propietario, gM, limiteSalarial, estadio);
		this.plantilla = plantilla;
	}

	public EquipoNormal(String nombre, short equipoID, Conferencia conferencia, String ciudadLocal,
			String dorsalesRetirados, String propietario, String gM, float limiteSalarial, Estadio estadio)
			throws EquipoMalIntroduciodoException, SQLException, EquipoSinDorsalesRetiradosException {
		super(nombre, equipoID, conferencia, ciudadLocal, dorsalesRetirados, propietario, gM, limiteSalarial, estadio);
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
