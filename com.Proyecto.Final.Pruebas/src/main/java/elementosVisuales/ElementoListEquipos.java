package elementosVisuales;

import javax.swing.JPanel;

import clases.Equipo;
import pantallas.Ventana;
import superClases.Jugador;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class ElementoListEquipos extends JPanel{
	private Ventana ventana;
	private Equipo equipo;
	
	public ElementoListEquipos(Ventana ventana, Equipo equipo) {
		super();
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		this.ventana = ventana;
		this.equipo = equipo;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel ciudadEquipo = new JLabel(this.equipo.getCiudadLocal());
		ciudadEquipo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_ciudadEquipo = new GridBagConstraints();
		gbc_ciudadEquipo.anchor = GridBagConstraints.WEST;
		gbc_ciudadEquipo.insets = new Insets(0, 0, 5, 5);
		gbc_ciudadEquipo.gridx = 1;
		gbc_ciudadEquipo.gridy = 3;
		add(ciudadEquipo, gbc_ciudadEquipo);
		
		JLabel equipoNombre = new JLabel(this.equipo.getNombre());
		equipoNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_equipoNombre = new GridBagConstraints();
		gbc_equipoNombre.anchor = GridBagConstraints.WEST;
		gbc_equipoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_equipoNombre.gridx = 2;
		gbc_equipoNombre.gridy = 3;
		add(equipoNombre, gbc_equipoNombre);
		
		JLabel lblNewLabel = new JLabel("fotaca");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
	}
	
	
}
