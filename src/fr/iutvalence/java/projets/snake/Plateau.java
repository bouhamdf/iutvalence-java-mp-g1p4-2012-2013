package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.*;
/**
 * Classe Plateau : Défini tous les éléments du plateau (taille et contenu des cases)
 * 
 * @author bouhamdf
 * @version 1
 */

public class Plateau
{
	/**
	 * Représente de la largeur
	 */
	public final static int LARGEUR = 25;

	/**
	 * Représente de la hauteur
	 */
	public final static int HAUTEUR = 25;		

	
	// FIXME revoir le commentaire (il n'y a plus de constantes
	// FIXME changer le type des éléments du tableau (utiliser l'énumération)
	/**
	 * Représente la grille à deux dimensions du jeu Les cases contiennent les constantes définies au-dessus
	 */
	private int[][] grille;
	
	/**
	 * Matérialise un nouveau Plateau de x cases hauteur et largeur. 
	 * La plateau est initialisé avec des "VIDE" dans toute la grille,
	 * Puis avec un MUR tout autour de la grille,
	 * Ensuite le SERPENT sur la grille,
	 * Enfin la grenouille est initialisée aléatoirement. 
	 */
	public Plateau()
	{				
		//Initialisation de la grille
		this.grille = new int[LARGEUR][HAUTEUR];
		
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				//Gestion cases vides et murs
				this.grille[j][i] = Case.VIDE.nomCase();		// On rempli le tableau de 0
				
				this.grille[0][i] = Case.MUR.nomCase(); // On modélise le mur du haut
				this.grille[j][0] = Case.MUR.nomCase();	// On modélise le mur de gauche
				this.grille[j][HAUTEUR - 1] = Case.MUR.nomCase(); // On modélise le mur de droite (la derniere ligne de la grille)
				this.grille[LARGEUR - 1][i] = Case.MUR.nomCase(); // On modélise le mur de du bas (la derniere colonn de la grille)
			}
		}			
	}
	
	/**
	 * Insère le serpent dans la grille
	 * @param s
	 */
	public void setSerpent(Serpent s)
	{
		int taille = s.tailleSerpent;
		
		//Insertion du serpent		
			//Insertion tete
		int xTete = s.getTete().getX(), yTete = s.getTete().getY();
		this.grille[xTete][yTete] = Case.TETE_SERPENT.nomCase();
		
			//Insertion Corps
		for(int k = 1; k < taille-1; k++)
		{
			int x = s.getCorps(k).getX(), y = s.getCorps(k).getY();
			this.grille[x][y] = Case.CASE_SERPENT.nomCase();
		}
		
			//Insertion queue du serpent
		int xQueue = s.getQueue().getX(), yQueue = s.getQueue().getY();
		this.grille[xQueue][yQueue] = Case.QUEUE_SERPENT.nomCase();
	}
	
	/**
	 * Insère la grenouille dans la grille
	 * @param g
	 */
	public void setGrenouille(Grenouille g)
	{
		//Insertion de la grenouille
		this.grille[g.getPosX()][g.getPosY()] = Case.GRENOUILLE.nomCase();
	}
	
	// FIXME gérer les débordements avec une exception
	/**
	 * Met un zero dans la grille à la position donnée
	 * @param pos
	 */
	public void setVide(Position pos)
	{
		int x = pos.getX(), y = pos.getY();
		this.grille[x][y] = Case.VIDE.nomCase();
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{

		String result = "";
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				result = result + this.grille[j][i];
			}
			result = result + '\n';
		}
		return result;
	}
}
