package cenec.survival;

import java.util.ArrayList;
import java.util.Random;

import clases.Arma;
import clases.Combate;
import clases.Personaje;
import clases.Proteccion;
import clases.Ronda;
import clases.Torneo;

public class Juego {

	public static void main(String[] args) {
		ArrayList<Arma> armasPosibles = new ArrayList<Arma>();
		armasPosibles.add(new Arma("MataCarpinchos", (byte) 15));
		armasPosibles.add(new Arma("Cuchara de Palo", (byte) 20));
		armasPosibles.add(new Arma("Espada Maestra", (byte) 15));
		armasPosibles.add(new Arma("Botijo nuclear", (byte) 17));
		armasPosibles.add(new Arma("Palillo de oido", (byte) 20));
		armasPosibles.add(new Arma("Chusta de canuto", (byte) 15));
		armasPosibles.add(new Arma("Zapatilla voladora", (byte) 20));
		armasPosibles.add(new Arma("Alpargata", (byte) 20));
		armasPosibles.add(new Arma("teclado custom", (byte) 13));
		armasPosibles.add(new Arma("Machetón", (byte) 15));
		armasPosibles.add(new Arma("Silla de Echenique", (byte) 13));
		armasPosibles.add(new Arma("Ray Gun m2", (byte) 20));
		armasPosibles.add(new Arma("Impuestos", (byte) 20));
		armasPosibles.add(new Arma("FlechaLanzaArcos", (byte) 14));
		armasPosibles.add(new Arma("Boli", (byte) 14));
		armasPosibles.add(new Arma("Frostmure", (byte) 14));
		armasPosibles.add(new Arma("Biblia", (byte) 13));
		armasPosibles.add(new Arma("Mechero de la Sole", (byte) 14));
		armasPosibles.add(new Arma("Miguel careta caballo", (byte) 20));
		armasPosibles.add(new Arma("bebe volador", (byte) 15));
		armasPosibles.add(new Arma("Chancla de madre", (byte) 14));
		armasPosibles.add(new Arma("Martillo de TORBE", (byte) 14));
		armasPosibles.add(new Arma("palo radiactivo", (byte) 15));
		armasPosibles.add(new Arma("Golem de Willyrex", (byte) 15));
		armasPosibles.add(new Arma("Maldición Gitana", (byte) 17));
		armasPosibles.add(new Arma("El mensajero del mensajero", (byte) 20));
		armasPosibles.add(new Arma("Espada Maestra", (byte) 20));
		armasPosibles.add(new Arma("AK-47",(byte)18));
		armasPosibles.add(new Arma("Pollo de goma",(byte)6));
		armasPosibles.add(new Arma("Monster de energia",(byte)12));
		armasPosibles.add(new Arma("Astilla",(byte)5));
		armasPosibles.add(new Arma("Barra de pan congelada",(byte)7));
		System.out.println("Tenemos " + armasPosibles.size() + " armas disponibles.");

		ArrayList<Proteccion> proteccionesPosibles = new ArrayList<Proteccion>();
		proteccionesPosibles.add(new Proteccion("Carpincho", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Pato de Goma", (byte) 5));
		proteccionesPosibles.add(new Proteccion("Escudo Hyliano", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Careta de Pedro Sanchez", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Escudo de papel", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Silla de plastico", (byte) 5));
		proteccionesPosibles.add(new Proteccion("Sustituto", (byte) 10));
		proteccionesPosibles.add(new Proteccion("Refrigeracion liquida", (byte) 7));
		proteccionesPosibles.add(new Proteccion("Ser furry", (byte) 13));
		proteccionesPosibles.add(new Proteccion("La asistencia de Marcos", (byte) 17));
		proteccionesPosibles.add(new Proteccion("Esclava de la Virgen Maria", (byte) 16));
		proteccionesPosibles.add(new Proteccion("Jose Carlos", (byte) 12));
		proteccionesPosibles.add(new Proteccion("Hacienda", (byte) 20));
		proteccionesPosibles.add(new Proteccion("escudo de papel mojado", (byte) 15));
		proteccionesPosibles.add(new Proteccion("Toison de oro", (byte) 15));
		proteccionesPosibles.add(new Proteccion("Jesuscristo", (byte) 16));
		proteccionesPosibles.add(new Proteccion("No mirar", (byte) 15));
		proteccionesPosibles.add(new Proteccion("Cigala fumando", (byte) 16));
		proteccionesPosibles.add(new Proteccion("Mi suegra", (byte) 15));
		proteccionesPosibles.add(new Proteccion("Caja de Donuts", (byte) 15));
		proteccionesPosibles.add(new Proteccion("Seta gigante ", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Mayichi gitana ", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Ojo de Horus", (byte) 20));
		proteccionesPosibles.add(new Proteccion("El apocolipsis", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Litro vacia", (byte) 17));
		proteccionesPosibles.add(new Proteccion("Gafas", (byte) 1));
		proteccionesPosibles.add(new Proteccion("Abrazo gratis",(byte)5));
		proteccionesPosibles.add(new Proteccion("Estampita del betis",(byte)8));
		proteccionesPosibles.add(new Proteccion("Oros del Bryan",(byte)11));
		proteccionesPosibles.add(new Proteccion("Amor de Hezucrito",(byte)20));
		proteccionesPosibles.add(new Proteccion("Estampita del fari chupando limones",(byte)15));
		proteccionesPosibles.add(new Proteccion("Chupete",(byte)5));
		System.out.println("Tenemos " + proteccionesPosibles.size() + " protecciones posibles");

		Random r = new Random();
		String[] nombresPersonajes = { "Marcos", "David", "JoseLui", "Alex L", "Abel R", "AleAsencio", "Cristian",
				"Gonzalo", "Guille", "Antonio", "Juanjo", "Juanmi", "Eric", "Leti", "Miguel Páramos", "AleB", "Joaquin",
				"Alexis", "Juan", "Jero", "PepeB", "Agustin", "Ignacio", "Jenaro","Alvaro","Jose","Hugo","Sandra","Natalia","Luisa","Irene B","Angel" };

		//Creamos a todos los personajes
		ArrayList<Personaje> personajesPosibles = new ArrayList<Personaje>();
		System.out.println("Van a luchar " + nombresPersonajes.length + " Personajes");
		for (byte i = 0; i < nombresPersonajes.length; i++) {
			personajesPosibles
					.add(new Personaje(nombresPersonajes[i], armasPosibles.get(r.nextInt(armasPosibles.size())),
							proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size()))));
			armasPosibles.remove(personajesPosibles.get(personajesPosibles.size() - 1).getArma());
			proteccionesPosibles.remove(personajesPosibles.get(personajesPosibles.size() - 1).getProteccion());
		}

		Torneo torneo=new Torneo(personajesPosibles);
		torneo.combatir();

	}

}
