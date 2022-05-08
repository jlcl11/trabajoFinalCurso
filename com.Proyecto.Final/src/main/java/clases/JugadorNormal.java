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

	@Override
	public String toString() {

		if (getSalario() <= 0 && getApodo() != null) {
			return getNombre() + " " + getApellido() + " nº" + getDorsal() + " conocido como " + getApodo()+"\n";
		}
		if (getSalario() <= 0 && getApodo() == null) {
			return getNombre() + " " + getApellido() + " nº" + getDorsal()+"\n";
		}
		if (getSalario() > 0 && getApodo() == null && isRookieDelAño() == true && isMIP() == false) {
			return getNombre() + " " + getApellido() + "nº" + getDorsal() + ", juega de " + getPosicion() + ", cobra "
					+ getSalario() + ",millones de dólares \n,ha sido nominado " + getNominacionesAllStar()
					+ " veces para el all Star, ha ganado =" + getAnillosDeCampeon()
					+ " anillos de campeón, ha ganado el MVP " + getMVPs() + "veces,ha ganado el defensor del año "
					+ getDefensorDelAño() + "veces,fue ganador del rookie del año,ha sido MVP del AllStar"
					+ getMVPAllStar() + " veces,ha ganado el FMVP " + getFMVP() + " veces,ha ganado el premio anotador "
					+ getPremioAnotador() + "veces ,anota" + getPPG() + " puntos por partido, reparte " + getAPG()
					+ " asistencias por partido,recoge " + getRBG() + " rebotes por partido,roba " + getSPG()
					+ " balones por partido,tapona " + getBPG() + " tiros por partido,juega " + getMPG()
					+ " minutos cada partido,tiene una nota" + getfinalizacion() + " en finalización,una " + gettiro()
					+ " en tiro,una " + getorganizacion() + " en organización y una " + getdefensas() + " en defensa"
					+ "\n";
		}
		if (getSalario() > 0 && getApodo() != null && isMIP() == true && isRookieDelAño() == false) {
			return getNombre() + " '" + getApodo() + "' " + getApellido() + "nº" + getDorsal() + ", juega de "
					+ getPosicion() + ", cobra " + getSalario() + ",millones de dólares,ha sido nominado "
					+ getNominacionesAllStar() + " veces para el all Star, ha ganado =" + getAnillosDeCampeon()
					+ " anillos de campeón, ha ganado el MVP " + getMVPs() + "veces,ha ganado el defensor del año "
					+ getDefensorDelAño() + "veces,fue ganador del MIP,ha sido MVP del AllStar" + getMVPAllStar()
					+ " veces,ha ganado el FMVP " + getFMVP() + " veces,ha ganado el premio anotador "
					+ getPremioAnotador() + "veces ,anota" + getPPG() + " puntos por partido, reparte " + getAPG()
					+ " asistencias por partido,recoge " + getRBG() + " rebotes por partido,roba " + getSPG()
					+ " balones por partido,tapona " + getBPG() + " tiros por partido,juega " + getMPG()
					+ " minutos cada partido,tiene una nota" + getfinalizacion() + " en finalización,una " + gettiro()
					+ " en tiro,una " + getorganizacion() + " en organización y una " + getdefensas() + " en defensa"
					+ "\n";
		}
		if (getSalario() > 0 && getApodo() != null && isRookieDelAño() == true && isMIP() == true) {
			return getNombre() + " '" + getApodo() + "' " + getApellido() + "nº" + getDorsal() + ", juega de "
					+ getPosicion() + ", cobra " + getSalario() + ",millones de dólares,ha sido nominado "
					+ getNominacionesAllStar() + " veces para el all Star, ha ganado =" + getAnillosDeCampeon()
					+ " anillos de campeón, ha ganado el MVP " + getMVPs() + "veces,ha ganado el defensor del año "
					+ getDefensorDelAño()
					+ "veces,fue ganador del rookie del año,fue ganador del MIP,ha sido MVP del AllStar"
					+ getMVPAllStar() + " veces,ha ganado el FMVP " + getFMVP() + " veces,ha ganado el premio anotador "
					+ getPremioAnotador() + "veces ,anota" + getPPG() + " puntos por partido, reparte " + getAPG()
					+ " asistencias por partido,recoge " + getRBG() + " rebotes por partido,roba " + getSPG()
					+ " balones por partido,tapona " + getBPG() + " tiros por partido,juega " + getMPG()
					+ " minutos cada partido,tiene una nota" + getfinalizacion() + " en finalización,una " + gettiro()
					+ " en tiro,una " + getorganizacion() + " en organización y una " + getdefensas() + " en defensa"
					+ "\n";
		}

		else {
			return getNombre() + " '" + getApodo() + "' " + getApellido() + "nº" + getDorsal() + ", juega de "
					+ getPosicion() + ", cobra " + getSalario() + ",millones de dólares,ha sido nominado "
					+ getNominacionesAllStar() + " veces para el all Star, ha ganado =" + getAnillosDeCampeon()
					+ " anillos de campeón, ha ganado el MVP " + getMVPs() + "veces,ha ganado el defensor del año "
					+ getDefensorDelAño()
					+ "veces,fue ganador del rookie del año,fue ganador del MIP,ha sido MVP del AllStar"
					+ getMVPAllStar() + " veces,ha ganado el FMVP " + getFMVP() + " veces,ha ganado el premio anotador "
					+ getPremioAnotador() + "veces ,anota" + getPPG() + " puntos por partido, reparte " + getAPG()
					+ " asistencias por partido,recoge " + getRBG() + " rebotes por partido,roba " + getSPG()
					+ " balones por partido,tapona " + getBPG() + " tiros por partido,juega " + getMPG()
					+ " minutos cada partido,tiene una nota" + getfinalizacion() + " en finalización,una " + gettiro()
					+ " en tiro,una " + getorganizacion() + " en organización y una " + getdefensas()
					+ " en getdefensas()"+"\n";
		}
	}

}
