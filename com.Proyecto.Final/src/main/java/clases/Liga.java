package clases;

public class Liga {

	private Conferencia confOeste;
	private Conferencia confEste;

	public Liga(Conferencia confOeste, Conferencia confEste) {
		super();
		this.confOeste = confOeste;
		this.confEste = confEste;
	}

	public Conferencia getConfOeste() {
		return confOeste;
	}

	public void setConfOeste(Conferencia confOeste) {
		this.confOeste = confOeste;
	}

	public Conferencia getConfEste() {
		return confEste;
	}

	public void setConfEste(Conferencia confEste) {
		this.confEste = confEste;
	}

}
