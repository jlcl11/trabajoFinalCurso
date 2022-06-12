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

/**
 * Clase que hereda de JFrame, y que contendr� a las pantallas (Heredera de
 * JPanel) del programa.
 * 
 * @author jcorr
 *
 */
public class Ventana extends JFrame {
	/*
	 * Variable que inicializa el equipo que vamos a ir seleccionando,de esta manera
	 * se queda guardado en el this
	 */
	protected Equipo miEquipo;
	/* Pantalla que se va a ir mostrando en la ventana */
	private JPanel pantallaActual;
	/**/
	private String nombreApellidosJugador;

	/**
	 * Constructor de Ventana, que inicializa su tamaño, título e icono, y otras
	 * propiedades.
	 * 
	 * @throws SQLException lanza la excepción porque rescata los datos del equipo
	 *                      desde bbdd
	 */
	public Ventana() throws SQLException {
		miEquipo = new Equipo("Wizards");
		setNombreApellidosJugador("");
		pantallaActual = new PantallaInicial(this);
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

	/**
	 * Función que cambia la pantalla en función del nombre que se le asigne
	 * 
	 * @param nombrePantalla nombre de la pantalla
	 * 
	 * @throws SQLException SQLException lanza la excepción porque rescata los datos
	 *                      del equipo desde bbdd
	 */
	public void cambiarAPantalla(String nombrePantalla) throws SQLException {
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
		case "jugadorBuscado":
			this.pantallaActual = new PantallaJugadorBuscado(this);
			break;

		}
		this.pantallaActual.setVisible(true);
		this.setContentPane(pantallaActual);
	}

	public String getNombreApellidosJugador() {
		return nombreApellidosJugador;
	}

	public void setNombreApellidosJugador(String nombreApellidosJugador) {
		this.nombreApellidosJugador = nombreApellidosJugador;
	}

}
