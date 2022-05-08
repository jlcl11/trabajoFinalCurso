package clases;

import java.util.ArrayList;

public class Torneo {
	private ArrayList<Ronda> rondas;
	private ArrayList<Personaje> participantesIniciales;
	
	public Torneo(ArrayList<Personaje> partInic) {
		super();
		this.participantesIniciales=partInic;
		rondas=new ArrayList<Ronda>();
		Ronda dieciseisavos=new Ronda("1/16 final");
		dieciseisavos.crearEmparejamientos(partInic);
		this.rondas.add(dieciseisavos);
	}
	
	public void combatir() {
		//Mientras la última ronda tenga más de un combate
		while(this.rondas.get(this.rondas.size()-1).getCombates().size()>1) {
			//Primero que se peleen en esta ronda
			Ronda actual=this.rondas.get(this.rondas.size()-1);
			actual.combatir();
			
			//Cuando se han peleado, cojo a los ganadores
			ArrayList<Personaje> ganadoresRActual=new ArrayList<Personaje>();
			for(byte i=0;i<actual.getCombates().size();i++) {
				ganadoresRActual.add(actual.getCombates().get(i).getGanador());
				//actual.getCombates().get(i).getGanador().setVida((byte)100);
			}
			
			Ronda proxima=new Ronda("Ronda X");
			proxima.crearEmparejamientos(ganadoresRActual);
			this.rondas.add(proxima);
		}
		//Cuando el while salga, solo queda por luchar la final
		System.out.println("__--------------GRAN FINAL-------------__");
		this.rondas.get(this.rondas.size()-1).getCombates().get(0).combatir();
		
	}
	
	

	public ArrayList<Ronda> getRondas() {
		return rondas;
	}

	public void setRondas(ArrayList<Ronda> rondas) {
		this.rondas = rondas;
	}

	public ArrayList<Personaje> getParticipantesIniciales() {
		return participantesIniciales;
	}

	public void setParticipantesIniciales(ArrayList<Personaje> participantesIniciales) {
		this.participantesIniciales = participantesIniciales;
	}
	
	
	
	
}
