package elementosVisuales;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import clases.Jugador;
import pantallas.Ventana;

/**
 * Clase que representa el elemento visual que muestra un jugador retirado cuyo
 * dorsal ha sido retirado por algún equipo
 * 
 * @author jcorr
 *
 */
public class ElementoListRetirados extends JPanel {
	/*
	 * ventana en la que se muestra esta pantalla,sirve para conseguir datos
	 * dinámicos
	 */
	private Ventana ventana;
	/* jugador del que se muestran los datos,así se puede hacer todo dinámico */
	private Jugador jugador;

	/**
	 * Constructor del elemento visual,hay que resaltar que depende si el jugador
	 * tiene o no apodo,pone el label en el que se muestra el apodo.
	 * 
	 * @param ventana ventana en la que se muestra esta pantalla
	 * @param jugador jugador del que se muestran los datos
	 */
	public ElementoListRetirados(Ventana ventana, Jugador jugador) {
		super();
		setBorder(new LineBorder(Color.WHITE, 3, true));
		this.ventana = ventana;
		this.jugador = jugador;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel nombreJugador = new JLabel(this.jugador.getNombre());
		nombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_nombreJugador = new GridBagConstraints();
		gbc_nombreJugador.gridwidth = 2;
		gbc_nombreJugador.insets = new Insets(0, 0, 0, 5);
		gbc_nombreJugador.gridx = 0;
		gbc_nombreJugador.gridy = 0;
		add(nombreJugador, gbc_nombreJugador);

		if (this.jugador.getApodo() != null) {
			JLabel lblNewLabel_1 = new JLabel(this.jugador.getApodo());
			lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.gridwidth = 2;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_1.gridx = 2;
			gbc_lblNewLabel_1.gridy = 0;
			add(lblNewLabel_1, gbc_lblNewLabel_1);
		}

		JLabel labelApellido = new JLabel(this.jugador.getApellido());
		labelApellido.setHorizontalAlignment(SwingConstants.LEFT);
		labelApellido.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_labelApellido = new GridBagConstraints();
		gbc_labelApellido.gridwidth = 2;
		gbc_labelApellido.insets = new Insets(0, 0, 0, 5);
		gbc_labelApellido.gridx = 4;
		gbc_labelApellido.gridy = 0;
		add(labelApellido, gbc_labelApellido);

		JLabel lblNewLabel = new JLabel(" nº " + this.jugador.getDorsal());
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 6;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

	}

}
