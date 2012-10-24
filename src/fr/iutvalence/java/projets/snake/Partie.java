package fr.iutvalence.java.projets.snake;

/**
 * Partie : Contient toutes les �l�ments li�s � une Partie
 * @author bouhamdf
 * @version 1 Classe 
 */

public class Partie
{

	// attributs

	/**
	 * le plateau de jeu sur lequel la partie sera lanc�e
	 */
	private Plateau terrain;

	/**
	 *  le serpent du jeu
	 */
	private Serpent crazySnake;


	/**
	 *  la (les) grenouille(s)
	 */
	private Grenouille crazyFrog;

	// constructeur
	// FIXME (FIXED) d�tailler le commentaire (dire dans quel "�tat" est la partie construite)
	/**
	 * Nouvelle partie compos�e d'un plateau de jeu, d'une grenouille et d'un serpent.
	 * Partie : Iniatialise un nouveau Plateau, un Serpent et une Grenouille
	 * @param: aucun
	 */
	public Partie()
	{
		this.terrain = new Plateau();
		this.crazySnake = new Serpent();
		this.crazyFrog = new Grenouille();
	}
	
	// FIXME ajouter une m�thode pour d�marrer la partie
	/*public DemarrerPartie()
	{
		new Partie();
	}*/
	
}
