package clases;

import enums.Posicion;
import enums.Valores;
import superClases.Jugador;

public class JugadorAllStar extends Jugador {

	public JugadorAllStar(String nombre, String apellido, byte dorsal, String apodo, Posicion posicion, float salario,
			byte nominacionesAllStar, byte anillosDeCampeon, byte mVPs, byte defensorDelAño, boolean rookieDelAño,
			boolean mIP, byte mVPAllStar, byte fMVP, byte premioAnotador, float pPG, float aPG, float rBG, float sPG,
			float bPG, byte mPG, Valores ataque, Valores defensa, Valores intangibles, Valores clutch) {
		super(nombre, apellido, dorsal, apodo, posicion, salario, nominacionesAllStar, anillosDeCampeon, mVPs,
				defensorDelAño, rookieDelAño, mIP, mVPAllStar, fMVP, premioAnotador, pPG, aPG, rBG, sPG, bPG, mPG,
				ataque, defensa, intangibles, clutch);
		// TODO Auto-generated constructor stub
	}

}
