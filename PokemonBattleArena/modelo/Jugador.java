package modelo;

import java.util.Random;
import static java.util.stream.IntStream.range;
public class Jugador {
	private static int num = 0;
	private String nombre;
	private Random random = new Random();
	private ListaPokemons listaPokemons = new ListaPokemons();
	
	public Jugador(int numPokemons) {
		num++;
		this.nombre = "Jugador"+num;
		
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

}
