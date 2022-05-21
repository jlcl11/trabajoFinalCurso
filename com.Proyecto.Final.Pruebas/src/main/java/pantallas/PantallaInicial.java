package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PantallaInicial extends JPanel {

	private Ventana ventana;

	public PantallaInicial(final Ventana ventana) {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelTitulo = new JLabel("Bienvenido!");
		labelTitulo.setBackground(Color.WHITE);
		labelTitulo.setForeground(Color.WHITE);
		labelTitulo.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 2;
		add(labelTitulo, gbc_labelTitulo);

		JButton botonComencemos = new JButton("Comencemos!");
		botonComencemos.setBackground(Color.BLUE);
		botonComencemos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});
		botonComencemos.setForeground(Color.WHITE);
		botonComencemos.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 35));
		GridBagConstraints gbc_botonComencemos = new GridBagConstraints();
		gbc_botonComencemos.fill = GridBagConstraints.BOTH;
		gbc_botonComencemos.gridheight = 3;
		gbc_botonComencemos.insets = new Insets(0, 0, 5, 5);
		gbc_botonComencemos.gridx = 2;
		gbc_botonComencemos.gridy = 4;
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
		gbc_botonSalir.gridy = 8;
		add(botonSalir, gbc_botonSalir);

		JLabel foto = new JLabel("New label");
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		foto.setIcon(new ImageIcon(".\\imagenes\\background.png"));
		GridBagConstraints gbc_foto = new GridBagConstraints();
		gbc_foto.gridheight = 12;
		gbc_foto.gridwidth = 5;
		gbc_foto.gridx = 0;
		gbc_foto.gridy = 0;
		add(foto, gbc_foto);

	}

}
