package fr.iutvalence.java.projets.snake;

/**
 * Classe Plateau : D�fini tous les �l�ments du plateau (taille et contenu des cases)
 * 
 * @author bouhamdf
 * @version 1
 */

public class Plateau
{
	/**
	 * Repr�sente de la largeur
	 */
	public final static int LARGEUR = 25;

	/**
	 * Repr�sente de la hauteur
	 */
	public final static int HAUTEUR = 25;

	
	// FIXME red�finir les constantes sp�cifiant le contenu des cases sous la forme d'une �num�ration (� discuter)
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
	public final static int CASE_SERPENT = 3;

	/**
	 * 4 repr�sente une case ou se trouvera la tete du serpent
	 */

	public final static int TETE_SERPENT = 4;

	/**
	 * Repr�sente la grille � deux dimensions du jeu Les cases contiennent les constantes d�finies au-dessus
	 */
	private int[][] grille;

	// FIXME d�tailler le commentaire
	/**
	 * Mat�rialise un nouveau Plateau de x cases de hauteur et de largeur. Les cases contiennent les constantes d�finies
	 * au-dessus.
	 */

	public Plateau()
	{
		this.grille = new int[LARGEUR][HAUTEUR];
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				this.grille[i][j] = VIDE;		// On rempli le tableau de 0
				this.grille[0][j] = MUR;		// On mod�lise le mur gauche (la premiere colonne de la grille)
				this.grille[i][0] = MUR;		// On mod�lise le mur du haut (la premiere ligne de la grille)
				this.grille[i][HAUTEUR - 1] = MUR; // On mod�lise le mur du bas (la derniere ligne de la grille)
				this.grille[LARGEUR - 1][j] = MUR; // On mod�lise le mur droit (la derniere colonn de la grille)
				this.grille[10][15] = CASE_SERPENT;
				this.grille[11][15] = CASE_SERPENT;
				this.grille[12][15] = CASE_SERPENT;
				this.grille[13][15] = TETE_SERPENT;
			}

		}
	}

	@Override
	public String toString()
	{

		String result = "";
		for (int i = 0; i < LONGUEUR; i++)
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
