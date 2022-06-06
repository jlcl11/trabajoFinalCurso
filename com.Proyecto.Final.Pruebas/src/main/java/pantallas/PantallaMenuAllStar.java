package pantallas;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaMenuAllStar extends JPanel {

	private Ventana ventana;

	public PantallaMenuAllStar(final Ventana ventana) throws HeadlessException {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout_1 = new GridBagLayout();
		gridBagLayout_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0,
				0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout_1);

		JLabel tituloAllStar = new JLabel("Bienvenido al AllStar");
		tituloAllStar.setForeground(Color.WHITE);
		tituloAllStar.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_tituloAllStar = new GridBagConstraints();
		gbc_tituloAllStar.gridwidth = 4;
		gbc_tituloAllStar.insets = new Insets(0, 0, 5, 5);
		gbc_tituloAllStar.gridx = 4;
		gbc_tituloAllStar.gridy = 2;
		add(tituloAllStar, gbc_tituloAllStar);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});

		JButton botonTitulares = new JButton("Ver los titulares del AllStar");
		botonTitulares.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("titularesAllStar");
			}
		});
		botonTitulares.setForeground(Color.WHITE);
		botonTitulares.setBackground(Color.BLUE);
		botonTitulares.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_botonTitulares = new GridBagConstraints();
		gbc_botonTitulares.fill = GridBagConstraints.BOTH;
		gbc_botonTitulares.gridheight = 2;
		gbc_botonTitulares.insets = new Insets(0, 0, 5, 5);
		gbc_botonTitulares.gridx = 5;
		gbc_botonTitulares.gridy = 4;
		add(botonTitulares, gbc_botonTitulares);

		JButton botonTitularesW = new JButton("Ver los titulares del Oeste");
		botonTitularesW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("AllStar Oeste");
			}
		});

		JButton botonMVPAllStar = new JButton("Ver el MVP del AllStar");
		botonMVPAllStar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				MVPAllStar p = new MVPAllStar();
				p.setVisible(true);
				p.setAlwaysOnTop(true);
				p.setSize(630, 805);
				p.setLocationRelativeTo(null);

			}
		});
		botonMVPAllStar.setForeground(Color.WHITE);
		botonMVPAllStar.setBackground(Color.BLUE);
		botonMVPAllStar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_botonMVPAllStar = new GridBagConstraints();
		gbc_botonMVPAllStar.fill = GridBagConstraints.BOTH;
		gbc_botonMVPAllStar.gridheight = 2;
		gbc_botonMVPAllStar.insets = new Insets(0, 0, 5, 5);
		gbc_botonMVPAllStar.gridx = 7;
		gbc_botonMVPAllStar.gridy = 4;
		add(botonMVPAllStar, gbc_botonMVPAllStar);
		botonTitularesW.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonTitularesW.setForeground(Color.WHITE);
		botonTitularesW.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonTitularesW = new GridBagConstraints();
		gbc_botonTitularesW.fill = GridBagConstraints.BOTH;
		gbc_botonTitularesW.gridheight = 2;
		gbc_botonTitularesW.insets = new Insets(0, 0, 5, 5);
		gbc_botonTitularesW.gridx = 5;
		gbc_botonTitularesW.gridy = 7;
		add(botonTitularesW, gbc_botonTitularesW);

		JButton botonTitularesE = new JButton("Ver los titulares del Este");
		botonTitularesE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("AllStars Este");
			}
		});
		botonTitularesE.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonTitularesE.setBackground(Color.BLUE);
		botonTitularesE.setForeground(Color.WHITE);
		GridBagConstraints gbc_botonTitularesE = new GridBagConstraints();
		gbc_botonTitularesE.fill = GridBagConstraints.BOTH;
		gbc_botonTitularesE.gridheight = 2;
		gbc_botonTitularesE.insets = new Insets(0, 0, 5, 5);
		gbc_botonTitularesE.gridx = 7;
		gbc_botonTitularesE.gridy = 7;
		add(botonTitularesE, gbc_botonTitularesE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 16;
		add(btnNewButton, gbc_btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\backgroundAllStar.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 18;
		gbc_lblNewLabel.gridwidth = 12;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0 };
		gridBagLayout.rowHeights = new int[] { 0 };
		gridBagLayout.columnWeights = new double[] { Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { Double.MIN_VALUE };

	}

}
