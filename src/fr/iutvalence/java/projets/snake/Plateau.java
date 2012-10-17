package fr.iutvalence.java.projets.snake;

//FIXME compléter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Plateau
{
	//FIXME détailler le commentaire (contenu des cases)
	/**
	 * Représente la grille de jeu
	 */
	private int[][] grille;
	
	// FIXME définir les constantes avant les attributs
	/**
	 * Représente de la largeur
	 */
	public final static int LARGEUR = 25;
	

	/**
	 * Représente de la longueur
	 */
	public final static int LONGUEUR = 25;
	
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
   
   // FIXME écrire un commentaire
	public Plateau() {
		this.grille = new int [LARGEUR] [LONGUEUR];
			for(int i = 0 ; i < LONGUEUR ; i++)
			{
				for(int j = 0 ; j < LARGEUR ; j++)
				{
					this.grille[i][j] = VIDE;		//On rempli le tableau de 0
					this.grille[0][j] = MUR;		//On modélise le mur gauche (la premiere colonne de la grille)
					this.grille[i][0] = MUR;		//On modélise le mur du haut (la premiere ligne de la grille)
					this.grille[i][LONGUEUR-1] = MUR; //On modélise le mur du bas (la derniere ligne de la grille)
					this.grille[LARGEUR-1][j] = MUR; //On modélise le mur droit (la derniere colonn de la grille)
					this.grille[10][15]=CASE_SERPENT;
					this.grille[11][15]=CASE_SERPENT;
					this.grille[12][15]=CASE_SERPENT;
					this.grille[13][15]=TETE_SERPENT;
				}
				
			}
			
	}

	@Override
	public String toString() {
		
		String result= "";
		for(int i = 0 ; i < LONGUEUR ; i++)
		{
			for(int j = 0 ; j < LARGEUR ; j++)
			{
				result = result + this.grille[i][j];	
			}
			result = result + '\n';
		}
		return result;			
	}
	
	// FIXME écrire (dans une autre classe) une application de test basique
}
