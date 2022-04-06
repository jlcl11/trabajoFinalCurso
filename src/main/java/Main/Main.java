package Main;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import utils.utilsDB;

public class Main {

	public static void main(String[] args) {

		Statement query = utilsDB.conectarBBDD();

		try {
			if (query.executeUpdate(
					"INSERT INTO jugador(jugador_id,nombre,apellido,dorsal,apodo,posicion,salario,mVP,anillos,nominacionesAllStar,\r\n"
							+ "defensorDelAnho,mVPAllStar,finalsMVP,puntosPorPartido,asistenciasPorPartido,rebotesPorPartido,robosPorPartido,\r\n"
							+ "taponesPorPartido,minutosPorPartido,premioAnotador) VALUES (89,'Prueba','Inserto',78,'ejemplo','Alero',41,4,4,18,0,3,4,30.1,6.3,8.2,1.3,1.1,37.2,1);") > 0) {
				System.out.println("Jugador introducido correctamente");
			}

		} catch (SQLIntegrityConstraintViolationException e) {

			System.err.println("Ese usuario ya existe,coge otro avaricioso");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
