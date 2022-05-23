package pantallas;

import java.awt.Point;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	private HashMap<String, JPanel> pantallas;

	public Ventana() throws SQLException {
		pantallas = new HashMap<String, JPanel>();
		pantallas.put("inicial", new PantallaInicial(this));
		pantallas.put("primerMenu", new PantallaInicioPrimerMenu(this));
		pantallas.put("Escoger Equipos", new PantallaEscogerEquipoDatosFranquicia(this));
		pantallas.put("Datos Franquicia", new PantallaDatosFranquicia(this));
		pantallas.put("Premios De Temporada", new PantallaMenusPremiosDeTemporada(this));
		pantallas.put("Menu AllStar", new PantallaMenuAllStar(this));
		pantallas.put("Playoffs", new PantallaPlayOffs(this));
		pantallas.put("ticket", new pantallaTicket(this));

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

		this.setContentPane(this.pantallas.get("inicial"));
		this.setResizable(false);
		this.setVisible(true);
	}

	public void cambiarAPantalla(String nombrePantalla) {
		Iterator it = this.pantallas.values().iterator();
		while (it.hasNext()) {
			JPanel actual = (JPanel) it.next();
			actual.setVisible(false);
		}
		this.pantallas.get(nombrePantalla).setVisible(true);
		this.setContentPane(this.pantallas.get(nombrePantalla));
	}

}
