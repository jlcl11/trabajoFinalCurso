package elementosVisuales;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import clases.Equipo;
import pantallas.Ventana;

/**
 * Clase que representa el elemento visual que muestra un equipo que participa
 * en la segunda ronda de playoffs
 * 
 * @author jcorr
 *
 */
public class ElementoListEquiposSegundaRonda extends JPanel {
	/*
	 * ventana en la que se muestra esta pantalla,sirve para conseguir datos
	 * dinámicos
	 */
	private Ventana ventana;
	/* equipo del que se muestran los datos,así se puede hacer todo dinámico */
	private Equipo equipo;

	/**
	 * Constructor del elemento visual
	 * 
	 * @param ventana ventana en la que se muestra esta pantalla
	 * @param equipo  equipo del que se muestran los datos
	 */
	public ElementoListEquiposSegundaRonda(Ventana ventana, Equipo equipo) {
		super();
		setBackground(Color.ORANGE);
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		this.ventana = ventana;
		this.equipo = equipo;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel ciudadEquipo = new JLabel(this.equipo.getCiudadLocal());
		ciudadEquipo.setForeground(Color.WHITE);
		ciudadEquipo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 15));
		GridBagConstraints gbc_ciudadEquipo = new GridBagConstraints();
		gbc_ciudadEquipo.anchor = GridBagConstraints.EAST;
		gbc_ciudadEquipo.insets = new Insets(0, 0, 5, 5);
		gbc_ciudadEquipo.gridx = 0;
		gbc_ciudadEquipo.gridy = 2;
		add(ciudadEquipo, gbc_ciudadEquipo);

		JLabel equipoNombre = new JLabel(this.equipo.getNombre());
		equipoNombre.setForeground(Color.WHITE);
		equipoNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 15));
		GridBagConstraints gbc_equipoNombre = new GridBagConstraints();
		gbc_equipoNombre.anchor = GridBagConstraints.WEST;
		gbc_equipoNombre.insets = new Insets(0, 0, 5, 0);
		gbc_equipoNombre.gridx = 1;
		gbc_equipoNombre.gridy = 2;
		add(equipoNombre, gbc_equipoNombre);
	}

}
