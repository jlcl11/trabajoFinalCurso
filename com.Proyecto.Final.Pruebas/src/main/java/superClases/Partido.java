package superClases;

import java.time.LocalDateTime;

public class Partido {

	private short marcadorLocal;
	private short marcadorVisitante;
	private LocalDateTime fecha;

	public Partido(short marcadorLocal, short marcadorVisitante, LocalDateTime fecha) {
		super();
		this.marcadorLocal = marcadorLocal;
		this.marcadorVisitante = marcadorVisitante;
		this.fecha = fecha;
	}

}
