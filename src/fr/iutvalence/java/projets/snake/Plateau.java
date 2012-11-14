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
				this.grille[i][j] = Case.VIDE.nomCase();		// On rempli le tableau de 0
				this.grille[0][j] = Case.MUR.nomCase();		// On modélise le mur gauche (la premiere colonne de la grille)
				this.grille[i][0] = Case.MUR.nomCase();		// On modélise le mur du haut (la premiere ligne de la grille)
				this.grille[i][HAUTEUR - 1] = Case.MUR.nomCase(); // On modélise le mur du bas (la derniere ligne de la grille)
				this.grille[LARGEUR - 1][j] = Case.MUR.nomCase(); // On modélise le mur droit (la derniere colonn de la grille)
			}
		}		
	}

	@Override
	public String toString()
	{

		String result = "";
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				result = result + this.grille[i][j];
			}
			result = result + '\n';
		}
		return result;
	}
	
	/**
	 * Insère le serpent dans la grille
	 * @param s
	 */
	public void setSerpent(Serpent s)
	{
			//Insertion du serpent
			//Insertion tete
		
		int taille = s.tailleSerpent;
		Position t = s.getElements(0);
		int xTete = t.getX(), yTete = t.getY();
		this.grille[xTete][yTete] = Case.TETE_SERPENT.nomCase();
		
			//Insertion Corps
		for(int k = 1; k < taille-1; k++)
		{
			Position c = s.getElements(k);
			int x = c.getX(), y = c.getY();
			this.grille[x][y] = Case.CASE_SERPENT.nomCase();
		}
		
			//Insertion queue du serpent
		Position q = s.getElements(taille-1);
		int xQueue = q.getX(), yQueue = q.getY();
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
	
	/**
	 * Met un zero dans la grille à la position donnée
	 * @param pos
	 */
	public void setVide(Position pos)
	{
		int x = pos.getX(), y = pos.getY();
		this.grille[x][y+1] = Case.VIDE.nomCase();
	}
	
	/**
	 * Verifie que la grenouille ne soit pas sur un élément du serpent
	 * @param g
	 * @param s
	 */
	public void verifGrenouille(Grenouille g, Serpent s)
	{
		for(int i=0; i<s.tailleSerpent;i++)
		{
			Position posSerpent = s.getElements(i);
			int xSerpent = t.getX(), ySerpent = t.getY();
			
			int xGrenouille = g.getPosX(), yGrenouille = g.getPosY();
			
			if(xSerpent == xGrenouille || ySerpent==yGrenouille)
			{
				
			}
			
			
		}
	}

}
