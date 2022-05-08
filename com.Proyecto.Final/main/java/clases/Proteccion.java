package clases;

public class Proteccion {
	private String nombre;
	private byte puntosDefensa;
	
	public Proteccion(String nombre, byte puntosDefensa) {
		super();
		this.nombre = nombre;
		this.puntosDefensa = puntosDefensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(byte puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	@Override
	public String toString() {
		return this.nombre+" (Defensa: "+this.puntosDefensa+")";
	}
	
	
	
	
}
