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
		//Déclaration des objets
		Grenouille g = new Grenouille();
		Serpent s = new Serpent();
		
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
		//Insertion du serpent
			//Insertion tete
		int taille = s.tailleSerpent;
		Position t = s.getElements(0);
		int xTete = s.getPosX(t), yTete = s.getPosY(t);
		this.grille[xTete][yTete] = Case.TETE_SERPENT.nomCase();
		
			//Insertion Corps
		for(int k = 1; k < taille-1; k++)
		{
			Position c = s.getElements(k);
			int x = s.getPosX(c), y = s.getPosY(c);
			this.grille[x][y] = Case.CASE_SERPENT.nomCase();
		}
		
			//Insertion queue du serpent
		Position q = s.getElements(taille-1);
		int xQueue = s.getPosX(q), yQueue = s.getPosY(q);
		this.grille[xQueue][yQueue] = Case.QUEUE_SERPENT.nomCase();
		
		/*for(int z = 0; z < 100; z++)
		{
			s.avancer();
		}*/
		
		//Insertion de la grenouille
		this.grille[g.getPosX()][g.getPosY()] = Case.GRENOUILLE.nomCase();
		
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

}
