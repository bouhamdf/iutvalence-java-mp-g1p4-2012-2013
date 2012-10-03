package fr.iutvalence.java.projets.snake;
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Partie {
	
	// attributs
	
	private Plateau TERRAIN;
	
	private Serpent CRAZY_SNAKE;
	
	private Grenouille CRAZY_FROGE;
	
	// constructeur
	
	public Partie (){
	this.TERRAIN = new Plateau();
	this.CRAZY_SNAKE = new Serpent();
	this.CRAZY_FROGE = new Grenouille();
	
	}
	
	
	//methodes
	public int demarrer()
	{
		// ...
		
		return 0;
	}

}
