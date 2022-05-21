package pantallas;

import java.awt.Point;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	private HashMap<String, JPanel> pantallas;

	public Ventana() {
		pantallas = new HashMap<String, JPanel>();
		pantallas.put("inicial", new PantallaInicial(this));
		pantallas.put("primerMenu", new PantallaInicioPrimerMenu(this));

		this.setSize(1500, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);
		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

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
