package fr.iutvalence.java.projets.snake;
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Plateau
{
	/**
	 * Repr�sente la grille de jeu
	 */
	private int[][] grille;
	
	/**
	 * 0 repr�sente une case vide
	 */
	public final static int VIDE = 0;
	
	/**
	 * 1 repr�sente un mur
	 */
	public final static int MUR = 1;
	
	/**
	 * 2 repr�sente une case ou se trouvera la grenouille
	 */
	public final static int GRENOUILLE = 2;
	
	/**
	 * 3 repr�sente une case ou se trouvera une case serpent
	 */
	public final static int SERPENT = 3;
	
	
}