package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import utils.FuncionesUtiles;
import javax.swing.ImageIcon;

/**
 * Clase hereda de JFrame, y que enseña el jugador que ha ganado el premio al
 * mejor jugador de la temporada
 * 
 * @author jcorr
 *
 */
public class PantallitaMVP extends JFrame {
	/**
	 * Constructor de PantallaAllStarEste,que inicializa la distribución de la
	 * información que sale por pantalla,así como su Layout y otras propiedades.Presenta por pantalla el
	 * nombre,apellidos y estadísticas del ganador
	 */
	public PantallitaMVP() {
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);

		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel nombre = new JLabel(
				FuncionesUtiles.devolverMVP().getNombre() + " " + FuncionesUtiles.devolverMVP().getApellido());
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setForeground(Color.WHITE);
		nombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_nums = new GridBagConstraints();
		gbc_nums.insets = new Insets(0, 0, 5, 5);
		gbc_nums.gridx = 2;
		gbc_nums.gridy = 1;
		getContentPane().add(nombre, gbc_nums);

		JLabel stats = new JLabel(FuncionesUtiles.devolverMVP().getPPG() + " PPG "
				+ FuncionesUtiles.devolverMVP().getAPG() + " APG " + FuncionesUtiles.devolverMVP().getRBG() + " RBG "
				+ FuncionesUtiles.devolverMVP().getSPG() + " SPG " + FuncionesUtiles.devolverMVP().getBPG() + " BPG");
		stats.setForeground(Color.WHITE);
		stats.setHorizontalAlignment(SwingConstants.CENTER);
		stats.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		GridBagConstraints gbc_stats = new GridBagConstraints();
		gbc_stats.insets = new Insets(0, 0, 5, 5);
		gbc_stats.gridx = 2;
		gbc_stats.gridy = 5;
		getContentPane().add(stats, gbc_stats);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(".\\imagenes\\backgroundAllStar.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 8;
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(background, gbc_lblNewLabel);

	}

}
