package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaPokemons {
	private List<Pokemon> lista = new ArrayList<>();

	public ListaPokemons() {

	}

	public void anadirPokemon(Pokemon pPokemon) {
		this.lista.add(pPokemon);
	}

	public void eliminarPokemon(Pokemon pPokemon) {
		this.lista.remove(pPokemon);
	}

	public Pokemon getPosicionPokemon(int pPos) {
		return (Pokemon) this.lista.get(pPos);
	}
	public int getTamaño() {
		return this.lista.size();
	}
	
	public boolean todosDerrotados() {
		return this.lista.stream().allMatch((p) -> {
			return p.getDerrotado();
		});
	}

	/*private List<Pokemon> filtro(Predicate<Pokemon> p) {
		return lista.stream().filter(p).toList();
	}

	public List<Pokemon> filtrarPorTipo(Tipo pTipo) {
		return filtro(p -> p.tipo.equals(pTipo));
	}

	public Map<Tipo, List<Pokemon>> agruparPorTipo() {
		return lista.stream().collect(Collectors.groupingBy(Pokemon::getTipo));
	}

	public Map<Tipo, Double> agruparPorTipoNombre() {
		return lista.stream()
				.collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.averagingInt(Pokemon::getVida)));
	}*/
}
