package clases;

import java.sql.SQLException;
import java.sql.Statement;

import exceptions.LigaInvalidaException;
import utlis.utilsDB;

public class Liga {

	private Conferencia confOeste;
	private Conferencia confEste;

	public Liga(Conferencia confOeste, Conferencia confEste) throws SQLException, LigaInvalidaException {
		super();

		Statement query = utilsDB.conectarBBDD();

		if (query.executeUpdate("INSERT INTO liga VALUES(1);") > 0) {

			this.confEste = confEste;
			this.confOeste = confOeste;
		} else {
			throw new LigaInvalidaException("La liga se ha introducido de manera incorrecta");
		}
		utilsDB.desconectarBBDD();

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
