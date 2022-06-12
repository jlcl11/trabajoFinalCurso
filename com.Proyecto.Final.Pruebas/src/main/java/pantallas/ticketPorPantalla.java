package pantallas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ticketPorPantalla extends JFrame {
	public ticketPorPantalla() throws IOException {
		this.setTitle("JuegoIndie2kNBA.exe");
		this.setIconImage(new ImageIcon("./imagenes/logoPrograma.png").getImage());
		this.setAlwaysOnTop(true);

		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("./imagenes/logoPrograma.png").getImage(), new Point(0, 0), "custom cursor"));

		BufferedReader lector = new BufferedReader(new BufferedReader(new FileReader("./ticket.txt")));
		String res = "";
		String linea = "";
		while (linea != null) {
			res += linea + "\n";
			linea = lector.readLine();
		}

		JTextPane txtpnVxvxvxvxv = new JTextPane();
		txtpnVxvxvxvxv.setText(res);
		getContentPane().add(txtpnVxvxvxvxv, BorderLayout.CENTER);
	}

}
