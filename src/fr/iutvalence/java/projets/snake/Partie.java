package fr.iutvalence.java.projets.snake;
//FIXME compl�ter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Partie {
	
	// attributs
	
	// FIXME �crire un commentaire
	// FIXME respecter les conventions d'�criture
	private Plateau TERRAIN;

	// FIXME �crire un commentaire
	// FIXME respecter les conventions d'�criture
	private Serpent CRAZY_SNAKE;
	
	// FIXME �crire un commentaire
	// FIXME respecter les conventions d'�criture
	private Grenouille CRAZY_FROG;
	
	// constructeur
	
	// FIXME �crire un commentaire
	public Partie (){
	this.TERRAIN = new Plateau();
	this.CRAZY_SNAKE = new Serpent();
	this.CRAZY_FROG = new Grenouille();
	
	}
	
	// FIXME �crire un commentaire
	//methodes
	public int demarrer()
	{
		// ...
		
		return 0;
	}


}
