package modelo;

import java.util.Observable;
import java.util.Random;

<<<<<<< HEAD
import evoluciones.Euforia;
import evoluciones.EvolucionDos;
import evoluciones.EvolucionUno;
import evoluciones.Evoluciones;
import evoluciones.SinEvolucionar;

public abstract class Pokemon extends Observable{
	private int ataque;
	private int defensa;
	private int vida;
	private int vidaMaxima;
	protected Tipo tipo;
	private Random random = new Random();
	private int posicion;
	private int numAtaquesParaEuforia;
	private int ataquesRecibidos = 0;
	private Evoluciones evo = new SinEvolucionar();
	private boolean derrotado = false;
	
	public Pokemon(int posicion,Tipo pTipo) {
		this.posicion = posicion;
		this.ataque = 11 + this.random.nextInt(7)+1;
		this.defensa = 3 + this.random.nextInt(3)+1;
		this.vida = 200 + this.random.nextInt(19)+1;
		this.vidaMaxima = this.vida;
		this.tipo = pTipo;
		this.numAtaquesParaEuforia = random.nextInt(4)+3;
	}
	
	public int bonoAtaque() {
		return this.evo.bonoAtaque();
	}
	public int bonoDefensa() {
		return this.evo.bonoDefensa();
	}
	public int getVida() {
		return this.vida;
	}
	public Tipo getTipo() {
		return this.tipo;
	}
	public int getVidaMaxima() {
		return this.vidaMaxima;
	}
	public int getAtaque() {
		return this.ataque;
	}
	public int getDefensa() {
		return this.defensa;
	}
	public int getAtaquesParaEuforia() {
		return this.numAtaquesParaEuforia;
	}
	public int getAtaquesRecibidos() {
		return this.ataquesRecibidos;
	}		
	
	public boolean getDerrotado() {
		return this.derrotado;
	}
	
	protected abstract int bono(Tipo pTipo);
	
	public void quitarEuforia() {
		if(this.ataquesRecibidos == this.numAtaquesParaEuforia) {
			this.ataquesRecibidos = 0;
			this.evolucionarPokemon();
			this.actualizarInfo();
		}
	}
	
	public void setDerrotado(boolean derrotado) {
		this.derrotado = derrotado;
		this.vida = 0;
	}
	
	public int recibirAtaque(int pAtaquePokemonAtacante, Tipo pTipoPokemonAtacante) {
		int bonoPokemonAtacante = this.bono(pTipoPokemonAtacante);
		int daño = (bonoPokemonAtacante * pAtaquePokemonAtacante) - this.getDefensa();
		
		this.vida = this.getVida()-daño;
		
		if(this.vida <= 0) {
			this.setDerrotado(true);
		}
		
		if(this.getAtaquesRecibidos() < this.getAtaquesParaEuforia()) {
			this.ataquesRecibidos++;
		}
		else {
			this.ataquesRecibidos = this.numAtaquesParaEuforia;
		}
		
		this.evolucionarPokemon();
		this.actualizarInfo();
		return this.getVida();
	}
	
	public void evolucionarPokemon() {
		if(this.getVida() < this.getVidaMaxima()/2 && this.getVida() >= this.getVidaMaxima()/5) {
			this.evo = new EvolucionUno();
		}
		if(this.getVida() < this.getVidaMaxima()/5) {
			this.evo = new EvolucionDos();
		}
		if(this.getAtaquesRecibidos() == this.numAtaquesParaEuforia) {
			this.evo = new Euforia();
		}
	}
	
	public void actualizarInfo() {
		//evolucionarPokemon();
		//reiniciarEuforia();
		//setDerrotado();
		this.setChanged();
		this.notifyObservers(new String[] {Integer.toString(this.getAtaque()), Integer.toString(this.getDefensa()), Integer.toString(this.getVida()), Integer.toString(this.getVidaMaxima()), this.getTipo().toString(), Integer.toString(this.bonoAtaque()), Integer.toString(this.bonoDefensa()), Integer.toString(this.getAtaquesRecibidos()), Integer.toString(this.getAtaquesParaEuforia())});
		//recibirAtaque();
=======
public class Pokemon extends Observable{
	private int ataque;
	private int defensa;
	private int vida;
	private int vidaMaxima;
	protected Tipo tipo;
	private Random random = new Random();
	private int posicion;
	private int numAtaquesParaEuforia;
	private int ataquesRecibidos = 0;
	
	public Pokemon(int posicion,Tipo pTipo) {
		this.posicion = posicion;
		this.ataque = 11 + this.random.nextInt(7)+1;
		this.defensa = 3 + this.random.nextInt(3)+1;
		this.vida = 200 + this.random.nextInt(19)+1;
		this.vidaMaxima = this.vida;
		this.tipo = pTipo;
		this.numAtaquesParaEuforia = random.nextInt(4)+3;
	}
	public int getVida() {
		return this.vida;
	}
	public Tipo getTipo() {
		return this.tipo;
	}
	public int getVidaMaxima() {
		return this.vidaMaxima;
	}
	public int getAtaque() {
		return this.ataque;
	}
	public int getDefensa() {
		return this.defensa;
	}
	
	public void actualizarInfo() {
		this.setChanged();
		this.notifyObservers(new String[] {Integer.toString(this.getAtaque()), Integer.toString(this.getDefensa()), Integer.toString(this.getVida()), Integer.toString(this.getVidaMaxima()), this.getTipo().toString()});
>>>>>>> branch 'master' of https://github.com/cursedx0/pokemonchirla.git
	}
}
