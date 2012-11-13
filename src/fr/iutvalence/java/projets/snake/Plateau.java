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
		this.grille = new int[LARGEUR][HAUTEUR];
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				
				this.grille[i][j] = Case.VIDE.nomCase();		// On rempli le tableau de 0
				
				this.grille[0][j] = Case.MUR.nomCase();		// On modélise le mur gauche (la premiere colonne de la grille)
				this.grille[i][0] = Case.MUR.nomCase();		// On modélise le mur du haut (la premiere ligne de la grille)
				this.grille[i][HAUTEUR - 1] = Case.MUR.nomCase(); // On modélise le mur du bas (la derniere ligne de la grille)
				this.grille[LARGEUR - 1][j] = Case.MUR.nomCase(); // On modélise le mur droit (la derniere colonn de la grille)
			}
		}
		
		this.grille[10][15] = Case.CASE_SERPENT.nomCase();
		this.grille[11][15] = Case.CASE_SERPENT.nomCase();
		this.grille[12][15] = Case.CASE_SERPENT.nomCase();
		this.grille[13][15] = Case.TETE_SERPENT.nomCase();
		
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
