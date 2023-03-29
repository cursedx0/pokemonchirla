package modelo;

import modelo.pokemons.PokemonAgua;
import modelo.pokemons.PokemonElectrico;
import modelo.pokemons.PokemonFuego;
import modelo.pokemons.PokemonPlanta;

public class CrearPokemons {
	private static CrearPokemons crearPokemons = null;
	//patron factory
	private CrearPokemons() {
		
	}
	
	public static CrearPokemons getCrearPokemons() {
		if(crearPokemons == null) {
			crearPokemons = new CrearPokemons();
		}
		return crearPokemons;
	}
	
	public Pokemon crear(int pPos, Tipo pTipo) {
		Pokemon pokemon = null;
		if(pTipo == Tipo.FUEGO) {
			pokemon = new PokemonFuego(pPos);
		}
		if(pTipo == Tipo.AGUA) {
			pokemon = new PokemonAgua(pPos);
		}
		if(pTipo == Tipo.PLANTA) {
			pokemon = new PokemonPlanta(pPos);
		}
		if(pTipo == Tipo.ELECTRICO) {
			pokemon = new PokemonElectrico(pPos);
		}
		return (Pokemon) pokemon;
	}
}
