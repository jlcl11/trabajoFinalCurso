package superClases;

import java.util.Random;

import enums.Posicion;
import enums.Valores;

public class Jugador extends ObjetoConNombre {
	private String apellido;
	private byte dorsal;
	private String apodo;
	private Posicion posicion;
	private float salario;
	private byte nominacionesAllStar;
	private byte anillosDeCampeon;
	private byte MVPs;
	private byte defensorDelAño;
	private boolean rookieDelAño;
	private boolean MIP;
	private byte MVPAllStar;
	private byte FMVP;
	private byte premioAnotador;
	private float PPG;
	private float APG;
	private float RBG;
	private float SPG;
	private float BPG;
	private byte MPG;// minutos por partido
	private Valores finalizacion;
	private Valores tiro;
	private Valores organizacion;
	private Valores defensas;

	public Jugador(String nombre, String apellido, byte dorsal, String apodo, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas) {
		super(nombre);
		this.apellido = apellido;
		this.dorsal = dorsal;
		this.apodo = apodo;
		this.posicion = posicion;
		this.salario = salario;
		this.nominacionesAllStar = nominacionesAllStar;
		this.anillosDeCampeon = anillosDeCampeon;
		MVPs = mVPs;
		this.defensorDelAño = defensorDelAño;
		this.rookieDelAño = rookieDelAño;
		MIP = mIP;
		MVPAllStar = mVPAllStar;
		FMVP = fMVP;
		this.premioAnotador = premioAnotador;
		PPG = pPG;
		APG = aPG;
		RBG = rBG;
		SPG = sPG;
		BPG = bPG;
		MPG = mPG;
		this.finalizacion = finalizacion;
		this.tiro = tiro;
		this.organizacion = organizacion;
		this.defensas = defensas;
	}

	public Jugador(String nombre, String apellido, byte dorsal, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores finalizacion, Valores tiro, Valores organizacion, Valores defensas) {
		super(nombre);
		this.apellido = apellido;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.salario = salario;
		this.nominacionesAllStar = nominacionesAllStar;
		this.anillosDeCampeon = anillosDeCampeon;
		MVPs = mVPs;
		this.defensorDelAño = defensorDelAño;
		this.rookieDelAño = rookieDelAño;
		MIP = mIP;
		MVPAllStar = mVPAllStar;
		FMVP = fMVP;
		this.premioAnotador = premioAnotador;
		PPG = pPG;
		APG = aPG;
		RBG = rBG;
		SPG = sPG;
		BPG = bPG;
		MPG = mPG;
		this.finalizacion = finalizacion;
		this.tiro = tiro;
		this.organizacion = organizacion;
		this.defensas = defensas;
	}

	public Jugador(String nombre, String apellido, byte dorsal, String apodo) {
		super(nombre);
		this.apellido = apellido;
		this.dorsal = dorsal;
		this.apodo = apodo;
	}

	public Jugador(String nombre, String apellido, byte dorsal) {
		super(nombre);
		this.apellido = apellido;
		this.dorsal = dorsal;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public byte getNominacionesAllStar() {
		return nominacionesAllStar;
	}

	public void setNominacionesAllStar(byte nominacionesAllStar) {
		this.nominacionesAllStar = nominacionesAllStar;
	}

	public byte getAnillosDeCampeon() {
		return anillosDeCampeon;
	}

	public void setAnillosDeCampeon(byte anillosDeCampeon) {
		this.anillosDeCampeon = anillosDeCampeon;
	}

	public byte getMVPs() {
		return MVPs;
	}

	public void setMVPs(byte mVPs) {
		MVPs = mVPs;
	}

	public byte getDefensorDelAño() {
		return defensorDelAño;
	}

	public void setDefensorDelAño(byte defensorDelAño) {
		this.defensorDelAño = defensorDelAño;
	}

	public boolean isRookieDelAño() {
		return rookieDelAño;
	}

	public void setRookieDelAño(boolean rookieDelAño) {
		this.rookieDelAño = rookieDelAño;
	}

	public boolean isMIP() {
		return MIP;
	}

	public void setMIP(boolean mIP) {
		MIP = mIP;
	}

	public byte getMVPAllStar() {
		return MVPAllStar;
	}

	public void setMVPAllStar(byte mVPAllStar) {
		MVPAllStar = mVPAllStar;
	}

	public byte getFMVP() {
		return FMVP;
	}

	public void setFMVP(byte fMVP) {
		FMVP = fMVP;
	}

	public byte getPremioAnotador() {
		return premioAnotador;
	}

	public void setPremioAnotador(byte premioAnotador) {
		this.premioAnotador = premioAnotador;
	}

	public float getPPG() {
		return PPG;
	}

	public void setPPG(float pPG) {
		PPG = pPG;
	}

	public float getAPG() {
		return APG;
	}

	public void setAPG(float aPG) {
		APG = aPG;
	}

	public float getRBG() {
		return RBG;
	}

	public void setRBG(float rBG) {
		RBG = rBG;
	}

	public float getSPG() {
		return SPG;
	}

	public void setSPG(float sPG) {
		SPG = sPG;
	}

	public float getBPG() {
		return BPG;
	}

	public void setBPG(float bPG) {
		BPG = bPG;
	}

	public byte getMPG() {
		return MPG;
	}

	public void setMPG(byte mPG) {
		MPG = mPG;
	}

	public Valores getfinalizacion() {
		return finalizacion;
	}

	public void setfinalizacion(Valores finalizacion) {
		this.finalizacion = finalizacion;
	}

	public Valores gettiro() {
		return tiro;
	}

	public void settiro(Valores tiro) {
		this.tiro = tiro;
	}

	public Valores getorganizacion() {
		return organizacion;
	}

	public void setorganizacion(Valores organizacion) {
		this.organizacion = organizacion;
	}

	public Valores getdefensas() {
		return defensas;
	}

	public void setdefensas(Valores defensas) {
		this.defensas = defensas;
	}

	public void jugadores() {
		Random r = new Random();

		Jugador preciousAchiuwa = new Jugador("Precious", "Achiuwa", (byte) 5, Posicion.ALAPIVOT, 2.78f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.B, Valores.D, Valores.B);
		Jugador stevenAdams = new Jugador("Steven", "Adams", (byte) 4, Posicion.PIVOT, 17, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B, Valores.D, Valores.C,
				Valores.A);
		Jugador bamAdebayo = new Jugador("Edrice Femi", "Adebayo", (byte) 5, "Bam", Posicion.PIVOT, 28.1f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.C, Valores.C, Valores.A);
		Jugador santiAldama = new Jugador("Santiago", "Aldama Toledo", (byte) 5, "Santi", Posicion.ALAPIVOT, 1.94f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 11, Valores.C,
				Valores.B, Valores.C, Valores.C);
		Jugador lamarcusAldridge = new Jugador("Lamarcus", "Aldridge", (byte) 2, Posicion.PIVOT, 2.64f, (byte) 7,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.B, Valores.C, Valores.B);
		Jugador nickeilAlexanderWalker = new Jugador("Nickeil", "Alexander-Walker", (byte) 6, Posicion.ESCOLTA, 3.26f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.C,
				Valores.B, Valores.B, Valores.D);
		Jugador graysonAllen = new Jugador("Grayson", "Allen", (byte) 7, Posicion.ESCOLTA, 4, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B, Valores.A, Valores.B,
				Valores.B);
		Jugador jarretAllen = new Jugador("Jarret", "Allen", (byte) 31, "Bam", Posicion.PIVOT, 20, (byte) 1, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A, Valores.D, Valores.D,
				Valores.A);
		Jugador joseAlvarado = new Jugador("Jose", "Alvarado", (byte) 15, Posicion.BASE, 1.5f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.C, Valores.B, Valores.C,
				Valores.A);
		Jugador kyleAnderson = new Jugador("Kyle", "Anderson", (byte) 1, "Slow-Mo", Posicion.ALAPIVOT, 9.93f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 21, Valores.B,
				Valores.B, Valores.C, Valores.B);
		Jugador giannisAntetokoumpo = new Jugador("Giannis Ougko", "Antetokounmpo", (byte) 34, "The Greek Freak",
				Posicion.ALAPIVOT, 39.34f, (byte) 6, (byte) 1, (byte) 2, (byte) 1, false, true, (byte) 1, (byte) 1,
				(byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1,
				(byte) 32, Valores.A, Valores.C, Valores.B, Valores.A);
		Jugador thanasisAntetokoumpo = new Jugador("Athanasios", "Antetokoumpo", (byte) 43, "Thanasis", Posicion.ALERO,
				1.72f, (byte) 0, (byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0,
				r.nextInt(35) + 1, r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10,
				Valores.B, Valores.C, Valores.C, Valores.B);
		Jugador carmeloAnthony = new Jugador("Carmelo Kyam", "Anthony", (byte) 7, "Melo", Posicion.ALERO, 2.64f,
				(byte) 10, (byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 1, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B,
				Valores.A, Valores.C, Valores.D);
		Jugador coleAnthony = new Jugador("Cole", "Anthony", (byte) 50, Posicion.BASE, 3.45f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B, Valores.C, Valores.B,
				Valores.C);
		Jugador ogAnunoby = new Jugador("Ogugua", "Anunoby", (byte) 3, "OG", Posicion.ALERO, 16, (byte) 0, (byte) 1,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.B, Valores.B, Valores.B,
				Valores.A);
		Jugador ryanArcidiacono = new Jugador("Ryan", "Arcidiacono", (byte) 51, Posicion.BASE, 0.79F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 7, Valores.C,
				Valores.C, Valores.B, Valores.D);
		Jugador djAugustin = new Jugador("Darryl Jerard", "Augustin", (byte) 4, "D.J.", Posicion.BASE, 0.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 18, Valores.C,
				Valores.B, Valores.B, Valores.D);
		Jugador daniAvdija = new Jugador("Deni", "Advija", (byte) 9, Posicion.ALERO, 4.69f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 24, Valores.B, Valores.A, Valores.C,
				Valores.A);
		Jugador deandreAyton = new Jugador("Deandre", "Ayton", (byte) 22, Posicion.PIVOT, 12.63f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.A, Valores.D, Valores.D,
				Valores.A);
		Jugador udokaAzubike = new Jugador("Udoka Timothy", "Azubike", (byte) 20, Posicion.ALERO, 2.07f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 11, Valores.C,
				Valores.D, Valores.D, Valores.C);
		Jugador marvinBagley = new Jugador("Marvin", "Bagley", (byte) 35, Posicion.PIVOT, 11f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B, Valores.C, Valores.C,
				Valores.B);
		Jugador lameloBall = new Jugador("LaMelo", "Ball", (byte) 2, Posicion.BASE, 8.32f, (byte) 1, (byte) 0, (byte) 0,
				(byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B, Valores.B, Valores.A,
				Valores.C);
		Jugador lonzoBall = new Jugador("Lonzo", "Ball", (byte) 2, Posicion.BASE, 18.6f, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B, Valores.A, Valores.A,
				Valores.A);
		Jugador moBamba = new Jugador("Mohamed Fakaba", "Bamba", (byte) 5, "Mo", Posicion.BASE, 7.56f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.B, Valores.D, Valores.B);
		Jugador desmondBane = new Jugador("Desmond Michael", "Bane", (byte) 22, Posicion.ESCOLTA, 2.03f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 30, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador dalanoBanton = new Jugador("Dalano", "Banton", (byte) 45, Posicion.ALERO, 0.92F, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 11, Valores.C, Valores.C, Valores.D,
				Valores.C);
		Jugador harrisonBarnes = new Jugador("Harrison", "Barnes", (byte) 40, Posicion.ALERO, 20.29f, (byte) 0,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.C);
		Jugador scottieBarnes = new Jugador("Scott Wayne", "Barnes", (byte) 4, "Scottie", Posicion.ALERO, 7.28f,
				(byte) 0, (byte) 0, (byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B,
				Valores.C, Valores.C, Valores.B);
		Jugador rjBarret = new Jugador("Rowan Alexander", "Barret", (byte) 9, "R.J.", Posicion.ESCOLTA, 8.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador willBarton = new Jugador("William", "Barton", (byte) 5, "Will", Posicion.BASE, 15.62f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.C,
				Valores.B, Valores.B, Valores.C);
		Jugador charlesBassey = new Jugador("Charles", "bassey", (byte) 23, Posicion.PIVOT, 0.92f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 7, Valores.B, Valores.C, Valores.D,
				Valores.C);
		Jugador keitaBatesDiop = new Jugador("Keita", "Bates-Diop", (byte) 33, Posicion.ALERO, 1.79F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.B,
				Valores.C, Valores.D, Valores.C);
		Jugador nicolasBatum = new Jugador("Nicolas", "Batum", (byte) 33, Posicion.ALAPIVOT, 3.17f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B, Valores.A, Valores.C,
				Valores.B);
		Jugador kentBazemore = new Jugador("Kent", "Bazemore", (byte) 9, Posicion.ESCOLTA, 2.4f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 14, Valores.C, Valores.A, Valores.D,
				Valores.C);
		Jugador dariusBazley = new Jugador("Darius", "Bazley", (byte) 7, Posicion.ALAPIVOT, 2.5f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.C, Valores.C, Valores.C,
				Valores.B);
		Jugador bradleyBeal = new Jugador("Bradley", "Beal", (byte) 3, Posicion.ESCOLTA, 33.72F, (byte) 3, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A, Valores.A, Valores.B,
				Valores.C);
		Jugador malikBeasly = new Jugador("Malik", "Beasly", (byte) 5, Posicion.ESCOLTA, 14.91f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B, Valores.B, Valores.C,
				Valores.B);
		Jugador davisBertans = new Jugador("Davis", "Bertans", (byte) 44, Posicion.ALAPIVOT, 16f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 14, Valores.B, Valores.A, Valores.C,
				Valores.B);
		Jugador patrickBeverly = new Jugador("Patrick", "Beverly", (byte) 22, Posicion.BASE, 14.32f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B, Valores.C, Valores.C,
				Valores.A);
		Jugador sadiqqBey = new Jugador("Sadiqq", "Bey", (byte) 41, Posicion.ALERO, 2.8f, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B, Valores.B, Valores.C,
				Valores.B);
		Jugador kemBirch = new Jugador("Khem", "Birch", (byte) 24, Posicion.PIVOT, 6.35f, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 18, Valores.B, Valores.D, Valores.D,
				Valores.B);
		Jugador gogaBitazde = new Jugador("Goga", "Bitazde", (byte) 88, Posicion.PIVOT, 3.09f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 15, Valores.B, Valores.D, Valores.D,
				Valores.B);
		Jugador bismackBiyombo = new Jugador("Bismack", "Biyombo", (byte) 18, Posicion.PIVOT, 1.58f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 14, Valores.B, Valores.C, Valores.C,
				Valores.B);
		Jugador nemanjaBjelica = new Jugador("Nemanja", "Bjelica", (byte) 8, Posicion.ALAPIVOT, 2.09F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.C,
				Valores.A, Valores.B, Valores.C);
		Jugador ericBledsoe = new Jugador("Eric", "Bledoe", (byte) 12, Posicion.BASE, 18.12f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B, Valores.C, Valores.C,
				Valores.B);
		Jugador keljinBlevins = new Jugador("Keljin", "Blevins", (byte) 21, Posicion.BASE, 0.23f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 7, Valores.D, Valores.C, Valores.C,
				Valores.D);
		Jugador bogdanBogdanovich = new Jugador("Bogdan", "Bogdanovich", (byte) 13, Posicion.ESCOLTA, 18f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador bojanBogdanovich = new Jugador("Bojan", "Bogdanovich", (byte) 44, Posicion.ALERO, 18.7f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador leandroBolmaro = new Jugador("Leandro", "Bolmaro", (byte) 13, Posicion.ESCOLTA, 2.35F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 7, Valores.C,
				Valores.C, Valores.C, Valores.D);
		Jugador isaacBonga = new Jugador("Isaac", "Bonga", (byte) 17, Posicion.ESCOLTA, 1.79f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 5, Valores.B, Valores.C, Valores.D,
				Valores.D);
		Jugador devinBooker = new Jugador("Devin", "Booker", (byte) 1, Posicion.ESCOLTA, 31.65f, (byte) 3, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.A, Valores.A, Valores.B,
				Valores.C);
		Jugador bjBoston = new Jugador("Brandon", "Boston", (byte) 4, "BJ Boston", Posicion.ESCOLTA, 0.92F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 15, Valores.B,
				Valores.D, Valores.D, Valores.C);
		Jugador chrisBoucher = new Jugador("Chris", "Boucher", (byte) 25, Posicion.ALAPIVOT, 7f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 21, Valores.B, Valores.B, Valores.C,
				Valores.B);
		Jugador jamesBouknight = new Jugador("James", "Bouknight", (byte) 5, Posicion.ESCOLTA, 4.15f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 10, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 21, Valores.B,
				Valores.C, Valores.C, Valores.D);
		Jugador averyBradley = new Jugador("Avery", "Bradley", (byte) 20, Posicion.ESCOLTA, 2.64f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 23, Valores.C, Valores.B, Valores.C,
				Valores.A);
		Jugador tonyBradley = new Jugador("Anthony", "Bradley", (byte) 13, Posicion.PIVOT, 1.79f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B, Valores.D, Valores.D,
				Valores.B);
		Jugador ignasBrazdeikis = new Jugador("Ignas", "Brazdeikis", (byte) 17, Posicion.ALERO, 0.25F, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 5, Valores.C,
				Valores.C, Valores.D, Valores.C);
		Jugador mikalBridges = new Jugador("Mikal", "Bridges", (byte) 25, Posicion.ALERO, 5.57F, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 35, Valores.B, Valores.A, Valores.B,
				Valores.A);
		Jugador milesBridges = new Jugador("Miles", "Bridges", (byte) 0, Posicion.ALERO, 5.56f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 36, Valores.A, Valores.A, Valores.C,
				Valores.B);
		Jugador oshaeBrisset = new Jugador("Oshae", "Brisset", (byte) 12, Posicion.ALAPIVOT, 1.7f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 23, Valores.B, Valores.B, Valores.D,
				Valores.B);
		Jugador malcomBrogdon = new Jugador("Malcom", "Brogdon", (byte) 7, Posicion.BASE, 21.7f, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, true, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1, r.nextInt(11) + 1,
				r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 33, Valores.B, Valores.B, Valores.A,
				Valores.C);
		Jugador armoniBrooks = new Jugador("Armoni", "Brooks", (byte) 1,Posicion.BASE,0.3f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 12, Valores.D,
				Valores.C, Valores.C, Valores.D);
		Jugador dilonBrooks = new Jugador("Dilon", "Brooks", (byte) 24,Posicion.ALERO,12.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.A,
				Valores.B, Valores.C, Valores.A);
		Jugador bruceBrown = new Jugador("Bruce", "Brown", (byte) 1,Posicion.ESCOLTA,4.73f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 25, Valores.B,
				Valores.B, Valores.C, Valores.A);
		Jugador chaundeeBrown = new Jugador("Chaundee", "Brown", (byte) 38,Posicion.ESCOLTA,70.23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 6, Valores.C,
				Valores.D, Valores.D, Valores.D);
		Jugador gregBrown = new Jugador("Greg", "Brown", (byte) 4,Posicion.ALAPIVOT,0.92f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 13, Valores.C,
				Valores.D, Valores.D, Valores.C);
		Jugador jaylenBrown = new Jugador("Jaylen", "Brown", (byte) 7,Posicion.ESCOLTA,26.76f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 34, Valores.A,
				Valores.A, Valores.C, Valores.B);
		Jugador mosesBrown = new Jugador("Moses", "Brown", (byte) 6,Posicion.PIVOT,0.24f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 12, Valores.D,
				Valores.D, Valores.D, Valores.C);
		Jugador sterlingBrown = new Jugador("Sterling", "Brown", (byte) 0,Posicion.BASE,3f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 13, Valores.C,
				Valores.B, Valores.D, Valores.C);
		Jugador troyBrown = new Jugador("Troy", "Brown", (byte) 7,Posicion.ALERO,5.17f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.C,
				Valores.C, Valores.C, Valores.C);
		Jugador charlieBrown = new Jugador("Charlie", "Brown", (byte) 16,Posicion.BASE,0.5f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 8, Valores.C,
				Valores.C, Valores.C, Valores.D);
		Jugador jalenBrunson = new Jugador("Jalen", "Brunson", (byte) 13,Posicion.BASE,1.8f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.B,
				Valores.A, Valores.B, Valores.C);
		Jugador thomasBryant = new Jugador("Thomas", "Bryant", (byte) 13,Posicion.PIVOT,8.63f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 16, Valores.B,
				Valores.C, Valores.D, Valores.B);
		Jugador reggieBullock = new Jugador("Reggie", "Bulloc", (byte) 25,Posicion.ESCOLTA,9.53f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador treyBurke = new Jugador("Trey", "Burke", (byte) 3,Posicion.BASE,3.15f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 11, Valores.C,
				Valores.B, Valores.B, Valores.C);
		Jugador alecBurks = new Jugador("Alec", "Burks", (byte) 18,Posicion.ESCOLTA,9.35f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.B, Valores.C, Valores.B);
		Jugador jaredButler = new Jugador("Jared", "Butler", (byte) 13,Posicion.BASE,0.92f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.D,
				Valores.C, Valores.C, Valores.D);
		Jugador jimmyButler = new Jugador("Jimmy", "Butler", (byte) 22,"Jimmy Buckets",Posicion.ALERO,36.01f, (byte) 6,
				(byte) 0, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 39, Valores.A,
				Valores.B, Valores.B, Valores.A);
		Jugador davontae = new Jugador("Devontae", "Cacok", (byte) 18,Posicion.ALAPIVOT,0.72f, (byte) 0,
				(byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 8, Valores.C,
				Valores.D, Valores.D, Valores.B);
		Jugador kcp = new Jugador("kentavius", "Cadwell-Pope", (byte) 1,Posicion.ESCOLTA,13.03f, (byte) 0,
				(byte) 1, (byte) 0, (byte) 0, false, true, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.B,
				Valores.B, Valores.C, Valores.A);
		Jugador facundoCampazzo = new Jugador("Facundo", "Campazzo", (byte) 7,"El Facu",Posicion.BASE,3.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte)18, Valores.C,
				Valores.C, Valores.B, Valores.B);
		Jugador vlaktoCancar = new Jugador("Vlaktor", "Cancar", (byte) 31,Posicion.ALAPIVOT,1.78f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 12, Valores.C,
				Valores.D, Valores.D, Valores.C);
		Jugador devinCannady = new Jugador("Devin", "Canady", (byte) 30,Posicion.BASE,0.09f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28.9, Valores.D,
				Valores.D, Valores.C, Valores.D);
		Jugador clintCapela = new Jugador("Clint", "Capela", (byte) 15,Posicion.PIVOT,18.6f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27.7, Valores.B,
				Valores.D, Valores.C, Valores.A);
		Jugador vernonCareyJr = new Jugador("Vernon", "Carney Jr", (byte) 22,Posicion.PIVOT,1.51f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 9, Valores.C,
				Valores.C, Valores.C, Valores.B);
		Jugador jevonCarter = new Jugador("Jevon", "Carter", (byte) 5,Posicion.BASE,0.45f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 17.7, Valores.B,
				Valores.B, Valores.C, Valores.D);
		Jugador wendellCarterJr = new Jugador("Wendell", "Carter Jr", (byte) 34,Posicion.PIVOT,6.92f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B,
				Valores.D, Valores.D, Valores.B);
		Jugador alexCaruso = new Jugador("Alex", "Caruso", (byte) 6,"The Bald Mamba",Posicion.BASE,10f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.B, Valores.B, Valores.A);
		Jugador justinChampagnie = new Jugador("Justin", "Champagnie", (byte) 11,Posicion.ALERO,0.25f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 8, Valores.D,
				Valores.C, Valores.C, Valores.D);
		Jugador chrisChiozza = new Jugador("Chris", "Chiozza", (byte) 2,Posicion.BASE,0.25f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 11, Valores.C,
				Valores.B, Valores.C, Valores.D);
		Jugador marquesseChriss = new Jugador("Marquesse", "Chriss", (byte) 32,Posicion.PIVOT,1.29f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.B,
				Valores.D, Valores.C, Valores.B);
		Jugador joshChristopher = new Jugador("Josh", "Christopher", (byte) 9,Posicion.ESCOLTA,2.26f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 18, Valores.D,
				Valores.C, Valores.C, Valores.D);
		Jugador garyClark = new Jugador("Gary", "Clark", (byte) 12,Posicion.ALAPIVOT,0.62f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.D,
				Valores.C, Valores.C, Valores.D);
		Jugador brandonClarke = new Jugador("Brandon", "Clarke", (byte) 15,Posicion.BASE,2.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 19, Valores.B,
				Valores.D, Valores.D, Valores.B);
		Jugador jordanClarkson = new Jugador("Jordan", "Clarkson", (byte) 00,Posicion.ESCOLTA,12.42f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 27, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador nicolasClaxton = new Jugador("Nicolas", "Claxton", (byte) 33,"Nic Claxton",Posicion.PIVOT,1.78f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 20, Valores.B,
				Valores.C, Valores.C, Valores.B);
		Jugador amirCoffey = new Jugador("Amir", "Coffey", (byte) 7,Posicion.ALERO,0.61f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 23, Valores.C,
				Valores.C, Valores.C, Valores.C);
		Jugador jhonCollins = new Jugador("Jhon", "Collins", (byte) 20,Posicion.ALAPIVOT,23f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 31, Valores.A,
				Valores.B, Valores.C, Valores.B);
		Jugador zachCollins = new Jugador("Zach", "Collins", (byte) 23,Posicion.ALERO,7f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 18, Valores.B,
				Valores.B, Valores.C, Valores.C);
		Jugador mikeConley = new Jugador("Mike", "Conley", (byte) 11,Posicion.BASE,21f, (byte) 1,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.B,
				Valores.A, Valores.A, Valores.D);
		Jugador patConnaughton = new Jugador("Pat", "Connaughton", (byte) 24,Posicion.BASE,5.33f, (byte) 0,
				(byte) 1, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 26, Valores.B,
				Valores.A, Valores.C, Valores.B);
		Jugador tylerCook = new Jugador("Tyler", "Craig", (byte) 25,Posicion.ALERO,0.25f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 10, Valores.C,
				Valores.C, Valores.C, Valores.D);
		Jugador sharifeCooper = new Jugador("Sharife", "Cooper", (byte) 2,Posicion.BASE,0.25f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 3, Valores.D,
				Valores.C, Valores.C, Valores.D);
		Jugador deMacusCousins = new Jugador("DeMarcus", "Cousins", (byte) 4,Posicion.PIVOT,1.14f, (byte) 4,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 12, Valores.C,
				Valores.D, Valores.D, Valores.B);
		Jugador robertCovington = new Jugador("Robert", "Covington", (byte) 23,Posicion.PIVOT,12.98f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 22, Valores.B,
				Valores.C, Valores.D, Valores.A);
		Jugador torreyCraig = new Jugador("Torrey", "Craig", (byte) 0,Posicion.ALERO,4.87f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 21, Valores.B,
				Valores.C, Valores.D, Valores.B);
		Jugador jaeCrowder = new Jugador("Jae", "Crowder", (byte) 99,Posicion.BASE,9.72f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 28, Valores.B,
				Valores.A, Valores.C, Valores.A);
		Jugador jarretCulver = new Jugador("Jarret", "Culver", (byte) 23,Posicion.ALERO, 6.39f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 9, Valores.B,
				Valores.C, Valores.C, Valores.B);
		Jugador cadeCunningham = new Jugador("Cade", "Cunningham", (byte) 2,Posicion.BASE,10.05f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 32, Valores.A,
				Valores.C, Valores.B, Valores.D);
		Jugador sethCurry = new Jugador("Seth", "Curry", (byte) 30,Posicion.ESCOLTA,8.2f, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0, false, false, (byte) 0, (byte) 0, (byte) 0, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 30, Valores.C,
				Valores.A, Valores.C, Valores.C);
		Jugador stephenCurry = new Jugador("Stephen", "Curry", (byte) 30,"Chef Curry",Posicion.BASE,45.78f, (byte) 8,
				(byte) 3, (byte) 2, (byte) 0, false, false, (byte) 1, (byte) 0, (byte) 2, r.nextInt(35) + 1,
				r.nextInt(11) + 1, r.nextInt(20) + 1, r.nextInt(2) + 1, r.nextInt(5) + 1, (byte) 4.7, Valores.A,
				Valores.A, Valores.A, Valores.B);

	}

	@Override
	public String toString() {

		if (salario <= 0 && apodo != null) {
			return getNombre() + " " + apellido + " nº" + dorsal + " conocido como " + apodo;
		}
		if (salario <= 0 && apodo == null) {
			return getNombre() + " " + apellido + " nº" + dorsal;
		}

		else {
			return "Jugador [apellido=" + apellido + ", dorsal=" + dorsal + ", apodo=" + apodo + ", posicion="
					+ posicion + ", salario=" + salario + ", nominacionesAllStar=" + nominacionesAllStar
					+ ", anillosDeCampeon=" + anillosDeCampeon + ", MVPs=" + MVPs + ", defensorDelAño=" + defensorDelAño
					+ ", rookieDelAño=" + rookieDelAño + ", MIP=" + MIP + ", MVPAllStar=" + MVPAllStar + ", FMVP="
					+ FMVP + ", premioAnotador=" + premioAnotador + ", PPG=" + PPG + ", APG=" + APG + ", RBG=" + RBG
					+ ", SPG=" + SPG + ", BPG=" + BPG + ", MPG=" + MPG + ", finalizacion=" + finalizacion + ", tiro="
					+ tiro + ", organizacion=" + organizacion + ", defensas=" + defensas + "]";
		}
	}

}
