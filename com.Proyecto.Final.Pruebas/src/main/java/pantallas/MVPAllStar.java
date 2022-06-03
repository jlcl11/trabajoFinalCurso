package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import utils.FuncionesUtiles;

public class MVPAllStar extends JFrame {
	public MVPAllStar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel nombre = new JLabel(
				FuncionesUtiles.getAllStarMVP().getNombre() + " " + FuncionesUtiles.getAllStarMVP().getApellido());
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setForeground(Color.BLACK);
		nombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_nums = new GridBagConstraints();
		gbc_nums.insets = new Insets(0, 0, 5, 5);
		gbc_nums.gridx = 2;
		gbc_nums.gridy = 3;
		getContentPane().add(nombre, gbc_nums);

		JLabel stats = new JLabel(FuncionesUtiles.getAllStarMVP().getPPG() + " Puntos "
				+ FuncionesUtiles.getAllStarMVP().getAPG() + " Asistencias" + FuncionesUtiles.getAllStarMVP().getRBG() + " Rebotes "
				+ FuncionesUtiles.getAllStarMVP().getSPG() + " robos " + FuncionesUtiles.getAllStarMVP().getBPG() + " tapones");
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
