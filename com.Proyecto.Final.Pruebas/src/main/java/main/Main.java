package main;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import clases.Conferencia;
import clases.Equipo;
import clases.Estadio;
import clases.Liga;
import clases.PartidoAllStar;
import clases.PartidoNormal;
import clases.Partidos;
import clases.Playoff;
import clases.RondaPlayoffs;
import exceptions.EquipoMalIntroduciodoException;
import pantallas.PantallaEscogerEquipoDatosFranquicia;
import pantallas.Ventana;
import superClases.Jugador;
import utils.funcionesUtiles;
import utils.utilsDB;

public class Main {

	public static void main(String[] args) {

		try {
			funcionesUtiles.borrarDatosTablas();
			funcionesUtiles.declararObjetos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EquipoMalIntroduciodoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(funcionesUtiles.devolverMVP().getNombre() + " " + funcionesUtiles.devolverMVP().getApellido()
				+ " ha anotado " + funcionesUtiles.devolverMVP().getPPG() + " puntos por partido,ha repartido "
				+ funcionesUtiles.devolverMVP().getAPG() + " asistencias por partido,ha recogido "
				+ funcionesUtiles.devolverMVP().getRBG() + " rebotes por partido,ha robado "
				+ funcionesUtiles.devolverMVP().getSPG() + " y ha taponado " + funcionesUtiles.devolverMVP().getBPG()
				+ " balones por partido");
		System.out
				.println(funcionesUtiles.devolverDPOY().getNombre() + " " + funcionesUtiles.devolverDPOY().getApellido()
						+ " ha anotado " + funcionesUtiles.devolverDPOY().getRBG() + " rebotes por partido,ha robado "
						+ funcionesUtiles.devolverDPOY().getSPG() + " balones por partido y ha taponado "
						+ funcionesUtiles.devolverDPOY().getBPG() + " balones por partido");
		System.out.println(funcionesUtiles.devolverPremioAnotador().getNombre() + " "
				+ funcionesUtiles.devolverPremioAnotador().getApellido() + " ha anotado "
				+ funcionesUtiles.devolverPremioAnotador().getPPG() + " puntos por partido");

		System.out.println(
				funcionesUtiles.getAllStarMVP().getNombre() + " " + funcionesUtiles.getAllStarMVP().getApellido());
		System.out.println("Titulares All Star :\n");
		for (byte i = 0; i < funcionesUtiles.getTitularesAllStar().size(); i++) {
			System.out.println(funcionesUtiles.getTitularesAllStar().get(i).getNombre() + " "
					+ funcionesUtiles.getTitularesAllStar().get(i).getApellido() + "\n");
		}
		System.out.println("Los jugadores del equipo 1 son \n");

		for (byte i = 0; i < funcionesUtiles.getJugadoresEquipo1().size(); i++) {
			System.out.println(funcionesUtiles.getJugadoresEquipo1().get(i).getNombre() + " "
					+ funcionesUtiles.getJugadoresEquipo1().get(i).getApellido()+"\n");
		}

		System.out.println("Los jugadores del equipo 2 son \n");

		for (byte i = 0; i < funcionesUtiles.getJugadoresEquipo2().size(); i++) {
			System.out.println(funcionesUtiles.getJugadoresEquipo2().get(i).getNombre() + " "
					+ funcionesUtiles.getJugadoresEquipo2().get(i).getApellido()+"\n");
		}

		try {
			funcionesUtiles.imprimeTicket();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 try {
			Ventana v = new Ventana();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
