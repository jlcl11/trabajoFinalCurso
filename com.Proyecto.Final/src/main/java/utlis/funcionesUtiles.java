package utlis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


import clases.Conferencia;
import clases.EquipoNormal;
import clases.Estadio;
import clases.JugadorAllStar;
import clases.JugadorNormal;
import enums.Posicion;
import enums.Valores;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.Equipo;
import superClases.Jugador;

public class funcionesUtiles {

	public static ArrayList<JugadorNormal> getJugadoresAllStar() {
		ArrayList<JugadorNormal> jugadores = funcionesUtiles.getTodosLosJugadoresNBA();

		Collections.sort(jugadores, new Comparator<JugadorNormal>() {

			public int compare(JugadorNormal o1, JugadorNormal o2) {

				if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) > (o2.getPPG() + o2.getAPG()
						+ o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return 1;
				} else if ((o1.getPPG() + o1.getAPG() + o1.getBPG() + o1.getSPG() + o1.getBPG()) < (o2.getPPG()
						+ o2.getAPG() + o2.getBPG() + o2.getSPG() + o2.getBPG())) {
					return -1;
				} else {
					return 0;
				}

			}

		});

		ArrayList<JugadorNormal> allStars=new ArrayList<JugadorNormal>();
		
		for (short i = 0; i < jugadores.size(); i++) {
			if (i >= 130) {
				allStars.add(jugadores.get(i));
			}
		}

		return allStars;
	}

	public static EquipoNormal escogerEquipo(int opcion) throws EquipoSinDorsalesRetiradosException {

		Conferencia este = new Conferencia("este", null);
		Conferencia oeste = new Conferencia("oeste", null);

		if (opcion == 1) {
			Estadio stateFarmArena = new Estadio("State Farm Arena", (short) 16600);
			EquipoNormal hawks = new EquipoNormal("Hawks", este, "Atlanta", null, "Anthony Ressler", "Travis Schlenk",
					109.1f, stateFarmArena);
			hawks.setPlantilla(funcionesUtiles.getPlantilla(hawks.getNombre()));
			hawks.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(hawks.getNombre()));
			return hawks;
		}
		if (opcion == 2) {
			Estadio tdGarden = new Estadio("TD Garden", (short) 18624);
			EquipoNormal celtics = new EquipoNormal("Celtics", este, "Boston", null, "Boston basketball partners",
					"Brad Stevens", 109.1f, tdGarden);
			celtics.setPlantilla(funcionesUtiles.getPlantilla(celtics.getNombre()));
			celtics.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(celtics.getNombre()));
			return celtics;
		}
		if (opcion == 3) {
			Estadio barclaysCenter = new Estadio("Barclays Center", (short) 17732);
			EquipoNormal nets = new EquipoNormal("Nets", este, "Brooklyn", null, "Joseph Tsai", "Sean marks", 109.1f,
					barclaysCenter);
			nets.setPlantilla(funcionesUtiles.getPlantilla(nets.getNombre()));
			nets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(nets.getNombre()));
			return nets;
		}
		if (opcion == 4) {
			Estadio spectrumCenter = new Estadio("Spectrum center", (short) 19077);
			EquipoNormal hornets = new EquipoNormal("Hornets", este, "Charlotte", null, "Michael Jordan",
					"Mitch Kupchak", 109.1f, spectrumCenter);
			hornets.setPlantilla(funcionesUtiles.getPlantilla(hornets.getNombre()));
			hornets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(hornets.getNombre()));
			return hornets;
		}
		if (opcion == 5) {
			Estadio unitedCenter = new Estadio("United center", (short) 20917);
			EquipoNormal bulls = new EquipoNormal("Bulls", este, "Chicago", null, "Jerry Reinsdorf", "Marc Eversley",
					109.1f, unitedCenter);
			bulls.setPlantilla(funcionesUtiles.getPlantilla(bulls.getNombre()));
			bulls.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(bulls.getNombre()));
			return bulls;
		}
		if (opcion == 6) {
			Estadio rocketMortageFieldHouse = new Estadio("Rocket Mortgage FieldHouse", (short) 19432);
			EquipoNormal cavs = new EquipoNormal("Cavaliers", este, "Cleveland", null, "Dan Gilbert", "Mike Gansey",
					109.1f, rocketMortageFieldHouse);
			cavs.setPlantilla(funcionesUtiles.getPlantilla(cavs.getNombre()));
			cavs.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(cavs.getNombre()));
			return cavs;
		}
		if (opcion == 7) {
			Estadio littkeCaesarsArena = new Estadio("Little Caesar Arena", (short) 20332);
			EquipoNormal pistons = new EquipoNormal("Pistons", este, "Detroit", null, "Tom Gores", "Troy Weaver",
					109.1f, littkeCaesarsArena);
			pistons.setPlantilla(funcionesUtiles.getPlantilla(pistons.getNombre()));
			pistons.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(pistons.getNombre()));
			return pistons;
		}
		if (opcion == 8) {
			Estadio bankersLifeFieldHouse = new Estadio("Bankers Life FieldHouse", (short) 17923);
			EquipoNormal pacers = new EquipoNormal("Pacers", este, "Indiana", null, "Herbert Simon", "Chad Buchanan",
					109.1f, bankersLifeFieldHouse);
			pacers.setPlantilla(funcionesUtiles.getPlantilla(pacers.getNombre()));
			pacers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(pacers.getNombre()));
			return pacers;
		}
		if (opcion == 9) {
			Estadio ftxArena = new Estadio("FTX Arena", (short) 19600);
			EquipoNormal heat = new EquipoNormal("Heat", este, "Miami", null, "Micky Arison", "Andy Elisburg", 109.1f,
					ftxArena);
			heat.setPlantilla(funcionesUtiles.getPlantilla(heat.getNombre()));
			heat.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(heat.getNombre()));
			return heat;
		}
		if (opcion == 10) {
			Estadio fiservForum = new Estadio("Fiserv Forum", (short) 17341);
			EquipoNormal bucks = new EquipoNormal("Bucks", este, "Milwaukee", null, "Los hermanos Edens", "Jon Horst",
					109.1f, fiservForum);
			bucks.setPlantilla(funcionesUtiles.getPlantilla(bucks.getNombre()));
			bucks.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(bucks.getNombre()));
			return bucks;
		}
		if (opcion == 11) {
			Estadio madisonSquareGarde = new Estadio("Madison Square Garden", (short) 19812);
			EquipoNormal knicks = new EquipoNormal("Knicks", este, "New York", null, "James L Dolan", "Scott Perry",
					109.1f, madisonSquareGarde);
			knicks.setPlantilla(funcionesUtiles.getPlantilla(knicks.getNombre()));
			knicks.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(knicks.getNombre()));
			return knicks;
		}
		if (opcion == 12) {
			Estadio amwayCenter = new Estadio("Amway Center", (short) 18846);
			EquipoNormal magic = new EquipoNormal("Magic", este, "Orlando", null, "Richard DeVos", "John Hammond",
					109.1f, amwayCenter);
			magic.setPlantilla(funcionesUtiles.getPlantilla(magic.getNombre()));
			magic.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(magic.getNombre()));
			return magic;
		}
		if (opcion == 13) {
			Estadio wellsFargoCenter = new Estadio("Wells Fargo Center", (short) 20478);
			EquipoNormal sixers = new EquipoNormal("76ers", este, "Philladelphia", null, "Josh Harris", "Elton Brand",
					109.1f, wellsFargoCenter);
			sixers.setPlantilla(funcionesUtiles.getPlantilla(sixers.getNombre()));
			sixers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(sixers.getNombre()));
			return sixers;
		}
		if (opcion == 14) {
			Estadio scotiaBankArena = new Estadio("Scotia Bank Arena", (short) 19800);
			EquipoNormal raptors = new EquipoNormal("Raptors", este, "Toronto", null,
					"Maple Leaf Sports & Entertainment", "Bobby Webster", 109.1f, scotiaBankArena);
			raptors.setPlantilla(funcionesUtiles.getPlantilla(raptors.getNombre()));
			raptors.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(raptors.getNombre()));
			return raptors;
		}
		if (opcion == 15) {
			Estadio capitalOneArena = new Estadio("Capital One Arena", (short) 20356);
			EquipoNormal wizards = new EquipoNormal("Wizards", este, "Washinton", null, "Ted Leonsis", "Tommy Sheppard",
					109.1f, capitalOneArena);
			wizards.setPlantilla(funcionesUtiles.getPlantilla(wizards.getNombre()));
			wizards.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(wizards.getNombre()));
			return wizards;
		}
		if (opcion == 16) {
			Estadio americanAirlinesCenter = new Estadio("American Airlines Center", (short) 19200);
			EquipoNormal mavs = new EquipoNormal("Mavericks", oeste, "Dallas", null, "Mark Cuban", "Nico Harrison",
					109.1f, americanAirlinesCenter);
			mavs.setPlantilla(funcionesUtiles.getPlantilla(mavs.getNombre()));
			mavs.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(mavs.getNombre()));
			return mavs;
		}
		if (opcion == 17) {
			Estadio ballCenter = new Estadio("Ball Center", (short) 19520);
			EquipoNormal nuggets = new EquipoNormal("Nuggets", oeste, "Denver", null, "Kroenke Sports & Entertainment",
					"Calvin Booth", 109.1f, ballCenter);
			nuggets.setPlantilla(funcionesUtiles.getPlantilla(nuggets.getNombre()));
			nuggets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(nuggets.getNombre()));
			return nuggets;
		}
		if (opcion == 18) {
			Estadio chaseCenter = new Estadio("Chase Center", (short) 18064);
			EquipoNormal warriors = new EquipoNormal("Warriors", oeste, "San Francisco", null, "Joe Lacob,Peter Guber",
					"Bob Myers", 109.1f, chaseCenter);
			warriors.setPlantilla(funcionesUtiles.getPlantilla(warriors.getNombre()));
			warriors.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(warriors.getNombre()));
			return warriors;
		}
		if (opcion == 19) {
			Estadio toyotaCenter = new Estadio("Toyota Center", (short) 18055);
			EquipoNormal rockets = new EquipoNormal("Rockets", oeste, "Houston", null, "Tilman Fertitta",
					"Rafael Stone", 109.1f, toyotaCenter);
			rockets.setPlantilla(funcionesUtiles.getPlantilla(rockets.getNombre()));
			rockets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(rockets.getNombre()));
			return rockets;
		}
		if (opcion == 20) {
			Estadio cryptocomArena = new Estadio("Crypto.com Arena", (short) 19060);
			EquipoNormal clippers = new EquipoNormal("Clippers", oeste, "Los Ángeles", null, "Steve Ballmer",
					"Michael Winger", 109.1f, cryptocomArena);
			clippers.setPlantilla(funcionesUtiles.getPlantilla(clippers.getNombre()));
			clippers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(clippers.getNombre()));
			return clippers;
		}
		if (opcion == 21) {
			Estadio cryptocomArena = new Estadio("Crypto.com Arena", (short) 19060);
			EquipoNormal lakers = new EquipoNormal("Lakers", oeste, "Los Ángeles", null, "Jeanie Buss", "Rob Pelinka",
					109.1f, cryptocomArena);
			lakers.setPlantilla(funcionesUtiles.getPlantilla(lakers.getNombre()));
			lakers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(lakers.getNombre()));
			return lakers;
		}
		if (opcion == 22) {
			Estadio targetCenter = new Estadio("Target Center", (short) 18798);
			EquipoNormal wolves = new EquipoNormal("Timberwolves", oeste, "Minnesota", null, "Marc Lore",
					"Sachin Gupta", 109.1f, targetCenter);
			wolves.setPlantilla(funcionesUtiles.getPlantilla(wolves.getNombre()));
			wolves.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(wolves.getNombre()));
			return wolves;
		}

		if (opcion == 23) {
			Estadio smoothieKingCenter = new Estadio("Smoothie King Center", (short) 16867);
			EquipoNormal pelicans = new EquipoNormal("Pelicans", oeste, "New Orleans", null, "Gayle Benson",
					"Trajan Langdon", 109.1f, smoothieKingCenter);
			pelicans.setPlantilla(funcionesUtiles.getPlantilla(pelicans.getNombre()));
			pelicans.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(pelicans.getNombre()));
			return pelicans;
		}
		if (opcion == 24) {
			Estadio fedexForum = new Estadio("FedEx Forum", (short) 18119);
			EquipoNormal grizzlies = new EquipoNormal("Grizzlies", este, "Memphis", null, "Robert Pera", "Jason Wexler",
					109.1f, fedexForum);
			grizzlies.setPlantilla(funcionesUtiles.getPlantilla(grizzlies.getNombre()));
			grizzlies.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(grizzlies.getNombre()));
			return grizzlies;
		}
		if (opcion == 25) {
			Estadio paycomCenter = new Estadio("Paycom Center", (short) 18203);
			EquipoNormal okc = new EquipoNormal("Thunder", oeste, "Oklahoma city", null,
					"Professional Basketball Club LLC", "Sam Presti", 109.1f, paycomCenter);
			okc.setPlantilla(funcionesUtiles.getPlantilla(okc.getNombre()));
			okc.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(okc.getNombre()));
			return okc;
		}
		if (opcion == 26) {
			Estadio footprintCenter = new Estadio("Footprint Center", (short) 18422);
			EquipoNormal suns = new EquipoNormal("Suns", oeste, "Phoenix", null, "Robert Sarver", "James Andrew Jones",
					109.1f, footprintCenter);
			suns.setPlantilla(funcionesUtiles.getPlantilla(suns.getNombre()));
			suns.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(suns.getNombre()));
			return suns;
		}
		if (opcion == 27) {
			Estadio modaCenter = new Estadio("Moda Center", (short) 19393);
			EquipoNormal blazers = new EquipoNormal("Trail Blazers", oeste, "Portland", null, "Paul Allen",
					"Joe Cronin", 109.1f, modaCenter);
			blazers.setPlantilla(funcionesUtiles.getPlantilla(blazers.getNombre()));
			blazers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(blazers.getNombre()));
			return blazers;
		}
		if (opcion == 28) {
			Estadio golden1Center = new Estadio("Golden 1 Center", (short) 17608);
			EquipoNormal kings = new EquipoNormal("Kings", oeste, "Sacramento", null, "Vivek Ranadivé", "Monte McNair",
					109.1f, golden1Center);
			kings.setPlantilla(funcionesUtiles.getPlantilla(kings.getNombre()));
			kings.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(kings.getNombre()));
			return kings;
		}
		if (opcion == 29) {
			Estadio attcenter = new Estadio("AT&T Center", (short) 18418);
			EquipoNormal spurs = new EquipoNormal("Spurs", oeste, "San Antonio", null,
					"Spurs Sports & Entertainment L.L.C.", "Brian Wright", 109.1f, attcenter);
			spurs.setPlantilla(funcionesUtiles.getPlantilla(spurs.getNombre()));
			spurs.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(spurs.getNombre()));
			return spurs;
		}
		if (opcion == 30) {
			Estadio vivintArena = new Estadio("Vivint Arena", (short) 18306);
			EquipoNormal jazz = new EquipoNormal("Jazz", oeste, "Utah", null, "Ryan Smith", "Justin Zanik", 109.1f,
					vivintArena);
			jazz.setPlantilla(funcionesUtiles.getPlantilla(jazz.getNombre()));
			jazz.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(jazz.getNombre()));
			return jazz;
		}

		else {
			return null;
		}

	}

	public static ArrayList<EquipoNormal> devolverTodosLosEquipos() throws EquipoSinDorsalesRetiradosException {
		ArrayList<EquipoNormal> equiposNBA = new ArrayList<EquipoNormal>();

		Conferencia este = new Conferencia("este", null);
		Conferencia oeste = new Conferencia("oeste", null);

		Estadio stateFarmArena = new Estadio("State Farm Arena", (short) 16600);
		EquipoNormal hawks = new EquipoNormal("Hawks", este, "Atlanta", null, "Anthony Ressler", "Travis Schlenk",
				109.1f, stateFarmArena);
		hawks.setPlantilla(funcionesUtiles.getPlantilla(hawks.getNombre()));
		hawks.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(hawks.getNombre()));

		equiposNBA.add(hawks);

		Estadio tdGarden = new Estadio("TD Garden", (short) 18624);
		EquipoNormal celtics = new EquipoNormal("Celtics", este, "Boston", null, "Boston basketball partners",
				"Brad Stevens", 109.1f, tdGarden);
		celtics.setPlantilla(funcionesUtiles.getPlantilla(celtics.getNombre()));
		celtics.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(celtics.getNombre()));

		equiposNBA.add(celtics);

		Estadio barclaysCenter = new Estadio("Barclays Center", (short) 17732);
		EquipoNormal nets = new EquipoNormal("Nets", este, "Brooklyn", null, "Joseph Tsai", "Sean marks", 109.1f,
				barclaysCenter);
		nets.setPlantilla(funcionesUtiles.getPlantilla(nets.getNombre()));
		nets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(nets.getNombre()));

		equiposNBA.add(nets);

		Estadio spectrumCenter = new Estadio("Spectrum center", (short) 19077);
		EquipoNormal hornets = new EquipoNormal("Hornets", este, "Charlotte", null, "Michael Jordan", "Mitch Kupchak",
				109.1f, spectrumCenter);
		hornets.setPlantilla(funcionesUtiles.getPlantilla(hornets.getNombre()));
		hornets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(hornets.getNombre()));

		equiposNBA.add(hornets);

		Estadio unitedCenter = new Estadio("United center", (short) 20917);
		EquipoNormal bulls = new EquipoNormal("Bulls", este, "Chicago", null, "Jerry Reinsdorf", "Marc Eversley",
				109.1f, unitedCenter);
		bulls.setPlantilla(funcionesUtiles.getPlantilla(bulls.getNombre()));
		bulls.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(bulls.getNombre()));

		equiposNBA.add(bulls);

		Estadio rocketMortageFieldHouse = new Estadio("Rocket Mortgage FieldHouse", (short) 19432);
		EquipoNormal cavs = new EquipoNormal("Cavaliers", este, "Cleveland", null, "Dan Gilbert", "Mike Gansey", 109.1f,
				rocketMortageFieldHouse);
		cavs.setPlantilla(funcionesUtiles.getPlantilla(cavs.getNombre()));
		cavs.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(cavs.getNombre()));

		equiposNBA.add(cavs);

		Estadio littkeCaesarsArena = new Estadio("Little Caesar Arena", (short) 20332);
		EquipoNormal pistons = new EquipoNormal("Pistons", este, "Detroit", null, "Tom Gores", "Troy Weaver", 109.1f,
				littkeCaesarsArena);
		pistons.setPlantilla(funcionesUtiles.getPlantilla(pistons.getNombre()));
		pistons.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(pistons.getNombre()));

		equiposNBA.add(pistons);

		Estadio bankersLifeFieldHouse = new Estadio("Bankers Life FieldHouse", (short) 17923);
		EquipoNormal pacers = new EquipoNormal("Pacers", este, "Indiana", null, "Herbert Simon", "Chad Buchanan",
				109.1f, bankersLifeFieldHouse);
		pacers.setPlantilla(funcionesUtiles.getPlantilla(pacers.getNombre()));
		pacers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(pacers.getNombre()));

		equiposNBA.add(pacers);

		Estadio ftxArena = new Estadio("FTX Arena", (short) 19600);
		EquipoNormal heat = new EquipoNormal("Heat", este, "Miami", null, "Micky Arison", "Andy Elisburg", 109.1f,
				ftxArena);
		heat.setPlantilla(funcionesUtiles.getPlantilla(heat.getNombre()));
		heat.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(heat.getNombre()));

		equiposNBA.add(heat);

		Estadio fiservForum = new Estadio("Fiserv Forum", (short) 17341);
		EquipoNormal bucks = new EquipoNormal("Bucks", este, "Milwaukee", null, "Los hermanos Edens", "Jon Horst",
				109.1f, fiservForum);
		bucks.setPlantilla(funcionesUtiles.getPlantilla(bucks.getNombre()));
		bucks.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(bucks.getNombre()));

		equiposNBA.add(bucks);

		Estadio madisonSquareGarde = new Estadio("Madison Square Garden", (short) 19812);
		EquipoNormal knicks = new EquipoNormal("Knicks", este, "New York", null, "James L Dolan", "Scott Perry", 109.1f,
				madisonSquareGarde);
		knicks.setPlantilla(funcionesUtiles.getPlantilla(knicks.getNombre()));
		knicks.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(knicks.getNombre()));

		equiposNBA.add(knicks);

		Estadio amwayCenter = new Estadio("Amway Center", (short) 18846);
		EquipoNormal magic = new EquipoNormal("Magic", este, "Orlando", null, "Richard DeVos", "John Hammond", 109.1f,
				amwayCenter);
		magic.setPlantilla(funcionesUtiles.getPlantilla(magic.getNombre()));
		magic.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(magic.getNombre()));

		equiposNBA.add(magic);

		Estadio wellsFargoCenter = new Estadio("Wells Fargo Center", (short) 20478);
		EquipoNormal sixers = new EquipoNormal("76ers", este, "Philladelphia", null, "Josh Harris", "Elton Brand",
				109.1f, wellsFargoCenter);
		sixers.setPlantilla(funcionesUtiles.getPlantilla(sixers.getNombre()));
		sixers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(sixers.getNombre()));

		equiposNBA.add(sixers);

		Estadio scotiaBankArena = new Estadio("Scotia Bank Arena", (short) 19800);
		EquipoNormal raptors = new EquipoNormal("Raptors", este, "Toronto", null, "Maple Leaf Sports & Entertainment",
				"Bobby Webster", 109.1f, scotiaBankArena);
		raptors.setPlantilla(funcionesUtiles.getPlantilla(raptors.getNombre()));
		raptors.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(raptors.getNombre()));

		equiposNBA.add(raptors);

		Estadio capitalOneArena = new Estadio("Capital One Arena", (short) 20356);
		EquipoNormal wizards = new EquipoNormal("Wizards", este, "Washinton", null, "Ted Leonsis", "Tommy Sheppard",
				109.1f, capitalOneArena);
		wizards.setPlantilla(funcionesUtiles.getPlantilla(wizards.getNombre()));
		wizards.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(wizards.getNombre()));

		equiposNBA.add(wizards);

		Estadio americanAirlinesCenter = new Estadio("American Airlines Center", (short) 19200);
		EquipoNormal mavs = new EquipoNormal("Mavericks", oeste, "Dallas", null, "Mark Cuban", "Nico Harrison", 109.1f,
				americanAirlinesCenter);
		mavs.setPlantilla(funcionesUtiles.getPlantilla(mavs.getNombre()));
		mavs.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(mavs.getNombre()));

		equiposNBA.add(mavs);

		Estadio ballCenter = new Estadio("Ball Center", (short) 19520);
		EquipoNormal nuggets = new EquipoNormal("Nuggets", oeste, "Denver", null, "Kroenke Sports & Entertainment",
				"Calvin Booth", 109.1f, ballCenter);
		nuggets.setPlantilla(funcionesUtiles.getPlantilla(nuggets.getNombre()));
		nuggets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(nuggets.getNombre()));

		equiposNBA.add(nuggets);

		Estadio chaseCenter = new Estadio("Chase Center", (short) 18064);
		EquipoNormal warriors = new EquipoNormal("Warriors", oeste, "San Francisco", null, "Joe Lacob,Peter Guber",
				"Bob Myers", 109.1f, chaseCenter);
		warriors.setPlantilla(funcionesUtiles.getPlantilla(warriors.getNombre()));
		warriors.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(warriors.getNombre()));

		equiposNBA.add(warriors);

		Estadio toyotaCenter = new Estadio("Toyota Center", (short) 18055);
		EquipoNormal rockets = new EquipoNormal("Rockets", oeste, "Houston", null, "Tilman Fertitta", "Rafael Stone",
				109.1f, toyotaCenter);
		rockets.setPlantilla(funcionesUtiles.getPlantilla(rockets.getNombre()));
		rockets.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(rockets.getNombre()));

		equiposNBA.add(rockets);

		Estadio cryptocomArena = new Estadio("Crypto.com Arena", (short) 19060);
		EquipoNormal clippers = new EquipoNormal("Clippers", oeste, "Los Ángeles", null, "Steve Ballmer",
				"Michael Winger", 109.1f, cryptocomArena);
		clippers.setPlantilla(funcionesUtiles.getPlantilla(clippers.getNombre()));
		clippers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(clippers.getNombre()));

		equiposNBA.add(clippers);

		EquipoNormal lakers = new EquipoNormal("Lakers", oeste, "Los Ángeles", null, "Jeanie Buss", "Rob Pelinka",
				109.1f, cryptocomArena);
		lakers.setPlantilla(funcionesUtiles.getPlantilla(lakers.getNombre()));
		lakers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(lakers.getNombre()));

		equiposNBA.add(lakers);

		Estadio targetCenter = new Estadio("Target Center", (short) 18798);
		EquipoNormal wolves = new EquipoNormal("Timberwolves", oeste, "Minnesota", null, "Marc Lore", "Sachin Gupta",
				109.1f, targetCenter);
		wolves.setPlantilla(funcionesUtiles.getPlantilla(wolves.getNombre()));
		wolves.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(wolves.getNombre()));

		equiposNBA.add(wolves);

		Estadio smoothieKingCenter = new Estadio("Smoothie King Center", (short) 16867);
		EquipoNormal pelicans = new EquipoNormal("Pelicans", oeste, "New Orleans", null, "Gayle Benson",
				"Trajan Langdon", 109.1f, smoothieKingCenter);
		pelicans.setPlantilla(funcionesUtiles.getPlantilla(pelicans.getNombre()));
		pelicans.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(pelicans.getNombre()));

		equiposNBA.add(pelicans);

		Estadio fedexForum = new Estadio("FedEx Forum", (short) 18119);
		EquipoNormal grizzlies = new EquipoNormal("Grizzlies", este, "Memphis", null, "Robert Pera", "Jason Wexler",
				109.1f, fedexForum);
		grizzlies.setPlantilla(funcionesUtiles.getPlantilla(grizzlies.getNombre()));
		grizzlies.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(grizzlies.getNombre()));

		equiposNBA.add(grizzlies);

		Estadio paycomCenter = new Estadio("Paycom Center", (short) 18203);
		EquipoNormal okc = new EquipoNormal("Thunder", oeste, "Oklahoma city", null, "Professional Basketball Club LLC",
				"Sam Presti", 109.1f, paycomCenter);
		okc.setPlantilla(funcionesUtiles.getPlantilla(okc.getNombre()));
		okc.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(okc.getNombre()));

		equiposNBA.add(okc);

		Estadio footprintCenter = new Estadio("Footprint Center", (short) 18422);
		EquipoNormal suns = new EquipoNormal("Suns", oeste, "Phoenix", null, "Robert Sarver", "James Andrew Jones",
				109.1f, footprintCenter);
		suns.setPlantilla(funcionesUtiles.getPlantilla(suns.getNombre()));
		suns.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(suns.getNombre()));

		equiposNBA.add(suns);

		Estadio modaCenter = new Estadio("Moda Center", (short) 19393);
		EquipoNormal blazers = new EquipoNormal("Trail Blazers", oeste, "Portland", null, "Paul Allen", "Joe Cronin",
				109.1f, modaCenter);
		blazers.setPlantilla(funcionesUtiles.getPlantilla(blazers.getNombre()));
		blazers.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(blazers.getNombre()));

		equiposNBA.add(blazers);

		Estadio golden1Center = new Estadio("Golden 1 Center", (short) 17608);
		EquipoNormal kings = new EquipoNormal("Kings", oeste, "Sacramento", null, "Vivek Ranadivé", "Monte McNair",
				109.1f, golden1Center);
		kings.setPlantilla(funcionesUtiles.getPlantilla(kings.getNombre()));
		kings.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(kings.getNombre()));

		equiposNBA.add(kings);

		Estadio attcenter = new Estadio("AT&T Center", (short) 18418);
		EquipoNormal spurs = new EquipoNormal("Spurs", oeste, "San Antonio", null,
				"Spurs Sports & Entertainment L.L.C.", "Brian Wright", 109.1f, attcenter);
		spurs.setPlantilla(funcionesUtiles.getPlantilla(spurs.getNombre()));
		spurs.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(spurs.getNombre()));

		equiposNBA.add(spurs);

		Estadio vivintArena = new Estadio("Vivint Arena", (short) 18306);
		EquipoNormal jazz = new EquipoNormal("Jazz", oeste, "Utah", null, "Ryan Smith", "Justin Zanik", 109.1f,
				vivintArena);
		jazz.setPlantilla(funcionesUtiles.getPlantilla(jazz.getNombre()));
		jazz.setDorsalesRetirados(funcionesUtiles.getDorsalesRetirados(jazz.getNombre()));

		equiposNBA.add(jazz);

		return equiposNBA;
	}

	public static String devolverMVP() {
		String ret = "";

		ArrayList<JugadorNormal> jugadoresNormalesNBA = getTodosLosJugadoresNBA();

		JugadorNormal max_jugador = jugadoresNormalesNBA.get(0);
		float max = max_jugador.getAPG() + max_jugador.getPPG() + max_jugador.getRBG() + max_jugador.getSPG()
				+ max_jugador.getBPG();
		float statsJugador = 0;

		for (short i = 1; i < jugadoresNormalesNBA.size(); i++) {

			statsJugador = jugadoresNormalesNBA.get(i).getAPG() + jugadoresNormalesNBA.get(i).getPPG()
					+ jugadoresNormalesNBA.get(i).getRBG() + jugadoresNormalesNBA.get(i).getSPG()
					+ jugadoresNormalesNBA.get(i).getBPG();

			if (statsJugador > max) {
				max_jugador = jugadoresNormalesNBA.get(i);
				max = statsJugador;
			}
		}
		ret += "\n" + max_jugador + "\n";
		return ret;

	}

	public static String devolverDPOY() {
		String ret = "";

		ArrayList<JugadorNormal> jugadoresNormalesNBA = getTodosLosJugadoresNBA();

		JugadorNormal max_jugador = jugadoresNormalesNBA.get(0);
		float max = max_jugador.getRBG() + max_jugador.getSPG() + max_jugador.getBPG();
		float statsJugador = 0;

		for (short i = 1; i < jugadoresNormalesNBA.size(); i++) {

			statsJugador = jugadoresNormalesNBA.get(i).getAPG() + jugadoresNormalesNBA.get(i).getPPG()
					+ jugadoresNormalesNBA.get(i).getRBG() + jugadoresNormalesNBA.get(i).getSPG()
					+ jugadoresNormalesNBA.get(i).getBPG();

			if (statsJugador > max) {
				max_jugador = jugadoresNormalesNBA.get(i);
				max = statsJugador;
			}
		}
		ret += "\n" + max_jugador + "\n";
		return ret;

	}

	public static String devolverPremioAnotador() {
		String ret = "";

		ArrayList<JugadorNormal> jugadoresNormalesNBA = getTodosLosJugadoresNBA();

		JugadorNormal max_jugador = jugadoresNormalesNBA.get(0);
		float max = max_jugador.getPPG();
		float statsJugador = 0;

		for (short i = 1; i < jugadoresNormalesNBA.size(); i++) {

			statsJugador = jugadoresNormalesNBA.get(i).getAPG() + jugadoresNormalesNBA.get(i).getPPG()
					+ jugadoresNormalesNBA.get(i).getRBG() + jugadoresNormalesNBA.get(i).getSPG()
					+ jugadoresNormalesNBA.get(i).getBPG();

			if (statsJugador > max) {
				max_jugador = jugadoresNormalesNBA.get(i);
				max = statsJugador;
			}
		}
		ret += "\n" + max_jugador + "\n";
		return ret;

	}

	public static ArrayList<JugadorNormal> getPlantilla(String nombre) {
		Random r = new Random();

		ArrayList<JugadorNormal> plantillaEquipo = new ArrayList<JugadorNormal>();

		if (nombre.equals("Hawks")) {
			JugadorNormal traeYoung = new JugadorNormal("Trae", "Young", (byte) 11, "Ice Trae", Posicion.BASE, 8.32f,
					(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.B, Valores.A, Valores.A, Valores.D);
			JugadorNormal jhonCollins = new JugadorNormal("Jhon", "Collins", (byte) 20, Posicion.PIVOT, 23f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
					Valores.B, Valores.C, Valores.B);
			JugadorNormal bogdanBogdanovich = new JugadorNormal("Bogdan", "Bogdanovich", (byte) 13, Posicion.ESCOLTA,
					18f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal deandreHunter = new JugadorNormal("De'Andre", "Hunter", (byte) 12, Posicion.ALAPIVOT, 7.75f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.B, Valores.C, Valores.B);
			JugadorNormal kevinHuerter = new JugadorNormal("Kevin", "Huerter", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(traeYoung);
			plantillaEquipo.add(kevinHuerter);
			plantillaEquipo.add(bogdanBogdanovich);
			plantillaEquipo.add(deandreHunter);
			plantillaEquipo.add(jhonCollins);
		}

		if (nombre.equals("Celtics")) {

			JugadorNormal jaysonTatum = new JugadorNormal("Jason", "Tatum", (byte) 0, "JT", Posicion.ALERO, 28.2f,
					(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 36, Valores.B, Valores.A, Valores.B, Valores.B);
			JugadorNormal jaylenBrown = new JugadorNormal("Jaylen", "Brown", (byte) 7, Posicion.ESCOLTA, 26.76f,
					(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 34, Valores.A, Valores.A, Valores.C, Valores.B);
			JugadorNormal marcusSmart = new JugadorNormal("Marcus", "Smart", (byte) 16, Posicion.BASE, 14.36f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
					Valores.B, Valores.B, Valores.A);
			JugadorNormal alHorfort = new JugadorNormal("Al", "Horford", (byte) 42, Posicion.ALAPIVOT, 27f, (byte) 5,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 29, Valores.C,
					Valores.B, Valores.C, Valores.A);
			JugadorNormal robertWilliams = new JugadorNormal("Robert", "Williams ||| ", (byte) 44, Posicion.PIVOT,
					3.36f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(jaysonTatum);
			plantillaEquipo.add(jaylenBrown);
			plantillaEquipo.add(marcusSmart);
			plantillaEquipo.add(alHorfort);
			plantillaEquipo.add(robertWilliams);

		}
		if (nombre.equals("Nets")) {
			JugadorNormal kevinDurant = new JugadorNormal("Kevin", "Durant", (byte) 7, "Durantula", Posicion.ALAPIVOT,
					42.01f, (byte) 12, (byte) 2, (byte) 1, (byte) 0, true, false, (byte) 2, (byte) 2, (byte) 4,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.A, Valores.A, Valores.A, Valores.B);
			JugadorNormal sethCurry = new JugadorNormal("Seth", "Curry", (byte) 30, Posicion.ESCOLTA, 8.2f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
					Valores.A, Valores.C, Valores.C);
			JugadorNormal bruceBrown = new JugadorNormal("Bruce", "Brown", (byte) 1, Posicion.ALERO, 4.73f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
					Valores.B, Valores.C, Valores.A);
			JugadorNormal kyrieIrving = new JugadorNormal("Kyrie", "Irving", (byte) 11, "Uncle Drew", Posicion.BASE,
					35.34f, (byte) 7, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.A, Valores.A, Valores.B, Valores.D);
			JugadorNormal lamarcusAldridge = new JugadorNormal("Lamarcus", "Aldridge", (byte) 2, Posicion.PIVOT, 2.64f,
					(byte) 7, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 22, Valores.B, Valores.B, Valores.C, Valores.B);
			plantillaEquipo.add(kyrieIrving);
			plantillaEquipo.add(sethCurry);
			plantillaEquipo.add(bruceBrown);
			plantillaEquipo.add(kevinDurant);
			plantillaEquipo.add(lamarcusAldridge);
		}

		if (nombre.equals("Hornets")) {
			JugadorNormal lameloBall = new JugadorNormal("LaMelo", "Ball", (byte) 2, Posicion.BASE, 8.32f, (byte) 1,
					(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
					Valores.B, Valores.A, Valores.C);
			JugadorNormal milesBridges = new JugadorNormal("Miles", "Bridges", (byte) 0, Posicion.ALERO, 5.56f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 36, Valores.A, Valores.A, Valores.C, Valores.B);
			JugadorNormal terryRozier = new JugadorNormal("Terry", "Rozier", (byte) 13, "Scary Terry", Posicion.ESCOLTA,
					18f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.B, Valores.D);
			JugadorNormal gordonHayward = new JugadorNormal("Gordon", "Hayward", (byte) 20, Posicion.ALAPIVOT, 29.92f,
					(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.B);
			JugadorNormal montrezlHarrel = new JugadorNormal("Montrezl", "Harrel", (byte) 8, "Trezz", Posicion.ALERO,
					4.2f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(lameloBall);
			plantillaEquipo.add(milesBridges);
			plantillaEquipo.add(terryRozier);
			plantillaEquipo.add(gordonHayward);
			plantillaEquipo.add(montrezlHarrel);
		}

		if (nombre.equals("Bulls")) {
			JugadorNormal lonzoBall = new JugadorNormal("Lonzo", "Ball", (byte) 2, Posicion.BASE, 18.6f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
					Valores.A, Valores.A, Valores.A);
			JugadorNormal demarDeRozan = new JugadorNormal("Demar", "DeRozan", (byte) 10, "King of the Fourth",
					Posicion.ALERO, 26f, (byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 36, Valores.A, Valores.A, Valores.C, Valores.C);
			JugadorNormal nikolaVucevic = new JugadorNormal("Nikola", "Vucevic", (byte) 9, Posicion.PIVOT, 24f,
					(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.C);
			JugadorNormal zachLavine = new JugadorNormal("Zach", "LaVine", (byte) 8, Posicion.ESCOLTA, 19.5f, (byte) 2,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
					Valores.B, Valores.C, Valores.D);
			JugadorNormal patrickWilliams = new JugadorNormal("Patrick", "Williams", (byte) 44, Posicion.ALAPIVOT, 7.2f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(lonzoBall);
			plantillaEquipo.add(demarDeRozan);
			plantillaEquipo.add(nikolaVucevic);
			plantillaEquipo.add(zachLavine);
			plantillaEquipo.add(patrickWilliams);
		}

		if (nombre.equals("Cavaliers")) {
			JugadorNormal jarretAllen = new JugadorNormal("Jarret", "Allen", (byte) 31, Posicion.PIVOT, 20, (byte) 1,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
					Valores.D, Valores.D, Valores.A);
			JugadorNormal dariusGarland = new JugadorNormal("Darius", "Garland", (byte) 10, Posicion.BASE, 10, (byte) 1,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
					Valores.B, Valores.A, Valores.C);
			JugadorNormal evanMoblaey = new JugadorNormal("Evan", "Mobley", (byte) 4, Posicion.ALERO, 18f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.A, Valores.C, Valores.B);
			JugadorNormal carisLeVert = new JugadorNormal("Caris", "LeVert", (byte) 3, Posicion.ESCOLTA, 17.75f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.D);
			JugadorNormal lauriMarkkanen = new JugadorNormal("Lauri", "Markkanen", (byte) 24, Posicion.ALAPIVOT, 15.69f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.B);
			plantillaEquipo.add(jarretAllen);
			plantillaEquipo.add(dariusGarland);
			plantillaEquipo.add(evanMoblaey);
			plantillaEquipo.add(carisLeVert);
			plantillaEquipo.add(lauriMarkkanen);
		}

		if (nombre.equals("Mavericks")) {
			JugadorNormal lukaDoncic = new JugadorNormal("Luka", "Doncic", (byte) 77, "Luka Magic", Posicion.BASE,
					10.74f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.A, Valores.A, Valores.A, Valores.C);
			JugadorNormal jalenBrunson = new JugadorNormal("Jalen", "Brunson", (byte) 13, Posicion.ESCOLTA, 1.8f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.B, Valores.A, Valores.B, Valores.C);
			JugadorNormal spencerDinwiddie = new JugadorNormal("Spencer", "Dinwiddie", (byte) 21, Posicion.ALERO,
					17.14f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 28, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal dorianFinneySmith = new JugadorNormal("Dorian", "Finney-Smith", (byte) 10, Posicion.PIVOT, 4,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 33, Valores.B, Valores.B, Valores.D, Valores.A);
			JugadorNormal reggieBullock = new JugadorNormal("Reggie", "Bulloc", (byte) 25, Posicion.ALAPIVOT, 9.53f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 28, Valores.B, Valores.A, Valores.C, Valores.B);

			plantillaEquipo.add(lukaDoncic);
			plantillaEquipo.add(jalenBrunson);
			plantillaEquipo.add(spencerDinwiddie);
			plantillaEquipo.add(dorianFinneySmith);
			plantillaEquipo.add(reggieBullock);
		}

		if (nombre.equals(("Nuggets"))) {
			JugadorNormal willBarton = new JugadorNormal("William", "Barton", (byte) 5, "Will", Posicion.ALERO, 15.62f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.C, Valores.B, Valores.B, Valores.C);
			JugadorNormal aaronGordon = new JugadorNormal("Aaron", "Gordon", (byte) 50, Posicion.ALAPIVOT, 16.4f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.A, Valores.C, Valores.C, Valores.B);
			JugadorNormal nikolaJokic = new JugadorNormal("Nikola", "Jokic", (byte) 15, Posicion.PIVOT, 31.58f,
					(byte) 4, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.A, Valores.A, Valores.A, Valores.B);
			JugadorNormal jamalMurray = new JugadorNormal("Jamal", "Murray", (byte) 27, Posicion.ESCOLTA, 29.67F,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.A, Valores.B, Valores.B, Valores.C);
			JugadorNormal monteMorris = new JugadorNormal("Monte", "Morris", (byte) 11, Posicion.BASE, 4.2f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.B, Valores.D);
			plantillaEquipo.add(willBarton);
			plantillaEquipo.add(aaronGordon);
			plantillaEquipo.add(nikolaJokic);
			plantillaEquipo.add(jamalMurray);
			plantillaEquipo.add(monteMorris);
		}

		if (nombre.equals("Pistons")) {
			JugadorNormal cadeCunningham = new JugadorNormal("Cade", "Cunningham", (byte) 2, Posicion.BASE, 10.05f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.A, Valores.C, Valores.B, Valores.D);
			JugadorNormal marvinBagley = new JugadorNormal("Marvin", "Bagley", (byte) 35, Posicion.PIVOT, 11f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
					Valores.C, Valores.C, Valores.B);
			JugadorNormal sadiqqBey = new JugadorNormal("Sadiqq", "Bey", (byte) 41, Posicion.ALERO, 2.8f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
					Valores.B, Valores.C, Valores.B);
			JugadorNormal hamidouDiallo = new JugadorNormal("Hamidou", "Diallo", (byte) 6, Posicion.ESCOLTA, 5.2f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 22, Valores.B, Valores.B, Valores.C, Valores.C);
			JugadorNormal jeramiGrant = new JugadorNormal("Jerami", "Grant", (byte) 9, Posicion.ALAPIVOT, 20f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.C, Valores.C, Valores.B);
			plantillaEquipo.add(cadeCunningham);
			plantillaEquipo.add(marvinBagley);
			plantillaEquipo.add(sadiqqBey);
			plantillaEquipo.add(hamidouDiallo);
			plantillaEquipo.add(jeramiGrant);
		}

		if (nombre.equals("Warriors")) {
			JugadorNormal stephenCurry = new JugadorNormal("Stephen", "Curry", (byte) 30, "Chef Curry", Posicion.BASE,
					45.78f, (byte) 8, (byte) 3, (byte) 2, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 34, Valores.A, Valores.A, Valores.A, Valores.D);
			JugadorNormal klayThompson = new JugadorNormal("Klay", "Thompson", (byte) 11, Posicion.ESCOLTA, 37.98f,
					(byte) 5, (byte) 3, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.B, Valores.A, Valores.C, Valores.A);
			JugadorNormal draymondGreen = new JugadorNormal("Draymond", "Green", (byte) 13, Posicion.PIVOT, 24,
					(byte) 4, (byte) 3, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.C, Valores.A, Valores.A);
			JugadorNormal andrewWiggins = new JugadorNormal("Andrew", "Hunter", (byte) 22, Posicion.ALAPIVOT, 31.57F,
					(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			JugadorNormal jordanPoole = new JugadorNormal("Jordan", "Poole", (byte) 3, Posicion.ALERO, 2.16f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.C, Valores.C);
			plantillaEquipo.add(stephenCurry);
			plantillaEquipo.add(klayThompson);
			plantillaEquipo.add(draymondGreen);
			plantillaEquipo.add(andrewWiggins);
			plantillaEquipo.add(jordanPoole);
		}

		if (nombre.equals("Rockets")) {
			JugadorNormal christianWood = new JugadorNormal("Christian", "Wood", (byte) 35, Posicion.PIVOT, 13.6F,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.B, Valores.D, Valores.D, Valores.B);
			JugadorNormal jalenGreen = new JugadorNormal("Jalen", "Green", (byte) 0, Posicion.BASE, 23f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
					Valores.B, Valores.D, Valores.D);
			JugadorNormal kpj = new JugadorNormal("Kevin", "Porter Jr", (byte) 3, Posicion.ALERO, 1.78F, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.C, Valores.D, Valores.C);
			JugadorNormal ericGordon = new JugadorNormal("Eric", "Gordon", (byte) 10, Posicion.ESCOLTA, 18.12f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.A, Valores.C, Valores.B);
			JugadorNormal jaseanTate = new JugadorNormal("Jae'Sean", "Tate", (byte) 8, Posicion.ALAPIVOT, 1.57f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.C);
			plantillaEquipo.add(christianWood);
			plantillaEquipo.add(jalenGreen);
			plantillaEquipo.add(kpj);
			plantillaEquipo.add(ericGordon);
			plantillaEquipo.add(jaseanTate);
		}

		if (nombre.equals("Pacers")) {
			JugadorNormal malcomBrogdon = new JugadorNormal("Malcom", "Brogdon", (byte) 7, Posicion.BASE, 21.7f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 33, Valores.B, Valores.B, Valores.A, Valores.C);
			JugadorNormal tyreseHaliburton = new JugadorNormal("Tyrese", "halliburton", (byte) 0, Posicion.ESCOLTA,
					4.03f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.C, Valores.A, Valores.C, Valores.C);
			JugadorNormal buddyHield = new JugadorNormal("Chavano Rainier", "Hield", (byte) 24, "Buddy Hield",
					Posicion.ALERO, 23.08F, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 30, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal jalenSmith = new JugadorNormal("Jalen", "Smith", (byte) 25, Posicion.ALAPIVOT, 4.48f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.D, Valores.D, Valores.C);
			JugadorNormal mylesTurner = new JugadorNormal("Myles", "Turner", (byte) 33, Posicion.PIVOT, 18, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(malcomBrogdon);
			plantillaEquipo.add(tyreseHaliburton);
			plantillaEquipo.add(buddyHield);
			plantillaEquipo.add(jalenSmith);
			plantillaEquipo.add(mylesTurner);
		}

		if (nombre.equals("Lakers")) {
			JugadorNormal russelWestbrook = new JugadorNormal("Russel", "Westbrook", (byte) 0, "Westbrick",
					Posicion.BASE, 44.21f, (byte) 9, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 2, (byte) 0,
					(byte) 2, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 35, Valores.B, Valores.D, Valores.A, Valores.D);
			JugadorNormal carmeloAnthony = new JugadorNormal("Carmelo Kyam", "Anthony", (byte) 7, "Melo",
					Posicion.ALERO, 2.64f, (byte) 10, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
					(byte) 1, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 26, Valores.B, Valores.A, Valores.C, Valores.D);
			JugadorNormal malikMonk = new JugadorNormal("Malik", "Monk", (byte) 11, Posicion.ESCOLTA, 1.8f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.D, Valores.D);
			JugadorNormal leBronJames = new JugadorNormal("LeBron", "James", (byte) 6, "King James", Posicion.ALAPIVOT,
					41.18f, (byte) 18, (byte) 4, (byte) 4, (byte) 0, true, false, (byte) 3, (byte) 4, (byte) 1,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.A, Valores.A, Valores.A, Valores.A);
			JugadorNormal anthonyDavis = new JugadorNormal("Anthony", "Davis", (byte) 3, "The Brow", Posicion.ALAPIVOT,
					35.36f, (byte) 8, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.A, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(russelWestbrook);
			plantillaEquipo.add(carmeloAnthony);
			plantillaEquipo.add(malikMonk);
			plantillaEquipo.add(leBronJames);
			plantillaEquipo.add(anthonyDavis);
		}

		if (nombre.equals("Grizzlies")) {
			JugadorNormal dilonBrooks = new JugadorNormal("Dilon", "Brooks", (byte) 24, Posicion.ALAPIVOT, 12.2f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 28, Valores.A, Valores.B, Valores.C, Valores.A);
			JugadorNormal desmondBane = new JugadorNormal("Desmond Michael", "Bane", (byte) 22, Posicion.ESCOLTA, 2.03f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 30,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal jaMorant = new JugadorNormal("Temetrius Jamel", "Morant", (byte) 12, "Ja Morant",
					Posicion.BASE, .603f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 30, Valores.A, Valores.B, Valores.C, Valores.C);
			JugadorNormal brandonClarke = new JugadorNormal("Brandon", "Clarke", (byte) 15, Posicion.ALERO, 2.72f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 19, Valores.B, Valores.D, Valores.D, Valores.B);
			JugadorNormal stevenAdams = new JugadorNormal("Steven", "Adams", (byte) 4, Posicion.PIVOT, 17, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B,
					Valores.D, Valores.C, Valores.A);
			plantillaEquipo.add(dilonBrooks);
			plantillaEquipo.add(desmondBane);
			plantillaEquipo.add(jaMorant);
			plantillaEquipo.add(brandonClarke);
			plantillaEquipo.add(stevenAdams);
		}

		if (nombre.equals("Heat")) {
			JugadorNormal jimmyButler = new JugadorNormal("Jimmy", "Butler", (byte) 22, "Jimmy Buckets", Posicion.ALERO,
					36.01f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 39, Valores.A, Valores.C, Valores.B, Valores.A);
			JugadorNormal bamAdebayo = new JugadorNormal("Edrice Femi", "Adebayo", (byte) 5, "Bam", Posicion.PIVOT,
					28.1f, (byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.A, Valores.C, Valores.C, Valores.A);
			JugadorNormal kyleLowry = new JugadorNormal("Kyle", "Lowry", (byte) 7, Posicion.BASE, 26.98f, (byte) 6,
					(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
					Valores.B, Valores.C, Valores.B);
			JugadorNormal maxStrus = new JugadorNormal("Max", "Strus", (byte) 31, Posicion.ESCOLTA, 1.67f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
					Valores.B, Valores.C, Valores.B);
			JugadorNormal pjTucker = new JugadorNormal("Anthony Leon", "Huerter", (byte) 3, "PJ Tucker",
					Posicion.ALAPIVOT, 7f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 30, Valores.C, Valores.C, Valores.C, Valores.A);
			plantillaEquipo.add(jimmyButler);
			plantillaEquipo.add(bamAdebayo);
			plantillaEquipo.add(kyleLowry);
			plantillaEquipo.add(maxStrus);
			plantillaEquipo.add(pjTucker);
		}

		if (nombre.equals("Bucks")) {
			JugadorNormal giannisAntetokoumpo = new JugadorNormal("Giannis Ougko", "Antetokounmpo", (byte) 34,
					"The Greek Freak", Posicion.ALAPIVOT, 39.34f, (byte) 6, (byte) 1, (byte) 2, (byte) 1, false, true,
					(byte) 1, (byte) 1, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1,
					r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A, Valores.C, Valores.B, Valores.A);
			JugadorNormal graysonAllen = new JugadorNormal("Grayson", "Allen", (byte) 7, Posicion.ESCOLTA, 4, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
					Valores.A, Valores.B, Valores.B);
			JugadorNormal brookLopez = new JugadorNormal("Brook", "Lopez", (byte) 11, Posicion.PIVOT, 13.3F, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.A, Valores.C, Valores.B);
			JugadorNormal jrueHoliday = new JugadorNormal("Jrue", "Holiday", (byte) 12, Posicion.BASE, 32.43f, (byte) 1,
					(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
					Valores.A, Valores.B, Valores.A);
			JugadorNormal khrisMiddleton = new JugadorNormal("Khris", "Middleton", (byte) 22, Posicion.ALERO, 33.5f,
					(byte) 3, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.B);
			plantillaEquipo.add(giannisAntetokoumpo);
			plantillaEquipo.add(graysonAllen);
			plantillaEquipo.add(brookLopez);
			plantillaEquipo.add(jrueHoliday);
			plantillaEquipo.add(khrisMiddleton);
		}

		if (nombre.equals("Timberwolves")) {
			JugadorNormal anthonyEdwards = new JugadorNormal("Anthony", "Edwards", (byte) 1, "Ant", Posicion.ALERO,
					10.25f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.A, Valores.B, Valores.B, Valores.B);
			JugadorNormal malikBeasly = new JugadorNormal("Malik", "Beasly", (byte) 5, Posicion.ESCOLTA, 14.91f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 25, Valores.B, Valores.B, Valores.C, Valores.B);
			JugadorNormal patrickBeverly = new JugadorNormal("Patrick", "Beverly", (byte) 22, Posicion.BASE, 14.32f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 26, Valores.B, Valores.C, Valores.C, Valores.A);
			JugadorNormal kat = new JugadorNormal("Karl-Anthony", "Towns Cruz", (byte) 32, Posicion.PIVOT, 31.65f,
					(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.A, Valores.D, Valores.B);
			JugadorNormal jadenMcDanields = new JugadorNormal("Jaden", "McDanields", (byte) 3, Posicion.ALAPIVOT, 2.06f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(anthonyEdwards);
			plantillaEquipo.add(malikBeasly);
			plantillaEquipo.add(patrickBeverly);
			plantillaEquipo.add(kat);
			plantillaEquipo.add(jadenMcDanields);
		}

		if (nombre.equals("Pelicans")) {
			JugadorNormal cjMcCollum = new JugadorNormal("Christian James", "McCollum", (byte) 3, "CJ McCollum",
					Posicion.ESCOLTA, 30.86f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 35, Valores.B, Valores.B, Valores.C, Valores.D);
			JugadorNormal jaxsonHayes = new JugadorNormal("Jaxon", "hayes", (byte) 10, Posicion.PIVOT, 5.34f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
					Valores.D, Valores.C, Valores.B);
			JugadorNormal herbertJones = new JugadorNormal("Herbert", "Jones", (byte) 5, Posicion.ALERO, 18f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
					Valores.C, Valores.C, Valores.B);
			JugadorNormal devonteGraham = new JugadorNormal("Devonte'", "Graham", (byte) 4, Posicion.BASE, 11f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.B, Valores.B, Valores.D);
			JugadorNormal jonasValanciunas = new JugadorNormal("Jonas", "Valanciunas", (byte) 17, Posicion.ALERO, 14.2f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(cjMcCollum);
			plantillaEquipo.add(jaxsonHayes);
			plantillaEquipo.add(herbertJones);
			plantillaEquipo.add(devonteGraham);
			plantillaEquipo.add(jonasValanciunas);
		}

		if (nombre.equals("Knicks")) {
			JugadorNormal rjBarret = new JugadorNormal("Rowan Alexander", "Barret", (byte) 9, "R.J.", Posicion.ALERO,
					8.63f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 34, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal evanFournier = new JugadorNormal("Evan", "Fournier", (byte) 13, Posicion.ESCOLTA, 17.14f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.B, Valores.B, Valores.C);
			JugadorNormal alecBurks = new JugadorNormal("Alec", "Burks", (byte) 18, Posicion.ESCOLTA, 9.35f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
					Valores.B, Valores.C, Valores.B);
			JugadorNormal mitchellRobinson = new JugadorNormal("Mitchell", "Robinson", (byte) 23, Posicion.PIVOT, 1.8f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.C, Valores.C, Valores.B);
			JugadorNormal juliusRande = new JugadorNormal("Julius", "The King", (byte) 3, Posicion.ALERO, 4.2f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			plantillaEquipo.add(rjBarret);
			plantillaEquipo.add(evanFournier);
			plantillaEquipo.add(alecBurks);
			plantillaEquipo.add(mitchellRobinson);
			plantillaEquipo.add(juliusRande);
		}

		if (nombre.equals("Magic")) {
			JugadorNormal coleAnthony = new JugadorNormal("Cole", "Anthony", (byte) 50, Posicion.BASE, 3.45f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
					Valores.C, Valores.B, Valores.C);
			JugadorNormal jalenSuggs = new JugadorNormal("Jalen", "Suggs", (byte) 4, Posicion.ESCOLTA, 6.59f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
					Valores.B, Valores.C, Valores.D);
			JugadorNormal moBamba = new JugadorNormal("Mohamed Fakaba", "Bamba", (byte) 5, "Mo Bamba", Posicion.BASE,
					7.56f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.B, Valores.B, Valores.D, Valores.B);
			JugadorNormal franzWagner = new JugadorNormal("Franz", "wagner", (byte) 22, Posicion.ALERO, 5f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
					Valores.B, Valores.C, Valores.B);
			JugadorNormal jonathanIsaac = new JugadorNormal("Jonathan", "isaac", (byte) 1, Posicion.ALAPIVOT, .17f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.C, Valores.C, Valores.A);
			plantillaEquipo.add(coleAnthony);
			plantillaEquipo.add(jalenSuggs);
			plantillaEquipo.add(moBamba);
			plantillaEquipo.add(franzWagner);
			plantillaEquipo.add(jonathanIsaac);
		}

		if (nombre.equals("76ers")) {
			JugadorNormal joelEmbiid = new JugadorNormal("Joel", "Embiid", (byte) 21, "Jojo", Posicion.PIVOT, 31.54f,
					(byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 34, Valores.A, Valores.B, Valores.B, Valores.A);
			JugadorNormal jamesHarden = new JugadorNormal("James", "Harden", (byte) 13, "The Beard", Posicion.BASE,
					44.31f, (byte) 10, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 3,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.B, Valores.A, Valores.A, Valores.D);
			JugadorNormal tyreseMaxey = new JugadorNormal("Tyrese", "Maxey", (byte) 0, Posicion.ESCOLTA, 2.6f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.A, Valores.C, Valores.B);
			JugadorNormal tobiasHarris = new JugadorNormal("Tobias", "Harris", (byte) 12, Posicion.ALAPIVOT, 35.95f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.B);
			JugadorNormal matisseThybulle = new JugadorNormal("Mathisse", "Thybulle", (byte) 22, Posicion.ALERO, 2.84f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.C, Valores.C, Valores.A);
			plantillaEquipo.add(joelEmbiid);
			plantillaEquipo.add(jamesHarden);
			plantillaEquipo.add(tyreseMaxey);
			plantillaEquipo.add(tobiasHarris);
			plantillaEquipo.add(matisseThybulle);
		}

		if (nombre.equals("Suns")) {
			JugadorNormal deandreAyton = new JugadorNormal("Deandre", "Ayton", (byte) 22, Posicion.PIVOT, 12.63f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.A, Valores.D, Valores.D, Valores.A);
			JugadorNormal mikalBridges = new JugadorNormal("Mikal", "Bridges", (byte) 25, Posicion.ALERO, 5.57F,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.B, Valores.A, Valores.B, Valores.A);
			JugadorNormal devinBooker = new JugadorNormal("Devin", "Booker", (byte) 1, "D-Book", Posicion.ESCOLTA,
					31.65f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.A, Valores.A, Valores.B, Valores.C);
			JugadorNormal jaeCrowder = new JugadorNormal("Jae", "Crowder", (byte) 99, Posicion.ALAPIVOT, 9.72f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 28, Valores.B, Valores.A, Valores.C, Valores.A);
			JugadorNormal chrisPaul = new JugadorNormal("Chris", "Paul", (byte) 3, Posicion.BASE, 30.8f, (byte) 12,
					(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.A, Valores.A);
			plantillaEquipo.add(deandreAyton);
			plantillaEquipo.add(mikalBridges);
			plantillaEquipo.add(devinBooker);
			plantillaEquipo.add(jaeCrowder);
			plantillaEquipo.add(chrisPaul);
		}

		if (nombre.equals("Trail Blazers")) {
			JugadorNormal damianLillard = new JugadorNormal("Damian", "Lillard", (byte) 0, "Dame Time", Posicion.BASE,
					39.34f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.B, Valores.A, Valores.A, Valores.D);
			JugadorNormal anferneeSimons = new JugadorNormal("Anfernee", "Simons", (byte) 1, Posicion.ESCOLTA, 3.9f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.C, Valores.B, Valores.C, Valores.C);
			JugadorNormal cjjElleby = new JugadorNormal("CJ", "Elleby", (byte) 16, Posicion.ALERO, 1.15f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 20, Valores.C,
					Valores.C, Valores.D, Valores.C);
			JugadorNormal justiceWinslow = new JugadorNormal("Justice", "Winslow", (byte) 26, Posicion.ALAPIVOT, 3.9f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.C, Valores.C, Valores.C);
			JugadorNormal jusufNurkic = new JugadorNormal("Jusuf", "Nurkic", (byte) 27, Posicion.PIVOT, 12f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.D, Valores.C, Valores.B);
			plantillaEquipo.add(damianLillard);
			plantillaEquipo.add(anferneeSimons);
			plantillaEquipo.add(cjjElleby);
			plantillaEquipo.add(justiceWinslow);
			plantillaEquipo.add(jusufNurkic);
		}
		if (nombre.equals("Kings")) {
			JugadorNormal deAaronFox = new JugadorNormal("De'Aaron", "Fox", (byte) 5, Posicion.BASE, 28.1f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
					Valores.B, Valores.B, Valores.D);
			JugadorNormal harrisonBarnes = new JugadorNormal("Harrison", "Barnes", (byte) 40, Posicion.ALERO, 20.29f,
					(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 34, Valores.B, Valores.A, Valores.C, Valores.C);
			JugadorNormal justinHoliday = new JugadorNormal("Justin", "Holiday", (byte) 9, Posicion.ESCOLTA, 6f,
					(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.B, Valores.D, Valores.B);
			JugadorNormal domantasSabonis = new JugadorNormal("Domantas", "Sabonis", (byte) 10, Posicion.PIVOT, 19.8f,
					(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.D, Valores.B);
			JugadorNormal mauriceHarkless = new JugadorNormal("Maurice", "Harkless", (byte) 8, "Moe Harkless",
					Posicion.ALAPIVOT, 4.2f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 30, Valores.C, Valores.D, Valores.C, Valores.B);
			plantillaEquipo.add(deAaronFox);
			plantillaEquipo.add(harrisonBarnes);
			plantillaEquipo.add(justinHoliday);
			plantillaEquipo.add(domantasSabonis);
			plantillaEquipo.add(mauriceHarkless);
		}

		if (nombre.equals("Spurs")) {
			JugadorNormal dejounteMurray = new JugadorNormal("Dejounte", "Murray", (byte) 5, Posicion.BASE, 15.24f,
					(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.B, Valores.B, Valores.B, Valores.B);
			JugadorNormal lonnieWalker = new JugadorNormal("Lonnie", "Walker IV", (byte) 1, Posicion.ESCOLTA, 4.47f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.C, Valores.B, Valores.C, Valores.C);
			JugadorNormal keldonJhonson = new JugadorNormal("Keldon", "Jhonson", (byte) 3, Posicion.ALAPIVOT, 18f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.D, Valores.B);
			JugadorNormal douMcDermott = new JugadorNormal("Doug", "McDermott", (byte) 17, Posicion.ALERO, 7.75f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.C, Valores.C, Valores.B);
			JugadorNormal jakobPoeltl = new JugadorNormal("Jakob", "Poeltl", (byte) 25, Posicion.PIVOT, 4.2f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.D, Valores.D, Valores.B);
			plantillaEquipo.add(dejounteMurray);
			plantillaEquipo.add(lonnieWalker);
			plantillaEquipo.add(keldonJhonson);
			plantillaEquipo.add(douMcDermott);
			plantillaEquipo.add(jakobPoeltl);
		}

		if (nombre.equals("Thunder")) {
			JugadorNormal luguentzDortz = new JugadorNormal("Luguentz", "Dortz", (byte) 5, "Lu Dortz", Posicion.ALERO,
					1.78f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 32, Valores.B, Valores.B, Valores.C, Valores.A);
			JugadorNormal dariusBazley = new JugadorNormal("Darius", "Bazley", (byte) 7, Posicion.ALAPIVOT, 2.5f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 28, Valores.C, Valores.C, Valores.C, Valores.B);
			JugadorNormal joshGiddey = new JugadorNormal("josh", "Giddey", (byte) 3, Posicion.ESCOLTA, 18f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.B, Valores.C);
			JugadorNormal kenrichWilliams = new JugadorNormal("Kenrich", "Williams", (byte) 34, Posicion.PIVOT, 2f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.D, Valores.D, Valores.C);
			JugadorNormal sga = new JugadorNormal("Shai", "Gilgeous-Alexander", (byte) 2, Posicion.BASE, 5.49f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.D);
			plantillaEquipo.add(luguentzDortz);
			plantillaEquipo.add(dariusBazley);
			plantillaEquipo.add(joshGiddey);
			plantillaEquipo.add(kenrichWilliams);
			plantillaEquipo.add(sga);
		}

		if (nombre.equals("Jazz")) {
			JugadorNormal mikeConley = new JugadorNormal("Mike", "Conley", (byte) 11, Posicion.BASE, 21f, (byte) 1,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B,
					Valores.A, Valores.A, Valores.D);
			JugadorNormal bojanBogdanovich = new JugadorNormal("Bojan", "Bogdanovich", (byte) 44, Posicion.ALAPIVOT,
					18.7f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal donovanMitchell = new JugadorNormal("Donovan", "Mitchell", (byte) 45, "Spida Mitchell",
					Posicion.ESCOLTA, 28.1f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 30, Valores.A, Valores.A, Valores.C, Valores.C);
			JugadorNormal jordanClarkson = new JugadorNormal("Jordan", "Clarkson", (byte) 00, Posicion.ALERO, 12.42f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 27, Valores.B, Valores.A, Valores.C, Valores.B);
			JugadorNormal rudyGobert = new JugadorNormal("Rudy", "Gobert", (byte) 27, Posicion.PIVOT, 35.34f, (byte) 3,
					(byte) 0, (byte) 0, (byte) 3, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.D, Valores.D, Valores.A);
			plantillaEquipo.add(mikeConley);
			plantillaEquipo.add(bojanBogdanovich);
			plantillaEquipo.add(donovanMitchell);
			plantillaEquipo.add(jordanClarkson);
			plantillaEquipo.add(rudyGobert);
		}
		if (nombre.equals("Wizards")) {
			JugadorNormal bradleyBeal = new JugadorNormal("Bradley", "Beal", (byte) 3, Posicion.BASE, 33.72F, (byte) 3,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
					Valores.A, Valores.B, Valores.C);
			JugadorNormal daniAvdija = new JugadorNormal("Deni", "Advija", (byte) 9, Posicion.ALERO, 4.69f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 24, Valores.B,
					Valores.A, Valores.C, Valores.A);
			JugadorNormal kcp = new JugadorNormal("kentavius", "Cadwell-Pope", (byte) 1, "KCP", Posicion.ESCOLTA,
					13.03f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.C, Valores.A);
			JugadorNormal thomasBryant = new JugadorNormal("Thomas", "Bryant", (byte) 13, Posicion.PIVOT, 8.63f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 16, Valores.B, Valores.C, Valores.D, Valores.B);
			JugadorNormal kristapsPorzingis = new JugadorNormal("Kristaps", "Porzingis", (byte) 6, Posicion.ALAPIVOT,
					31.65f, (byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.D, Valores.C);
			plantillaEquipo.add(bradleyBeal);
			plantillaEquipo.add(daniAvdija);
			plantillaEquipo.add(kcp);
			plantillaEquipo.add(thomasBryant);
			plantillaEquipo.add(kristapsPorzingis);
		}
		if (nombre.equals("Raptors")) {
			JugadorNormal scottieBarnes = new JugadorNormal("Scott Wayne", "Barnes", (byte) 4, "Scottie",
					Posicion.ALERO, 7.28f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0,
					(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
					r.nextInt(5) + 1, (byte) 35, Valores.B, Valores.C, Valores.C, Valores.B);
			JugadorNormal ogAnunoby = new JugadorNormal("Ogugua", "Anunoby", (byte) 3, "OG", Posicion.ALAPIVOT, 16,
					(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 36, Valores.B, Valores.B, Valores.B, Valores.A);
			JugadorNormal fredVanVleet = new JugadorNormal("Fred", "VanVleet", (byte) 23, Posicion.BASE, 19.67f,
					(byte) 1, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.C, Valores.B, Valores.C, Valores.D);
			JugadorNormal pascalSiakam = new JugadorNormal("Pascal", "Siakam", (byte) 43, "Spicy P", Posicion.PIVOT,
					33f, (byte) 1, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.B, Valores.B, Valores.D, Valores.A);
			JugadorNormal garyTrentJr = new JugadorNormal("Gary", "Trent Jr", (byte) 33, Posicion.ALERO, 16f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.B, Valores.C, Valores.C);
			plantillaEquipo.add(scottieBarnes);
			plantillaEquipo.add(ogAnunoby);
			plantillaEquipo.add(fredVanVleet);
			plantillaEquipo.add(pascalSiakam);
			plantillaEquipo.add(garyTrentJr);
		}
		if (nombre.equals("Clippers")) {
			JugadorNormal reggieJackson = new JugadorNormal("Reggie", "Jackson", (byte) 1, Posicion.BASE, 10.38f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 35, Valores.C, Valores.B, Valores.C, Valores.C);
			JugadorNormal paulGeorge = new JugadorNormal("Paul", "George", (byte) 13, "PG13", Posicion.ESCOLTA, 39.34f,
					(byte) 7, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 31, Valores.A, Valores.B, Valores.C, Valores.B);
			JugadorNormal kawhiLeonard = new JugadorNormal("Kawhi", "Leonard", (byte) 2, "Mr Fun Guy", Posicion.ALERO,
					39.34f, (byte) 5, (byte) 2, (byte) 0, (byte) 2, false, false, (byte) 1, (byte) 2, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 30, Valores.A, Valores.A, Valores.C, Valores.A);
			JugadorNormal ivicaZubac = new JugadorNormal("Ivica", "Zubac", (byte) 40, Posicion.PIVOT, 7.5f, (byte) 0,
					(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
					r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
					Valores.D, Valores.D, Valores.B);
			JugadorNormal robertCovington = new JugadorNormal("Robert", "Covington", (byte) 23, Posicion.PIVOT, 12.98f,
					(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
					r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
					(byte) 22, Valores.B, Valores.C, Valores.D, Valores.A);
			plantillaEquipo.add(reggieJackson);
			plantillaEquipo.add(paulGeorge);
			plantillaEquipo.add(kawhiLeonard);
			plantillaEquipo.add(ivicaZubac);
			plantillaEquipo.add(robertCovington);
		}

		return plantillaEquipo;

	}

	public static String getDorsalesRetirados(String nombre) throws EquipoSinDorsalesRetiradosException {
		String ret = "";

		if (nombre.equals("Hawks")) {
			JugadorNormal bobCousy = new JugadorNormal("Bob", "Cousy", (byte) 9);
			JugadorNormal tedTurner = new JugadorNormal("Ted", "Turner", (byte) 17);
			JugadorNormal dominiqueWilkins = new JugadorNormal("Dominique", "Wilkins", (byte) 21);
			JugadorNormal louHudson = new JugadorNormal("Lou", "Hudson", (byte) 23);
			JugadorNormal jasonColler = new JugadorNormal("Jason", "Collier", (byte) 40);
			JugadorNormal peteMaravich = new JugadorNormal("Pete", "Maravich", (byte) 44, "Pistol Pete");
			JugadorNormal dikembeMutombo = new JugadorNormal("Dikembe", "Mutombo", (byte) 55);

			JugadorNormal[] dorsalesRetiradosHawks = { bobCousy, tedTurner, dominiqueWilkins, louHudson, jasonColler,
					peteMaravich, dikembeMutombo };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS HAWKS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosHawks.length; i++) {

				ret += dorsalesRetiradosHawks[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Celtics")) {

			JugadorNormal robertparish = new JugadorNormal("Robert", "Parish", (byte) 00);
			JugadorNormal walterBrown = new JugadorNormal("Walter", "brown", (byte) 1);
			JugadorNormal arnoldAuerbach = new JugadorNormal("Arnold", "Auerbach", (byte) 2, "Red");
			JugadorNormal dennisJhonson = new JugadorNormal("Dennis", "Jhonson", (byte) 3);
			JugadorNormal kevinGarnet = new JugadorNormal("Kevin", "Garnet", (byte) 5, "Big Ticket");
			JugadorNormal billRussel = new JugadorNormal("Bill", "Russel", (byte) 6, "Lord of the Rings");
			JugadorNormal jojoWhite = new JugadorNormal("Jo Jo", "White", (byte) 10);
			JugadorNormal bobCousyCeltics = new JugadorNormal("Bob", "Cousy", (byte) 14);
			JugadorNormal tomHeison = new JugadorNormal("Tom", "Heison", (byte) 15);
			JugadorNormal tomSanders = new JugadorNormal("Tom", "Sanders", (byte) 16, "Satch");
			JugadorNormal jhonHavliceK = new JugadorNormal("Jhon", "Havlicek", (byte) 17);
			JugadorNormal jimLoscutoff = new JugadorNormal("Bob", "Cousy", (byte) 18);
			JugadorNormal daveCowens = new JugadorNormal("Dave", "Cowens", (byte) 18);
			JugadorNormal donaldNelson = new JugadorNormal("Donald", "Nelson", (byte) 19, "Don Nelson");
			JugadorNormal billSharman = new JugadorNormal("Bill", "Sharman", (byte) 21);
			JugadorNormal edMacauley = new JugadorNormal("Edward", "Macauley", (byte) 22, "Ed Macauley");
			JugadorNormal frankRamsey = new JugadorNormal("Frank Vernon", "Ramsey", (byte) 23, "Frank Ramsey");
			JugadorNormal samJones = new JugadorNormal("Sam", "Jones", (byte) 24);
			JugadorNormal kcJones = new JugadorNormal("K.C.", "Jones", (byte) 25);
			JugadorNormal cedricMaxwell = new JugadorNormal("Cedric", "Maxwell", (byte) 31, "Cornbread");
			JugadorNormal kevinMcHale = new JugadorNormal("Kevin Edward", "McHale", (byte) 32, "Kevin McHale");
			JugadorNormal larryBird = new JugadorNormal("Larry Joe", "Bird", (byte) 33, "Larry Bird");
			JugadorNormal paulPierce = new JugadorNormal("Paul", "Pierce", (byte) 34, "the truth");
			JugadorNormal reggieLewis = new JugadorNormal("Reginald", "Lewis", (byte) 35, "Reggie Lewis");

			JugadorNormal[] dorsalesRetiradosCeltics = { robertparish, walterBrown, arnoldAuerbach, dennisJhonson,
					kevinGarnet, billRussel, jojoWhite, bobCousyCeltics, tomHeison, tomSanders, jhonHavliceK,
					jimLoscutoff, daveCowens, donaldNelson, billSharman, edMacauley, frankRamsey, samJones, kcJones,
					cedricMaxwell, kevinMcHale, larryBird, paulPierce, reggieLewis };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS CELTICS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosCeltics.length; i++) {

				ret += dorsalesRetiradosCeltics[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}
		if (nombre.equals("Nets")) {

			JugadorNormal drazenPetrovich = new JugadorNormal("Dražen ", "Petrović", (byte) 3);
			JugadorNormal wendellLadner = new JugadorNormal("Wendell", "Ladner", (byte) 4);
			JugadorNormal jasonKidd = new JugadorNormal("Jason", "Kidd", (byte) 5);
			JugadorNormal jhonWilliamson = new JugadorNormal("Jhon Lee", "Williamson", (byte) 23, "John Williamson");
			JugadorNormal billMelchionni = new JugadorNormal("William P", "Melchionni", (byte) 25, "Bill Melchionni");
			JugadorNormal juliusErving = new JugadorNormal("Julius Winfield", "Earving ||", (byte) 32, "Dr J");
			JugadorNormal buckWilliams = new JugadorNormal("Dikembe", "Mutombo", (byte) 55);

			JugadorNormal[] dorsalesRetiradosNets = { drazenPetrovich, wendellLadner, jasonKidd, jhonWilliamson,
					billMelchionni, juliusErving, buckWilliams };

			ret += "-----------------------------------------" + "\n";
			ret += " -----DORSALES RETIRADOS DE LOS NETS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosNets.length; i++) {

				ret += dorsalesRetiradosNets[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Hornets")) {

			JugadorNormal bobbyPhills = new JugadorNormal("Bobby Ray ", "Phills ||", (byte) 13, "Bobby Phills");
			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS HORNETS----" + "\n";
			ret += "|                                       |" + "\n";
			ret += bobbyPhills + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Bulls")) {

			JugadorNormal michaelJordan = new JugadorNormal("Michael", "Jordan", (byte) 23, "Air Jordan");
			JugadorNormal scottiePippen = new JugadorNormal("Scottie", "Pippen", (byte) 33, "Pip");
			JugadorNormal bobLove = new JugadorNormal("Bob", "Love", (byte) 10);
			JugadorNormal jerrySloan = new JugadorNormal("Jerry", "Sloan", (byte) 4);

			JugadorNormal[] dorsalesRetiradosBulls = { michaelJordan, scottiePippen, bobLove, jerrySloan };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS BULLS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosBulls.length; i++) {

				ret += dorsalesRetiradosBulls[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Cavaliers")) {

			JugadorNormal bingoSmith = new JugadorNormal("Robert", "Smith", (byte) 7, "Bingo Smith");
			JugadorNormal zydrunasilgaukas = new JugadorNormal("Žydrūnas ", "Ilgauskas", (byte) 11);
			JugadorNormal larryNance = new JugadorNormal("Larry Donnel", "Nance Sr", (byte) 2, "Larry Nance");
			JugadorNormal markPrice = new JugadorNormal("William Mark", "Price", (byte) 25, "Mark Price");
			JugadorNormal austinCarr = new JugadorNormal("Austin George ", "Carr", (byte) 34, "Austin Carr");
			JugadorNormal nateThurmond = new JugadorNormal("Nathaniel", "Thurmond", (byte) 42, "Nate the Great");
			JugadorNormal bradDaugherty = new JugadorNormal("Bradley Lee", "Daugherty", (byte) 43, "Brad Daugherty");

			JugadorNormal[] dorsalesRetiradosCavs = { bingoSmith, zydrunasilgaukas, larryNance, markPrice, austinCarr,
					nateThurmond, bradDaugherty };

			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS CAVALIERS---" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosCavs.length; i++) {

				ret += dorsalesRetiradosCavs[i];
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Mavericks")) {

			JugadorNormal derekHarper = new JugadorNormal("Derek ", "Harper", (byte) 12);
			JugadorNormal bradDavis = new JugadorNormal("Bradley Ernest ", "Davis", (byte) 15, "Brad Davis");
			JugadorNormal rolandoBlackman = new JugadorNormal("Rolando  Antonio", "Price", (byte) 22, "Ro Blackman");
			JugadorNormal dirkNowitzki = new JugadorNormal("Dirk", "Werner Nowitzki", (byte) 41, "Wunderkind");

			JugadorNormal[] dorsalesRetiradosMavs = { derekHarper, bradDavis, rolandoBlackman, dirkNowitzki };

			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS MAVERICKS---" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosMavs.length; i++) {

				ret += dorsalesRetiradosMavs[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals(("Nuggets"))) {
			JugadorNormal alexEnglish = new JugadorNormal("Alexander", "English", (byte) 2, "Alex English");
			JugadorNormal fatLever = new JugadorNormal("Lafayette ", "Lever", (byte) 12, "Fat Lever");
			JugadorNormal davidThompson = new JugadorNormal("David O'Neil", "Thompson", (byte) 33);
			JugadorNormal byronbeck = new JugadorNormal("Byrin", "Beck", (byte) 40);
			JugadorNormal danIssel = new JugadorNormal("Daniel Paul ", "Issel", (byte) 44, "Dan Issel");
			JugadorNormal dikembeMutomboNuggets = new JugadorNormal("Dikembe", "Mutombo", (byte) 55);
			JugadorNormal dougMoe = new JugadorNormal("Douglas Edwin", "Moe", (byte) 432, "Doug Moe");

			JugadorNormal[] dorsalesRetiradosNuggets = { alexEnglish, fatLever, davidThompson, byronbeck, danIssel,
					dikembeMutomboNuggets, dougMoe };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS NUGGETS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosNuggets.length; i++) {

				ret += dorsalesRetiradosNuggets[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Pistons")) {

			JugadorNormal chaunceyBillups = new JugadorNormal("Chauncey", "Billups", (byte) 1, "Mr. Big Shot");
			JugadorNormal chuckDaily = new JugadorNormal("Charles Jerome ", "Daily", (byte) 2, "Chuck Daly");
			JugadorNormal benWallace = new JugadorNormal("Ben", "Wallace", (byte) 6, "Big Ben");
			JugadorNormal joeDumars = new JugadorNormal("Joe", "Dumars", (byte) 4, "Joe-D");
			JugadorNormal dennisRodman = new JugadorNormal("Dennis Keith", "Rodman", (byte) 10, "The Worm");
			JugadorNormal isaiahThomas = new JugadorNormal("Isiah Lord", "Thomas", (byte) 11, "Zeke");
			JugadorNormal vinnieJhonson = new JugadorNormal("Vincent", "Jhonson", (byte) 15, "Microwave");
			JugadorNormal bobLanier = new JugadorNormal("Robert Jerry", "Lanier", (byte) 16, "Bob Lanier");
			JugadorNormal daveBing = new JugadorNormal("David ", "Bing", (byte) 21, "Duke");
			JugadorNormal richardHamilton = new JugadorNormal("Richard Clay", "Hamilton", (byte) 32,
					"The Man in the Mask");
			JugadorNormal billLaimbeer = new JugadorNormal("William J.", "Laimbeer", (byte) 40, "Bill Laimbeer");

			JugadorNormal[] dorsalesRetiradosPistons = { chaunceyBillups, chuckDaily, benWallace, joeDumars,
					dennisRodman, isaiahThomas, vinnieJhonson, bobLanier, daveBing, richardHamilton, billLaimbeer };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS PISTONS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosPistons.length; i++) {

				ret += dorsalesRetiradosPistons[i] + "\n";
			}

			ret += "|                                       |";
			ret += "-----------------------------------------";
		}

		if (nombre.equals("Warriors")) {

			JugadorNormal wiltChamberlain = new JugadorNormal("Wilton Norman", "Chamberlain", (byte) 13,
					"Wilt the Stilt");
			JugadorNormal thomMeschery = new JugadorNormal("Thomas Nicholas  ", "Meschery", (byte) 14, "Thom Meschery");
			JugadorNormal alAttles = new JugadorNormal("Alvin", "Attles", (byte) 16, "Destroyer");
			JugadorNormal chrisMullin = new JugadorNormal("Christopher Paul", "Dumars", (byte) 17, "Chris Mullin");
			JugadorNormal rickBarry = new JugadorNormal("Richard Francis Dennis", "Barry |||", (byte) 24, "Greyhound");
			JugadorNormal nateThurmondWarriors = new JugadorNormal("Nathaniel", "Thurmond", (byte) 42,
					"Nate the Great");

			JugadorNormal[] dorsalesRetiradosWarriors = { wiltChamberlain, thomMeschery, alAttles, chrisMullin,
					rickBarry, nateThurmondWarriors };

			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS WARRIORS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosWarriors.length; i++) {

				ret += dorsalesRetiradosWarriors[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Rockets")) {

			JugadorNormal yaoMing = new JugadorNormal("Yao", "Ming", (byte) 11, "Yao's dinasty");
			JugadorNormal clydeDrexler = new JugadorNormal("Clyde Austin", "Drexler ", (byte) 22, "The Glide");
			JugadorNormal calvinMurphy = new JugadorNormal("Calvin Jerome", "Murphy ", (byte) 23, "Destroyer");
			JugadorNormal mosesMalone = new JugadorNormal("Moses Eugene", "Malone", (byte) 24, "Moses Malone");
			JugadorNormal hakeemOlajuwon = new JugadorNormal("Hakeem Abdul", "Olajuwon", (byte) 34, "The Dream");
			JugadorNormal rudyTomjanovich = new JugadorNormal("Rudolph ", "Tomjanovich", (byte) 45, "Rudy Tomjanovich");

			JugadorNormal[] dorsalesRetiradosRockets = { yaoMing, clydeDrexler, calvinMurphy, mosesMalone,
					hakeemOlajuwon, rudyTomjanovich };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS ROCKETS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosRockets.length; i++) {

				ret += dorsalesRetiradosRockets[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Pacers")) {

			JugadorNormal georgemcGinnis = new JugadorNormal("George", "McGinnis", (byte) 30);
			JugadorNormal reggieMiller = new JugadorNormal("Reginald Wayne", "Miller ", (byte) 31, "Miller Time");
			JugadorNormal melDaniels = new JugadorNormal("Melvin Joe", "Daniels ", (byte) 34, "Melvin Joe");
			JugadorNormal rogerBrown = new JugadorNormal("Roger William", "Brown", (byte) 35, "The Rajah");
			JugadorNormal slickLeonard = new JugadorNormal("William Robert", "Leonard", (byte) 529, "Slick Leonard");

			JugadorNormal[] dorsalesRetiradosPacers = { georgemcGinnis, reggieMiller, melDaniels, rogerBrown,
					slickLeonard, };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS PACERS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosPacers.length; i++) {

				ret += dorsalesRetiradosPacers[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}

		if (nombre.equals("Lakers")) {

			JugadorNormal kobe8 = new JugadorNormal("Kobe ", "Bryant", (byte) 8, "Black mamba");
			JugadorNormal wiltChamberlain = new JugadorNormal("Wilton Norman", "Chamberlain", (byte) 13,
					"Wilt the Stilt");
			JugadorNormal elginBaylor = new JugadorNormal("Elgin Gay", "Baylor ", (byte) 22, "Elgin Baylor");
			JugadorNormal kobe24 = new JugadorNormal("Kobe ", "Bryant", (byte) 24, "Black mamba");
			JugadorNormal gailGoodrich = new JugadorNormal("Gail Charles", "Goodrich", (byte) 25, "The Stump");
			JugadorNormal magicJhonson = new JugadorNormal("Earvin", "Jhonson", (byte) 32, "Magic Jhonson");
			JugadorNormal kareemAbdulJabbar = new JugadorNormal("Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook");
			JugadorNormal shaquilleOneal = new JugadorNormal("Shaquille Rashaun", "O'Neal ", (byte) 34, "Shaq Attack");
			JugadorNormal jamesWorthy = new JugadorNormal("James Ager ", "Worthy", (byte) 42, "Big Game James");
			JugadorNormal jerryWest = new JugadorNormal("Jerome Alan", "West", (byte) 44, "The Logo");
			JugadorNormal jamalWilkes = new JugadorNormal("Jamaal Abdul-Lateef", "Wilkes", (byte) 52, "Smooth as Silk");
			JugadorNormal jimPollard = new JugadorNormal("James Clifford", "Pollard", (byte) 17, "The Kangaroo Kid");
			JugadorNormal vernMikelsen = new JugadorNormal("Arild Verner Agerskov", "Mikkelsen", (byte) 19,
					"Ven Mikkelsen");
			JugadorNormal slaterMartin = new JugadorNormal("Slater Nelson", "Martin", (byte) 22, "Dugie");
			JugadorNormal clydeLovellete = new JugadorNormal("Clyde Edward", "Lovellette", (byte) 34,
					"Clyde Lovellette");
			JugadorNormal georgeMikan = new JugadorNormal("George Lawrence", "Mikan", (byte) 99, "Mr. Basketball");

			JugadorNormal[] dorsalesRetiradosLaKers = { kobe8, wiltChamberlain, elginBaylor, kobe24, gailGoodrich,
					magicJhonson, kareemAbdulJabbar, shaquilleOneal, jamesWorthy, jerryWest, jamalWilkes, jimPollard,
					vernMikelsen, slaterMartin, clydeLovellete, georgeMikan };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS LAKERS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosLaKers.length; i++) {

				ret += dorsalesRetiradosLaKers[i] + "\n";
			}

			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Grizzlies")) {

			JugadorNormal zachRandolph = new JugadorNormal("Zachary McKenley", "Randolph", (byte) 50, "Z-Bo");
			ret += "-----------------------------------------" + "\n";
			ret += "---DORSALES RETIRADOS DE LOS GRIZZLIES---" + "\n";
			ret += "|                                       |" + "\n";
			ret += zachRandolph + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Heat")) {
			JugadorNormal chrisBosh = new JugadorNormal("Christopher Wesson ", "Bosh", (byte) 1, "Boshasaurus");
			JugadorNormal dwayneWade = new JugadorNormal("Dwyane Tyrone", "Wade ", (byte) 3, "Flash");
			JugadorNormal timHardaway = new JugadorNormal("Timothy Duane", "Hardaway", (byte) 10, "Tim Bug");
			JugadorNormal danMarino = new JugadorNormal("Daniel Constantine ", "Marino", (byte) 13);
			JugadorNormal michaelJordan = new JugadorNormal("Michael", "Jordan", (byte) 23, "Air Jordan");
			JugadorNormal shaquilleOnealHeat = new JugadorNormal("Shaquille Rashaun", "O'Neal ", (byte) 32,
					"Shaq Attack");
			JugadorNormal alonzoMourning = new JugadorNormal("Alonzo Harding ", "Mourning", (byte) 33, "Zo");

			JugadorNormal[] dorsalesRetiradosHeat = { chrisBosh, dwayneWade, timHardaway, danMarino, michaelJordan,
					shaquilleOnealHeat, alonzoMourning };

			ret += "-----------------------------------------" + "\n";
			ret += "------DORSALES RETIRADOS DE LOS HEAT-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosHeat.length; i++) {

				ret += dorsalesRetiradosHeat[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Bucks")) {

			JugadorNormal oscarRobertson = new JugadorNormal("Oscar Palmer", "Robertson", (byte) 1, "Mr.Triple-Double");
			JugadorNormal juniorBridgeman = new JugadorNormal("Ulysses Lee", "Bridgeman ", (byte) 2,
					"Junior Bridgeman");
			JugadorNormal sidneyMoncrief = new JugadorNormal("Sidney Alvin", "Moncrief", (byte) 4, "The squid");
			JugadorNormal marquesJhonson = new JugadorNormal("Marques Kevin", "Johnson", (byte) 8, "Slammer");
			JugadorNormal jonMcGlockin = new JugadorNormal("Jon P.", "McGlockin", (byte) 14, "Jonny Mac");
			JugadorNormal bobLanier = new JugadorNormal("Robert Jerry", "Lanier", (byte) 16, "Bob Lanier");
			JugadorNormal brianWinters = new JugadorNormal("Brian Joseph", "Winters", (byte) 32, "Lurch");
			JugadorNormal kareemAbdulJabbar = new JugadorNormal("Kareem ", "Abdul-Jabbar", (byte) 33, "The sky Hook");

			JugadorNormal[] dorsalesRetiradosBucks = { oscarRobertson, juniorBridgeman, sidneyMoncrief, marquesJhonson,
					jonMcGlockin, bobLanier, brianWinters, kareemAbdulJabbar };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS BUCKS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosBucks.length; i++) {

				ret += dorsalesRetiradosBucks[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Timberwolves")) {
			JugadorNormal malikSealy = new JugadorNormal("Malik", "Sealy", (byte) 2, "Silk");
			ret += "-----------------------------------------" + "\n";
			ret += "--DORSALES RETIRADOS DE LOS TIMBERWOLVES-" + "\n";
			ret += "|                                       |" + "\n";
			ret += malikSealy + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Pelicans")) {

			JugadorNormal peteMaravichPelicans = new JugadorNormal("Pete", "Maravich", (byte) 7, "Pistol Pete");
			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS PELICANS---" + "\n";
			ret += "|                                       |" + "\n";
			ret += peteMaravichPelicans + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Knicks")) {

			JugadorNormal waltFrazier = new JugadorNormal("Walter", "Frazier", (byte) 10, "Clyde");
			JugadorNormal dickBarnet = new JugadorNormal("Richard", "Barnett ", (byte) 12, "Dick Barnett");
			JugadorNormal earlMonroe = new JugadorNormal("Vernon Earl", "Monroe", (byte) 15, "The Pearl");
			JugadorNormal dickMcGuire = new JugadorNormal("Richard Josephn", "McGuire", (byte) 15, "Dick the Knick");
			JugadorNormal willisReed = new JugadorNormal("Willis", "Reed", (byte) 19);
			JugadorNormal daveDeBusschere = new JugadorNormal("David Albert", "DeBusschere", (byte) 22, "Big D");
			JugadorNormal billBradley = new JugadorNormal("William Warren ", "Bradley", (byte) 24, "Bill Bradley");
			JugadorNormal patrickEwing = new JugadorNormal("Patrick Aloysius", "Ewing", (byte) 33, "Big Pat");
			JugadorNormal redHolzman = new JugadorNormal("William", "Holzman", (byte) 613, "Big D");

			JugadorNormal[] dorsalesRetiradosKnicks = { waltFrazier, dickBarnet, earlMonroe, dickMcGuire, willisReed,
					daveDeBusschere, billBradley, patrickEwing, redHolzman };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS KNICKS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosKnicks.length; i++) {

				ret += dorsalesRetiradosKnicks[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Magic")) {

			JugadorNormal aficion = new JugadorNormal("Afición", "", (byte) 6);
			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS MAGIC-----" + "\n";
			ret += "|                                       |" + "\n";
			ret += aficion + "\n";
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("76ers")) {

			JugadorNormal mosesMalonePhilly = new JugadorNormal("Moses Eugene", "Malone", (byte) 2, "Moses Malone");
			JugadorNormal allenIverson = new JugadorNormal("Allen Ezail", "Iverson ", (byte) 3, "The Answer");
			JugadorNormal juliusErvingPhilly = new JugadorNormal("Julius Winfield", "Earving ||", (byte) 6, "Dr J");
			JugadorNormal mauriceCheeks = new JugadorNormal("Maurice Edward", "Cheeks", (byte) 10, "Little Mo");
			JugadorNormal wiltChamberlain = new JugadorNormal("Wilton Norman", "Chamberlain", (byte) 13,
					"Wilt the Stilt");
			JugadorNormal halGreer = new JugadorNormal("Harold Everett", "Greer", (byte) 15, "Hal Greer");
			JugadorNormal bobbyJones = new JugadorNormal("Robert Clyde", "Jones", (byte) 22, "Bobby Jones");
			JugadorNormal billyChunningham = new JugadorNormal("William John", "Cunningham ", (byte) 32,
					"Bily Cunningham");
			JugadorNormal charlesBarkley = new JugadorNormal("Charles Wade", "Barkley", (byte) 34, "El Gordo");

			JugadorNormal[] dorsalesRetirados76ers = { mosesMalonePhilly, allenIverson, juliusErvingPhilly,
					mauriceCheeks, wiltChamberlain, halGreer, bobbyJones, billyChunningham, charlesBarkley };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS 76ERS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetirados76ers.length; i++) {

				ret += dorsalesRetirados76ers[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Suns")) {

			JugadorNormal dickVanArsdale = new JugadorNormal("Richard Albert", "Van Arsdale", (byte) 5,
					"Dick Van Arsdale");
			JugadorNormal walterDavis = new JugadorNormal("Walter Paul", "Davis ", (byte) 6, "Sweet D");
			JugadorNormal kevinJhonson = new JugadorNormal("Kevin Maurice", "Jhonson", (byte) 7, "K.J");
			JugadorNormal danMajerle = new JugadorNormal("Daniel Lewis", "Majerle", (byte) 9, "Thunder Dan");
			JugadorNormal steveNash = new JugadorNormal("Stephen John", "Nash", (byte) 13, "Nasty Nash");
			JugadorNormal tomChambers = new JugadorNormal("Thomas Doane", "Chambers ", (byte) 24, "Tommy Gun");
			JugadorNormal alvanAdams = new JugadorNormal("Alvan Leigh", "Adams  ", (byte) 33, "Double A");
			JugadorNormal charlesBarkley = new JugadorNormal("Charles Wade", "Barkley", (byte) 34, "El Gordo");
			JugadorNormal connieHawkins = new JugadorNormal("Cornelius ", "Hawkins", (byte) 42, "The Hawk");
			JugadorNormal paulWestphal = new JugadorNormal("Paul Douglas", "Westphal ", (byte) 44, "Paul Westphal");
			JugadorNormal cottonFitzsimmons = new JugadorNormal("Lowell", "Lowell ", (byte) 42, "Cotton Fitzsimmons");

			JugadorNormal[] dorsalesRetiradosSuns = { dickVanArsdale, walterDavis, kevinJhonson, danMajerle, steveNash,
					tomChambers, alvanAdams, charlesBarkley, connieHawkins, paulWestphal, cottonFitzsimmons };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS SUNS------" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosSuns.length; i++) {

				ret += dorsalesRetiradosSuns[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Trail Blazers")) {

			JugadorNormal larryWeinberg = new JugadorNormal("Larry", "Weinberg", (byte) 1);
			JugadorNormal davidTwardzik = new JugadorNormal("David", "Twardzik", (byte) 13);
			JugadorNormal lionelHollins = new JugadorNormal("Lionel Eugene", "Hollins", (byte) 14, "L-Train");
			JugadorNormal larrySteele = new JugadorNormal("Maurice D.", "Steele ", (byte) 15, "Man of steele");
			JugadorNormal mauriceLucas = new JugadorNormal("Stephen John", "Lucas", (byte) 20, "Mo Lucas");
			JugadorNormal clydeDrexler = new JugadorNormal("Clyde Austin", "Drexler ", (byte) 22, "The Glide");
			JugadorNormal bobGross = new JugadorNormal("Robert Edwin", "Gross ", (byte) 30, "Bob Gross");
			JugadorNormal terryPorter = new JugadorNormal("Terry", "Porter", (byte) 30);
			JugadorNormal billWalton = new JugadorNormal("William Theodore", "Walton", (byte) 32, "Big Red-Head");
			JugadorNormal lloydNeal = new JugadorNormal("Lloyd ", "Neal ", (byte) 36);
			JugadorNormal geoffPetrie = new JugadorNormal("Geoffrey Michael", "Petrie ", (byte) 45, "Geoff Petrie");
			JugadorNormal jackRamsay = new JugadorNormal("Dr. John T.", "Ramsay ", (byte) 77);

			JugadorNormal[] dorsalesRetiradosBlazers = { larryWeinberg, davidTwardzik, lionelHollins, larrySteele,
					mauriceLucas, clydeDrexler, bobGross, terryPorter, billWalton, lloydNeal, geoffPetrie, jackRamsay };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS BLAZERS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosBlazers.length; i++) {

				ret += dorsalesRetiradosBlazers[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}
		if (nombre.equals("Kings")) {

			JugadorNormal nateArchibal = new JugadorNormal("Nathaniel", "Archibald", (byte) 1, "Nate Tiny Archibald");
			JugadorNormal mithcRichmond = new JugadorNormal("Mitchell James", "Richmond", (byte) 2, "Hammer");
			JugadorNormal chrisWebber = new JugadorNormal("Mayce Edward Christopher", "Webber ", (byte) 4,
					"Chris Webber");
			JugadorNormal aficion = new JugadorNormal("Afición", "", (byte) 6);
			JugadorNormal bobDavies = new JugadorNormal("Robert Edris", "Davies", (byte) 11, "The Harrisburg Houdini");
			JugadorNormal mauriceStokes = new JugadorNormal("Maurice", "Stokes", (byte) 12, "Mo Stokes");
			JugadorNormal oscarRobertsonKings = new JugadorNormal("Oscar Palmer", "Robertson", (byte) 14,
					"Mr.Triple-Double");
			JugadorNormal predragStojakovic = new JugadorNormal("Predrag Peđa", "Stojaković", (byte) 16,
					"Peja Stojaković");
			JugadorNormal vladeDivac = new JugadorNormal("Vlade", "Divac", (byte) 21, "Vittorio Gassman");
			JugadorNormal jackTwynam = new JugadorNormal("John Kennedy", "Twyman", (byte) 27, "Jack Twyman");
			JugadorNormal samLacey = new JugadorNormal("Samuel", "Lacey ", (byte) 44, "Slammin' Sam");

			JugadorNormal[] dorsalesRetiradosKings = { nateArchibal, mithcRichmond, chrisWebber, aficion, bobDavies,
					mauriceStokes, oscarRobertsonKings, predragStojakovic, vladeDivac, jackTwynam, samLacey };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS KINGS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosKings.length; i++) {

				ret += dorsalesRetiradosKings[i];
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Spurs")) {

			JugadorNormal jhonnyMoore = new JugadorNormal("John Brian", "Moore", (byte) 00, "Johnny Moore");
			JugadorNormal averyJhonson = new JugadorNormal("Avery", "Johnson", (byte) 6, "Taz");
			JugadorNormal tonyParker = new JugadorNormal("William Anthony", "Parker ", (byte) 9, "Parisian Torpedo");
			JugadorNormal bruceBowen = new JugadorNormal("Bruce Eric", "Bowen", (byte) 12);
			JugadorNormal jamesSilas = new JugadorNormal("James Edward", "Silas", (byte) 13, "Captain Late");
			JugadorNormal manuGinobii = new JugadorNormal("Emanuel David", "Ginóbili", (byte) 20, "Manu Ginóbili");
			JugadorNormal timDuncan = new JugadorNormal("Timothy Theodore", "Duncan", (byte) 21, "The Big Fundamental");
			JugadorNormal seanElliot = new JugadorNormal("Sean", "Elliott", (byte) 32);
			JugadorNormal georgeGervin = new JugadorNormal("George", "Gervin", (byte) 44, "The Iceman");
			JugadorNormal davidRobinson = new JugadorNormal("David Maurice", "Robinson", (byte) 50, "The Admiral");

			JugadorNormal[] dorsalesRetiradosSpurs = { jhonnyMoore, averyJhonson, tonyParker, bruceBowen, jamesSilas,
					manuGinobii, timDuncan, seanElliot, georgeGervin, davidRobinson };

			ret += "-----------------------------------------" + "\n";
			ret += "-----DORSALES RETIRADOS DE LOS SPURS-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosSpurs.length; i++) {

				ret += dorsalesRetiradosSpurs[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Thunder")) {

			JugadorNormal gusWilliams = new JugadorNormal("Gus", "Williams", (byte) 1, "The Wizard");
			JugadorNormal nickCollison = new JugadorNormal("Nicholas John", "Collison", (byte) 4);
			JugadorNormal nateMcMillan = new JugadorNormal("Nathaniel", "McMillan", (byte) 10, "Nate McMillan");
			JugadorNormal lennyWilkens = new JugadorNormal("Leonard Randolph", "Wilkens", (byte) 19, "Lenny Wilkens");
			JugadorNormal spencerHaywood = new JugadorNormal("Spencer", "Haywood", (byte) 24);
			JugadorNormal fredBrwon = new JugadorNormal("Fred", "Brown", (byte) 32, "Downtown");
			JugadorNormal jackSikman = new JugadorNormal("Jack Wayne", "Sikma", (byte) 44, "Goldilocks");

			JugadorNormal[] dorsalesRetiradosThunder = { gusWilliams, nickCollison, nateMcMillan, lennyWilkens,
					spencerHaywood, fredBrwon, jackSikman };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS THUNDER----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosThunder.length; i++) {

				ret += dorsalesRetiradosThunder[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}

		if (nombre.equals("Jazz")) {
			JugadorNormal frankLayden = new JugadorNormal("Frank", "Layden", (byte) 1);
			JugadorNormal adrianDantley = new JugadorNormal("Adrian Delano", "Dantley", (byte) 4, "The teacher");
			JugadorNormal peteMaravichPelicans = new JugadorNormal("Pete", "Maravich", (byte) 7, "Pistol Pete");
			JugadorNormal johnStockton = new JugadorNormal("John", "Stockton", (byte) 12);
			JugadorNormal jeffHornacek = new JugadorNormal("Jeffrey John", "Hornacek", (byte) 14, "Horny");
			JugadorNormal karlMalone = new JugadorNormal("Karl", "Malone", (byte) 32, "The Mailman");
			JugadorNormal darrelGriffith = new JugadorNormal("Darrell Steven", "Griffith", (byte) 35,
					"Dr. Dunkenstein");
			JugadorNormal markEaton = new JugadorNormal("Mark", "Eaton", (byte) 53);
			JugadorNormal geraldSloan = new JugadorNormal("Gerald Eugene", "Sloan", (byte) 1223, "Jerry Sloan");

			JugadorNormal[] dorsalesRetiradosJazz = { frankLayden, adrianDantley, peteMaravichPelicans, johnStockton,
					jeffHornacek, karlMalone, darrelGriffith, markEaton, geraldSloan };

			ret += "-----------------------------------------" + "\n";
			ret += "------DORSALES RETIRADOS DE LOS JAZZ-----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosJazz.length; i++) {

				ret += dorsalesRetiradosJazz[i] + "\n";
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";

		}
		if (nombre.equals("Wizards")) {
			JugadorNormal earlMonroeWizards = new JugadorNormal("Vernon Earl", "Monroe", (byte) 10, "The Pearl");
			JugadorNormal elvinHayes = new JugadorNormal("Elvin Ernest", "Hayes", (byte) 11, "The Big E");
			JugadorNormal gusJohnson = new JugadorNormal("Gus", "Johnson", (byte) 25, "Honeycomb");
			JugadorNormal wesUnseld = new JugadorNormal("Westley Sissel", "Unseld", (byte) 41, "Wes Unseld");
			JugadorNormal philChenier = new JugadorNormal("Philip ", "Chenier ", (byte) 45, "Phil Chenier");

			JugadorNormal[] dorsalesRetiradosWizards = { earlMonroeWizards, elvinHayes, gusJohnson, wesUnseld,
					philChenier };

			ret += "-----------------------------------------" + "\n";
			ret += "----DORSALES RETIRADOS DE LOS WIZARDS----" + "\n";
			ret += "|                                       |" + "\n";

			for (byte i = 0; i < dorsalesRetiradosWizards.length; i++) {

				ret += dorsalesRetiradosWizards[i];
			}
			ret += "|                                       |" + "\n";
			ret += "-----------------------------------------" + "\n";
		}
		if (nombre.equals("Raptors")) {
			throw new EquipoSinDorsalesRetiradosException(
					"Los Raptors son un equipo relativamente reciente y no tiene dorsales retirados todavía,pero hay unos pocos JugadorNormales que puede que su caso esté en trámite");
		}
		if (nombre.equals("Clippers")) {
			throw new EquipoSinDorsalesRetiradosException(
					"Los Clippers siempre han sido un mal equipo pero retirarán los dorsales del equipo de la época de Lob City");
		}

		return ret;
	}

	public static ArrayList<JugadorNormal> getTodosLosJugadoresNBA() {

		Random r = new Random();

		ArrayList<JugadorNormal> plantillaEquipo = new ArrayList<JugadorNormal>();

		JugadorNormal traeYoung = new JugadorNormal("Trae", "Young", (byte) 11, "Ice Trae", Posicion.BASE, 8.32f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.A, Valores.D);
		JugadorNormal jhonCollins = new JugadorNormal("Jhon", "Collins", (byte) 20, Posicion.PIVOT, 23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal bogdanBogdanovich = new JugadorNormal("Bogdan", "Bogdanovich", (byte) 13, Posicion.ESCOLTA, 18f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal deandreHunter = new JugadorNormal("De'Andre", "Hunter", (byte) 12, Posicion.ALAPIVOT, 7.75f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal kevinHuerter = new JugadorNormal("Kevin", "Huerter", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(traeYoung);
		plantillaEquipo.add(kevinHuerter);
		plantillaEquipo.add(bogdanBogdanovich);
		plantillaEquipo.add(deandreHunter);
		plantillaEquipo.add(jhonCollins);

		JugadorNormal jaysonTatum = new JugadorNormal("Jason", "Tatum", (byte) 0, "JT", Posicion.ALERO, 28.2f, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.A, Valores.B, Valores.B);
		JugadorNormal jaylenBrown = new JugadorNormal("Jaylen", "Brown", (byte) 7, Posicion.ESCOLTA, 26.76f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal marcusSmart = new JugadorNormal("Marcus", "Smart", (byte) 16, Posicion.BASE, 14.36f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.A);
		JugadorNormal alHorfort = new JugadorNormal("Al", "Horford", (byte) 42, Posicion.ALAPIVOT, 27f, (byte) 5,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 29, Valores.C,
				Valores.B, Valores.C, Valores.A);
		JugadorNormal robertWilliams = new JugadorNormal("Robert", "Williams ||| ", (byte) 44, Posicion.PIVOT, 3.36f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(jaysonTatum);
		plantillaEquipo.add(jaylenBrown);
		plantillaEquipo.add(marcusSmart);
		plantillaEquipo.add(alHorfort);
		plantillaEquipo.add(robertWilliams);

		JugadorNormal kevinDurant = new JugadorNormal("Kevin", "Durant", (byte) 7, "Durantula", Posicion.ALAPIVOT,
				42.01f, (byte) 12, (byte) 2, (byte) 1, (byte) 0, true, false, (byte) 2, (byte) 2, (byte) 4,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.A, Valores.A, Valores.A, Valores.B);
		JugadorNormal sethCurry = new JugadorNormal("Seth", "Curry", (byte) 30, Posicion.ESCOLTA, 8.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.C);
		JugadorNormal bruceBrown = new JugadorNormal("Bruce", "Brown", (byte) 1, Posicion.ALERO, 4.73f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.A);
		JugadorNormal kyrieIrving = new JugadorNormal("Kyrie", "Irving", (byte) 11, "Uncle Drew", Posicion.BASE, 35.34f,
				(byte) 7, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.B, Valores.D);
		JugadorNormal lamarcusAldridge = new JugadorNormal("Lamarcus", "Aldridge", (byte) 2, Posicion.PIVOT, 2.64f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.B);
		plantillaEquipo.add(kyrieIrving);
		plantillaEquipo.add(sethCurry);
		plantillaEquipo.add(bruceBrown);
		plantillaEquipo.add(kevinDurant);
		plantillaEquipo.add(lamarcusAldridge);

		JugadorNormal lameloBall = new JugadorNormal("LaMelo", "Ball", (byte) 2, Posicion.BASE, 8.32f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C);
		JugadorNormal milesBridges = new JugadorNormal("Miles", "Bridges", (byte) 0, Posicion.ALERO, 5.56f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal terryRozier = new JugadorNormal("Terry", "Rozier", (byte) 13, "Scary Terry", Posicion.ESCOLTA,
				18f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.B, Valores.B, Valores.D);
		JugadorNormal gordonHayward = new JugadorNormal("Gordon", "Hayward", (byte) 20, Posicion.ALAPIVOT, 29.92f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal montrezlHarrel = new JugadorNormal("Montrezl", "Harrel", (byte) 8, "Trezz", Posicion.ALERO, 4.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(lameloBall);
		plantillaEquipo.add(milesBridges);
		plantillaEquipo.add(terryRozier);
		plantillaEquipo.add(gordonHayward);
		plantillaEquipo.add(montrezlHarrel);

		JugadorNormal lonzoBall = new JugadorNormal("Lonzo", "Ball", (byte) 2, Posicion.BASE, 18.6f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B, Valores.A, Valores.A,
				Valores.A);
		JugadorNormal demarDeRozan = new JugadorNormal("Demar", "DeRozan", (byte) 10, "King of the Fourth",
				Posicion.ALERO, 26f, (byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36,
				Valores.A, Valores.A, Valores.C, Valores.C);
		JugadorNormal nikolaVucevic = new JugadorNormal("Nikola", "Vucevic", (byte) 9, Posicion.PIVOT, 24f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C);
		JugadorNormal zachLavine = new JugadorNormal("Zach", "LaVine", (byte) 8, Posicion.ESCOLTA, 19.5f, (byte) 2,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.C, Valores.D);
		JugadorNormal patrickWilliams = new JugadorNormal("Patrick", "Williams", (byte) 44, Posicion.ALAPIVOT, 7.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(lonzoBall);
		plantillaEquipo.add(demarDeRozan);
		plantillaEquipo.add(nikolaVucevic);
		plantillaEquipo.add(zachLavine);
		plantillaEquipo.add(patrickWilliams);

		JugadorNormal jarretAllen = new JugadorNormal("Jarret", "Allen", (byte) 31, Posicion.PIVOT, 20, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.D, Valores.D, Valores.A);
		JugadorNormal dariusGarland = new JugadorNormal("Darius", "Garland", (byte) 10, Posicion.BASE, 10, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.A, Valores.C);
		JugadorNormal evanMoblaey = new JugadorNormal("Evan", "Mobley", (byte) 4, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal carisLeVert = new JugadorNormal("Caris", "LeVert", (byte) 3, Posicion.ESCOLTA, 17.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D);
		JugadorNormal lauriMarkkanen = new JugadorNormal("Lauri", "Markkanen", (byte) 24, Posicion.ALAPIVOT, 15.69f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B);
		plantillaEquipo.add(jarretAllen);
		plantillaEquipo.add(dariusGarland);
		plantillaEquipo.add(evanMoblaey);
		plantillaEquipo.add(carisLeVert);
		plantillaEquipo.add(lauriMarkkanen);

		JugadorNormal lukaDoncic = new JugadorNormal("Luka", "Doncic", (byte) 77, "Luka Magic", Posicion.BASE, 10.74f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.A, Valores.C);
		JugadorNormal jalenBrunson = new JugadorNormal("Jalen", "Brunson", (byte) 13, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.B, Valores.C);
		JugadorNormal spencerDinwiddie = new JugadorNormal("Spencer", "Dinwiddie", (byte) 21, Posicion.ALERO, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal dorianFinneySmith = new JugadorNormal("Dorian", "Finney-Smith", (byte) 10, Posicion.PIVOT, 4,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.D, Valores.A);
		JugadorNormal reggieBullock = new JugadorNormal("Reggie", "Bulloc", (byte) 25, Posicion.ALAPIVOT, 9.53f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B);

		plantillaEquipo.add(lukaDoncic);
		plantillaEquipo.add(jalenBrunson);
		plantillaEquipo.add(spencerDinwiddie);
		plantillaEquipo.add(dorianFinneySmith);
		plantillaEquipo.add(reggieBullock);

		JugadorNormal willBarton = new JugadorNormal("William", "Barton", (byte) 5, "Will", Posicion.ALERO, 15.62f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.C);
		JugadorNormal aaronGordon = new JugadorNormal("Aaron", "Gordon", (byte) 50, Posicion.ALAPIVOT, 16.4f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.B);
		JugadorNormal nikolaJokic = new JugadorNormal("Nikola", "Jokic", (byte) 15, Posicion.PIVOT, 31.58f, (byte) 4,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.A, Valores.A, Valores.B);
		JugadorNormal jamalMurray = new JugadorNormal("Jamal", "Murray", (byte) 27, Posicion.ESCOLTA, 29.67F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.B, Valores.B, Valores.C);
		JugadorNormal monteMorris = new JugadorNormal("Monte", "Morris", (byte) 11, Posicion.BASE, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.D);
		plantillaEquipo.add(willBarton);
		plantillaEquipo.add(aaronGordon);
		plantillaEquipo.add(nikolaJokic);
		plantillaEquipo.add(jamalMurray);
		plantillaEquipo.add(monteMorris);

		JugadorNormal cadeCunningham = new JugadorNormal("Cade", "Cunningham", (byte) 2, Posicion.BASE, 10.05f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.C, Valores.B, Valores.D);
		JugadorNormal marvinBagley = new JugadorNormal("Marvin", "Bagley", (byte) 35, Posicion.PIVOT, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.C, Valores.C, Valores.B);
		JugadorNormal sadiqqBey = new JugadorNormal("Sadiqq", "Bey", (byte) 41, Posicion.ALERO, 2.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal hamidouDiallo = new JugadorNormal("Hamidou", "Diallo", (byte) 6, Posicion.ESCOLTA, 5.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.C);
		JugadorNormal jeramiGrant = new JugadorNormal("Jerami", "Grant", (byte) 9, Posicion.ALAPIVOT, 20f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B);
		plantillaEquipo.add(cadeCunningham);
		plantillaEquipo.add(marvinBagley);
		plantillaEquipo.add(sadiqqBey);
		plantillaEquipo.add(hamidouDiallo);
		plantillaEquipo.add(jeramiGrant);

		JugadorNormal stephenCurry = new JugadorNormal("Stephen", "Curry", (byte) 30, "Chef Curry", Posicion.BASE,
				45.78f, (byte) 8, (byte) 3, (byte) 2, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34,
				Valores.A, Valores.A, Valores.A, Valores.D);
		JugadorNormal klayThompson = new JugadorNormal("Klay", "Thompson", (byte) 11, Posicion.ESCOLTA, 37.98f,
				(byte) 5, (byte) 3, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.A);
		JugadorNormal draymondGreen = new JugadorNormal("Draymond", "Green", (byte) 13, Posicion.PIVOT, 24, (byte) 4,
				(byte) 3, (byte) 0, (byte) 1, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.A, Valores.A);
		JugadorNormal andrewWiggins = new JugadorNormal("Andrew", "Hunter", (byte) 22, Posicion.ALAPIVOT, 31.57F,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		JugadorNormal jordanPoole = new JugadorNormal("Jordan", "Poole", (byte) 3, Posicion.ALERO, 2.16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C);
		plantillaEquipo.add(stephenCurry);
		plantillaEquipo.add(klayThompson);
		plantillaEquipo.add(draymondGreen);
		plantillaEquipo.add(andrewWiggins);
		plantillaEquipo.add(jordanPoole);

		JugadorNormal christianWood = new JugadorNormal("Christian", "Wood", (byte) 35, Posicion.PIVOT, 13.6F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.D, Valores.D, Valores.B);
		JugadorNormal jalenGreen = new JugadorNormal("Jalen", "Green", (byte) 0, Posicion.BASE, 23f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A, Valores.B, Valores.D,
				Valores.D);
		JugadorNormal kpj = new JugadorNormal("Kevin", "Porter Jr", (byte) 3, Posicion.ALERO, 1.78F, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B, Valores.C, Valores.D,
				Valores.C);
		JugadorNormal ericGordon = new JugadorNormal("Eric", "Gordon", (byte) 10, Posicion.ESCOLTA, 18.12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal jaseanTate = new JugadorNormal("Jae'Sean", "Tate", (byte) 8, Posicion.ALAPIVOT, 1.57f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C);
		plantillaEquipo.add(christianWood);
		plantillaEquipo.add(jalenGreen);
		plantillaEquipo.add(kpj);
		plantillaEquipo.add(ericGordon);
		plantillaEquipo.add(jaseanTate);

		JugadorNormal malcomBrogdon = new JugadorNormal("Malcom", "Brogdon", (byte) 7, Posicion.BASE, 21.7f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B,
				Valores.B, Valores.A, Valores.C);
		JugadorNormal tyreseHaliburton = new JugadorNormal("Tyrese", "halliburton", (byte) 0, Posicion.ESCOLTA, 4.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.A, Valores.C, Valores.C);
		JugadorNormal buddyHield = new JugadorNormal("Chavano Rainier", "Hield", (byte) 24, "Buddy Hield",
				Posicion.ALERO, 23.08F, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.B, Valores.A, Valores.C, Valores.B);
		JugadorNormal jalenSmith = new JugadorNormal("Jalen", "Smith", (byte) 25, Posicion.ALAPIVOT, 4.48f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.C);
		JugadorNormal mylesTurner = new JugadorNormal("Myles", "Turner", (byte) 33, Posicion.PIVOT, 18, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(malcomBrogdon);
		plantillaEquipo.add(tyreseHaliburton);
		plantillaEquipo.add(buddyHield);
		plantillaEquipo.add(jalenSmith);
		plantillaEquipo.add(mylesTurner);

		JugadorNormal russelWestbrook = new JugadorNormal("Russel", "Westbrook", (byte) 0, "Westbrick", Posicion.BASE,
				44.21f, (byte) 9, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 2, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.D, Valores.A, Valores.D);
		JugadorNormal carmeloAnthony = new JugadorNormal("Carmelo Kyam", "Anthony", (byte) 7, "Melo", Posicion.ALERO,
				2.64f, (byte) 10, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26,
				Valores.B, Valores.A, Valores.C, Valores.D);
		JugadorNormal malikMonk = new JugadorNormal("Malik", "Monk", (byte) 11, Posicion.ESCOLTA, 1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.D);
		JugadorNormal leBronJames = new JugadorNormal("LeBron", "James", (byte) 6, "King James", Posicion.ALAPIVOT,
				41.18f, (byte) 18, (byte) 4, (byte) 4, (byte) 0, true, false, (byte) 3, (byte) 4, (byte) 1,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.A, Valores.A);
		JugadorNormal anthonyDavis = new JugadorNormal("Anthony", "Davis", (byte) 3, "The Brow", Posicion.ALAPIVOT,
				35.36f, (byte) 8, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.A, Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(russelWestbrook);
		plantillaEquipo.add(carmeloAnthony);
		plantillaEquipo.add(malikMonk);
		plantillaEquipo.add(leBronJames);
		plantillaEquipo.add(anthonyDavis);

		JugadorNormal dilonBrooks = new JugadorNormal("Dilon", "Brooks", (byte) 24, Posicion.ALAPIVOT, 12.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.A,
				Valores.B, Valores.C, Valores.A);
		JugadorNormal desmondBane = new JugadorNormal("Desmond Michael", "Bane", (byte) 22, Posicion.ESCOLTA, 2.03f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 30, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal jaMorant = new JugadorNormal("Temetrius Jamel", "Morant", (byte) 12, "Ja Morant", Posicion.BASE,
				.603f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.B, Valores.C, Valores.C);
		JugadorNormal brandonClarke = new JugadorNormal("Brandon", "Clarke", (byte) 15, Posicion.ALERO, 2.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 19, Valores.B,
				Valores.D, Valores.D, Valores.B);
		JugadorNormal stevenAdams = new JugadorNormal("Steven", "Adams", (byte) 4, Posicion.PIVOT, 17, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B,
				Valores.D, Valores.C, Valores.A);
		plantillaEquipo.add(dilonBrooks);
		plantillaEquipo.add(desmondBane);
		plantillaEquipo.add(jaMorant);
		plantillaEquipo.add(brandonClarke);
		plantillaEquipo.add(stevenAdams);

		JugadorNormal jimmyButler = new JugadorNormal("Jimmy", "Butler", (byte) 22, "Jimmy Buckets", Posicion.ALERO,
				36.01f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 39,
				Valores.A, Valores.C, Valores.B, Valores.A);
		JugadorNormal bamAdebayo = new JugadorNormal("Edrice Femi", "Adebayo", (byte) 5, "Bam", Posicion.PIVOT, 28.1f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.A);
		JugadorNormal kyleLowry = new JugadorNormal("Kyle", "Lowry", (byte) 7, Posicion.BASE, 26.98f, (byte) 6,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal maxStrus = new JugadorNormal("Max", "Strus", (byte) 31, Posicion.ESCOLTA, 1.67f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal pjTucker = new JugadorNormal("Anthony Leon", "Huerter", (byte) 3, "PJ Tucker", Posicion.ALAPIVOT,
				7f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.C, Valores.C, Valores.C, Valores.A);
		plantillaEquipo.add(jimmyButler);
		plantillaEquipo.add(bamAdebayo);
		plantillaEquipo.add(kyleLowry);
		plantillaEquipo.add(maxStrus);
		plantillaEquipo.add(pjTucker);

		JugadorNormal giannisAntetokoumpo = new JugadorNormal("Giannis Ougko", "Antetokounmpo", (byte) 34,
				"The Greek Freak", Posicion.ALAPIVOT, 39.34f, (byte) 6, (byte) 1, (byte) 2, (byte) 1, false, true,
				(byte) 1, (byte) 1, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1,
				r.nextInt(5) + 1, (byte) 32, Valores.A, Valores.C, Valores.B, Valores.A);
		JugadorNormal graysonAllen = new JugadorNormal("Grayson", "Allen", (byte) 7, Posicion.ESCOLTA, 4, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.B, Valores.B);
		JugadorNormal brookLopez = new JugadorNormal("Brook", "Lopez", (byte) 11, Posicion.PIVOT, 13.3F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal jrueHoliday = new JugadorNormal("Jrue", "Holiday", (byte) 12, Posicion.BASE, 32.43f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.B, Valores.A);
		JugadorNormal khrisMiddleton = new JugadorNormal("Khris", "Middleton", (byte) 22, Posicion.ALERO, 33.5f,
				(byte) 3, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B);
		plantillaEquipo.add(giannisAntetokoumpo);
		plantillaEquipo.add(graysonAllen);
		plantillaEquipo.add(brookLopez);
		plantillaEquipo.add(jrueHoliday);
		plantillaEquipo.add(khrisMiddleton);

		JugadorNormal anthonyEdwards = new JugadorNormal("Anthony", "Edwards", (byte) 1, "Ant", Posicion.ALERO, 10.25f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.B);
		JugadorNormal malikBeasly = new JugadorNormal("Malik", "Beasly", (byte) 5, Posicion.ESCOLTA, 14.91f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal patrickBeverly = new JugadorNormal("Patrick", "Beverly", (byte) 22, Posicion.BASE, 14.32f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B,
				Valores.C, Valores.C, Valores.A);
		JugadorNormal kat = new JugadorNormal("Karl-Anthony", "Towns Cruz", (byte) 32, Posicion.PIVOT, 31.65f, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.D, Valores.B);
		JugadorNormal jadenMcDanields = new JugadorNormal("Jaden", "McDanields", (byte) 3, Posicion.ALAPIVOT, 2.06f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(anthonyEdwards);
		plantillaEquipo.add(malikBeasly);
		plantillaEquipo.add(patrickBeverly);
		plantillaEquipo.add(kat);
		plantillaEquipo.add(jadenMcDanields);

		JugadorNormal cjMcCollum = new JugadorNormal("Christian James", "McCollum", (byte) 3, "CJ McCollum",
				Posicion.ESCOLTA, 30.86f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 35, Valores.B, Valores.B, Valores.C, Valores.D);
		JugadorNormal jaxsonHayes = new JugadorNormal("Jaxon", "hayes", (byte) 10, Posicion.PIVOT, 5.34f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.D, Valores.C, Valores.B);
		JugadorNormal herbertJones = new JugadorNormal("Herbert", "Jones", (byte) 5, Posicion.ALERO, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B);
		JugadorNormal devonteGraham = new JugadorNormal("Devonte'", "Graham", (byte) 4, Posicion.BASE, 11f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.D);
		JugadorNormal jonasValanciunas = new JugadorNormal("Jonas", "Valanciunas", (byte) 17, Posicion.ALERO, 14.2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(cjMcCollum);
		plantillaEquipo.add(jaxsonHayes);
		plantillaEquipo.add(herbertJones);
		plantillaEquipo.add(devonteGraham);
		plantillaEquipo.add(jonasValanciunas);

		JugadorNormal rjBarret = new JugadorNormal("Rowan Alexander", "Barret", (byte) 9, "R.J.", Posicion.ALERO, 8.63f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal evanFournier = new JugadorNormal("Evan", "Fournier", (byte) 13, Posicion.ESCOLTA, 17.14f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.B, Valores.C);
		JugadorNormal alecBurks = new JugadorNormal("Alec", "Burks", (byte) 18, Posicion.ESCOLTA, 9.35f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal mitchellRobinson = new JugadorNormal("Mitchell", "Robinson", (byte) 23, Posicion.PIVOT, 1.8f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.B);
		JugadorNormal juliusRande = new JugadorNormal("Julius", "The King", (byte) 3, Posicion.ALERO, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		plantillaEquipo.add(rjBarret);
		plantillaEquipo.add(evanFournier);
		plantillaEquipo.add(alecBurks);
		plantillaEquipo.add(mitchellRobinson);
		plantillaEquipo.add(juliusRande);

		JugadorNormal coleAnthony = new JugadorNormal("Cole", "Anthony", (byte) 50, Posicion.BASE, 3.45f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.C, Valores.B, Valores.C);
		JugadorNormal jalenSuggs = new JugadorNormal("Jalen", "Suggs", (byte) 4, Posicion.ESCOLTA, 6.59f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.D);
		JugadorNormal moBamba = new JugadorNormal("Mohamed Fakaba", "Bamba", (byte) 5, "Mo Bamba", Posicion.BASE, 7.56f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.D, Valores.B);
		JugadorNormal franzWagner = new JugadorNormal("Franz", "wagner", (byte) 22, Posicion.ALERO, 5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal jonathanIsaac = new JugadorNormal("Jonathan", "isaac", (byte) 1, Posicion.ALAPIVOT, .17f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A);
		plantillaEquipo.add(coleAnthony);
		plantillaEquipo.add(jalenSuggs);
		plantillaEquipo.add(moBamba);
		plantillaEquipo.add(franzWagner);
		plantillaEquipo.add(jonathanIsaac);

		JugadorNormal joelEmbiid = new JugadorNormal("Joel", "Embiid", (byte) 21, "Jojo", Posicion.PIVOT, 31.54f,
				(byte) 5, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.B, Valores.B, Valores.A);
		JugadorNormal jamesHarden = new JugadorNormal("James", "Harden", (byte) 13, "The Beard", Posicion.BASE, 44.31f,
				(byte) 10, (byte) 0, (byte) 1, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 3, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.A, Valores.D);
		JugadorNormal tyreseMaxey = new JugadorNormal("Tyrese", "Maxey", (byte) 0, Posicion.ESCOLTA, 2.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal tobiasHarris = new JugadorNormal("Tobias", "Harris", (byte) 12, Posicion.ALAPIVOT, 35.95f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal matisseThybulle = new JugadorNormal("Mathisse", "Thybulle", (byte) 22, Posicion.ALERO, 2.84f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.A);
		plantillaEquipo.add(joelEmbiid);
		plantillaEquipo.add(jamesHarden);
		plantillaEquipo.add(tyreseMaxey);
		plantillaEquipo.add(tobiasHarris);
		plantillaEquipo.add(matisseThybulle);

		JugadorNormal deandreAyton = new JugadorNormal("Deandre", "Ayton", (byte) 22, Posicion.PIVOT, 12.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A,
				Valores.D, Valores.D, Valores.A);
		JugadorNormal mikalBridges = new JugadorNormal("Mikal", "Bridges", (byte) 25, Posicion.ALERO, 5.57F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.A, Valores.B, Valores.A);
		JugadorNormal devinBooker = new JugadorNormal("Devin", "Booker", (byte) 1, "D-Book", Posicion.ESCOLTA, 31.65f,
				(byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.A, Valores.B, Valores.C);
		JugadorNormal jaeCrowder = new JugadorNormal("Jae", "Crowder", (byte) 99, Posicion.ALAPIVOT, 9.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.A);
		JugadorNormal chrisPaul = new JugadorNormal("Chris", "Paul", (byte) 3, Posicion.BASE, 30.8f, (byte) 12,
				(byte) 0, (byte) 0, (byte) 0, true, false, (byte) 1, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.A, Valores.A);
		plantillaEquipo.add(deandreAyton);
		plantillaEquipo.add(mikalBridges);
		plantillaEquipo.add(devinBooker);
		plantillaEquipo.add(jaeCrowder);
		plantillaEquipo.add(chrisPaul);

		JugadorNormal damianLillard = new JugadorNormal("Damian", "Lillard", (byte) 0, "Dame Time", Posicion.BASE,
				39.34f, (byte) 6, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.A, Valores.A, Valores.D);
		JugadorNormal anferneeSimons = new JugadorNormal("Anfernee", "Simons", (byte) 1, Posicion.ESCOLTA, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C);
		JugadorNormal cjjElleby = new JugadorNormal("CJ", "Elleby", (byte) 16, Posicion.ALERO, 1.15f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 20, Valores.C,
				Valores.C, Valores.D, Valores.C);
		JugadorNormal justiceWinslow = new JugadorNormal("Justice", "Winslow", (byte) 26, Posicion.ALAPIVOT, 3.9f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.C, Valores.C, Valores.C);
		JugadorNormal jusufNurkic = new JugadorNormal("Jusuf", "Nurkic", (byte) 27, Posicion.PIVOT, 12f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.C, Valores.B);
		plantillaEquipo.add(damianLillard);
		plantillaEquipo.add(anferneeSimons);
		plantillaEquipo.add(cjjElleby);
		plantillaEquipo.add(justiceWinslow);
		plantillaEquipo.add(jusufNurkic);

		JugadorNormal deAaronFox = new JugadorNormal("De'Aaron", "Fox", (byte) 5, Posicion.BASE, 28.1f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A,
				Valores.B, Valores.B, Valores.D);
		JugadorNormal harrisonBarnes = new JugadorNormal("Harrison", "Barnes", (byte) 40, Posicion.ALERO, 20.29f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.C);
		JugadorNormal justinHoliday = new JugadorNormal("Justin", "Holiday", (byte) 9, Posicion.ESCOLTA, 6f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.D, Valores.B);
		JugadorNormal domantasSabonis = new JugadorNormal("Domantas", "Sabonis", (byte) 10, Posicion.PIVOT, 19.8f,
				(byte) 2, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B);
		JugadorNormal mauriceHarkless = new JugadorNormal("Maurice", "Harkless", (byte) 8, "Moe Harkless",
				Posicion.ALAPIVOT, 4.2f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.C, Valores.D, Valores.C, Valores.B);
		plantillaEquipo.add(deAaronFox);
		plantillaEquipo.add(harrisonBarnes);
		plantillaEquipo.add(justinHoliday);
		plantillaEquipo.add(domantasSabonis);
		plantillaEquipo.add(mauriceHarkless);

		JugadorNormal dejounteMurray = new JugadorNormal("Dejounte", "Murray", (byte) 5, Posicion.BASE, 15.24f,
				(byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.B, Valores.B, Valores.B);
		JugadorNormal lonnieWalker = new JugadorNormal("Lonnie", "Walker IV", (byte) 1, Posicion.ESCOLTA, 4.47f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.C,
				Valores.B, Valores.C, Valores.C);
		JugadorNormal keldonJhonson = new JugadorNormal("Keldon", "Jhonson", (byte) 3, Posicion.ALAPIVOT, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.B);
		JugadorNormal douMcDermott = new JugadorNormal("Doug", "McDermott", (byte) 17, Posicion.ALERO, 7.75f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.C, Valores.C, Valores.B);
		JugadorNormal jakobPoeltl = new JugadorNormal("Jakob", "Poeltl", (byte) 25, Posicion.PIVOT, 4.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B);
		plantillaEquipo.add(dejounteMurray);
		plantillaEquipo.add(lonnieWalker);
		plantillaEquipo.add(keldonJhonson);
		plantillaEquipo.add(douMcDermott);
		plantillaEquipo.add(jakobPoeltl);

		JugadorNormal luguentzDortz = new JugadorNormal("Luguentz", "Dortz", (byte) 5, "Lu Dortz", Posicion.ALERO,
				1.78f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32,
				Valores.B, Valores.B, Valores.C, Valores.A);
		JugadorNormal dariusBazley = new JugadorNormal("Darius", "Bazley", (byte) 7, Posicion.ALAPIVOT, 2.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.C,
				Valores.C, Valores.C, Valores.B);
		JugadorNormal joshGiddey = new JugadorNormal("josh", "Giddey", (byte) 3, Posicion.ESCOLTA, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.B, Valores.C);
		JugadorNormal kenrichWilliams = new JugadorNormal("Kenrich", "Williams", (byte) 34, Posicion.PIVOT, 2f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.D, Valores.D, Valores.C);
		JugadorNormal sga = new JugadorNormal("Shai", "Gilgeous-Alexander", (byte) 2, Posicion.BASE, 5.49f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.D);
		plantillaEquipo.add(luguentzDortz);
		plantillaEquipo.add(dariusBazley);
		plantillaEquipo.add(joshGiddey);
		plantillaEquipo.add(kenrichWilliams);
		plantillaEquipo.add(sga);

		JugadorNormal mikeConley = new JugadorNormal("Mike", "Conley", (byte) 11, Posicion.BASE, 21f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B,
				Valores.A, Valores.A, Valores.D);
		JugadorNormal bojanBogdanovich = new JugadorNormal("Bojan", "Bogdanovich", (byte) 44, Posicion.ALAPIVOT, 18.7f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal donovanMitchell = new JugadorNormal("Donovan", "Mitchell", (byte) 45, "Spida Mitchell",
				Posicion.ESCOLTA, 28.1f, (byte) 3, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 30, Valores.A, Valores.A, Valores.C, Valores.C);
		JugadorNormal jordanClarkson = new JugadorNormal("Jordan", "Clarkson", (byte) 00, Posicion.ALERO, 12.42f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.C, Valores.B);
		JugadorNormal rudyGobert = new JugadorNormal("Rudy", "Gobert", (byte) 27, Posicion.PIVOT, 35.34f, (byte) 3,
				(byte) 0, (byte) 0, (byte) 3, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.A);
		plantillaEquipo.add(mikeConley);
		plantillaEquipo.add(bojanBogdanovich);
		plantillaEquipo.add(donovanMitchell);
		plantillaEquipo.add(jordanClarkson);
		plantillaEquipo.add(rudyGobert);

		JugadorNormal bradleyBeal = new JugadorNormal("Bradley", "Beal", (byte) 3, Posicion.BASE, 33.72F, (byte) 3,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A,
				Valores.A, Valores.B, Valores.C);
		JugadorNormal daniAvdija = new JugadorNormal("Deni", "Advija", (byte) 9, Posicion.ALERO, 4.69f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 24, Valores.B,
				Valores.A, Valores.C, Valores.A);
		JugadorNormal kcp = new JugadorNormal("kentavius", "Cadwell-Pope", (byte) 1, "KCP", Posicion.ESCOLTA, 13.03f,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		JugadorNormal thomasBryant = new JugadorNormal("Thomas", "Bryant", (byte) 13, Posicion.PIVOT, 8.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.B,
				Valores.C, Valores.D, Valores.B);
		JugadorNormal kristapsPorzingis = new JugadorNormal("Kristaps", "Porzingis", (byte) 6, Posicion.ALAPIVOT,
				31.65f, (byte) 1, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.B, Valores.B, Valores.D, Valores.C);
		plantillaEquipo.add(bradleyBeal);
		plantillaEquipo.add(daniAvdija);
		plantillaEquipo.add(kcp);
		plantillaEquipo.add(thomasBryant);
		plantillaEquipo.add(kristapsPorzingis);

		JugadorNormal scottieBarnes = new JugadorNormal("Scott Wayne", "Barnes", (byte) 4, "Scottie", Posicion.ALERO,
				7.28f, (byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35,
				Valores.B, Valores.C, Valores.C, Valores.B);
		JugadorNormal ogAnunoby = new JugadorNormal("Ogugua", "Anunoby", (byte) 3, "OG", Posicion.ALAPIVOT, 16,
				(byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B,
				Valores.B, Valores.B, Valores.A);
		JugadorNormal fredVanVleet = new JugadorNormal("Fred", "VanVleet", (byte) 23, Posicion.BASE, 19.67f, (byte) 1,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.B, Valores.C, Valores.D);
		JugadorNormal pascalSiakam = new JugadorNormal("Pascal", "Siakam", (byte) 43, "Spicy P", Posicion.PIVOT, 33f,
				(byte) 1, (byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.D, Valores.A);
		JugadorNormal garyTrentJr = new JugadorNormal("Gary", "Trent Jr", (byte) 33, Posicion.ALERO, 16f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.C);
		plantillaEquipo.add(scottieBarnes);
		plantillaEquipo.add(ogAnunoby);
		plantillaEquipo.add(fredVanVleet);
		plantillaEquipo.add(pascalSiakam);
		plantillaEquipo.add(garyTrentJr);

		JugadorNormal reggieJackson = new JugadorNormal("Reggie", "Jackson", (byte) 1, Posicion.BASE, 10.38f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.C,
				Valores.B, Valores.C, Valores.C);
		JugadorNormal paulGeorge = new JugadorNormal("Paul", "George", (byte) 13, "PG13", Posicion.ESCOLTA, 39.34f,
				(byte) 7, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B);
		JugadorNormal kawhiLeonard = new JugadorNormal("Kawhi", "Leonard", (byte) 2, "Mr Fun Guy", Posicion.ALERO,
				39.34f, (byte) 5, (byte) 2, (byte) 0, (byte) 2, false, false, (byte) 1, (byte) 2, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30,
				Valores.A, Valores.A, Valores.C, Valores.A);
		JugadorNormal ivicaZubac = new JugadorNormal("Ivica", "Zubac", (byte) 40, Posicion.PIVOT, 7.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.D, Valores.D, Valores.B);
		JugadorNormal robertCovington = new JugadorNormal("Robert", "Covington", (byte) 23, Posicion.PIVOT, 12.98f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.C, Valores.D, Valores.A);
		plantillaEquipo.add(reggieJackson);
		plantillaEquipo.add(paulGeorge);
		plantillaEquipo.add(kawhiLeonard);
		plantillaEquipo.add(ivicaZubac);
		plantillaEquipo.add(robertCovington);

		return plantillaEquipo;

	}

}
