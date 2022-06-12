package pantallas;

import javax.swing.JPanel;

import clases.Jugador;
import utils.UtilsDB;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JugadorBuscado extends JPanel {
	public JugadorBuscado(final Ventana ventana) throws SQLException {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0,
				1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("primerMenu");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		String apodo;
		if (Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getApodo() != null) {
			apodo = Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getApodo();
		} else {
			apodo = "";
		}

		JLabel labelNombre = new JLabel(Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getNombre() + " "
				+ apodo + " " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getApellido() + " nº"
				+ Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getDorsal());
		labelNombre.setForeground(Color.WHITE);
		labelNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		labelNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.gridwidth = 11;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 2;
		add(labelNombre, gbc_labelNombre);

		JLabel labelNominaciones = new JLabel("Nominaciones al AllStar "
				+ Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getNominacionesAllStar());
		labelNominaciones.setForeground(Color.WHITE);
		labelNominaciones.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelNominaciones = new GridBagConstraints();
		gbc_labelNominaciones.insets = new Insets(0, 0, 5, 5);
		gbc_labelNominaciones.gridx = 3;
		gbc_labelNominaciones.gridy = 5;
		add(labelNominaciones, gbc_labelNominaciones);

		JLabel labelMPG = new JLabel("MPG " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getMPG());
		labelMPG.setForeground(Color.WHITE);
		labelMPG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelMPG = new GridBagConstraints();
		gbc_labelMPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelMPG.gridx = 5;
		gbc_labelMPG.gridy = 5;
		add(labelMPG, gbc_labelMPG);

		JLabel labelPPG = new JLabel("PPG " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getPPG());
		labelPPG.setForeground(Color.WHITE);
		labelPPG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		GridBagConstraints gbc_labelPPG = new GridBagConstraints();
		gbc_labelPPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelPPG.gridx = 7;
		gbc_labelPPG.gridy = 5;
		add(labelPPG, gbc_labelPPG);

		JLabel labelAnillos = new JLabel("Anillos de campeón "
				+ Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getAnillosDeCampeon());
		labelAnillos.setForeground(Color.WHITE);
		labelAnillos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelAnillos = new GridBagConstraints();
		gbc_labelAnillos.insets = new Insets(0, 0, 5, 5);
		gbc_labelAnillos.gridx = 3;
		gbc_labelAnillos.gridy = 7;
		add(labelAnillos, gbc_labelAnillos);

		JLabel labelMIP = new JLabel(
				"Most Improved Player " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).isMIP());
		labelMIP.setForeground(Color.WHITE);
		labelMIP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelMIP = new GridBagConstraints();
		gbc_labelMIP.insets = new Insets(0, 0, 5, 5);
		gbc_labelMIP.gridx = 5;
		gbc_labelMIP.gridy = 7;
		add(labelMIP, gbc_labelMIP);

		JLabel labelAPG = new JLabel("APG " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getAPG());
		labelAPG.setForeground(Color.WHITE);
		labelAPG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelAPG = new GridBagConstraints();
		gbc_labelAPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelAPG.gridx = 7;
		gbc_labelAPG.gridy = 7;
		add(labelAPG, gbc_labelAPG);

		JLabel labelMVPAllStar = new JLabel(
				"MVP del  AllStar " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getMVPAllStar());
		labelMVPAllStar.setForeground(Color.WHITE);
		labelMVPAllStar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelMVPAllStar = new GridBagConstraints();
		gbc_labelMVPAllStar.insets = new Insets(0, 0, 5, 5);
		gbc_labelMVPAllStar.gridx = 3;
		gbc_labelMVPAllStar.gridy = 9;
		add(labelMVPAllStar, gbc_labelMVPAllStar);

		JLabel labelRookie = new JLabel(
				"Rookie del año " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).isRookieDelAño());
		labelRookie.setForeground(Color.WHITE);
		labelRookie.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelRookie = new GridBagConstraints();
		gbc_labelRookie.insets = new Insets(0, 0, 5, 5);
		gbc_labelRookie.gridx = 5;
		gbc_labelRookie.gridy = 9;
		add(labelRookie, gbc_labelRookie);

		JLabel labelRBG = new JLabel("RBG " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getRBG());
		labelRBG.setForeground(Color.WHITE);
		labelRBG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelRBG = new GridBagConstraints();
		gbc_labelRBG.insets = new Insets(0, 0, 5, 5);
		gbc_labelRBG.gridx = 7;
		gbc_labelRBG.gridy = 9;
		add(labelRBG, gbc_labelRBG);

		JLabel labelPremioAnotador = new JLabel(
				"Premio anotador " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getPremioAnotador());
		labelPremioAnotador.setForeground(Color.WHITE);
		labelPremioAnotador.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelPremioAnotador = new GridBagConstraints();
		gbc_labelPremioAnotador.insets = new Insets(0, 0, 5, 5);
		gbc_labelPremioAnotador.gridx = 3;
		gbc_labelPremioAnotador.gridy = 11;
		add(labelPremioAnotador, gbc_labelPremioAnotador);

		JLabel labelDPOY = new JLabel("Número de trofeos de defensor del año "
				+ Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getDefensorDelAño());
		labelDPOY.setForeground(Color.WHITE);
		labelDPOY.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelDPOY = new GridBagConstraints();
		gbc_labelDPOY.insets = new Insets(0, 0, 5, 5);
		gbc_labelDPOY.gridx = 5;
		gbc_labelDPOY.gridy = 11;
		add(labelDPOY, gbc_labelDPOY);

		JLabel labelSPG = new JLabel("SPG " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getSPG());
		labelSPG.setForeground(Color.WHITE);
		labelSPG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelSPG = new GridBagConstraints();
		gbc_labelSPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelSPG.gridx = 7;
		gbc_labelSPG.gridy = 11;
		add(labelSPG, gbc_labelSPG);

		JLabel labelFMVP = new JLabel("FMVP " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getFMVP());
		labelFMVP.setForeground(Color.WHITE);
		labelFMVP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelFMVP = new GridBagConstraints();
		gbc_labelFMVP.insets = new Insets(0, 0, 5, 5);
		gbc_labelFMVP.gridx = 3;
		gbc_labelFMVP.gridy = 13;
		add(labelFMVP, gbc_labelFMVP);

		JLabel labelMVP = new JLabel(
				"Número de MVP " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getMVPs());
		labelMVP.setForeground(Color.WHITE);
		labelMVP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelMVP = new GridBagConstraints();
		gbc_labelMVP.insets = new Insets(0, 0, 5, 5);
		gbc_labelMVP.gridx = 5;
		gbc_labelMVP.gridy = 13;
		add(labelMVP, gbc_labelMVP);

		JLabel labelBPG = new JLabel("BPG " + Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getBPG());
		labelBPG.setForeground(Color.WHITE);
		labelBPG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelBPG = new GridBagConstraints();
		gbc_labelBPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelBPG.gridx = 7;
		gbc_labelBPG.gridy = 13;
		add(labelBPG, gbc_labelBPG);

		JLabel labelSalario = new JLabel(
				Jugador.getDatosDeJugador().get(ventana.getNombreJugador()).getSalario() + " Millones de dólares");
		labelSalario.setForeground(Color.WHITE);
		labelSalario.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		GridBagConstraints gbc_labelSalario = new GridBagConstraints();
		gbc_labelSalario.insets = new Insets(0, 0, 5, 5);
		gbc_labelSalario.gridx = 9;
		gbc_labelSalario.gridy = 13;
		add(labelSalario, gbc_labelSalario);
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);
		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 15;
		add(botonVolver, gbc_botonVolver);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(".\\imagenes\\fondoVerJugador.jpg"));
		GridBagConstraints gbc_background = new GridBagConstraints();
		gbc_background.gridheight = 17;
		gbc_background.gridwidth = 13;
		gbc_background.insets = new Insets(0, 0, 5, 5);
		gbc_background.gridx = 0;
		gbc_background.gridy = 0;
		add(background, gbc_background);
	}

}
