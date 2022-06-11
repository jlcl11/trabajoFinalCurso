package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.ImageIcon;

/**
 * Clase hereda de JPanel, y que enseña el nombre y apellidos del dueño del
 * equipo así como un a foto suya
 * 
 * @author jcorr
 *
 */
public class PantallaPropietario extends JPanel {
	/* ventana en la que se muestra la pantalla */
	private Ventana ventana;

	/**
	 * Constructor de PantallaPropietario,que inicializa la distribución de la
	 * información que sale por pantalla,así como su Layout.Consiste en una pantalla
	 * con 2 label, en uno de ellos muestra su nombre y apellidos y en otro la foto
	 * con la porpiedad icon del label
	 * 
	 * @param ventana ventana en la que se muestra la pantalla
	 */
	public PantallaPropietario(final Ventana ventana) {
		super();
		setBackground(Color.BLACK);
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("El propietario de los " + this.ventana.miEquipo.getNombre() + " es "
				+ this.ventana.miEquipo.getPropietario());
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel foto = new JLabel("");
		String propietario = ".\\\\imagenes\\\\" + this.ventana.miEquipo.getNombre() + "PROPIETARIO.jpg";
		foto.setIcon(new ImageIcon(propietario));
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
				try {
					ventana.cambiarAPantalla("Datos Franquicia");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
