package fr.iutvalence.java.projets.snake;


/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Plateau
{
	

	/**
	 * Représente la grille de jeu
	 */
	private int[][] GRILLE;
	
	/**
	 * Représente de la largeur
	 */
	private int LARGEUR = 70;
	

	/**
	 * Représente de la longueur
	 */
	private int LONGUEUR = 70;
	
	/**
	 * 0 représente une case vide
	 */
	public final static int VIDE = 0;
	
	/**
	 * 1 représente un mur
	 */
	public final static int MUR = 1;
	
	/**
	 * 2 représente une case ou se trouvera la grenouille
	 */
	public final static int GRENOUILLE = 2;
	
	/**
	 * 3 représente une case ou se trouvera une case serpent
	 */
	public final static int CASE_SERPENT = 3;
	
	/**
	 * 4 représente une case ou se trouvera la tete du serpent
	 */
   
   public final static int TETE_SERPENT = 4; 
   
	public Plateau() {
		this.GRILLE = new int [LARGEUR] [LONGUEUR];
			for(int i = 0 ; i <= LONGUEUR ; i++)
			{
				for(int j = 0 ; j <= LARGEUR ; j++)
				{
					this.GRILLE[i][j] = 0;		//On rempli le tableau de 0
					this.GRILLE[0][j] = 1;		//On modélise le mur gauche (la premiere colonne de la grille)
					this.GRILLE[i][0] = 1;		//On modélise le mur du haut (la premiere ligne de la grille)
					this.GRILLE[i][LARGEUR] = 1;//On modélise le mur du bas (la derniere ligne de la grille)
					this.GRILLE[LONGUEUR][j] = 1;//On modélise le mur droit (la derniere colonn de la grille)
				}
			}
			
	}

	@Override
	public String toString() {
		
		String result= "";
		for(int i = 0 ; i <= LONGUEUR ; i++)
		{
			for(int j = 0 ; j <= LARGEUR ; j++)
			{
				result = result+(this.GRILLE[i][j]);
			}
		}
		return result;
				
	}
	
	
	
}
