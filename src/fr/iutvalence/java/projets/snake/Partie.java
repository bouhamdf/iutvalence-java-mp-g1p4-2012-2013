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
	
	// FIXME (FIXED) ajouter une méthode pour démarrer la partie
	/**
	 * Demarre une partie
	 */
	public void demarrer()
	{		
		this.terrain.setGrenouille(this.crazyFrog);
		
		for(int i = 0; i<20; i++)
		{
			Serpent s = this.crazySnake;
			Plateau p = this.terrain;
			Grenouille g = this.crazyFrog;
						
			
			s.avancer();p.setSerpent(s);
			p.setVide(s.getDernierElement());
			System.out.println(p);
	
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				// à ignorer
			}
		}
	}
	
}
