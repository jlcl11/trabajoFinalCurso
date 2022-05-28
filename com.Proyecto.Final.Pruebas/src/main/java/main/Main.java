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
	
			String nombre="Hawks";
			for(int i=0;i<funcionesUtiles.getJugadoresReitrados(nombre).size();i++) {
				System.out.println(funcionesUtiles.getJugadoresReitrados(nombre).get(i));
			}
		//	Ventana v = new Ventana();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EquipoMalIntroduciodoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
