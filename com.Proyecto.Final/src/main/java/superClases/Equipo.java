package superClases;

import clases.Conferencia;

public class Equipo extends ObjetoConNombre{
private Conferencia conferencia;
private String CiudadLocal;
private Jugador[] dorsalesRetirados;
private String propietario;
private String GM;
private float limiteSalarial;

public Equipo(String nombre, Conferencia conferencia, String ciudadLocal, Jugador[] dorsalesRetirados,
		String propietario, String gM, float limiteSalarial) {
	super(nombre);
	this.conferencia = conferencia;
	CiudadLocal = ciudadLocal;
	this.dorsalesRetirados = dorsalesRetirados;
	this.propietario = propietario;
	GM = gM;
	this.limiteSalarial = limiteSalarial;
}

public Conferencia getConferencia() {
	return conferencia;
}

public void setConferencia(Conferencia conferencia) {
	this.conferencia = conferencia;
}

public String getCiudadLocal() {
	return CiudadLocal;
}

public void setCiudadLocal(String ciudadLocal) {
	CiudadLocal = ciudadLocal;
}

public Jugador[] getDorsalesRetirados() {
	return dorsalesRetirados;
}

public void setDorsalesRetirados(Jugador[] dorsalesRetirados) {
	this.dorsalesRetirados = dorsalesRetirados;
}

public String getPropietario() {
	return propietario;
}

public void setPropietario(String propietario) {
	this.propietario = propietario;
}

public String getGM() {
	return GM;
}

public void setGM(String gM) {
	GM = gM;
}

public float getLimiteSalarial() {
	return limiteSalarial;
}

public void setLimiteSalarial(float limiteSalarial) {
	this.limiteSalarial = limiteSalarial;
}



}
