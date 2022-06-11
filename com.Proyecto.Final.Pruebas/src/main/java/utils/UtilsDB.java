package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que se usa para establecer conexiones con la bbdd
 * 
 * @author jcorr
 *
 */
public class UtilsDB {
	/* cadena que se usa como ruta de la base de datos */
	private static final String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/trabajoFinal";
	/* cadena que se usa como usuario de la base de datos */
	private static final String usuarioBBDD = "root";
	/* cadena que se usa como contraseña de la base de datos */
	private static final String contrasenha = "ContrasenaWorkb3nch";
	/* cadena que se usa como conector de la base de datos */
	private static Connection conexion;

	/**
	 * Función que establece la conexión con bbdd
	 * 
	 * @return devuelve la conexión con la bbdd
	 */
	public static Statement conectarBBDD() {

		try {
			if (conexion == null) {
				conexion = DriverManager.getConnection(cadenaConexion, usuarioBBDD, contrasenha);

			}
			return conexion.createStatement();

		} catch (SQLException e) {

			System.err.println("No se ha podido conectar,inténtalo luego");
			return null;
		}

	}

	/**
	 * Función que cierra la conexión con la base de datos
	 */
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
