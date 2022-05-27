package elementosVisuales;

import javax.swing.JPanel;

import pantallas.Ventana;
import superClases.Jugador;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ElementoListaJugador extends JPanel {
	private Ventana ventana;
	private Jugador jugador;
	public ElementoListaJugador(Ventana ventana, Jugador jugador) {
		super();
		setBorder(new LineBorder(Color.WHITE, 3, true));
		this.ventana = ventana;
		this.jugador = jugador;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel nombreJugador = new JLabel(this.jugador.getNombre());
		nombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_nombreJugador = new GridBagConstraints();
		gbc_nombreJugador.gridwidth = 2;
		gbc_nombreJugador.insets = new Insets(0, 0, 5, 5);
		gbc_nombreJugador.gridx = 0;
		gbc_nombreJugador.gridy = 1;
		add(nombreJugador, gbc_nombreJugador);
		
		JLabel labelApellido = new JLabel(this.jugador.getApellido());
		labelApellido.setHorizontalAlignment(SwingConstants.LEFT);
		labelApellido.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 40));
		GridBagConstraints gbc_labelApellido = new GridBagConstraints();
		gbc_labelApellido.gridwidth = 2;
		gbc_labelApellido.insets = new Insets(0, 0, 5, 5);
		gbc_labelApellido.gridx = 2;
		gbc_labelApellido.gridy = 1;
		add(labelApellido, gbc_labelApellido);
		
		JLabel labelPuntos = new JLabel(this.jugador.getPPG() +" PPG");
		labelPuntos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_botonPuntos = new GridBagConstraints();
		gbc_botonPuntos.insets = new Insets(0, 0, 0, 5);
		gbc_botonPuntos.gridx = 0;
		gbc_botonPuntos.gridy = 2;
		add(labelPuntos, gbc_botonPuntos);
		
		JLabel labelAsistencias = new JLabel(this.jugador.getAPG()+" APG");
		labelAsistencias.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_labelAsistencias = new GridBagConstraints();
		gbc_labelAsistencias.insets = new Insets(0, 0, 0, 5);
		gbc_labelAsistencias.gridx = 1;
		gbc_labelAsistencias.gridy = 2;
		add(labelAsistencias, gbc_labelAsistencias);
		
		JLabel labelRebotes = new JLabel(this.jugador.getRBG()+" RBG");
		labelRebotes.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_labelRebotes = new GridBagConstraints();
		gbc_labelRebotes.insets = new Insets(0, 0, 0, 5);
		gbc_labelRebotes.gridx = 2;
		gbc_labelRebotes.gridy = 2;
		add(labelRebotes, gbc_labelRebotes);
		
		JLabel labelRobos = new JLabel(this.jugador.getSPG()+" SPG");
		labelRobos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_labelRobos = new GridBagConstraints();
		gbc_labelRobos.insets = new Insets(0, 0, 0, 5);
		gbc_labelRobos.gridx = 3;
		gbc_labelRobos.gridy = 2;
		add(labelRobos, gbc_labelRobos);
		
		JLabel labelTapones = new JLabel(this.jugador.getBPG()+" BPG");
		labelTapones.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_labelTapones = new GridBagConstraints();
		gbc_labelTapones.gridx = 4;
		gbc_labelTapones.gridy = 2;
		add(labelTapones, gbc_labelTapones);
		
		
		
	}
	
	
	

}
