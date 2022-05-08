package clases;

import java.util.Random;

public class Combate {
	private Personaje participante1;
	private Personaje participante2;
	private Personaje ganador;
	
	public Combate(Personaje participante1, Personaje participante2) {
		super();
		this.participante1 = participante1;
		this.participante2 = participante2;
		this.ganador=null;
	}

	public Personaje getParticipante1() {
		return participante1;
	}

	public void setParticipante1(Personaje participante1) {
		this.participante1 = participante1;
	}

	public Personaje getParticipante2() {
		return participante2;
	}

	public void setParticipante2(Personaje participante2) {
		this.participante2 = participante2;
	}

	public Personaje getGanador() {
		return ganador;
	}

	public void setGanador(Personaje ganador) {
		this.ganador = ganador;
	}
	
	public void combatir() {

		System.out.println(this.participante1);
		System.out.println("\nVs\n\n");
		System.out.println(this.participante2+"\n");
		Random r=new Random();
		Personaje[] luchadores= {this.participante1,this.participante2};
		//Se sortea al primer combatiente
		byte leTocaA=(byte)r.nextInt(luchadores.length);
		//Mientras que los dos estén vivos
		while(this.participante1.getVida()>0&&
				this.participante2.getVida()>0) {
			//se hace y recibe el ataque
			byte puntosAtaque=luchadores[leTocaA].atacar();
			luchadores[(1+leTocaA)%2].recibirAtaque(puntosAtaque);
			
			//se cambia a que le toque primero al contrario
			leTocaA=(byte)((1+leTocaA)%2);
			System.out.println();
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(this.participante1.getVida()>0) {
			this.ganador=participante1;
			System.out.println(participante1.getNombre()+" ha ganado!");
		}else {
			this.ganador=this.participante2;
			System.out.println(participante2.getNombre()+" ha ganado!");
		}
		
	}
	
	
	
	
}
