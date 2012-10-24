package fr.iutvalence.java.projets.snake;

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

	
	// FIXME redéfinir les constantes spécifiant le contenu des cases sous la forme d'une énumération (à discuter)
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

	/**
	 * Représente la grille à deux dimensions du jeu Les cases contiennent les constantes définies au-dessus
	 */
	private int[][] grille;

	// FIXME détailler le commentaire
	/**
	 * Matérialise un nouveau Plateau de x cases de hauteur et de largeur. Les cases contiennent les constantes définies
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
				this.grille[0][j] = MUR;		// On modélise le mur gauche (la premiere colonne de la grille)
				this.grille[i][0] = MUR;		// On modélise le mur du haut (la premiere ligne de la grille)
				this.grille[i][HAUTEUR - 1] = MUR; // On modélise le mur du bas (la derniere ligne de la grille)
				this.grille[LARGEUR - 1][j] = MUR; // On modélise le mur droit (la derniere colonn de la grille)
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
