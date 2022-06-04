package pantallas;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import clases.Equipo;
import utils.FuncionesUtiles;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Campeon extends JFrame {
	private Equipo equipo;

	public Campeon() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel(FuncionesUtiles.devolverCampeon().getCiudadLocal() + " "
				+ FuncionesUtiles.devolverCampeon().getNombre());
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
	}

}
