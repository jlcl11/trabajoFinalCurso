package utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class utilsDB {

	// TODO Hacer un gestor de conexiones aqui

	private static final String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/trabajoFinal";

	private static final String usuarioBBDD = "root";

	private static final String contrasenha = "ContrasenaWorkb3nch";

	private static Connection conexion;

	public static Statement conectarBBDD() {

		try {
			if (conexion == null) {
				conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/trabajoFinal", "root",
						"ContrasenaWorkb3nch");

			}
			return conexion.createStatement();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.err.println("No se ha podido conectar,inténtalo luego");
			return null;
		}

	}

	public static void desconectarBBDD() {
		if (conexion != null) {
			try {
				conexion.close();
				conexion = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("No se ha podido desconectar");
			}
		}
	}

}
