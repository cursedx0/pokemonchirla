package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Juego;
import modelo.ListaJugadores;
import vista.PantallaJugador;
import vista.PantallaPrincipal;

public class controladorPantallaPrincipal implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

			int posJugador = 0;
			Juego.getJuego().iniciarPartida(Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumJugadores()), Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumBots()), Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getMiliSeg()), PantallaPrincipal.getPantallaPrincipal().getNumPokemons());
			for(int i = 0; i<Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumJugadores());i++) {
				PantallaJugador pb = new PantallaJugador(PantallaPrincipal.getPantallaPrincipal().getNumPokemons(), "Jugador"+(i+1), ListaJugadores.getListaJugadores().getJugadorPos(posJugador));
				pb.setVisible(true);
				posJugador++;
			}
			for(int j = 0;j<Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumBots());j++) {
				PantallaJugador pb1 = new PantallaJugador(PantallaPrincipal.getPantallaPrincipal().getNumPokemons(), "Bot"+(j+1), ListaJugadores.getListaJugadores().getJugadorPos(posJugador));
				pb1.setVisible(true);
				posJugador++;
			}			
		}
	}


