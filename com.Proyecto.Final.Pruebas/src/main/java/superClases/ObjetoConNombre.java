package superClases;

public class ObjetoConNombre {
	private String nombre;

	public ObjetoConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	public ObjetoConNombre() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
