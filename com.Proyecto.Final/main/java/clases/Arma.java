package clases;

public class Arma {
	private String nombre;
	private byte puntosAtaque;
	
	public Arma(String n,byte pA) {
		this.nombre=n;
		this.setPuntosAtaque(pA);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	
	public void setPuntosAtaque(byte pA) {
		if(pA<5||pA>20) {
			System.out.println("Debiste ponerme entre 5 y 20. Te pongo 5. Arreglamos esto en el tema 7");
			this.puntosAtaque=5;
		}else {
			this.puntosAtaque=pA;
		}
	}
	
	public byte getPuntosAtaque() {
		return this.puntosAtaque;
	}
	
	public String toString() {
		return this.nombre+"(Ataque: "+this.puntosAtaque+")";
	}
	
}
