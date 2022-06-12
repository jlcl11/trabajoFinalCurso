package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import clases.Liga;
import clases.PartidoAllStar;

/**
 * Clase hereda de JFrame, y que enseña el MVP del AllStar
 * 
 * @author jcorr
 *
 */
public class MVPAllStar extends JFrame {
	/**
	 * Constructor de MVPAllStar,que inicializa su tamaño, título e icono, y otras
	 * propiedades como el nombre del jugador y las estadísticas que ha tenido en la
	 * temporada
	 */
	public MVPAllStar() {
		getContentPane().setBackground(Color.WHITE);
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);

		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		
				JLabel nombre = new JLabel(
						PartidoAllStar.getAllStarMVP().getNombre() + " " + PartidoAllStar.getAllStarMVP().getApellido());
				nombre.setHorizontalAlignment(SwingConstants.CENTER);
				nombre.setForeground(Color.BLACK);
				nombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
				GridBagConstraints gbc_nums = new GridBagConstraints();
				gbc_nums.insets = new Insets(0, 0, 5, 5);
				gbc_nums.gridx = 2;
				gbc_nums.gridy = 2;
				getContentPane().add(nombre, gbc_nums);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\allStarMVP.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JLabel stats = new JLabel(PartidoAllStar.getAllStarMVP().getPPG() + " Puntos "
				+ PartidoAllStar.getAllStarMVP().getAPG() + " Asistencias" + PartidoAllStar.getAllStarMVP().getRBG()
				+ " Rebotes " + PartidoAllStar.getAllStarMVP().getSPG() + " robos "
				+ PartidoAllStar.getAllStarMVP().getBPG() + " tapones");
		stats.setForeground(Color.BLACK);
		stats.setHorizontalAlignment(SwingConstants.CENTER);
		stats.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		GridBagConstraints gbc_stats = new GridBagConstraints();
		gbc_stats.insets = new Insets(0, 0, 5, 5);
		gbc_stats.gridx = 2;
		gbc_stats.gridy = 5;
		getContentPane().add(stats, gbc_stats);

	}

}
