package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controladorPantallaPrincipal;
import modelo.Juego;
import modelo.Jugador;
import modelo.ListaJugadores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;

public class PantallaPrincipal extends JFrame{

	private static PantallaPrincipal pantallaPrincipal = null;
	private JPanel contentPane;
	private JPanel panelImagen;
	private JPanel panelDatos;
	private JPanel panelJugadores;
	private JPanel panelBots;
	private JPanel panelTiempo;
	private JPanel panelNumPokemons;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panelReadMe;
	private JPanel panelFree4All;
	private JLabel lblJugadores;
	private JTextField textFieldJugadores;
	private JLabel lblBots;
	private JLabel lblTiempo;
	private JLabel lblNumPokemons;
	private JLabel lblNewLabel_3;
	private JButton btnReadMe;
	private JLabel lblNewLabel_4;
	private JButton btnFree4All;
	private JTextField textFieldBots;
	private JTextField textFieldTiempo;
	private JTextField textFieldNumPokemons;
	private JLabel lblImagen;
	private controladorPantallaPrincipal controlador = new controladorPantallaPrincipal();

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 314);
		this.setTitle("Pokemon-BattleArena");
		this.setBackground(Color.WHITE);
		this.setForeground(Color.DARK_GRAY);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelImagen(), BorderLayout.CENTER);
		contentPane.add(getPanelDatos(), BorderLayout.EAST);
		this.setVisible(true);
	}
	
	public static PantallaPrincipal getPantallaPrincipal() {
		if(pantallaPrincipal == null) {
			pantallaPrincipal = new PantallaPrincipal();
		}
		return pantallaPrincipal;
	}

	private JPanel getPanelImagen() {
		if (panelImagen == null) {
			panelImagen = new JPanel();
			panelImagen.add(getLblImagen());
		}
		return panelImagen;
	}
	private JPanel getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanel();
			panelDatos.setLayout(new GridLayout(0, 1, 0, 0));
			panelDatos.add(getPanelJugadores());
			panelDatos.add(getPanelBots());
			panelDatos.add(getPanelTiempo());
			panelDatos.add(getPanelNumPokemons());
			panelDatos.add(getPanel_4());
			panelDatos.add(getPanel_5());
			panelDatos.add(getPanelReadMe());
			panelDatos.add(getPanelFree4All());
		}
		return panelDatos;
	}
	private JPanel getPanelJugadores() {
		if (panelJugadores == null) {
			panelJugadores = new JPanel();
			panelJugadores.setLayout(new GridLayout(0, 2, 0, 0));
			panelJugadores.add(getLblJugadores());
			panelJugadores.add(getTextFieldJugadores());
		}
		return panelJugadores;
	}
	private JPanel getPanelBots() {
		if (panelBots == null) {
			panelBots = new JPanel();
			panelBots.setLayout(new GridLayout(1, 0, 0, 0));
			panelBots.add(getLblBots());
			panelBots.add(getTextFieldBots());
		}
		return panelBots;
	}
	private JPanel getPanelTiempo() {
		if (panelTiempo == null) {
			panelTiempo = new JPanel();
			panelTiempo.setLayout(new GridLayout(1, 0, 0, 0));
			panelTiempo.add(getLblTiempo());
			panelTiempo.add(getTextFieldTiempo());
		}
		return panelTiempo;
	}
	private JPanel getPanelNumPokemons() {
		if (panelNumPokemons == null) {
			panelNumPokemons = new JPanel();
			panelNumPokemons.setLayout(new GridLayout(1, 0, 0, 0));
			panelNumPokemons.add(getLblNumPokemons());
			panelNumPokemons.add(getTextFieldNumPokemons());
		}
		return panelNumPokemons;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		}
		return panel_5;
	}
	private JPanel getPanelReadMe() {
		if (panelReadMe == null) {
			panelReadMe = new JPanel();
			panelReadMe.setLayout(new GridLayout(1, 0, 0, 0));
			panelReadMe.add(getLblNewLabel_3());
			panelReadMe.add(getBtnReadMe());
		}
		return panelReadMe;
	}
	private JPanel getPanelFree4All() {
		if (panelFree4All == null) {
			panelFree4All = new JPanel();
			panelFree4All.setLayout(new GridLayout(1, 0, 0, 0));
			panelFree4All.add(getLblNewLabel_4());
			panelFree4All.add(getBtnFree4All());
		}
		return panelFree4All;
	}
	private JLabel getLblJugadores() {
		if (lblJugadores == null) {
			lblJugadores = new JLabel("Jugadores");
			lblJugadores.setBackground(Color.WHITE);
			lblJugadores.setForeground(Color.BLACK);
		}
		return lblJugadores;
	}
	private JTextField getTextFieldJugadores() {
		if (textFieldJugadores == null) {
			textFieldJugadores = new JTextField();
			textFieldJugadores.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldJugadores.setColumns(10);
			textFieldJugadores.setBackground(Color.GRAY);
			textFieldJugadores.setForeground(Color.GREEN);
		}
		return textFieldJugadores;
	}
	private JLabel getLblBots() {
		if (lblBots == null) {
			lblBots = new JLabel("Bots");
			lblBots.setBackground(Color.WHITE);
			lblBots.setForeground(Color.BLACK);
		}
		return lblBots;
	}
	private JLabel getLblTiempo() {
		if (lblTiempo == null) {
			lblTiempo = new JLabel("Tiempo");
			lblTiempo.setBackground(Color.WHITE);
			lblTiempo.setForeground(Color.BLACK);
		}
		return lblTiempo;
	}
	private JLabel getLblNumPokemons() {
		if (lblNumPokemons == null) {
			lblNumPokemons = new JLabel("NumPokemons");
			lblNumPokemons.setBackground(Color.WHITE);
			lblNumPokemons.setForeground(Color.BLACK);
		}
		return lblNumPokemons;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
		}
		return lblNewLabel_3;
	}
	private JButton getBtnReadMe() {
		if (btnReadMe == null) {
			btnReadMe = new JButton("ReadMe");
			btnReadMe.setBackground(Color.DARK_GRAY);
			btnReadMe.setForeground(Color.ORANGE);
		}
		return btnReadMe;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
		}
		return lblNewLabel_4;
	}
	private JButton getBtnFree4All() {
		if (btnFree4All == null) {
			btnFree4All = new JButton("Free4All");
			btnFree4All.setBackground(Color.DARK_GRAY);
			btnFree4All.setForeground(Color.GREEN);
			btnFree4All.addActionListener(controlador);

		}
		return btnFree4All;
	}
	private JTextField getTextFieldBots() {
		if (textFieldBots == null) {
			textFieldBots = new JTextField();
			textFieldBots.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldBots.setColumns(10);
			textFieldBots.setBackground(Color.GRAY);
			textFieldBots.setForeground(Color.GREEN);
		}
		return textFieldBots;
	}
	private JTextField getTextFieldTiempo() {
		if (textFieldTiempo == null) {
			textFieldTiempo = new JTextField();
			textFieldTiempo.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTiempo.setColumns(10);
			textFieldTiempo.setBackground(Color.GRAY);
			textFieldTiempo.setForeground(Color.GREEN);
		}
		return textFieldTiempo;
	}
	private JTextField getTextFieldNumPokemons() {
		if (textFieldNumPokemons == null) {
			textFieldNumPokemons = new JTextField();
			textFieldNumPokemons.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldNumPokemons.setColumns(10);
			textFieldNumPokemons.setBackground(Color.GRAY);
			textFieldNumPokemons.setForeground(Color.GREEN);
		}
		return textFieldNumPokemons;
	}
	private JLabel getLblImagen() {
		if (lblImagen == null) {
			ImageIcon imagen = new ImageIcon(this.getClass().getResource("/imagenes/main.png"));
			lblImagen = new JLabel(imagen);
		}
		return lblImagen;
	}
	
	public String getNumJugadores() {
		return this.textFieldJugadores.getText();
	}
	
	public String getNumBots() {
		return this.textFieldBots.getText();
	}
	
	public String getMiliSeg() {
		return this.textFieldTiempo.getText();
	}
	
	public int getNumPokemons() {
		return Integer.parseInt(this.textFieldNumPokemons.getText());
	}
}

