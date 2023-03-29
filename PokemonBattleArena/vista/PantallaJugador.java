package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Jugador;
import modelo.ListaPokemons;
import modelo.Pokemon;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaJugador extends JFrame implements Observer{
	private JPanel contentPane;
	private JPanel panelBotonFoto;
	private JPanel panelPokemons;
	private JButton btnGo;
	private JLabel lblImagen;
	private Random random = new Random();
	private int numPokemons;
	private Jugador jugador;

	/**
	 * Create the frame.
	 */
	public PantallaJugador(int pNumPokemons, String pNombre, Jugador pJugador) {
		this.numPokemons = pNumPokemons;
		this.jugador = pJugador;
		jugador.addObserver(this);
		//this.controler = new Controler(pJugador);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelBotonFoto(), BorderLayout.WEST);
		contentPane.add(getPanelPokemons(), BorderLayout.CENTER);
		//this.jugador.addObserver(this);
		this.setTitle(pNombre);
		this.setBackground(Color.WHITE);
		this.setVisible(true);
	}

	private JPanel getPanelBotonFoto() {
		if (panelBotonFoto == null) {
			panelBotonFoto = new JPanel();
			panelBotonFoto.setLayout(new BorderLayout(0, 0));
			panelBotonFoto.add(getBtnGo(), BorderLayout.NORTH);
			panelBotonFoto.add(getLblImagen(), BorderLayout.CENTER);
		}
		return panelBotonFoto;
	}
	private JPanel getPanelPokemons() {
		if (panelPokemons == null) {
			panelPokemons = new JPanel();
			panelPokemons.setLayout(new GridLayout(0,this.numPokemons, 1, 1));
			for(int i = 0; i<numPokemons;i++) {
				panelPokemons.add(new PanelPokemon(this.jugador.getListaPokemons().getPosicionPokemon(i)));
			}
		}
		return panelPokemons;
	}
	private JButton getBtnGo() {
		if (btnGo == null) {
			btnGo = new JButton("GO!");
			btnGo.setBackground(Color.GREEN);
			btnGo.setForeground(Color.BLACK);
			//btnGo.addActionListener(controler);
		}
		return btnGo;
	}
	private JLabel getLblImagen() {
		if (lblImagen == null) {
			ImageIcon imagen = new ImageIcon(this.getClass().getResource(Imagenes.getImagenes().obtenerFoto("Entrenador"+this.random.nextInt(6))));
			lblImagen = new JLabel(imagen);
		}
		return lblImagen;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Jugador) {
			boolean[] array = (boolean[]) arg;
			System.out.println(array[0]);
			if(this.jugador.getTurno() == array[0]) {
				this.getBtnGo().setText("GO!");
				this.getBtnGo().setForeground(Color.BLACK);
				this.getBtnGo().setBackground(Color.GREEN);
			}
			else {
				this.getBtnGo().setText("WAIT!");
				this.getBtnGo().setForeground(Color.BLACK);
				this.getBtnGo().setBackground(Color.RED);
			}
		}
	}
}
