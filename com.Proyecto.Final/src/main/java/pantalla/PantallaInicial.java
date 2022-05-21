package pantalla;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;

public class PantallaInicial extends JPanel {

	private VentanaInicial ventana;
	private JTextField textoComencemos;

	public PantallaInicial(VentanaInicial v) {
		setForeground(SystemColor.activeCaption);
		this.ventana = v;
		setLayout(null);
	
		textoComencemos = new JTextField();
		textoComencemos.setFont(new Font("Impact", Font.BOLD, 31));
		textoComencemos.setText("COMENCEMOS!");
		textoComencemos.setBackground(Color.WHITE);
		textoComencemos.setBounds(256, 395, 198, 61);
		add(textoComencemos);
		textoComencemos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./imagenes/fotoFondoPrimeraPantalla.png"));
		lblNewLabel.setBounds(0, 11, 706, 479);
		add(lblNewLabel);
		
	}
}
