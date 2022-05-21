package pantallas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaInicioPrimerMenu extends JPanel {
	private Ventana ventana;
	
	public PantallaInicioPrimerMenu(Ventana v) {
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel inicioPrimerMenu = new JLabel("\u00BFQu\u00E9 quieres hacer?");
		inicioPrimerMenu.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_inicioPrimerMenu = new GridBagConstraints();
		gbc_inicioPrimerMenu.gridwidth = 5;
		gbc_inicioPrimerMenu.insets = new Insets(0, 0, 5, 5);
		gbc_inicioPrimerMenu.gridx = 2;
		gbc_inicioPrimerMenu.gridy = 2;
		add(inicioPrimerMenu, gbc_inicioPrimerMenu);
		
		JButton botonDatosDeFranquicias = new JButton("Ver datos de franquicias");
		botonDatosDeFranquicias.setBackground(Color.BLUE);
		botonDatosDeFranquicias.setForeground(Color.WHITE);
		botonDatosDeFranquicias.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_botonDatosDeFranquicias = new GridBagConstraints();
		gbc_botonDatosDeFranquicias.gridheight = 3;
		gbc_botonDatosDeFranquicias.fill = GridBagConstraints.BOTH;
		gbc_botonDatosDeFranquicias.insets = new Insets(0, 0, 5, 5);
		gbc_botonDatosDeFranquicias.gridx = 2;
		gbc_botonDatosDeFranquicias.gridy = 7;
		add(botonDatosDeFranquicias, gbc_botonDatosDeFranquicias);
		
		JButton BotonPremiosTemporada = new JButton("Ver los premios de temporada");
		BotonPremiosTemporada.setBackground(Color.BLUE);
		BotonPremiosTemporada.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		BotonPremiosTemporada.setForeground(Color.WHITE);
		GridBagConstraints gbc_BotonPremiosTemporada = new GridBagConstraints();
		gbc_BotonPremiosTemporada.fill = GridBagConstraints.BOTH;
		gbc_BotonPremiosTemporada.gridheight = 3;
		gbc_BotonPremiosTemporada.insets = new Insets(0, 0, 5, 5);
		gbc_BotonPremiosTemporada.gridx = 6;
		gbc_BotonPremiosTemporada.gridy = 7;
		add(BotonPremiosTemporada, gbc_BotonPremiosTemporada);
		
		JButton BotonAllStar = new JButton("Ver el All Star");
		BotonAllStar.setForeground(Color.WHITE);
		BotonAllStar.setBackground(Color.BLUE);
		BotonAllStar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		GridBagConstraints gbc_BotonAllStar = new GridBagConstraints();
		gbc_BotonAllStar.fill = GridBagConstraints.BOTH;
		gbc_BotonAllStar.gridheight = 3;
		gbc_BotonAllStar.insets = new Insets(0, 0, 5, 5);
		gbc_BotonAllStar.gridx = 2;
		gbc_BotonAllStar.gridy = 12;
		add(BotonAllStar, gbc_BotonAllStar);
		
		JButton botonPlayoffs = new JButton("Simular los playoff");
		botonPlayoffs.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		botonPlayoffs.setBackground(Color.BLUE);
		botonPlayoffs.setForeground(Color.WHITE);
		GridBagConstraints gbc_botonPlayoffs = new GridBagConstraints();
		gbc_botonPlayoffs.fill = GridBagConstraints.BOTH;
		gbc_botonPlayoffs.gridheight = 3;
		gbc_botonPlayoffs.insets = new Insets(0, 0, 5, 5);
		gbc_botonPlayoffs.gridx = 6;
		gbc_botonPlayoffs.gridy = 12;
		add(botonPlayoffs, gbc_botonPlayoffs);
		
		JButton botonVolverEmpecemos = new JButton("Volver");
		botonVolverEmpecemos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla("inicial");
			}
		});
		botonVolverEmpecemos.setForeground(Color.WHITE);
		botonVolverEmpecemos.setBackground(Color.RED);
		GridBagConstraints gbc_botonVolverEmpecemos = new GridBagConstraints();
		gbc_botonVolverEmpecemos.fill = GridBagConstraints.BOTH;
		gbc_botonVolverEmpecemos.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolverEmpecemos.gridx = 1;
		gbc_botonVolverEmpecemos.gridy = 16;
		add(botonVolverEmpecemos, gbc_botonVolverEmpecemos);
		
	}

}
