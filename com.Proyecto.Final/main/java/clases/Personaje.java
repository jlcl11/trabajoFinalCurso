package clases;

import java.util.Random;

public class Personaje {
	private String nombre;
	private byte vida;
	private Arma arma;
	private Proteccion proteccion;
	
	/**
	 * Constructor con todos los argumentos de Personaje
	 * @param n nombre que se le pondrÃ±
	 * @param v vida inicial
	 * @param a arma inicial
	 * @param p proteccion inicial
	 */
	public Personaje(String n,byte v,Arma a,Proteccion p) {
		this.setNombre(n);
		this.setVida(v);
		this.arma=a;
		this.proteccion=p;
	}
	
	public Personaje(String n,Arma a,Proteccion p) {
		this.setNombre(n);
		this.vida=100;
		this.arma=a;
		this.proteccion=p;
	}
	
	public void setProteccion(Proteccion p) {
		this.proteccion=p;
	}
	
	public void setArma(Arma a) {
		this.arma=a;
	}
	
	public void setVida(byte v) {
		if(v<0||v>100) {
			System.out.println("Rango de vida no valido. Mejoramos esto en el tema 7");
		}else {
			this.vida=v;
		}
	}
	
	public void setNombre(String n) {
		if(n.contains("0")||n.contains("1")||n.contains("2")||
			n.contains("3")||n.contains("4")||n.contains("5")||
			n.contains("6")||n.contains("7")||n.contains("8")||
			n.contains("9")) {
			System.out.println("Nombre no establecido porque tiene numeros. Mejoramos esto en el tema 7");
		}else {
			this.nombre=n;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public byte getVida() {
		return this.vida;
	}
	
	public Arma getArma() {
		return this.arma;
	}
	
	public Proteccion getProteccion() {
		return this.proteccion;
	}
	
	public String toString() {
		String ret=this.nombre+" ("+this.vida+")"+(this.arma==null?"\n\tDesarmado":"\n\tArma : "+this.arma);
				if(this.proteccion==null) {
					ret+="\n\tDesprotegido";
				}else {
					ret+="\n\tProteccion: "+this.proteccion;
				}
		
		return ret;
	}
	
	public byte atacar() {
		Random r=new Random();
		byte puntosDaño=(byte)r.nextInt(this.getArma().getPuntosAtaque());
		System.out.println(this.nombre+" ("+this.vida+")"+" ataca con su "+
		this.getArma().getNombre()+" y hace "+puntosDaño+" puntos de daï¿½o");
		return puntosDaño;
	}
	
	public void recibirAtaque(byte puntosAtaqueRecibidos) {
		Random r=new Random();
		byte defensaUsada=
				(byte)r.nextInt(this.getProteccion().getPuntosDefensa());
		System.out.print(this.nombre+" ("+this.vida+")"+" recibe un ataque de "
				+puntosAtaqueRecibidos+" puntos, usa su "+this.proteccion.getNombre()+
				" para defenserse, y ");
		if(puntosAtaqueRecibidos>defensaUsada) {
			System.out.println("recibe "+(puntosAtaqueRecibidos-defensaUsada)+
					" puntos de daï¿½o");
			this.vida-=puntosAtaqueRecibidos-defensaUsada;
		}else {
			System.out.println("no recibe daï¿½o");
		}
	}
	
}
