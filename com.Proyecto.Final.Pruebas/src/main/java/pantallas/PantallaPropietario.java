package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.funcionesUtiles;

public class PantallaPropietario extends JPanel{
private Ventana ventana;

public PantallaPropietario(final Ventana ventana) {
	super();
	this.ventana = ventana;
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
	gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
	gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
	setLayout(gridBagLayout);
	
	JLabel lblNewLabel = new JLabel("El estadio de los xxxx es el xxxx"+ventana.miEquipo.getPropietario());
	lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel.gridx = 2;
	gbc_lblNewLabel.gridy = 2;
	add(lblNewLabel, gbc_lblNewLabel);
	
	JLabel foto = new JLabel("placeHolderDeFoto");
	GridBagConstraints gbc_foto = new GridBagConstraints();
	gbc_foto.gridheight = 2;
	gbc_foto.insets = new Insets(0, 0, 5, 5);
	gbc_foto.gridx = 2;
	gbc_foto.gridy = 4;
	add(foto, gbc_foto);
	
	JButton Volver = new JButton("Volver");
	Volver.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			ventana.cambiarAPantalla("Datos Franquicia");
		}
	});
	Volver.setForeground(Color.WHITE);
	Volver.setBackground(Color.RED);
	GridBagConstraints gbc_Volver = new GridBagConstraints();
	gbc_Volver.anchor = GridBagConstraints.WEST;
	gbc_Volver.insets = new Insets(0, 0, 5, 5);
	gbc_Volver.gridx = 1;
	gbc_Volver.gridy = 7;
	add(Volver, gbc_Volver);
}

}
