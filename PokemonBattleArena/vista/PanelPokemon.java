package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.SwingConstants;

import modelo.Pokemon;
import modelo.Tipo;

public class PanelPokemon extends JPanel implements Observer{
	private JTextArea txtrAtaque;
	private JLabel lblImagen;
	private JProgressBar progressBarVida;
	private JProgressBar progressBarEuforia;
	private JPanel panel;
	private String texto;
	private Pokemon pokemon;
	private Random random = new Random();
	ImageIcon imagen;

	/**
	 * Create the panel.
	 */
	public PanelPokemon(Pokemon pPokemon) {
		this.pokemon = pPokemon;
		pokemon.addObserver(this);
		pokemon.actualizarInfo();
		setLayout(new BorderLayout(0, 0));
		add(getTxtrAtaque(), BorderLayout.NORTH);
		add(getLblImagen(), BorderLayout.CENTER);
		add(getPanel(), BorderLayout.SOUTH);
		this.setBackground(Color.WHITE);

	}

	private JTextArea getTxtrAtaque() {
		if (txtrAtaque == null) {
			txtrAtaque = new JTextArea();
			txtrAtaque.setText(texto);
		}
		return txtrAtaque;
	}
	private JLabel getLblImagen() {
		if (lblImagen == null) {
			if(this.pokemon.getTipo() == Tipo.FUEGO) {
				imagen = new ImageIcon(this.getClass().getResource(Imagenes.getImagenes().obtenerFoto("Fuego"+random.nextInt(3))));
			}
			if(this.pokemon.getTipo() == Tipo.AGUA) {
				imagen = new ImageIcon(this.getClass().getResource(Imagenes.getImagenes().obtenerFoto("Agua"+random.nextInt(3))));
			}
			if(this.pokemon.getTipo() == Tipo.PLANTA) {
				imagen = new ImageIcon(this.getClass().getResource(Imagenes.getImagenes().obtenerFoto("Planta"+random.nextInt(3))));
			}
			if(this.pokemon.getTipo() == Tipo.ELECTRICO) {
				imagen = new ImageIcon(this.getClass().getResource(Imagenes.getImagenes().obtenerFoto("Electrico"+random.nextInt(3))));
			}
			lblImagen = new JLabel(imagen);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblImagen;
	}
	private JProgressBar getProgressBarVida() {
		if (progressBarVida == null) {
			progressBarVida = new JProgressBar();
			progressBarVida.setStringPainted(true);
			progressBarVida.setString("VIDA");
			progressBarVida.setForeground(Color.BLACK);
		}
		return progressBarVida;
	}
	private JProgressBar getProgressBarEuforia() {
		if (progressBarEuforia == null) {
			progressBarEuforia = new JProgressBar();
			progressBarEuforia.setStringPainted(true);
			progressBarEuforia.setString("EUFORIA");
			progressBarEuforia.setForeground(Color.RED);
		}
		return progressBarEuforia;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(0, 1, 1, 2));
			panel.add(getProgressBarVida());
			panel.add(getProgressBarEuforia());
		}
		return panel;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Pokemon) {
			String[] array = (String[]) arg;
			this.getTxtrAtaque().setText("Ataque: " +array[0] +"+" +array[5] +"\nDefensa: " +array[1] +"+" +array[6] +"\nVida: " +array[2] +"/" +array[3] +"\nTipo: " +array[4]);
			this.getProgressBarVida().setMaximum(Integer.parseInt(array[3]));
			this.getProgressBarVida().setValue(Integer.parseInt(array[2]));
			this.getProgressBarEuforia().setMaximum(Integer.parseInt(array[8]));
			this.getProgressBarEuforia().setValue(Integer.parseInt(array[7]));
			
			if(Integer.parseInt(array[2]) >= this.pokemon.getVidaMaxima()/2) {
				this.getProgressBarVida().setForeground(Color.GREEN);
			}
			if(Integer.parseInt(array[2]) < this.pokemon.getVidaMaxima()/2 && Integer.parseInt(array[2]) >= this.pokemon.getVidaMaxima()/5) {
				this.getProgressBarVida().setForeground(Color.ORANGE);
			}
			if(Integer.parseInt(array[2]) < this.pokemon.getVidaMaxima()/5) {
				this.getProgressBarVida().setForeground(Color.RED);
			}
		}
	}
}
