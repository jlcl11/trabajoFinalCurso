package exceptions;

/**
 * Clase cuya instancia lanza una excepci�n cuando se quiere proteger un setter
 * y no se quiere hacer una cantidad muy grande de excepciones en un equipo
 * 
 * @author jcorr
 *
 */
public class SetterJugadorNoFuncionaAsiException extends Exception {
	public SetterJugadorNoFuncionaAsiException(String msg) {
		super(msg);
	}
}
