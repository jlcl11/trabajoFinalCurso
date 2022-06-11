package pantallas;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ticketPorPantalla extends JFrame {
	public ticketPorPantalla() throws IOException {
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
