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

public short getMarcadorLocal() {
	return marcadorLocal;
}

public void setMarcadorLocal(short marcadorLocal) {
	this.marcadorLocal = marcadorLocal;
}

public short getMarcadorVisitante() {
	return marcadorVisitante;
}

public void setMarcadorVisitante(short marcadorVisitante) {
	this.marcadorVisitante = marcadorVisitante;
}

public LocalDateTime getFecha() {
	return fecha;
}

public void setFecha(LocalDateTime fecha) {
	this.fecha = fecha;
}




}
