package clases;

import java.util.ArrayList;
import java.util.Random;

import enums.Posicion;
import enums.Valores;
import exceptions.EquipoSinDorsalesRetiradosException;
import superClases.Jugador;
import superClases.Jugador;

public class JugadorNormal extends Jugador {

	public JugadorNormal(String nombre, String apellido, byte dorsal, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas) {
		super(nombre, apellido, dorsal, posicion, salario, nominacionesAllStar, anillosDeCampeon, mVPs, defensorDelAño,
				rookieDelAño, mIP, mVPAllStar, fMVP, premioAnotador, pPG, aPG, rBG, sPG, bPG, mPG, finalizacion, tiro,
				organizacion, defensas);
		// TODO Auto-generated constructor stub
	}

	public JugadorNormal(String nombre, String apellido, byte dorsal, String apodo, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas) {
		super(nombre, apellido, dorsal, apodo, posicion, salario, nominacionesAllStar, anillosDeCampeon, mVPs,
				defensorDelAño, rookieDelAño, mIP, mVPAllStar, fMVP, premioAnotador, pPG, aPG, rBG, sPG, bPG, mPG,
				finalizacion, tiro, organizacion, defensas);
		// TODO Auto-generated constructor stub
	}

	public JugadorNormal(String nombre, String apellido, byte dorsal, String apodo) {
		super(nombre, apellido, dorsal, apodo);
		// TODO Auto-generated constructor stub
	}

	public JugadorNormal(String nombre, String apellido, byte dorsal) {
		super(nombre, apellido, dorsal);
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<JugadorNormal> JugadoresNormales(String nombre) {
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

	@Override
	public String toString() {
		return "JugadorNormal [getApellido()=" + getApellido() + ", getDorsal()=" + getDorsal() + ", getApodo()="
				+ getApodo() + ", getPosicion()=" + getPosicion() + ", getSalario()=" + getSalario()
				+ ", getNominacionesAllStar()=" + getNominacionesAllStar() + ", getAnillosDeCampeon()="
				+ getAnillosDeCampeon() + ", getMVPs()=" + getMVPs() + ", getDefensorDelAño()=" + getDefensorDelAño()
				+ ", isRookieDelAño()=" + isRookieDelAño() + ", isMIP()=" + isMIP() + ", getMVPAllStar()="
				+ getMVPAllStar() + ", getFMVP()=" + getFMVP() + ", getPremioAnotador()=" + getPremioAnotador()
				+ ", getPPG()=" + getPPG() + ", getAPG()=" + getAPG() + ", getRBG()=" + getRBG() + ", getSPG()="
				+ getSPG() + ", getBPG()=" + getBPG() + ", getMPG()=" + getMPG() + ", getfinalizacion()="
				+ getfinalizacion() + ", gettiro()=" + gettiro() + ", getorganizacion()=" + getorganizacion()
				+ ", getdefensas()=" + getdefensas() + ", toString()=" + super.toString() + ", getNombre()="
				+ getNombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "\n";
	}

}
