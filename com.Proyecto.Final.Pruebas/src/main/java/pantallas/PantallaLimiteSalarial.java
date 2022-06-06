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

public class PantallaLimiteSalarial extends JPanel{
	private Ventana ventana;

	public PantallaLimiteSalarial(final Ventana ventana) {
		super();
		setBackground(Color.BLACK);
		this.ventana = ventana;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("El l�mite salarial de los "+ventana.miEquipo.getNombre());
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
				ventana.cambiarAPantalla("Datos Franquicia");
			}
		});
		
		JLabel foto = new JLabel("es de "+ventana.miEquipo.getLimiteSalarial()+" millones de d�lares");
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
