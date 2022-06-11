package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import clases.Jugador;
import clases.PartidoAllStar;
import elementosVisuales.ElementoListaJugador;

/**
 * Clase hereda de JPanel, y que enseña los jugadores que han entrado en el
 * equipo del AllStar del Oeste
 * 
 * @author jcorr
 *
 */
public class PantallaAllStarOeste extends JPanel {

	/**
	 * Constructor de PantallaAllStarEste,que inicializa la distribución de la
	 * información que sale por pantalla,así como su Layout.Consiste en una lista
	 * dentro de un JScroll para que inserte 10 elementos de jugador ordenados por
	 * estadísticas *
	 * 
	 * @param ventana ventana en la que se muestra la pantalla
	 */
	public PantallaAllStarOeste(final Ventana ventana) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel titulo = new JLabel("AllStar Oeste");
		titulo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.gridwidth = 4;
		gbc_titulo.insets = new Insets(0, 0, 5, 0);
		gbc_titulo.gridx = 0;
		gbc_titulo.gridy = 0;
		add(titulo, gbc_titulo);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		JPanel listaTitulares = new JPanel();
		scrollPane.setViewportView(listaTitulares);
		listaTitulares.setLayout(new BoxLayout(listaTitulares, BoxLayout.Y_AXIS));

		ArrayList<Jugador> todos = PartidoAllStar.getJugadoresEquipo2();
		for (int i = 0; i < todos.size(); i++) {
			listaTitulares.add(new ElementoListaJugador(ventana, todos.get(i)));
		}

		JButton volver = new JButton("Volver");
		volver.setHorizontalAlignment(SwingConstants.LEFT);
		volver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("Menu AllStar");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		volver.setForeground(Color.WHITE);
		volver.setBackground(Color.RED);
		GridBagConstraints gbc_volver = new GridBagConstraints();
		gbc_volver.anchor = GridBagConstraints.WEST;
		gbc_volver.insets = new Insets(0, 0, 0, 5);
		gbc_volver.gridx = 0;
		gbc_volver.gridy = 2;
		add(volver, gbc_volver);

	}

}
