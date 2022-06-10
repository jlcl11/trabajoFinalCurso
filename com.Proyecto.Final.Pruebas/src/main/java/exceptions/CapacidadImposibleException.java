package exceptions;

/**
 * Clase que representa una excepci�n que se lanza cuando un estadio tiene una
 * capacidad que no est� entre los valores posibles
 * 
 * @author jcorr
 *
 */
public class CapacidadImposibleException extends Exception {

	public CapacidadImposibleException(String msg) {
		super(msg);
	}

}
