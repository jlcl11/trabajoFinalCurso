package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 * Clase hereda de JPanel y presenta las opciones de datos de franquicia que
 * puedes ver
 * 
 * @author jcorr
 *
 */
public class PantallaDatosFranquicia extends JPanel {
	/**
	 * Constructor de PantallaDatosFranquicia,que inicializa la distribuci?n de la
	 * informaci?n que sale por pantalla,as? como su Layout.Consiste en 6 botones
	 * que te env?an a diferentes pantallas que muestran diferentes datos sobre la
	 * franquicia seleccionada,por lo tanto esta pantalla funciona a modo de men?
	 * 
	 * @param ventana ventana en la que se muestra la pantalla
	 */
	public PantallaDatosFranquicia(final Ventana ventana) {
		super();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel escogerDatoFranquicia = new JLabel("Qu\u00E9 quieres saber sobre tu franquicia?");
		escogerDatoFranquicia.setForeground(Color.WHITE);
		escogerDatoFranquicia.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_escogerDatoFranquicia = new GridBagConstraints();
		gbc_escogerDatoFranquicia.gridwidth = 5;
		gbc_escogerDatoFranquicia.insets = new Insets(0, 0, 5, 5);
		gbc_escogerDatoFranquicia.gridx = 4;
		gbc_escogerDatoFranquicia.gridy = 1;
		add(escogerDatoFranquicia, gbc_escogerDatoFranquicia);

		JButton botonDatosEstadio = new JButton("Ver el estadio");
		botonDatosEstadio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Estadio");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonDatosEstadio.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonDatosEstadio.setForeground(Color.WHITE);
		botonDatosEstadio.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonDatosEstadio = new GridBagConstraints();
		gbc_botonDatosEstadio.gridheight = 2;
		gbc_botonDatosEstadio.fill = GridBagConstraints.BOTH;
		gbc_botonDatosEstadio.insets = new Insets(0, 0, 5, 5);
		gbc_botonDatosEstadio.gridx = 4;
		gbc_botonDatosEstadio.gridy = 3;
		add(botonDatosEstadio, gbc_botonDatosEstadio);

		JButton botonVerPropietario = new JButton("Ver el propietario del equipo");
		botonVerPropietario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Propietario");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonVerPropietario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonVerPropietario.setForeground(Color.WHITE);
		botonVerPropietario.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonVerPropietario = new GridBagConstraints();
		gbc_botonVerPropietario.gridheight = 2;
		gbc_botonVerPropietario.fill = GridBagConstraints.BOTH;
		gbc_botonVerPropietario.insets = new Insets(0, 0, 5, 5);
		gbc_botonVerPropietario.gridx = 8;
		gbc_botonVerPropietario.gridy = 3;
		add(botonVerPropietario, gbc_botonVerPropietario);

		JButton botonVerGM = new JButton("Ver el General Manager del equipo");
		botonVerGM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("GM");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonVerGM.setForeground(Color.WHITE);
		botonVerGM.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonVerGM.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonVerGM = new GridBagConstraints();
		gbc_botonVerGM.gridheight = 2;
		gbc_botonVerGM.fill = GridBagConstraints.BOTH;
		gbc_botonVerGM.insets = new Insets(0, 0, 5, 5);
		gbc_botonVerGM.gridx = 4;
		gbc_botonVerGM.gridy = 6;
		add(botonVerGM, gbc_botonVerGM);

		JButton botonLimiteSalarial = new JButton("Ver el l?mite salarial del equipo");
		botonLimiteSalarial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Limite");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonLimiteSalarial.setForeground(Color.WHITE);
		botonLimiteSalarial.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonLimiteSalarial.setBackground(Color.BLUE);
		GridBagConstraints gbc_botonLimiteSalarial = new GridBagConstraints();
		gbc_botonLimiteSalarial.gridheight = 2;
		gbc_botonLimiteSalarial.fill = GridBagConstraints.BOTH;
		gbc_botonLimiteSalarial.insets = new Insets(0, 0, 5, 5);
		gbc_botonLimiteSalarial.gridx = 8;
		gbc_botonLimiteSalarial.gridy = 6;
		add(botonLimiteSalarial, gbc_botonLimiteSalarial);

		JButton btnNewButton_2 = new JButton("Ver los dorsales retirados del equipo");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Dorsales Retirados");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLUE);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridheight = 2;
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 4;
		gbc_btnNewButton_2.gridy = 9;
		add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_5 = new JButton("Ver la plantilla");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Plantilla");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_5.setBackground(Color.BLUE);
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.gridheight = 2;
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 8;
		gbc_btnNewButton_5.gridy = 9;
		add(btnNewButton_5, gbc_btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Volver");

		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Escoger Equipos");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBackground(Color.RED);
		btnNewButton_6.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton_6.gridheight = 2;
		gbc_btnNewButton_6.gridwidth = 2;
		gbc_btnNewButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 1;
		gbc_btnNewButton_6.gridy = 12;
		add(btnNewButton_6, gbc_btnNewButton_6);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(".\\imagenes\\fondoDatosFranquicia.png"));
		GridBagConstraints gbc_fondo = new GridBagConstraints();
		gbc_fondo.gridheight = 15;
		gbc_fondo.gridwidth = 12;
		gbc_fondo.insets = new Insets(0, 0, 5, 5);
		gbc_fondo.gridx = 0;
		gbc_fondo.gridy = 0;
		add(fondo, gbc_fondo);

	}

}
