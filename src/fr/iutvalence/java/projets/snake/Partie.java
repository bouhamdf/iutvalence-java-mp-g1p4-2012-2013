package fr.iutvalence.java.projets.snake;

//FIXME (FIXED) compl�ter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1 Classe Partie : Contient toutes les �l�ments li�s � une Partie
 */

public class Partie
{

	// attributs

	// FIXME (FIXED) �crire un commentaire
	// FIXME (FIXED respecter les conventions d'�criture
	/**
	 * terrain repr�sente le plateau de jeu sur lequel la partie sera lanc�e
	 */
	private Plateau terrain;

	// FIXME (FIXED) �crire un commentaire
	// FIXME (FIXED) respecter les conventions d'�criture
	/**
	 * crazySnake repr�sente le serpent du jeu
	 */
	private Serpent crazySnake;

	// FIXME (FIXED) �crire un commentaire
	// FIXME (FIXED) respecter les conventions d'�criture
	/**
	 * crazyFrog repr�sente la (les) grenouille(s)
	 */
	private Grenouille crazyFrog;

	// constructeur
	// FIXME (FIXED) �crire un commentaire
	/**
	 * Nouvelle partie compos�e d'un plateau de jeu, d'une grenouille et d'un serpent.
	 */
	public Partie()
	{
		this.terrain = new Plateau();
		this.crazySnake = new Serpent();
		this.crazyFrog = new Grenouille();
	}

	// FIXME (FIXED) �crire un commentaire
	// m�thode non utile pour le moment

}
