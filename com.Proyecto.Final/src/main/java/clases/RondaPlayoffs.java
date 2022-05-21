package clases;

import java.sql.SQLException;
import java.util.ArrayList;

import exceptions.EquipoMalIntroduciodoException;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.ObjetoConNombre;
import superClases.Partido;
import utlis.funcionesUtiles;

public class RondaPlayoffs extends ObjetoConNombre {

	private ArrayList<PartidoNormal> partido;

	public RondaPlayoffs(String nombre, ArrayList<PartidoNormal> partido) {
		super(nombre);
		this.partido = partido;
	}

	public ArrayList<PartidoNormal> getPartido() {
		return partido;
	}

	public void setPartido(ArrayList<PartidoNormal> partido) {
		this.partido = partido;
	}

	RondaPlayoffs primero = new RondaPlayoffs("Primera ronda", partido);
	RondaPlayoffs semis = new RondaPlayoffs("Semifinales de conferencia", partido);
	RondaPlayoffs confFinals = new RondaPlayoffs("Finales de conferencia", partido);
	RondaPlayoffs finals = new RondaPlayoffs("Finales NBA", partido);

	public static void pillarEquipos(ArrayList<EquipoNormal> w) throws EquipoSinDorsalesRetiradosException, EquipoMalIntroduciodoException, SQLException {

		w = funcionesUtiles.devolverTodosLosEquipos();

		int marcador1 = 0;
		int marcador2 = 0;
		for (byte i = 0; i < funcionesUtiles.escogerEquipo(0).getPlantilla().size(); i++) {
			marcador1 = (short) funcionesUtiles.escogerEquipo(0).getPlantilla().get(i).getPPG() + marcador1;
			marcador2 = (short) funcionesUtiles.escogerEquipo(0).getPlantilla().get(i).getPPG() + marcador1;
			PartidoNormal game1 = new PartidoNormal((short) marcador1, (short) marcador2, null,
					funcionesUtiles.escogerEquipo(0), funcionesUtiles.escogerEquipo(0),
					funcionesUtiles.escogerEquipo(0).getPlantilla(), funcionesUtiles.escogerEquipo(0).getPlantilla());
		}

	}

}
