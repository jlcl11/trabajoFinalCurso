package clases;

import java.util.ArrayList;
import java.util.Random;

public class Ronda {
	private ArrayList<Combate> combates;
	private String nombre;
	
	
	public Ronda(String nombre) {
		super();
		this.nombre = nombre;
		combates=new ArrayList<Combate>();
	}
	
	public void crearEmparejamientos(ArrayList<Personaje> posibles) {
		Random r=new Random();
		while (!posibles.isEmpty()) {
			Personaje p1 = posibles.get(r.nextInt(posibles.size()));
			posibles.remove(p1);
			Personaje p2 = posibles.get(r.nextInt(posibles.size()));
			posibles.remove(p2);
			this.combates.add(new Combate(p1, p2));
		}
		
	}
	
	public void combatir() {
		//Poner a combatir todos los combates de la ronda
		for(byte i=0;i<this.combates.size();i++) {
			System.out.println(this.nombre+" | Combate "+(i+1)+"/"+this.combates.size());
			this.combates.get(i).combatir();
		}
	}

	public ArrayList<Combate> getCombates() {
		return combates;
	}


	public void setCombates(ArrayList<Combate> combates) {
		this.combates = combates;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
