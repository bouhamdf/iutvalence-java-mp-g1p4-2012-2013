package fr.iutvalence.java.projets.snake;

//FIXME (FIXED) compléter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1 Classe Partie : Contient toutes les éléments liés à une Partie
 */

public class Partie
{

	// attributs

	// FIXME (FIXED) écrire un commentaire
	// FIXME (FIXED respecter les conventions d'écriture
	/**
	 * terrain représente le plateau de jeu sur lequel la partie sera lancée
	 */
	private Plateau terrain;

	// FIXME (FIXED) écrire un commentaire
	// FIXME (FIXED) respecter les conventions d'écriture
	/**
	 * crazySnake représente le serpent du jeu
	 */
	private Serpent crazySnake;

	// FIXME (FIXED) écrire un commentaire
	// FIXME (FIXED) respecter les conventions d'écriture
	/**
	 * crazyFrog représente la (les) grenouille(s)
	 */
	private Grenouille crazyFrog;

	// constructeur
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Nouvelle partie composée d'un plateau de jeu, d'une grenouille et d'un serpent.
	 */
	public Partie()
	{
		this.terrain = new Plateau();
		this.crazySnake = new Serpent();
		this.crazyFrog = new Grenouille();
	}

	// FIXME (FIXED) écrire un commentaire
	// méthode non utile pour le moment

}
