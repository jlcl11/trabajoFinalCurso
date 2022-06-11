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

/**
 * Clase hereda de JPanel, y que enseña el límite salarial de cada equipo
 * 
 * @author jcorr
 *
 */
public class PantallaLimiteSalarial extends JPanel {

	/**
	 * Constructor de PantallaLimiteSalarial,que inicializa la distribución de la
	 * información que sale por pantalla,así como su Layout.Consiste en una pantalla
	 * con 2 label, en uno de ellos muestra el nombre y ciudad Local del equipo y
	 * otro en el que se muestra el límite salarial
	 * 
	 * @param ventana ventana en la que se muestra la pantalla
	 */
	public PantallaLimiteSalarial(final Ventana ventana) {
		super();
		setBackground(Color.BLACK);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("El límite salarial de los " + ventana.miEquipo.getNombre());
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);

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

		JLabel foto = new JLabel("es de " + ventana.miEquipo.getLimiteSalarial() + " millones de dólares");
		foto.setForeground(Color.WHITE);
		foto.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_foto = new GridBagConstraints();
		gbc_foto.insets = new Insets(0, 0, 5, 5);
		gbc_foto.gridx = 2;
		gbc_foto.gridy = 3;
		add(foto, gbc_foto);
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
