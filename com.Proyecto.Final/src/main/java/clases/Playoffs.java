package clases;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import exceptions.EquipoMalIntroduciodoException;
import exceptions.EquipoSinDorsalesRetiradosException;
import exceptions.PartidoAllStarMalHechoException;
import exceptions.PlayoffsMalIntroducidoException;
import superClases.Equipo;
import superClases.ObjetoConNombre;
import utlis.funcionesUtiles;
import utlis.utilsDB;

public class Playoffs extends ObjetoConNombre {

	private ArrayList<Equipo> listaEquiposPlayoffs;

	public Playoffs(String nombre, ArrayList<Equipo> listaEquiposPlayoffs) throws SQLException, EquipoSinDorsalesRetiradosException, PlayoffsMalIntroducidoException, EquipoMalIntroduciodoException {
		super(nombre);

		Statement query = utilsDB.conectarBBDD();

		if (query.executeUpdate(
				"INSERT INTO playoffs(listaequipos,lista_rondas) VALUES ('"+nombre+"',"+funcionesUtiles.devolverTodosLosEquipos()+");") > 0) {

			this.listaEquiposPlayoffs = listaEquiposPlayoffs;
		} else {
			throw new PlayoffsMalIntroducidoException("El equipo del All Star se ha introducido de manera incorrecta");
		}
		utilsDB.desconectarBBDD();
	}

	public ArrayList<Equipo> getListaEquiposPlayoffs() {
		return listaEquiposPlayoffs;
	}

	public void setListaEquiposPlayoffs(ArrayList<Equipo> listaEquiposPlayoffs) {
		this.listaEquiposPlayoffs = listaEquiposPlayoffs;
	}

}
