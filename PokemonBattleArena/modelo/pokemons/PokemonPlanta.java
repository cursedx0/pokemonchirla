package modelo.pokemons;

import modelo.Pokemon;
import modelo.Tipo;

public class PokemonPlanta extends Pokemon{

	public PokemonPlanta(int posicion) {
		super(posicion,Tipo.PLANTA);
		// TODO Auto-generated constructor stub
	}
	
	protected int bono(Tipo pTipo) {
		int multiplicador = 1;
		if(pTipo.equals(Tipo.FUEGO)) {
			multiplicador = 2;
		}
		return multiplicador;
	}

}
