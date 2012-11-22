package fr.iutvalence.java.projets.snake.interfaces;

import fr.iutvalence.java.projets.snake.Grenouille;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;
import fr.iutvalence.java.projets.snake.Serpent;

/**
 * PartieAuto : Contient toutes les �l�ments li�s � une Partie, le serpent avance automatiquement
 * @author bouhamdf
 * @version 1 Classe 
 */

public class PartieAuto
{

	// attributs

	/**
	 * le plateau de jeu sur lequel la partie sera lanc�e
	 */
	private Plateau terrain;

	/**
	 *  le serpent du jeu
	 */
	private Serpent serpent;


	/**
	 *  la (les) grenouille(s)
	 */
	private Grenouille grenouille;

	// constructeur
	/**
	 * Nouvelle partie compos�e d'un plateau de jeu, d'une grenouille et d'un serpent.
	 * Partie : Iniatialise un nouveau Plateau, un Serpent et une Grenouille
	 * @param: aucun
	 */
	public PartieAuto()
	{
		this.terrain = new Plateau();
		this.serpent = new Serpent();
		this.grenouille = new Grenouille();
	}
	
	/**
	 * Demarre une partie
	 */
	public void demarrer()
	{		
		this.terrain.setGrenouille(this.grenouille);
		
		while(perdu()!= true)
		{			
			this.serpent.avancerAleatoirement();
			this.serpent.avancerAuto();//serpent avance
			
			if(perdu())//serpent touche mur, se mord
			{
				System.out.println("GAME OVER");break;
			}
			this.terrain.setSerpent(this.serpent);//ins�re serpent
			this.terrain.setVide(this.serpent.getDernierElement());//ins�re un 0
			System.out.println(this.terrain);//affiche le plateau
	
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
	
	/**
	 * M�thode qui renvoie true Si le serpent touche le mur ou bien un de ses �l�ments
	 * @return true/false
	 */
	public boolean perdu()
	{
		Position tete = this.serpent.getTete();
		//Touche un mur
		if(tete.getX()==0 || tete.getX()==this.terrain.LARGEUR || tete.getY()==0 || tete.getY()==this.terrain.HAUTEUR)
		{
			return true;
		}
		
		//Touche un �l�ment de serpent
		for(int i=1;i<this.serpent.getTailleSerpent()-1;i++)
		{
			if(this.serpent.getCorps(i)== tete)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
}
