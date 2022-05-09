package pantalla;

import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {

		this.setSize(700, 500);
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

		this.setContentPane(new PantallaInicial(this));

		this.setResizable(false);
		this.setVisible(true);
	}
}
