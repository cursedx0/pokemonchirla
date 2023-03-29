package modelo;

import java.util.Random;

import vista.PantallaJugador;

import static java.util.stream.IntStream.range;

import java.util.Observable;
public class Jugador extends Observable{
	private static int num = 0;
	private String nombre;
	private Random random = new Random();
	private ListaPokemons listaPokemons = new ListaPokemons();
	private boolean derrotado = false;
	public boolean turno;
	
	public Jugador(int numPokemons) {
		num++;
		
		range(0, numPokemons).forEach(i ->{
			Pokemon pokemon = CrearPokemons.getCrearPokemons().crear(i, Tipo.values()[this.random.nextInt(Tipo.values().length)]);
			this.listaPokemons.anadirPokemon(pokemon);
		});
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public ListaPokemons getListaPokemons() {
		return this.listaPokemons;
	}
	
	public void setDerrotado(boolean pDerrotado) {
		this.derrotado = pDerrotado;
	}
	
	public boolean getTurno() {
		
		return this.turno;
	}
	
	public void setTurno(boolean pTurno) {
		this.turno = pTurno;
		actualizarInfo();
		
	}
	
	public void setNombre(String pString) {
		this.nombre = pString;
	}

	public void actualizarInfo() {
		this.setChanged();
		this.notifyObservers(new boolean[] {this.getTurno()});
	}
}
