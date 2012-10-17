package fr.iutvalence.java.projets.snake;
//FIXME compléter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Partie {
	
	// attributs
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	private Plateau TERRAIN;

	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	private Serpent CRAZY_SNAKE;
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	private Grenouille CRAZY_FROG;
	
	// constructeur
	
	// FIXME écrire un commentaire
	public Partie (){
	this.TERRAIN = new Plateau();
	this.CRAZY_SNAKE = new Serpent();
	this.CRAZY_FROG = new Grenouille();
	
	}
	
	// FIXME écrire un commentaire
	//methodes
	public int demarrer()
	{
		// ...
		
		return 0;
	}


}
