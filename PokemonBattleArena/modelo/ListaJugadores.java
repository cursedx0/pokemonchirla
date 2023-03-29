package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaJugadores {
	private static ListaJugadores listaJugadores = null;
	private List<Jugador> lista;
	
	private ListaJugadores() {
		this.lista = new ArrayList<>();
	}
	
	public static ListaJugadores getListaJugadores() {
		if(listaJugadores == null) {
			listaJugadores = new ListaJugadores();
		}
		return listaJugadores;
	}
	
	public void anadirJugador(Jugador pJugador) {
		this.lista.add(pJugador);
	}
	
	public void eliminarJugador(Jugador pJugador) {
		this.lista.remove(pJugador);
	}
	
	public Jugador getJugadorAleatorio() {
		return null;
	}
	
	public Jugador getJugadorPos(int pPos) {
		return (Jugador) this.lista.get(pPos);
	}
	public int tamañoLista(){
		return this.lista.size();
	}
}
