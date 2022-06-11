package superClases;

import java.time.LocalDateTime;

/**
 * Superclase que contiene los elementos básicos que tendrá un partido
 * 
 * @author jcorr
 *
 */
public class Partido {
	/* marcador del equipo local */
	private short marcadorLocal;
	/* marcador del equipo visitante */
	private short marcadorVisitante;
	/* fecha en la que se juega el partido */
	private LocalDateTime fecha;

	/**
	 * Constructor de Partido,sirve para poder tener herencias
	 * 
	 * @param marcadorLocal     marcador del equipo local
	 * @param marcadorVisitante marcador del equipo visitante
	 * @param fecha             fecha en la que se juega el partido
	 */
	public Partido(short marcadorLocal, short marcadorVisitante, LocalDateTime fecha) {
		super();
		this.marcadorLocal = marcadorLocal;
		this.marcadorVisitante = marcadorVisitante;
		this.fecha = fecha;
	}

	/**
	 * getter de marcadorLocal
	 * 
	 * @return marcador del equipo local
	 */
	public short getMarcadorLocal() {
		return marcadorLocal;
	}

	/**
	 * setter de marcadorLocal
	 * 
	 * @param marcadorLocal marcador del equipo local
	 */
	public void setMarcadorLocal(short marcadorLocal) {
		this.marcadorLocal = marcadorLocal;
	}

	/**
	 * getter de marcadorVisitante
	 * 
	 * @return marcador del equipo visitante
	 */
	public short getMarcadorVisitante() {
		return marcadorVisitante;
	}

	/**
	 * setter de marcadorVisitante
	 * 
	 * @param marcadorVisitante marcador del equipo visitante
	 */
	public void setMarcadorVisitante(short marcadorVisitante) {
		this.marcadorVisitante = marcadorVisitante;
	}

	/**
	 * getter de fecha
	 * 
	 * @return fecha en la que se juega el partido
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}

	/**
	 * setter de fecha
	 * 
	 * @param fecha fecha en la que se juega el partido
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
