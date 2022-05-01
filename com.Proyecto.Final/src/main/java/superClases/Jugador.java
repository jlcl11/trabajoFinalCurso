package superClases;

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
	private Valores ataque;
	private Valores defensa;
	private Valores intangibles;
	private Valores clutch;

	public Jugador(String nombre, String apellido, byte dorsal, String apodo, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores ataque, Valores defensa, Valores intangibles, Valores clutch) {
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
		this.ataque = ataque;
		this.defensa = defensa;
		this.intangibles = intangibles;
		this.clutch = clutch;
	}

	public Jugador(String nombre, String apellido, byte dorsal, String apodo) {
		super(nombre);
		this.apellido = apellido;
		this.dorsal = dorsal;
		this.apodo = apodo;
	}

	public Jugador(String nombre) {
		super(nombre);

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

	public Valores getAtaque() {
		return ataque;
	}

	public void setAtaque(Valores ataque) {
		this.ataque = ataque;
	}

	public Valores getDefensa() {
		return defensa;
	}

	public void setDefensa(Valores defensa) {
		this.defensa = defensa;
	}

	public Valores getIntangibles() {
		return intangibles;
	}

	public void setIntangibles(Valores intangibles) {
		this.intangibles = intangibles;
	}

	public Valores getClutch() {
		return clutch;
	}

	public void setClutch(Valores clutch) {
		this.clutch = clutch;
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
					+ ", SPG=" + SPG + ", BPG=" + BPG + ", MPG=" + MPG + ", ataque=" + ataque + ", defensa=" + defensa
					+ ", intangibles=" + intangibles + ", clutch=" + clutch + "]";
		}
	}

}
