package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 * Clase hereda de JPanel, y se muestra como primera pantalla al iniciar el
 * programa
 * 
 * @author jcorr
 *
 */
public class PantallaInicial extends JPanel {
	/**
	 * Constructor de PantallaInicial,que inicializa la distribución de la
	 * información que sale por pantalla,así como su Layout.Consiste en una imagen
	 * de fondo,un botón que pone música,un botón que lleva al menú principal y otro
	 * que cierra el programa
	 * 
	 * @param ventana ventana en la que se muestra la pantalla
	 */
	public PantallaInicial(final Ventana ventana) {
		super();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JButton musiquitaMP3 = new JButton("\uD83D\uDD0A");
		musiquitaMP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem
							.getAudioInputStream(new File("./rumble.wav").getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (IOException ex) {
					ex.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		musiquitaMP3.setBackground(Color.BLUE);
		musiquitaMP3.setForeground(Color.WHITE);
		GridBagConstraints gbc_musiquitaMP3 = new GridBagConstraints();
		gbc_musiquitaMP3.insets = new Insets(0, 0, 5, 5);
		gbc_musiquitaMP3.gridx = 1;
		gbc_musiquitaMP3.gridy = 2;
		add(musiquitaMP3, gbc_musiquitaMP3);

		JLabel labelTitulo = new JLabel("Bienvenido!");
		labelTitulo.setBackground(Color.WHITE);
		labelTitulo.setForeground(Color.WHITE);
		labelTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 4;
		add(labelTitulo, gbc_labelTitulo);

		JButton botonComencemos = new JButton("Comencemos!");
		botonComencemos.setBackground(Color.BLUE);
		botonComencemos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cambiarAPantalla("primerMenu");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonComencemos.setForeground(Color.WHITE);
		botonComencemos.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 35));
		GridBagConstraints gbc_botonComencemos = new GridBagConstraints();
		gbc_botonComencemos.fill = GridBagConstraints.BOTH;
		gbc_botonComencemos.gridheight = 3;
		gbc_botonComencemos.insets = new Insets(0, 0, 5, 5);
		gbc_botonComencemos.gridx = 2;
		gbc_botonComencemos.gridy = 6;
		add(botonComencemos, gbc_botonComencemos);

		JButton botonSalir = new JButton("Cerrar el programa");
		botonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(ABORT);
			}
		});
		botonSalir.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonSalir.setForeground(Color.WHITE);
		botonSalir.setBackground(Color.RED);
		GridBagConstraints gbc_botonSalir = new GridBagConstraints();
		gbc_botonSalir.gridheight = 3;
		gbc_botonSalir.insets = new Insets(0, 0, 5, 5);
		gbc_botonSalir.gridx = 2;
		gbc_botonSalir.gridy = 10;
		add(botonSalir, gbc_botonSalir);

		JLabel foto = new JLabel("New label");
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		foto.setIcon(new ImageIcon(".\\imagenes\\background.png"));
		GridBagConstraints gbc_foto = new GridBagConstraints();
		gbc_foto.gridheight = 14;
		gbc_foto.gridwidth = 5;
		gbc_foto.gridx = 0;
		gbc_foto.gridy = 0;
		add(foto, gbc_foto);

	}

}
