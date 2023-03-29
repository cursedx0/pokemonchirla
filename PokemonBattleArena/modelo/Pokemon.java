package modelo;

import java.util.Observable;
import java.util.Random;

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
	}
}
