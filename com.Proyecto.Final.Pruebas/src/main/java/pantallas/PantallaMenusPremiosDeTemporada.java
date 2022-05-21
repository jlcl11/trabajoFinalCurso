package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PantallaMenusPremiosDeTemporada extends JPanel{
	private Ventana ventana;

	public PantallaMenusPremiosDeTemporada(final Ventana ventana) {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel tituloPremios = new JLabel("Qu\u00E9 premio quieres ver?");
		tituloPremios.setHorizontalAlignment(SwingConstants.CENTER);
		tituloPremios.setForeground(Color.WHITE);
		tituloPremios.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_tituloPremios = new GridBagConstraints();
		gbc_tituloPremios.gridwidth = 5;
		gbc_tituloPremios.insets = new Insets(0, 0, 5, 5);
		gbc_tituloPremios.gridx = 3;
		gbc_tituloPremios.gridy = 2;
		add(tituloPremios, gbc_tituloPremios);
		
		JButton botonMVP = new JButton("Ver MVP de la temporada");
		botonMVP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonMVP.setForeground(Color.WHITE);
		botonMVP.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonMVP = new GridBagConstraints();
		gbc_botonMVP.fill = GridBagConstraints.BOTH;
		gbc_botonMVP.gridheight = 2;
		gbc_botonMVP.insets = new Insets(0, 0, 5, 5);
		gbc_botonMVP.gridx = 3;
		gbc_botonMVP.gridy = 5;
		add(botonMVP, gbc_botonMVP);
		
		JButton botonDPOY = new JButton("Ver el defensor del A\u00F1o");
		botonDPOY.setForeground(Color.WHITE);
		botonDPOY.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonDPOY.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonDPOY = new GridBagConstraints();
		gbc_botonDPOY.fill = GridBagConstraints.BOTH;
		gbc_botonDPOY.gridheight = 2;
		gbc_botonDPOY.insets = new Insets(0, 0, 5, 5);
		gbc_botonDPOY.gridx = 5;
		gbc_botonDPOY.gridy = 5;
		add(botonDPOY, gbc_botonDPOY);
		
		JButton botonAnotador = new JButton("Ver el m\u00E1ximo anotador");
		botonAnotador.setForeground(Color.WHITE);
		botonAnotador.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonAnotador.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonAnotador = new GridBagConstraints();
		gbc_botonAnotador.fill = GridBagConstraints.BOTH;
		gbc_botonAnotador.gridheight = 2;
		gbc_botonAnotador.insets = new Insets(0, 0, 5, 5);
		gbc_botonAnotador.gridx = 7;
		gbc_botonAnotador.gridy = 5;
		add(botonAnotador, gbc_botonAnotador);
		
		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});
		
		botonVolver.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);
		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 8;
		add(botonVolver, gbc_botonVolver);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\mvp.jpeg"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 10;
		gbc_lblNewLabel.gridwidth = 10;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
	}
	
}
