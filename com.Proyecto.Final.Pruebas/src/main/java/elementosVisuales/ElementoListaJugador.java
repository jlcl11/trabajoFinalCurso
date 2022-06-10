package elementosVisuales;

import javax.swing.JPanel;

import pantallas.Ventana;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.border.LineBorder;

import clases.Jugador;

import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * Clase que representa el elemento visual que muestra un jugador en activo
 * 
 * @author jcorr
 *
 */
public class ElementoListaJugador extends JPanel {
	/*
	 * ventana en la que se muestra esta pantalla,sirve para conseguir datos
	 * dinámicos
	 */
	private Ventana ventana;
	/* jugador del que se muestran los datos,así se puede hacer todo dinámico */
	private Jugador jugador;

	/**
	 * Constructor del elemento visual,hay que resaltar que depende si el jugador
	 * tiene o no apodo,pone el label en el que se muestra el apodo.Además del
	 * dorsal,el nombre los apellidos y el mote si tuviese muestra lás estadísticas
	 * de la temporada
	 * 
	 * @param ventana ventana en la que se muestra esta pantalla
	 * @param jugador jugador del que se muestran los datos
	 */
	public ElementoListaJugador(Ventana ventana, Jugador jugador) {
		super();
		setBorder(new LineBorder(Color.WHITE, 3, true));
		this.ventana = ventana;
		this.jugador = jugador;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelNombre = new JLabel(this.jugador.getNombre());
		labelNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.gridwidth = 2;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 0;
		gbc_labelNombre.gridy = 0;
		add(labelNombre, gbc_labelNombre);

		if (this.jugador.getApodo() != null) {
			JLabel labelApodo = new JLabel(this.jugador.getApodo());
			labelApodo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
			GridBagConstraints gbc_labelApodo = new GridBagConstraints();
			gbc_labelApodo.gridwidth = 2;
			gbc_labelApodo.insets = new Insets(0, 0, 5, 5);
			gbc_labelApodo.gridx = 2;
			gbc_labelApodo.gridy = 0;
			add(labelApodo, gbc_labelApodo);
		}

		JLabel labelApellido = new JLabel(this.jugador.getApellido());
		labelApellido.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_labelApellido = new GridBagConstraints();
		gbc_labelApellido.gridwidth = 2;
		gbc_labelApellido.insets = new Insets(0, 0, 5, 5);
		gbc_labelApellido.gridx = 4;
		gbc_labelApellido.gridy = 0;
		add(labelApellido, gbc_labelApellido);

		JLabel labelDorsal = new JLabel("nº " + this.jugador.getDorsal());
		labelDorsal.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_labelDorsal = new GridBagConstraints();
		gbc_labelDorsal.gridwidth = 2;
		gbc_labelDorsal.insets = new Insets(0, 0, 5, 0);
		gbc_labelDorsal.gridx = 6;
		gbc_labelDorsal.gridy = 0;
		add(labelDorsal, gbc_labelDorsal);

		JLabel lblNewLabel = new JLabel(this.jugador.getPPG() + " PPG");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(this.jugador.getAPG() + " APG");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(this.jugador.getRBG() + " RBG");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(this.jugador.getSPG() + " SPG");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 1;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(this.jugador.getBPG() + " BPG");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 5;
		gbc_lblNewLabel_4.gridy = 1;
		add(lblNewLabel_4, gbc_lblNewLabel_4);

	}

}
