package modelo.pokemons;

import modelo.Pokemon;
import modelo.Tipo;

public class PokemonFuego extends Pokemon{

	public PokemonFuego(int posicion) {
		super(posicion,Tipo.FUEGO);
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
	
	protected int bono(Tipo pTipo) {
		int multiplicador = 1;
		if(pTipo.equals(Tipo.AGUA)) {
			multiplicador = 2;
		}
		return multiplicador;
	}
=======
>>>>>>> branch 'master' of https://github.com/cursedx0/pokemonchirla.git

}
