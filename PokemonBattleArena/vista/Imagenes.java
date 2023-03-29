package vista;

import java.util.HashMap;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Imagenes {
	private static Imagenes imagenes = null;
	private HashMap<String, String> imagenesPokemons= new HashMap<>();
	
	private Imagenes() {
		this.imagenesPokemons.put("Entrenador0", "/imagenes/trainer0.png");
		this.imagenesPokemons.put("Entrenador1", "/imagenes/trainer1.png");
		this.imagenesPokemons.put("Entrenador2", "/imagenes/trainer2.png");
		this.imagenesPokemons.put("Entrenador3", "/imagenes/trainer3.png");
		this.imagenesPokemons.put("Entrenador4", "/imagenes/trainer4.png");
		this.imagenesPokemons.put("Entrenador5", "/imagenes/trainer5.png");
		this.imagenesPokemons.put("Fuego0", "/imagenes/Fire/0charmander.png");
		this.imagenesPokemons.put("Fuego1", "/imagenes/Fire/1charmeleon.png");
		this.imagenesPokemons.put("Fuego2", "/imagenes/Fire/2charizard.png");
		this.imagenesPokemons.put("Electrico0", "/imagenes/Electric/0pikachu.png");
		this.imagenesPokemons.put("Electrico1", "/imagenes/Electric/1raichu.png");
		this.imagenesPokemons.put("Electrico2", "/imagenes/Electric/2raichu2.png");
		this.imagenesPokemons.put("Agua0", "/imagenes/Water/0squirtle.png");
		this.imagenesPokemons.put("Agua1", "/imagenes/Water/1wartortle.png");
		this.imagenesPokemons.put("Agua2", "/imagenes/Water/2blastoise.png");
		this.imagenesPokemons.put("Planta0", "/imagenes/Grass/0bulbasaur.png");
		this.imagenesPokemons.put("Planta1", "/imagenes/Grass/1ivysaur.png");
		this.imagenesPokemons.put("Planta2", "/imagenes/Grass/2venusaur.png");
	}
	
	public static Imagenes getImagenes() {
		if(imagenes == null) {
			imagenes = new Imagenes();
		}
		return imagenes;
	}
	
	public String obtenerFoto(String pClave) {
		return this.imagenesPokemons.get(pClave);
	}
}
