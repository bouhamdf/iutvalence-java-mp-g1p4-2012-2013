package fr.iutvalence.java.projets.snake;

/**
 * Partie : Contient toutes les éléments liés à une Partie
 * @author bouhamdf
 * @version 1 Classe 
 */

public class Partie
{

	// attributs

	/**
	 * le plateau de jeu sur lequel la partie sera lancée
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
	// FIXME (FIXED) détailler le commentaire (dire dans quel "état" est la partie construite)
	/**
	 * Nouvelle partie composée d'un plateau de jeu, d'une grenouille et d'un serpent.
	 * Partie : Iniatialise un nouveau Plateau, un Serpent et une Grenouille
	 * @param: aucun
	 */
	public Partie()
	{
		this.terrain = new Plateau();
		this.crazySnake = new Serpent();
		this.crazyFrog = new Grenouille();
	}
	
	// FIXME ajouter une méthode pour démarrer la partie
	/*public DemarrerPartie()
	{
		new Partie();
	}*/
	
}
