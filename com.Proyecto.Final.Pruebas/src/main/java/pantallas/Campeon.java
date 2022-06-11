package pantallas;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import clases.Equipo;
import clases.Playoff;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;

/**
 * Clase hereda de JFrame, y que enseña el equipo campeón
 * 
 * @author jcorr
 *
 */
public class Campeon extends JFrame {
	/**
	 * Constructor de Campeon,que inicializa su tamaño, título e icono, y otras
	 * propiedades como el nombre del equipo y la foto de su estadio.
	 */
	public Campeon() {
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);

		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));

		getContentPane().setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel(Playoff.devolverCampeon().getCiudadLocal() + " "
				+ Playoff.devolverCampeon().getNombre());
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		String foto = ".\\\\imagenes\\\\" + Playoff.devolverCampeon().getNombre() + "ESCUDO.jpg";
		lblNewLabel_1.setIcon(new ImageIcon(foto));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridheight = 2;
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
	}

}
