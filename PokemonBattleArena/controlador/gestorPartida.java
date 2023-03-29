package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Jugador;
import modelo.ListaPokemons;
import modelo.Pokemon;

public class gestorPartida implements ActionListener{
	private static gestorPartida gestor = null;
	private Jugador jAtacante;
	private Jugador jDefensor;
	private Pokemon pAtacante;
	private Pokemon pDefensor;
	
	public gestorPartida() {
		
	}
	
	public static gestorPartida getGestor() {
		if(gestor == null) {
			gestor = new gestorPartida();
		}
		return gestor;
	}
	
	public void setJugadorAtacante(Jugador pJugador) {
		this.jAtacante = pJugador;
	}
	
	public void setJugadorDefensor(Jugador pJugador) {
		this.jDefensor = pJugador;
	}
	
	public void setPokemonAtacante(Pokemon pPokemon) {
		this.pAtacante = pPokemon;
	}
	
	public void setPokemonDefensor(Pokemon pPokemon) {
		this.pDefensor = pPokemon;
	}

	public void atacar(){
		if(this.jAtacante != null && this.jDefensor != null && this.pAtacante != null && this.pDefensor != null) {
			this.pDefensor.recibirAtaque(this.pAtacante.getAtaque(), this.pAtacante.getTipo());
			if((this.jDefensor.getListaPokemons()).todosDerrotados()) {
				this.jDefensor.setDerrotado(true);
			}
			this.pAtacante.quitarEuforia();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
