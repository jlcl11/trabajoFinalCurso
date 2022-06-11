package pantallas;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;

import clases.Liga;

import javax.swing.ImageIcon;

/**
 * Clase hereda de JFrame, y que enseña el jugador que ha ganado el premio al
 * mejor defensor de la temporada
 * 
 * @author jcorr
 *
 */
public class PantallitaDPOY extends JFrame {
	/**
	 * Constructor de PantallaAllStarEste,que inicializa la distribución de la
	 * información que sale por pantalla,así como su Layout y otras
	 * propiedades.Presenta por pantalla el nombre,apellidos y estadísticas del
	 * ganador
	 */
	public PantallitaDPOY() {
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);

		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel nombre = new JLabel(Liga.devolverDPOY().getNombre() + " " + Liga.devolverDPOY().getApellido());
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setForeground(Color.BLACK);
		nombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_nums = new GridBagConstraints();
		gbc_nums.insets = new Insets(0, 0, 5, 5);
		gbc_nums.gridx = 2;
		gbc_nums.gridy = 3;
		getContentPane().add(nombre, gbc_nums);

		JLabel stats = new JLabel(Liga.devolverDPOY().getRBG() + " RPG " + Liga.devolverDPOY().getSPG() + " SPG "
				+ Liga.devolverDPOY().getBPG() + " BPG");
		stats.setForeground(Color.BLACK);
		stats.setHorizontalAlignment(SwingConstants.CENTER);
		stats.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		GridBagConstraints gbc_stats = new GridBagConstraints();
		gbc_stats.insets = new Insets(0, 0, 5, 5);
		gbc_stats.gridx = 2;
		gbc_stats.gridy = 4;
		getContentPane().add(stats, gbc_stats);

	}

}
