package superClases;

/**
 * Clase cuyas instancias representan a un objeto que tiene nombre
 * 
 * @author jcorr
 *
 */
public class ObjetoConNombre {
	/* nombre */
	private String nombre;

	/**
	 * contructor de objeto con nombre
	 * 
	 * @param nombre nombre del objeto
	 */
	public ObjetoConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * constructor vacío de objeto con nombre
	 */
	public ObjetoConNombre() {
		super();
	}

	/**
	 * getter de nombre
	 * 
	 * @return devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter de nombre
	 * 
	 * @param nombre nombre del objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
