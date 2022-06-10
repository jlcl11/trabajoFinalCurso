package exceptions;

/**
 * Clase que representa una excepción que se lanza cuando un estadio tiene una
 * capacidad que no está entre los valores posibles
 * 
 * @author jcorr
 *
 */
public class CapacidadImposibleException extends Exception {

	public CapacidadImposibleException(String msg) {
		super(msg);
	}

}
