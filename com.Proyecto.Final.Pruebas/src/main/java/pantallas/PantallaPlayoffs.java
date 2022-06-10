package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;

import clases.Equipo;
import clases.Jugador;
import elementosVisuales.ElementoListEquiposFinal;
import elementosVisuales.ElementoListEquiposFinalConferencia;
import elementosVisuales.ElementoListEquiposPrimeraRonda;
import elementosVisuales.ElementoListEquiposSegundaRonda;
import elementosVisuales.ElementoListaJugador;
import utils.FuncionesUtiles;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

public class PantallaPlayoffs extends JPanel {
	private Ventana ventana;

	public PantallaPlayoffs(final Ventana ventana) throws InterruptedException {

		super();
		setBackground(Color.WHITE);
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("primerMenu");
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JLabel labelTitulo = new JLabel("Playoffs 2022");
		labelTitulo.setBackground(Color.WHITE);
		labelTitulo.setForeground(Color.BLACK);
		labelTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.gridheight = 2;
		gbc_labelTitulo.gridwidth = 5;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 3;
		gbc_labelTitulo.gridy = 1;
		add(labelTitulo, gbc_labelTitulo);

		JScrollPane scrollPaneprimeraRondaOeste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneprimeraRondaOeste = new GridBagConstraints();
		gbc_scrollPaneprimeraRondaOeste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneprimeraRondaOeste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneprimeraRondaOeste.gridx = 2;
		gbc_scrollPaneprimeraRondaOeste.gridy = 4;
		add(scrollPaneprimeraRondaOeste, gbc_scrollPaneprimeraRondaOeste);

		JPanel panelprimeraRondaOeste = new JPanel();
		scrollPaneprimeraRondaOeste.setViewportView(panelprimeraRondaOeste);
		panelprimeraRondaOeste.setLayout(new BoxLayout(panelprimeraRondaOeste, BoxLayout.Y_AXIS));

		ArrayList<Equipo> primeraRondaOeste = FuncionesUtiles.devolverPrimeraRondaOeste();
		for (int i = 0; i < primeraRondaOeste.size(); i++) {
			panelprimeraRondaOeste.add(new ElementoListEquiposPrimeraRonda(ventana, primeraRondaOeste.get(i)));
		}
		JScrollPane scrollPaneprimeraRondaEste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneprimeraRondaEste = new GridBagConstraints();
		gbc_scrollPaneprimeraRondaEste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneprimeraRondaEste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneprimeraRondaEste.gridx = 8;
		gbc_scrollPaneprimeraRondaEste.gridy = 4;
		add(scrollPaneprimeraRondaEste, gbc_scrollPaneprimeraRondaEste);

		JPanel panelprimeraRondaEste = new JPanel();
		scrollPaneprimeraRondaEste.setViewportView(panelprimeraRondaEste);
		panelprimeraRondaEste.setLayout(new BoxLayout(panelprimeraRondaEste, BoxLayout.Y_AXIS));
		ArrayList<Equipo> primeraRondaEste = FuncionesUtiles.devolverPrimeraRondaEste();
		for (int i = 0; i < primeraRondaEste.size(); i++) {
			panelprimeraRondaEste.add(new ElementoListEquiposPrimeraRonda(ventana, primeraRondaEste.get(i)));
		}

		JButton botonCampeon = new JButton("Ver el campe\u00F3n");
		botonCampeon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Campeon p = new Campeon();
				p.setVisible(true);
				p.setAlwaysOnTop(true);
				p.setSize(630, 805);
				p.setLocationRelativeTo(null);
			}
		});
		botonCampeon.setForeground(Color.WHITE);
		botonCampeon.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonCampeon = new GridBagConstraints();
		gbc_botonCampeon.fill = GridBagConstraints.BOTH;
		gbc_botonCampeon.insets = new Insets(0, 0, 5, 5);
		gbc_botonCampeon.gridx = 5;
		gbc_botonCampeon.gridy = 6;
		add(botonCampeon, gbc_botonCampeon);

		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);

		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 7;
		add(botonVolver, gbc_botonVolver);

		Thread.sleep(850);

		JScrollPane scrollPaneSegundaRondaOeste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneSegundaRondaOeste = new GridBagConstraints();
		gbc_scrollPaneSegundaRondaOeste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneSegundaRondaOeste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneSegundaRondaOeste.gridx = 3;
		gbc_scrollPaneSegundaRondaOeste.gridy = 4;
		add(scrollPaneSegundaRondaOeste, gbc_scrollPaneSegundaRondaOeste);

		JPanel panelSegundaRondaOeste = new JPanel();
		scrollPaneSegundaRondaOeste.setViewportView(panelSegundaRondaOeste);
		panelSegundaRondaOeste.setLayout(new BoxLayout(panelSegundaRondaOeste, BoxLayout.Y_AXIS));

		ArrayList<Equipo> segundaRondaOeste = FuncionesUtiles.devolverSegundaRondaOeste();
		for (int i = 0; i < segundaRondaOeste.size(); i++) {
			panelSegundaRondaOeste.add(new ElementoListEquiposSegundaRonda(ventana, segundaRondaOeste.get(i)));
		}

		JScrollPane scrollPaneSegundaRondaEste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneSegundaRondaEste = new GridBagConstraints();
		gbc_scrollPaneSegundaRondaEste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneSegundaRondaEste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneSegundaRondaEste.gridx = 7;
		gbc_scrollPaneSegundaRondaEste.gridy = 4;
		add(scrollPaneSegundaRondaEste, gbc_scrollPaneSegundaRondaEste);

		JPanel panelSegundaRondaEste = new JPanel();
		scrollPaneSegundaRondaEste.setViewportView(panelSegundaRondaEste);
		panelSegundaRondaEste.setLayout(new BoxLayout(panelSegundaRondaEste, BoxLayout.Y_AXIS));

		ArrayList<Equipo> segundaRondaEste = FuncionesUtiles.devolverSegundaRondaEste();
		for (int i = 0; i < segundaRondaEste.size(); i++) {
			panelSegundaRondaEste.add(new ElementoListEquiposSegundaRonda(ventana, segundaRondaEste.get(i)));
		}
		Thread.sleep(850);

		JScrollPane scrollPaneFinalConferenciaOeste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneFinalConferenciaOeste = new GridBagConstraints();
		gbc_scrollPaneFinalConferenciaOeste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneFinalConferenciaOeste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneFinalConferenciaOeste.gridx = 4;
		gbc_scrollPaneFinalConferenciaOeste.gridy = 4;
		add(scrollPaneFinalConferenciaOeste, gbc_scrollPaneFinalConferenciaOeste);

		JPanel panelFinalConferenciaOeste = new JPanel();
		scrollPaneFinalConferenciaOeste.setViewportView(panelFinalConferenciaOeste);
		panelFinalConferenciaOeste.setLayout(new BoxLayout(panelFinalConferenciaOeste, BoxLayout.Y_AXIS));

		ArrayList<Equipo> finalOeste = FuncionesUtiles.devolverFinalOeste();
		for (int i = 0; i < finalOeste.size(); i++) {
			panelFinalConferenciaOeste.add(new ElementoListEquiposFinalConferencia(ventana, finalOeste.get(i)));
		}

		JScrollPane scrollPaneFinalConferenciaEste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneFinalConferenciaEste = new GridBagConstraints();
		gbc_scrollPaneFinalConferenciaEste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneFinalConferenciaEste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneFinalConferenciaEste.gridx = 6;
		gbc_scrollPaneFinalConferenciaEste.gridy = 4;
		add(scrollPaneFinalConferenciaEste, gbc_scrollPaneFinalConferenciaEste);

		JPanel panelFinalConferenciaEste = new JPanel();
		scrollPaneFinalConferenciaEste.setViewportView(panelFinalConferenciaEste);
		panelFinalConferenciaEste.setLayout(new BoxLayout(panelFinalConferenciaEste, BoxLayout.Y_AXIS));

		ArrayList<Equipo> finalEste = FuncionesUtiles.devolverFinalEste();
		for (int i = 0; i < finalEste.size(); i++) {
			panelFinalConferenciaEste.add(new ElementoListEquiposFinalConferencia(ventana, finalEste.get(i)));
		}
		Thread.sleep(850);

		JScrollPane scrollPaneFinales = new JScrollPane();
		GridBagConstraints gbc_scrollPaneFinales = new GridBagConstraints();
		gbc_scrollPaneFinales.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneFinales.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneFinales.gridx = 5;
		gbc_scrollPaneFinales.gridy = 4;
		add(scrollPaneFinales, gbc_scrollPaneFinales);

		JPanel panelFinales = new JPanel();
		scrollPaneFinales.setViewportView(panelFinales);
		panelFinales.setLayout(new BoxLayout(panelFinales, BoxLayout.Y_AXIS));

		ArrayList<Equipo> finalistas = FuncionesUtiles.finalistasParaMostrarlos();
		for (int i = 0; i < finalistas.size(); i++) {
			panelFinales.add(new ElementoListEquiposFinal(ventana, finalistas.get(i)));
		}

	}

}
