package modelo;

import java.util.Observable;
import java.util.Timer;

public class Juego{
	private static Juego juego = null;
	private Timer timer;
	private int miliSeg;
	
	public Juego() {
		
	}
	
	public static Juego getJuego() {
		if(juego == null) {
			juego = new Juego();
		}
		return juego;
	}
	
	public void iniciarPartida(int numJugadores, int numBots, int miliSeg, int numPokemons) {

		
		for(int i = 0;i<numJugadores; i++) {
			Jugador jugador = new Jugador(numPokemons);
			ListaJugadores.getListaJugadores().anadirJugador(jugador);
		}
		for(int j = 0;j<numBots; j++) {
			Bot bot = new Bot(numPokemons);
			ListaJugadores.getListaJugadores().anadirJugador(bot);
		}
	}
}
