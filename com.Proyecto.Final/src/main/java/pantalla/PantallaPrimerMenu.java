package pantalla;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaPrimerMenu extends JPanel {

	private VentanaInicial ventana;

	public PantallaPrimerMenu(VentanaInicial v) {
		setForeground(SystemColor.activeCaption);
		this.ventana = v;
		setLayout(null);

	}
}
