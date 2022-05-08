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
	private byte defensorDelA�o;
	private boolean rookieDelA�o;
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
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelA�o, boolean rookieDelA�o,
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
		this.defensorDelA�o = defensorDelA�o;
		this.rookieDelA�o = rookieDelA�o;
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
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelA�o, boolean rookieDelA�o,
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
		this.defensorDelA�o = defensorDelA�o;
		this.rookieDelA�o = rookieDelA�o;
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

	public byte getDefensorDelA�o() {
		return defensorDelA�o;
	}

	public void setDefensorDelA�o(byte defensorDelA�o) {
		this.defensorDelA�o = defensorDelA�o;
	}

	public boolean isRookieDelA�o() {
		return rookieDelA�o;
	}

	public void setRookieDelA�o(boolean rookieDelA�o) {
		this.rookieDelA�o = rookieDelA�o;
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

	

}
