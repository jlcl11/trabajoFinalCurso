package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import clases.Equipo;
import utils.funcionesUtiles;

public class PantallaEscogerEquipoDatosFranquicia extends JPanel {
	private Ventana ventana;
	private ArrayList<JRadioButton> botonesEquipo;

	public PantallaEscogerEquipoDatosFranquicia(final Ventana ventana) throws SQLException {
		super();
		this.ventana = ventana;
		botonesEquipo=new ArrayList<JRadioButton>();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0,
				1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel tituloEscogerEquipo = new JLabel("\u00BFQu\u00E9 equipo quieres escoger?");
		tituloEscogerEquipo.setBackground(Color.WHITE);
		tituloEscogerEquipo.setForeground(Color.BLACK);
		tituloEscogerEquipo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_tituloEscogerEquipo = new GridBagConstraints();
		gbc_tituloEscogerEquipo.gridwidth = 4;
		gbc_tituloEscogerEquipo.gridheight = 2;
		gbc_tituloEscogerEquipo.insets = new Insets(0, 0, 5, 5);
		gbc_tituloEscogerEquipo.gridx = 4;
		gbc_tituloEscogerEquipo.gridy = 1;
		add(tituloEscogerEquipo, gbc_tituloEscogerEquipo);

		JButton botonVolver = new JButton("Volver");
		botonVolver.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});

		ButtonGroup grupoEquipos = new ButtonGroup();

		final JRadioButton escogerHawks = new JRadioButton("Hawks");
		botonesEquipo.add(escogerHawks);

		escogerHawks.setBackground(Color.WHITE);
		escogerHawks.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerHawks = new GridBagConstraints();
		gbc_escogerHawks.fill = GridBagConstraints.VERTICAL;
		gbc_escogerHawks.insets = new Insets(0, 0, 5, 5);
		gbc_escogerHawks.gridx = 4;
		gbc_escogerHawks.gridy = 5;
		add(escogerHawks, gbc_escogerHawks);

		if (escogerHawks.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerHawks.getText());
		}
		grupoEquipos.add(escogerHawks);

		JRadioButton escogerCeltics = new JRadioButton("Celtics");
		escogerCeltics.setBackground(Color.WHITE);
		escogerCeltics.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerCeltics = new GridBagConstraints();
		gbc_escogerCeltics.fill = GridBagConstraints.VERTICAL;
		gbc_escogerCeltics.insets = new Insets(0, 0, 5, 5);
		gbc_escogerCeltics.gridx = 5;
		gbc_escogerCeltics.gridy = 5;
		add(escogerCeltics, gbc_escogerCeltics);
		if (escogerCeltics.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerCeltics.getText());
		}
		grupoEquipos.add(escogerCeltics);

		JRadioButton escogerNets = new JRadioButton("Nets");
		escogerNets.setBackground(Color.WHITE);
		escogerNets.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerNets = new GridBagConstraints();
		gbc_escogerNets.fill = GridBagConstraints.VERTICAL;
		gbc_escogerNets.insets = new Insets(0, 0, 5, 5);
		gbc_escogerNets.gridx = 6;
		gbc_escogerNets.gridy = 5;
		add(escogerNets, gbc_escogerNets);
		if (escogerNets.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerNets.getText());
		}
		grupoEquipos.add(escogerNets);

		JRadioButton escogerHornets = new JRadioButton("Hornets");
		escogerHornets.setBackground(Color.WHITE);
		escogerHornets.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerHornets = new GridBagConstraints();
		gbc_escogerHornets.fill = GridBagConstraints.VERTICAL;
		gbc_escogerHornets.insets = new Insets(0, 0, 5, 5);
		gbc_escogerHornets.gridx = 4;
		gbc_escogerHornets.gridy = 7;
		add(escogerHornets, gbc_escogerHornets);
		if (escogerHornets.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerHornets.getText());
		}
		grupoEquipos.add(escogerHornets);

		JRadioButton escogerBulls = new JRadioButton("Bulls");
		escogerBulls.setBackground(Color.WHITE);
		escogerBulls.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerBulls = new GridBagConstraints();
		gbc_escogerBulls.fill = GridBagConstraints.VERTICAL;
		gbc_escogerBulls.insets = new Insets(0, 0, 5, 5);
		gbc_escogerBulls.gridx = 5;
		gbc_escogerBulls.gridy = 7;
		add(escogerBulls, gbc_escogerBulls);
		if (escogerBulls.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerBulls.getText());
		}
		grupoEquipos.add(escogerBulls);

		JRadioButton escogerCavs = new JRadioButton("Cavaliers");
		escogerCavs.setBackground(Color.WHITE);
		escogerCavs.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerCavs = new GridBagConstraints();
		gbc_escogerCavs.fill = GridBagConstraints.VERTICAL;
		gbc_escogerCavs.insets = new Insets(0, 0, 5, 5);
		gbc_escogerCavs.gridx = 6;
		gbc_escogerCavs.gridy = 7;
		add(escogerCavs, gbc_escogerCavs);
		if (escogerCavs.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerCavs.getText());
		}
		grupoEquipos.add(escogerCavs);

		JRadioButton escogerPistons = new JRadioButton("Pistons");
		escogerPistons.setBackground(Color.WHITE);
		escogerPistons.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerPistons = new GridBagConstraints();
		gbc_escogerPistons.fill = GridBagConstraints.VERTICAL;
		gbc_escogerPistons.insets = new Insets(0, 0, 5, 5);
		gbc_escogerPistons.gridx = 4;
		gbc_escogerPistons.gridy = 9;
		add(escogerPistons, gbc_escogerPistons);
		if (escogerPistons.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerPistons.getText());
		}
		grupoEquipos.add(escogerPistons);

		JRadioButton escogerPacers = new JRadioButton("Pacers");
		escogerPacers.setBackground(Color.WHITE);
		escogerPacers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerPacers = new GridBagConstraints();
		gbc_escogerPacers.fill = GridBagConstraints.VERTICAL;
		gbc_escogerPacers.insets = new Insets(0, 0, 5, 5);
		gbc_escogerPacers.gridx = 5;
		gbc_escogerPacers.gridy = 9;
		add(escogerPacers, gbc_escogerPacers);
		if (escogerPacers.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerPacers.getText());
		}
		grupoEquipos.add(escogerPacers);

		JRadioButton escogerHeat = new JRadioButton("Heat");
		escogerHeat.setBackground(Color.WHITE);
		escogerHeat.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerHeat = new GridBagConstraints();
		gbc_escogerHeat.fill = GridBagConstraints.VERTICAL;
		gbc_escogerHeat.insets = new Insets(0, 0, 5, 5);
		gbc_escogerHeat.gridx = 6;
		gbc_escogerHeat.gridy = 9;
		add(escogerHeat, gbc_escogerHeat);
		if (escogerHeat.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerHeat.getText());
		}
		grupoEquipos.add(escogerHeat);

		JRadioButton escogerBucks = new JRadioButton("Bucks");
		escogerBucks.setBackground(Color.WHITE);
		escogerBucks.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerBucks = new GridBagConstraints();
		gbc_escogerBucks.fill = GridBagConstraints.VERTICAL;
		gbc_escogerBucks.insets = new Insets(0, 0, 5, 5);
		gbc_escogerBucks.gridx = 4;
		gbc_escogerBucks.gridy = 11;
		add(escogerBucks, gbc_escogerBucks);
		if (escogerBucks.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerBucks.getText());
		}
		grupoEquipos.add(escogerBucks);

		JRadioButton escogerKnicks = new JRadioButton("Knicks");
		escogerKnicks.setBackground(Color.WHITE);
		escogerKnicks.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerKnicks = new GridBagConstraints();
		gbc_escogerKnicks.fill = GridBagConstraints.VERTICAL;
		gbc_escogerKnicks.insets = new Insets(0, 0, 5, 5);
		gbc_escogerKnicks.gridx = 5;
		gbc_escogerKnicks.gridy = 11;
		add(escogerKnicks, gbc_escogerKnicks);
		if (escogerKnicks.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerKnicks.getText());
		}
		grupoEquipos.add(escogerKnicks);

		JRadioButton escogerMagic = new JRadioButton("Magic");
		escogerMagic.setBackground(Color.WHITE);
		escogerMagic.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerMagic = new GridBagConstraints();
		gbc_escogerMagic.fill = GridBagConstraints.VERTICAL;
		gbc_escogerMagic.insets = new Insets(0, 0, 5, 5);
		gbc_escogerMagic.gridx = 6;
		gbc_escogerMagic.gridy = 11;
		add(escogerMagic, gbc_escogerMagic);
		if (escogerMagic.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerMagic.getText());
		}
		grupoEquipos.add(escogerMagic);

		JRadioButton escogerSixers = new JRadioButton("76ers");
		escogerSixers.setBackground(Color.WHITE);
		escogerSixers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerSixers = new GridBagConstraints();
		gbc_escogerSixers.fill = GridBagConstraints.VERTICAL;
		gbc_escogerSixers.insets = new Insets(0, 0, 5, 5);
		gbc_escogerSixers.gridx = 4;
		gbc_escogerSixers.gridy = 13;
		add(escogerSixers, gbc_escogerSixers);
		if (escogerSixers.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerSixers.getText());
		}
		grupoEquipos.add(escogerSixers);

		JRadioButton escogerRaptors = new JRadioButton("Raptors");
		escogerRaptors.setBackground(Color.WHITE);
		escogerRaptors.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerRaptors = new GridBagConstraints();
		gbc_escogerRaptors.fill = GridBagConstraints.VERTICAL;
		gbc_escogerRaptors.insets = new Insets(0, 0, 5, 5);
		gbc_escogerRaptors.gridx = 5;
		gbc_escogerRaptors.gridy = 13;
		add(escogerRaptors, gbc_escogerRaptors);
		if (escogerRaptors.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerRaptors.getText());
		}
		grupoEquipos.add(escogerRaptors);

		JRadioButton escogerWizards = new JRadioButton("Wizards");
		escogerWizards.setBackground(Color.WHITE);
		escogerWizards.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerWizards = new GridBagConstraints();
		gbc_escogerWizards.fill = GridBagConstraints.VERTICAL;
		gbc_escogerWizards.insets = new Insets(0, 0, 5, 5);
		gbc_escogerWizards.gridx = 6;
		gbc_escogerWizards.gridy = 13;
		add(escogerWizards, gbc_escogerWizards);
		if (escogerWizards.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerWizards.getText());
		}
		grupoEquipos.add(escogerWizards);

		JRadioButton escogerMavs = new JRadioButton("Mavericks");
		escogerMavs.setBackground(Color.WHITE);
		escogerMavs.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerMavs = new GridBagConstraints();
		gbc_escogerMavs.fill = GridBagConstraints.VERTICAL;
		gbc_escogerMavs.insets = new Insets(0, 0, 5, 5);
		gbc_escogerMavs.gridx = 4;
		gbc_escogerMavs.gridy = 15;
		add(escogerMavs, gbc_escogerMavs);
		if (escogerMavs.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerMavs.getText());
		}
		grupoEquipos.add(escogerMavs);

		JRadioButton escogerNuggets = new JRadioButton("Nuggets");
		escogerNuggets.setBackground(Color.WHITE);
		escogerNuggets.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerNuggets = new GridBagConstraints();
		gbc_escogerNuggets.fill = GridBagConstraints.VERTICAL;
		gbc_escogerNuggets.insets = new Insets(0, 0, 5, 5);
		gbc_escogerNuggets.gridx = 5;
		gbc_escogerNuggets.gridy = 15;
		add(escogerNuggets, gbc_escogerNuggets);
		if (escogerNuggets.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerNuggets.getText());
		}
		grupoEquipos.add(escogerNuggets);

		JRadioButton escogerWarriors = new JRadioButton("Golden State Warriors");
		escogerWarriors.setBackground(Color.WHITE);
		escogerWarriors.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerWarriors = new GridBagConstraints();
		gbc_escogerWarriors.fill = GridBagConstraints.VERTICAL;
		gbc_escogerWarriors.insets = new Insets(0, 0, 5, 5);
		gbc_escogerWarriors.gridx = 6;
		gbc_escogerWarriors.gridy = 15;
		add(escogerWarriors, gbc_escogerWarriors);
		if (escogerWarriors.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerWarriors.getText());
		}
		grupoEquipos.add(escogerWarriors);

		JRadioButton escogerRockets = new JRadioButton("Rockets");
		escogerRockets.setBackground(Color.WHITE);
		escogerRockets.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerRockets = new GridBagConstraints();
		gbc_escogerRockets.fill = GridBagConstraints.VERTICAL;
		gbc_escogerRockets.insets = new Insets(0, 0, 5, 5);
		gbc_escogerRockets.gridx = 4;
		gbc_escogerRockets.gridy = 17;
		add(escogerRockets, gbc_escogerRockets);
		if (escogerRockets.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerRockets.getText());
		}
		grupoEquipos.add(escogerRockets);

		JRadioButton escogerClippers = new JRadioButton("Clippers");
		escogerClippers.setBackground(Color.WHITE);
		escogerClippers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerClippers = new GridBagConstraints();
		gbc_escogerClippers.fill = GridBagConstraints.VERTICAL;
		gbc_escogerClippers.insets = new Insets(0, 0, 5, 5);
		gbc_escogerClippers.gridx = 5;
		gbc_escogerClippers.gridy = 17;
		add(escogerClippers, gbc_escogerClippers);
		if (escogerClippers.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerClippers.getText());
		}
		grupoEquipos.add(escogerClippers);

		JRadioButton escogerLakers = new JRadioButton("Lakers");
		escogerLakers.setBackground(Color.WHITE);
		escogerLakers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerLakers = new GridBagConstraints();
		gbc_escogerLakers.fill = GridBagConstraints.VERTICAL;
		gbc_escogerLakers.insets = new Insets(0, 0, 5, 5);
		gbc_escogerLakers.gridx = 6;
		gbc_escogerLakers.gridy = 17;
		add(escogerLakers, gbc_escogerLakers);
		if (escogerLakers.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerLakers.getText());
		}
		grupoEquipos.add(escogerLakers);

		JRadioButton escogerGrizzlies = new JRadioButton("Grizzlies");
		escogerGrizzlies.setBackground(Color.WHITE);
		escogerGrizzlies.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerGrizzlies = new GridBagConstraints();
		gbc_escogerGrizzlies.fill = GridBagConstraints.VERTICAL;
		gbc_escogerGrizzlies.insets = new Insets(0, 0, 5, 5);
		gbc_escogerGrizzlies.gridx = 4;
		gbc_escogerGrizzlies.gridy = 19;
		add(escogerGrizzlies, gbc_escogerGrizzlies);
		if (escogerGrizzlies.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerGrizzlies.getText());
		}
		grupoEquipos.add(escogerGrizzlies);

		JRadioButton escogerTWolves = new JRadioButton("Timberwolves");
		escogerTWolves.setBackground(Color.WHITE);
		escogerTWolves.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerTWolves = new GridBagConstraints();
		gbc_escogerTWolves.fill = GridBagConstraints.VERTICAL;
		gbc_escogerTWolves.insets = new Insets(0, 0, 5, 5);
		gbc_escogerTWolves.gridx = 5;
		gbc_escogerTWolves.gridy = 19;
		add(escogerTWolves, gbc_escogerTWolves);
		if (escogerTWolves.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerTWolves.getText());
		}
		grupoEquipos.add(escogerTWolves);

		JRadioButton escogerPelicans = new JRadioButton("Pelicans");
		escogerPelicans.setBackground(Color.WHITE);
		escogerPelicans.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerPelicans = new GridBagConstraints();
		gbc_escogerPelicans.fill = GridBagConstraints.VERTICAL;
		gbc_escogerPelicans.insets = new Insets(0, 0, 5, 5);
		gbc_escogerPelicans.gridx = 6;
		gbc_escogerPelicans.gridy = 19;
		add(escogerPelicans, gbc_escogerPelicans);
		if (escogerPelicans.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerPelicans.getText());
		}
		grupoEquipos.add(escogerPelicans);

		JRadioButton escogerThunder = new JRadioButton("Thunder");
		escogerThunder.setBackground(Color.WHITE);
		escogerThunder.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerThunder = new GridBagConstraints();
		gbc_escogerThunder.fill = GridBagConstraints.VERTICAL;
		gbc_escogerThunder.insets = new Insets(0, 0, 5, 5);
		gbc_escogerThunder.gridx = 4;
		gbc_escogerThunder.gridy = 21;
		add(escogerThunder, gbc_escogerThunder);
		if (escogerThunder.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerThunder.getText());
		}
		grupoEquipos.add(escogerThunder);

		JRadioButton escogerSuns = new JRadioButton("Suns");
		escogerSuns.setBackground(Color.WHITE);
		escogerSuns.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerSuns = new GridBagConstraints();
		gbc_escogerSuns.fill = GridBagConstraints.VERTICAL;
		gbc_escogerSuns.insets = new Insets(0, 0, 5, 5);
		gbc_escogerSuns.gridx = 5;
		gbc_escogerSuns.gridy = 21;
		add(escogerSuns, gbc_escogerSuns);
		if (escogerSuns.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerSuns.getText());
		}
		grupoEquipos.add(escogerSuns);

		JRadioButton escogerBlazers = new JRadioButton("Trail Blazesr");
		escogerBlazers.setBackground(Color.WHITE);
		escogerBlazers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerBlazers = new GridBagConstraints();
		gbc_escogerBlazers.fill = GridBagConstraints.VERTICAL;
		gbc_escogerBlazers.insets = new Insets(0, 0, 5, 5);
		gbc_escogerBlazers.gridx = 6;
		gbc_escogerBlazers.gridy = 21;
		add(escogerBlazers, gbc_escogerBlazers);
		if (escogerBlazers.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerBlazers.getText());
		}
		grupoEquipos.add(escogerBlazers);

		JRadioButton escogerKings = new JRadioButton("Kings");
		escogerKings.setBackground(Color.WHITE);
		escogerKings.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerKings = new GridBagConstraints();
		gbc_escogerKings.fill = GridBagConstraints.VERTICAL;
		gbc_escogerKings.insets = new Insets(0, 0, 5, 5);
		gbc_escogerKings.gridx = 4;
		gbc_escogerKings.gridy = 23;
		add(escogerKings, gbc_escogerKings);
		if (escogerKings.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerKings.getText());
		}
		grupoEquipos.add(escogerKings);

		JRadioButton escogerSpurs = new JRadioButton("Spurs");
		escogerSpurs.setBackground(Color.WHITE);
		escogerSpurs.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerSpurs = new GridBagConstraints();
		gbc_escogerSpurs.fill = GridBagConstraints.VERTICAL;
		gbc_escogerSpurs.insets = new Insets(0, 0, 5, 5);
		gbc_escogerSpurs.gridx = 5;
		gbc_escogerSpurs.gridy = 23;
		add(escogerSpurs, gbc_escogerSpurs);
		if (escogerSpurs.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerSpurs.getText());
		}
		grupoEquipos.add(escogerSpurs);

		JRadioButton escogerJazz = new JRadioButton("Jazz");
		escogerJazz.setBackground(Color.WHITE);
		escogerJazz.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_escogerJazz = new GridBagConstraints();
		gbc_escogerJazz.fill = GridBagConstraints.VERTICAL;
		gbc_escogerJazz.insets = new Insets(0, 0, 5, 5);
		gbc_escogerJazz.gridx = 6;
		gbc_escogerJazz.gridy = 23;
		add(escogerJazz, gbc_escogerJazz);
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);
		if (escogerJazz.isSelected()) {

			this.ventana.miEquipo = new Equipo(escogerJazz.getText());
		}
		grupoEquipos.add(escogerJazz);

		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.gridwidth = 2;
		gbc_botonVolver.fill = GridBagConstraints.BOTH;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 25;
		add(botonVolver, gbc_botonVolver);

		JButton botonEquipoEscogido = new JButton("Siguiente");
		botonEquipoEscogido.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		botonEquipoEscogido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(byte i=0;i<botonesEquipo.size();i++) {
					if(botonesEquipo.get(i).isSelected()) {
						try {
							ventana.miEquipo=new Equipo(botonesEquipo.get(i).getText());
							System.out.println(ventana.miEquipo);
							break;
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				ventana.cambiarAPantalla("Datos Franquicia");
			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\logo.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 27;
		gbc_lblNewLabel.gridwidth = 12;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		botonEquipoEscogido.setBackground(Color.BLUE);
		botonEquipoEscogido.setForeground(Color.WHITE);
		GridBagConstraints gbc_botonEquipoEscogido = new GridBagConstraints();
		gbc_botonEquipoEscogido.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonEquipoEscogido.gridwidth = 2;
		gbc_botonEquipoEscogido.insets = new Insets(0, 0, 5, 5);
		gbc_botonEquipoEscogido.gridx = 9;
		gbc_botonEquipoEscogido.gridy = 25;
		add(botonEquipoEscogido, gbc_botonEquipoEscogido);

	}

}
