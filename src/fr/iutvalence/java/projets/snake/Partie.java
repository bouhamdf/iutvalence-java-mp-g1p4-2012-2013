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
	
	private Grenouille CRAZY_FROG;
	
	// constructeur
	
	public Partie (){
	this.TERRAIN = new Plateau();
	this.CRAZY_SNAKE = new Serpent();
	this.CRAZY_FROG = new Grenouille();
	
	}
	
	
	//methodes
	public int demarrer()
	{
		// ...
		
		return 0;
	}


}
