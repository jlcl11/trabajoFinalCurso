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
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;

import clases.Equipo;
import elementosVisuales.ElementoListEquipos;
import elementosVisuales.ElementoListaJugador;
import superClases.Jugador;
import utils.FuncionesUtiles;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

public class PantallaPlayoffs extends JPanel {
	private Ventana ventana;

	public PantallaPlayoffs(final Ventana ventana) {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
	
		
		
		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});
		
		JLabel labelTitulo = new JLabel("Playoffs 2022");
		labelTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.gridheight = 2;
		gbc_labelTitulo.gridwidth = 5;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 3;
		gbc_labelTitulo.gridy = 1;
		add(labelTitulo, gbc_labelTitulo);
		
		JScrollPane scrollPanePrimeraRondaOeste = new JScrollPane();
		GridBagConstraints gbc_scrollPanePrimeraRondaOeste = new GridBagConstraints();
		gbc_scrollPanePrimeraRondaOeste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPanePrimeraRondaOeste.fill = GridBagConstraints.BOTH;
		gbc_scrollPanePrimeraRondaOeste.gridx = 2;
		gbc_scrollPanePrimeraRondaOeste.gridy = 4;
		add(scrollPanePrimeraRondaOeste, gbc_scrollPanePrimeraRondaOeste);
		
		JPanel panelPrimeraRondaOeste = new JPanel();
		scrollPanePrimeraRondaOeste.setViewportView(panelPrimeraRondaOeste);
		panelPrimeraRondaOeste.setLayout(new BoxLayout(panelPrimeraRondaOeste, BoxLayout.Y_AXIS));
		
		ArrayList<Equipo> PrimeraRondaOeste = FuncionesUtiles.getEquiposOeste();
		for (int i = 0; i < PrimeraRondaOeste.size(); i++) {
			panelPrimeraRondaOeste.add(new ElementoListEquipos(ventana, PrimeraRondaOeste.get(i)));
		}
		
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
		
		
		JScrollPane scrollPaneFinalConferenciaOeste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneFinalConferenciaOeste = new GridBagConstraints();
		gbc_scrollPaneFinalConferenciaOeste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneFinalConferenciaOeste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneFinalConferenciaOeste.gridx = 4;
		gbc_scrollPaneFinalConferenciaOeste.gridy = 4;
		add(scrollPaneFinalConferenciaOeste, gbc_scrollPaneFinalConferenciaOeste);
		
		JPanel panelFinalConferenciaOeste = new JPanel();
		scrollPaneFinalConferenciaOeste.setViewportView(panelFinalConferenciaOeste);
		panelFinalConferenciaOeste.setLayout(new BoxLayout(panelFinalConferenciaOeste, BoxLayout.X_AXIS));
		
		JScrollPane scrollPaneFinales = new JScrollPane();
		GridBagConstraints gbc_scrollPaneFinales = new GridBagConstraints();
		gbc_scrollPaneFinales.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneFinales.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneFinales.gridx = 5;
		gbc_scrollPaneFinales.gridy = 4;
		add(scrollPaneFinales, gbc_scrollPaneFinales);
		
		JPanel panelFinales = new JPanel();
		scrollPaneFinales.setViewportView(panelFinales);
		panelFinales.setLayout(new BoxLayout(panelFinales, BoxLayout.X_AXIS));
		
		JScrollPane scrollPaneFinalConferenciaEste = new JScrollPane();
		GridBagConstraints gbc_scrollPaneFinalConferenciaEste = new GridBagConstraints();
		gbc_scrollPaneFinalConferenciaEste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneFinalConferenciaEste.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneFinalConferenciaEste.gridx = 6;
		gbc_scrollPaneFinalConferenciaEste.gridy = 4;
		add(scrollPaneFinalConferenciaEste, gbc_scrollPaneFinalConferenciaEste);
		
		JPanel panelFinalConferenciaEste = new JPanel();
		scrollPaneFinalConferenciaEste.setViewportView(panelFinalConferenciaEste);
		panelFinalConferenciaEste.setLayout(new BoxLayout(panelFinalConferenciaEste, BoxLayout.X_AXIS));
		
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
		
		JScrollPane scrollPanePrimeraRondaEste = new JScrollPane();
		GridBagConstraints gbc_scrollPanePrimeraRondaEste = new GridBagConstraints();
		gbc_scrollPanePrimeraRondaEste.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPanePrimeraRondaEste.fill = GridBagConstraints.BOTH;
		gbc_scrollPanePrimeraRondaEste.gridx = 8;
		gbc_scrollPanePrimeraRondaEste.gridy = 4;
		add(scrollPanePrimeraRondaEste, gbc_scrollPanePrimeraRondaEste);
		
		JPanel panelPrimeraRondaEste = new JPanel();
		scrollPanePrimeraRondaEste.setViewportView(panelPrimeraRondaEste);
		panelPrimeraRondaEste.setLayout(new BoxLayout(panelPrimeraRondaEste, BoxLayout.Y_AXIS));
		ArrayList<Equipo> PrimeraRondaEste = FuncionesUtiles.getEquiposEste();
		for (int i = 0; i < PrimeraRondaEste.size(); i++) {
			panelPrimeraRondaEste.add(new ElementoListEquipos(ventana, PrimeraRondaEste.get(i)));
		}
		
		
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);
		
		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 5;
		add(botonVolver, gbc_botonVolver);
	}

}
