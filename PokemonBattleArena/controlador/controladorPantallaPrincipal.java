package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.util.Random;

import modelo.Juego;
import modelo.Jugador;
import modelo.ListaJugadores;
import vista.PantallaJugador;
import vista.PantallaPrincipal;

public class controladorPantallaPrincipal implements ActionListener{
	
	private Random random = new Random();
	

	@Override
	public void actionPerformed(ActionEvent e) {

			int posJugador = 0;
			int numBot = 0;
			Juego.getJuego().iniciarPartida(Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumJugadores()), Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumBots()), Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getMiliSeg()), PantallaPrincipal.getPantallaPrincipal().getNumPokemons());
			for(int i = 0; i<Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumJugadores());i++) {
				PantallaJugador pb = new PantallaJugador(PantallaPrincipal.getPantallaPrincipal().getNumPokemons(), "Jugador"+(i+1), ListaJugadores.getListaJugadores().getJugadorPos(posJugador));
				ListaJugadores.getListaJugadores().getJugadorPos(posJugador).setNombre("Jugador"+(posJugador+1));
				pb.setVisible(true);
				posJugador++;
			}
			for(int j = 0;j<Integer.parseInt(PantallaPrincipal.getPantallaPrincipal().getNumBots());j++) {
				PantallaJugador pb1 = new PantallaJugador(PantallaPrincipal.getPantallaPrincipal().getNumPokemons(), "Bot"+(j+1), ListaJugadores.getListaJugadores().getJugadorPos(posJugador));
				ListaJugadores.getListaJugadores().getJugadorPos(posJugador).setNombre("Bot"+(numBot+1));
				pb1.setVisible(true);
				numBot++;
				posJugador++;
			}	
			
			int i = random.nextInt(ListaJugadores.getListaJugadores().tamañoLista());
			ListaJugadores.getListaJugadores().getJugadorPos(i).setTurno(true);		
			System.out.println("Es el turno del jugador: "+ListaJugadores.getListaJugadores().getJugadorPos(i).getNombre());
			for(int x = 0; x<ListaJugadores.getListaJugadores().tamañoLista(); x++) {
				
			}
			
	}
=======

import modelo.Juego;
import modelo.ListaJugadores;
import vista.PantallaJugador;
import vista.PantallaPrincipal;

public class controladorPantallaPrincipal implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

	
		
		}
>>>>>>> branch 'master' of https://github.com/cursedx0/pokemonchirla.git
	}


