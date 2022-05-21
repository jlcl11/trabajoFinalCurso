package pantallas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pantallaTicket extends JPanel {
	private Ventana ventana;

	public pantallaTicket(final Ventana ventana) {
		super();
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Ticket de Temporada");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("primerMenu");
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(".\\imagenes\\ticket.png"));
		GridBagConstraints gbc_fondo = new GridBagConstraints();
		gbc_fondo.gridheight = 7;
		gbc_fondo.gridwidth = 7;
		gbc_fondo.insets = new Insets(0, 0, 5, 5);
		gbc_fondo.gridx = 0;
		gbc_fondo.gridy = 0;
		add(fondo, gbc_fondo);
	}

}
