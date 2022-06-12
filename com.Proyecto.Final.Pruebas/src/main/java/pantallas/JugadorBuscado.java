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

public class JugadorBuscado extends JPanel {
	public JugadorBuscado(final Ventana ventana, HashMap<String, Jugador> g) throws SQLException {
		

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
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

		JLabel labelNombre = new JLabel(g.get(ventana.getNombreApellidosJugador()).getNombre() + " "
				+ g.get(ventana.getNombreApellidosJugador()).getApodo() + " "
				+ g.get(ventana.getNombreApellidosJugador()).getApellido() + " "
				+ g.get(ventana.getNombreApellidosJugador()).getPosicion() + " nº "
				+ g.get(ventana.getNombreApellidosJugador()).getDorsal());
		labelNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		labelNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.gridwidth = 11;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 2;
		add(labelNombre, gbc_labelNombre);

		JLabel labelNominaciones = new JLabel(
				"Nominaciones al AllStar " + g.get(ventana.getNombreApellidosJugador()).getNominacionesAllStar());
		GridBagConstraints gbc_labelNominaciones = new GridBagConstraints();
		gbc_labelNominaciones.insets = new Insets(0, 0, 5, 5);
		gbc_labelNominaciones.gridx = 3;
		gbc_labelNominaciones.gridy = 5;
		add(labelNominaciones, gbc_labelNominaciones);

		JLabel labelMPG = new JLabel("MPG " + g.get(ventana.getNombreApellidosJugador()).getMPG());
		GridBagConstraints gbc_labelMPG = new GridBagConstraints();
		gbc_labelMPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelMPG.gridx = 5;
		gbc_labelMPG.gridy = 5;
		add(labelMPG, gbc_labelMPG);

		JLabel labelPPG = new JLabel("PPG " + g.get(ventana.getNombreApellidosJugador()).getPPG());
		GridBagConstraints gbc_labelPPG = new GridBagConstraints();
		gbc_labelPPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelPPG.gridx = 7;
		gbc_labelPPG.gridy = 5;
		add(labelPPG, gbc_labelPPG);

		JLabel labelFinalizacion = new JLabel(
				"Finalización " + g.get(ventana.getNombreApellidosJugador()).getFinalizacion());
		GridBagConstraints gbc_labelFinalizacion = new GridBagConstraints();
		gbc_labelFinalizacion.insets = new Insets(0, 0, 5, 5);
		gbc_labelFinalizacion.gridx = 9;
		gbc_labelFinalizacion.gridy = 5;
		add(labelFinalizacion, gbc_labelFinalizacion);

		JLabel labelAnillos = new JLabel(
				"Anillos de campeón " + g.get(ventana.getNombreApellidosJugador()).getAnillosDeCampeon());
		GridBagConstraints gbc_labelAnillos = new GridBagConstraints();
		gbc_labelAnillos.insets = new Insets(0, 0, 5, 5);
		gbc_labelAnillos.gridx = 3;
		gbc_labelAnillos.gridy = 7;
		add(labelAnillos, gbc_labelAnillos);

		JLabel labelMIP = new JLabel("Most Improved Player " + g.get(ventana.getNombreApellidosJugador()).isMIP());
		GridBagConstraints gbc_labelMIP = new GridBagConstraints();
		gbc_labelMIP.insets = new Insets(0, 0, 5, 5);
		gbc_labelMIP.gridx = 5;
		gbc_labelMIP.gridy = 7;
		add(labelMIP, gbc_labelMIP);

		JLabel labelAPG = new JLabel("APG " + g.get(ventana.getNombreApellidosJugador()).getAPG());
		GridBagConstraints gbc_labelAPG = new GridBagConstraints();
		gbc_labelAPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelAPG.gridx = 7;
		gbc_labelAPG.gridy = 7;
		add(labelAPG, gbc_labelAPG);

		JLabel labelTiro = new JLabel("Tiro " + g.get(ventana.getNombreApellidosJugador()).getTiro());
		GridBagConstraints gbc_labelTiro = new GridBagConstraints();
		gbc_labelTiro.insets = new Insets(0, 0, 5, 5);
		gbc_labelTiro.gridx = 9;
		gbc_labelTiro.gridy = 7;
		add(labelTiro, gbc_labelTiro);

		JLabel labelMVPAllStar = new JLabel(
				"MVP del  AllStar " + g.get(ventana.getNombreApellidosJugador()).getMVPAllStar());
		GridBagConstraints gbc_labelMVPAllStar = new GridBagConstraints();
		gbc_labelMVPAllStar.insets = new Insets(0, 0, 5, 5);
		gbc_labelMVPAllStar.gridx = 3;
		gbc_labelMVPAllStar.gridy = 9;
		add(labelMVPAllStar, gbc_labelMVPAllStar);

		JLabel labelRookie = new JLabel(
				"Rookie del año " + g.get(ventana.getNombreApellidosJugador()).isRookieDelAño());
		GridBagConstraints gbc_labelRookie = new GridBagConstraints();
		gbc_labelRookie.insets = new Insets(0, 0, 5, 5);
		gbc_labelRookie.gridx = 5;
		gbc_labelRookie.gridy = 9;
		add(labelRookie, gbc_labelRookie);

		JLabel labelRBG = new JLabel("RBG " + g.get(ventana.getNombreApellidosJugador()).getRBG());
		GridBagConstraints gbc_labelRBG = new GridBagConstraints();
		gbc_labelRBG.insets = new Insets(0, 0, 5, 5);
		gbc_labelRBG.gridx = 7;
		gbc_labelRBG.gridy = 9;
		add(labelRBG, gbc_labelRBG);

		JLabel labelOrga = new JLabel("Organización " + g.get(ventana.getNombreApellidosJugador()).getOrganizacion());
		GridBagConstraints gbc_labelOrga = new GridBagConstraints();
		gbc_labelOrga.insets = new Insets(0, 0, 5, 5);
		gbc_labelOrga.gridx = 9;
		gbc_labelOrga.gridy = 9;
		add(labelOrga, gbc_labelOrga);

		JLabel labelPremioAnotador = new JLabel(
				"Premio anotador " + g.get(ventana.getNombreApellidosJugador()).getPremioAnotador());
		GridBagConstraints gbc_labelPremioAnotador = new GridBagConstraints();
		gbc_labelPremioAnotador.insets = new Insets(0, 0, 5, 5);
		gbc_labelPremioAnotador.gridx = 3;
		gbc_labelPremioAnotador.gridy = 11;
		add(labelPremioAnotador, gbc_labelPremioAnotador);

		JLabel labelDPOY = new JLabel("Número de trofeos de defensor del año "
				+ g.get(ventana.getNombreApellidosJugador()).getDefensorDelAño());
		GridBagConstraints gbc_labelDPOY = new GridBagConstraints();
		gbc_labelDPOY.insets = new Insets(0, 0, 5, 5);
		gbc_labelDPOY.gridx = 5;
		gbc_labelDPOY.gridy = 11;
		add(labelDPOY, gbc_labelDPOY);

		JLabel labelSPG = new JLabel("SPG " + g.get(ventana.getNombreApellidosJugador()).getSPG());
		GridBagConstraints gbc_labelSPG = new GridBagConstraints();
		gbc_labelSPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelSPG.gridx = 7;
		gbc_labelSPG.gridy = 11;
		add(labelSPG, gbc_labelSPG);

		JLabel labelDefensa = new JLabel("Defensa " + g.get(ventana.getNombreApellidosJugador()).getDefensas());
		GridBagConstraints gbc_labelDefensa = new GridBagConstraints();
		gbc_labelDefensa.insets = new Insets(0, 0, 5, 5);
		gbc_labelDefensa.gridx = 9;
		gbc_labelDefensa.gridy = 11;
		add(labelDefensa, gbc_labelDefensa);

		JLabel labelFMVP = new JLabel("FMVP " + g.get(ventana.getNombreApellidosJugador()).getFMVP());
		GridBagConstraints gbc_labelFMVP = new GridBagConstraints();
		gbc_labelFMVP.insets = new Insets(0, 0, 5, 5);
		gbc_labelFMVP.gridx = 3;
		gbc_labelFMVP.gridy = 13;
		add(labelFMVP, gbc_labelFMVP);

		JLabel labelMVP = new JLabel("Número de MVP " + g.get(ventana.getNombreApellidosJugador()).getMVPs());
		GridBagConstraints gbc_labelMVP = new GridBagConstraints();
		gbc_labelMVP.insets = new Insets(0, 0, 5, 5);
		gbc_labelMVP.gridx = 5;
		gbc_labelMVP.gridy = 13;
		add(labelMVP, gbc_labelMVP);

		JLabel labelBPG = new JLabel("BPG " + g.get(ventana.getNombreApellidosJugador()).getBPG());
		GridBagConstraints gbc_labelBPG = new GridBagConstraints();
		gbc_labelBPG.insets = new Insets(0, 0, 5, 5);
		gbc_labelBPG.gridx = 7;
		gbc_labelBPG.gridy = 13;
		add(labelBPG, gbc_labelBPG);

		JLabel labelSalario = new JLabel(
				g.get(ventana.getNombreApellidosJugador()).getSalario() + " Millones de dólares");
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
	}

}
