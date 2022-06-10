package exceptions;

/**
 * Clase cuya instancia lanza una excepci�n cuando falla el constructor de
 * jugador
 * 
 * @author jcorr
 *
 */
public class JugadorMalIntroduciodoException extends Exception {

	public JugadorMalIntroduciodoException(String msg) {
		super(msg);
	}
}
