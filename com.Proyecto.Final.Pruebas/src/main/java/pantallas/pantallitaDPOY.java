package pantallas;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import utils.funcionesUtiles;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class pantallitaDPOY extends JFrame{
	public pantallitaDPOY() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel nombre = new JLabel(funcionesUtiles.devolverDPOY().getNombre() + " " + funcionesUtiles.devolverDPOY().getApellido());
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setForeground(Color.BLACK);
		nombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_nums = new GridBagConstraints();
		gbc_nums.insets = new Insets(0, 0, 5, 5);
		gbc_nums.gridx = 2;
		gbc_nums.gridy = 3;
		getContentPane().add(nombre, gbc_nums);
		
		JLabel stats = new JLabel(funcionesUtiles.devolverDPOY().getRBG() + " RPG "
				+ funcionesUtiles.devolverDPOY().getSPG() + " SPG "
				+ funcionesUtiles.devolverDPOY().getBPG()+" BPG");
		stats.setForeground(Color.BLACK);
		stats.setHorizontalAlignment(SwingConstants.CENTER);
		stats.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		GridBagConstraints gbc_stats = new GridBagConstraints();
		gbc_stats.insets = new Insets(0, 0, 5, 5);
		gbc_stats.gridx = 2;
		gbc_stats.gridy = 4;
		getContentPane().add(stats, gbc_stats);
		
		/*JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(".\\imagenes\\dpoy.png"));
		GridBagConstraints gbc_fondo = new GridBagConstraints();
		gbc_fondo.fill = GridBagConstraints.VERTICAL;
		gbc_fondo.insets = new Insets(0, 0, 5, 5);
		gbc_fondo.gridx = 0;
		gbc_fondo.gridy = 0;
		getContentPane().add(fondo, gbc_fondo);*/
		
		
		

		
	
	}

}
