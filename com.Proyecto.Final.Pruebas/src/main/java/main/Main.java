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
import clases.Jugador;
import clases.Liga;
import clases.PartidoAllStar;
import clases.PartidoNormal;
import clases.Partidos;
import clases.Playoff;
import clases.RondaPlayoffs;
import exceptions.EquipoMalIntroduciodoException;
import exceptions.JugadorMalIntroduciodoException;
import pantallas.PantallaEscogerEquipoDatosFranquicia;
import pantallas.Ventana;
import utils.FuncionesUtiles;
import utils.UtilsDB;

public class Main {

	public static void main(String[] args) {

		try {
			FuncionesUtiles.borrarDatosTablas();
			FuncionesUtiles.declararObjetos();

			Ventana v = new Ventana();

		} catch (SQLException e) {
			// TODO Auto-generated catch block9
			e.printStackTrace();
		} catch (EquipoMalIntroduciodoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JugadorMalIntroduciodoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
