package pantallas;

import java.awt.Point;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import clases.Equipo;
import clases.Playoff;

public class Ventana extends JFrame {
	protected Equipo miEquipo;

	private JPanel pantallaActual;

	public Ventana() throws SQLException, InterruptedException {
		miEquipo = new Equipo("Wizards");
		pantallaActual= new PantallaInicial(this);
		this.setSize(1300, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);

		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(getBackground());

		// TODO Poner en pantalla completa
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// this.setUndecorated(true);

		this.setContentPane(pantallaActual);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void cambiarAPantalla(String nombrePantalla) throws InterruptedException, SQLException {
		if (this.pantallaActual != null) {
			this.pantallaActual.setVisible(false);
		} else {
			this.pantallaActual = null;
		}

		switch (nombrePantalla) {

		case "inicial":
			this.pantallaActual = new PantallaInicial(this);
			break;
		case "primerMenu":
			this.pantallaActual = new PantallaInicioPrimerMenu(this);
			break;
		case "Escoger Equipos":
			this.pantallaActual = new PantallaEscogerEquipoDatosFranquicia(this);
			break;
		case "Datos Franquicia":
			this.pantallaActual = new PantallaDatosFranquicia(this);
			break;

		case "Premios De Temporada":
			this.pantallaActual = new PantallaMenusPremiosDeTemporada(this);
			break;

		case "Menu AllStar":
			this.pantallaActual = new PantallaMenuAllStar(this);
			break;
		case "Playoffs":
			this.pantallaActual = new PantallaPlayoffs(this);
			break;
		case "AllStars Este":
			this.pantallaActual = new PantallaAllStarEste(this);
			break;
		case "titularesAllStar":
			this.pantallaActual = new PantallaTitularesAllStar(this);
			break;

		case "AllStar Oeste":
			this.pantallaActual = new PantallaAllStarOeste(this);
			break;

		case "Dorsales Retirados":
			this.pantallaActual = new PantallaDorsalesRetirados(this);
			break;
		case "GM":
			this.pantallaActual = new PantallaGM(this);
			break;

		case "Limite":
			this.pantallaActual = new PantallaLimiteSalarial(this);
			break;

		case "Plantilla":
			this.pantallaActual = new PantallaPlantilla(this);
			break;
		case "Propietario":
			this.pantallaActual = new PantallaPropietario(this);
			break;

		case "Estadio":
			this.pantallaActual = new PantallaVerEstadio(this);
			break;

		}
		this.pantallaActual.setVisible(true);
		this.setContentPane(pantallaActual);
	}

}
