package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PantallaPlayOffs extends JPanel {
	private Ventana ventana;

	public PantallaPlayOffs(final Ventana ventana) {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\NBA-Playoffs-Bracket.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 7;
		gbc_lblNewLabel.gridwidth = 9;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		
		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});
		
		JLabel tituloPlayoff = new JLabel("Bienvenido a los Playoff de 2022");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_tituloPlayoff = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		botonVolver.setForeground(Color.WHITE);
		botonVolver.setBackground(Color.RED);
		
		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 1;
		gbc_botonVolver.gridy = 5;
		add(botonVolver, gbc_botonVolver);
	}

}
