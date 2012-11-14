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
	
	// FIXME (FIXED) ajouter une m�thode pour d�marrer la partie
	/**
	 * Demarre une partie
	 */
	public void demarrer()
	{		
		this.terrain.setGrenouille(this.crazyFrog);
		
		for(int i = 0; i<20; i++)
		{
			Serpent s = this.crazySnake;
			Plateau t = this.terrain;
			Grenouille g = this.crazyFrog;
			
			s.avancer();	
			t.setSerpent(s);
			
			Position p = s.getElements(s.tailleSerpent-1);
			t.setVide(p);
			
			System.out.println(t);
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				// � ignorer
			}
		}
	}
	
}
