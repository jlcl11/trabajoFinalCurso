package exceptions;

/**
 * Clase cuya instancia lanza una excepci�n cuando falla el constructor de
 * equipo
 * 
 * @author jcorr
 *
 */
public class EquipoMalIntroduciodoException extends Exception {

	public EquipoMalIntroduciodoException(String msg) {
		super(msg);
	}
}
