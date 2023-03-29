package modelo.pokemons;

import modelo.Pokemon;
import modelo.Tipo;

public class PokemonElectrico extends Pokemon{

	public PokemonElectrico(int posicion) {
		super(posicion,Tipo.ELECTRICO);
		// TODO Auto-generated constructor stub
	}
	
	protected int bono(Tipo pTipo) {
		int multiplicador = 1;
		return multiplicador;
	}

}
