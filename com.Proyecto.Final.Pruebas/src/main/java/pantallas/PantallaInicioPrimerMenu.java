package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import utils.FuncionesUtiles;

import java.awt.GridBagLayout;
import javax.swing.ImageIcon;

public class PantallaInicioPrimerMenu extends JPanel {
	private Ventana ventana;

	public PantallaInicioPrimerMenu(final Ventana ventana) {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel botonTitulo = new JLabel("Qu\u00E9 quieres hacer?");
		botonTitulo.setForeground(Color.WHITE);
		botonTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_botonTitulo = new GridBagConstraints();
		gbc_botonTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_botonTitulo.gridx = 5;
		gbc_botonTitulo.gridy = 2;
		add(botonTitulo, gbc_botonTitulo);

		JButton botonDatosFranquicia = new JButton("Ver datos de Franquicia");
		botonDatosFranquicia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("Escoger Equipos");
			}
		});
		botonDatosFranquicia.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonDatosFranquicia.setForeground(Color.WHITE);
		botonDatosFranquicia.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonDatosFranquicia = new GridBagConstraints();
		gbc_botonDatosFranquicia.fill = GridBagConstraints.BOTH;
		gbc_botonDatosFranquicia.gridheight = 3;
		gbc_botonDatosFranquicia.insets = new Insets(0, 0, 5, 5);
		gbc_botonDatosFranquicia.gridx = 4;
		gbc_botonDatosFranquicia.gridy = 4;
		add(botonDatosFranquicia, gbc_botonDatosFranquicia);

		JButton botonDatosDeTemporada = new JButton("Ver premios de temporada");
		botonDatosDeTemporada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("Premios De Temporada");
			}
		});
		botonDatosDeTemporada.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonDatosDeTemporada.setForeground(Color.WHITE);
		botonDatosDeTemporada.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonDatosDeTemporada = new GridBagConstraints();
		gbc_botonDatosDeTemporada.fill = GridBagConstraints.BOTH;
		gbc_botonDatosDeTemporada.gridheight = 3;
		gbc_botonDatosDeTemporada.insets = new Insets(0, 0, 5, 5);
		gbc_botonDatosDeTemporada.gridx = 6;
		gbc_botonDatosDeTemporada.gridy = 4;
		add(botonDatosDeTemporada, gbc_botonDatosDeTemporada);

		JButton botonSimular = new JButton("Simular los playoffs");
		botonSimular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("Playoffs");
			}
		});
		botonSimular.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonSimular.setForeground(Color.WHITE);
		botonSimular.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonSimular = new GridBagConstraints();
		gbc_botonSimular.fill = GridBagConstraints.BOTH;
		gbc_botonSimular.gridheight = 3;
		gbc_botonSimular.insets = new Insets(0, 0, 5, 5);
		gbc_botonSimular.gridx = 4;
		gbc_botonSimular.gridy = 8;
		add(botonSimular, gbc_botonSimular);

		JButton botonAllStar = new JButton("Ver el AllStar");
		botonAllStar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("Menu AllStar");
			}
		});
		botonAllStar.setForeground(Color.WHITE);
		botonAllStar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonAllStar.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonAllStar = new GridBagConstraints();
		gbc_botonAllStar.fill = GridBagConstraints.BOTH;
		gbc_botonAllStar.gridheight = 3;
		gbc_botonAllStar.insets = new Insets(0, 0, 5, 5);
		gbc_botonAllStar.gridx = 6;
		gbc_botonAllStar.gridy = 8;
		add(botonAllStar, gbc_botonAllStar);

		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("inicial");
			}
		});

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\NBA-2K22.jpeg"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridheight = 15;
		gbc_lblNewLabel.gridwidth = 10;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		JButton botonTicket = new JButton("Imprimir un ticket con los ganadores de la temporada");
		botonTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					FuncionesUtiles.imprimeTicket();
					JOptionPane.showMessageDialog(ventana, "Ticket impreso con éxito", ventana.getName(),
							JOptionPane.PLAIN_MESSAGE);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(ventana, "El ticket no pudo imprimirse", ventana.getName(),
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		botonTicket.setForeground(Color.WHITE);
		botonTicket.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonTicket.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonTicket = new GridBagConstraints();
		gbc_botonTicket.gridheight = 2;
		gbc_botonTicket.fill = GridBagConstraints.BOTH;
		gbc_botonTicket.insets = new Insets(0, 0, 5, 5);
		gbc_botonTicket.gridx = 5;
		gbc_botonTicket.gridy = 12;
		add(botonTicket, gbc_botonTicket);

		botonVolver.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);
		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 14;
		add(botonVolver, gbc_botonVolver);
	}
}