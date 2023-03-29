package modelo.pokemons;

import modelo.Pokemon;
import modelo.Tipo;

public class PokemonAgua extends Pokemon{
	
	public PokemonAgua(int posicion) {
		super(posicion, Tipo.AGUA);
	}
	
	protected int bono(Tipo pTipo) {
		int multiplicador = 1;
		if(pTipo.equals(Tipo.ELECTRICO)) {
			multiplicador = 2;
		}
		return multiplicador;
	}

}
