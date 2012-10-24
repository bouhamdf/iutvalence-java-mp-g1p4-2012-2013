package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.Plateau;

public enum Case
{
	/**
	 * VIDE repr�sente une case vide
	 */
	VIDE,
		
	/**
	 * MUR repr�sente un mur
	 */
	MUR,
		
	/**
	 * GRENOUILLE repr�sente une case o� se trouvera la grenouille
	 */
	GRENOUILLE,
		
	/**
	 * CASE_SERPENT repr�sente une case o� se trouvera une case serpent
	 */
	CASE_SERPENT,
		
	/**
	 * TETE_SERPENT repr�sente la case o� se trouvera la tete du serpent
	 */
	TETE_SERPENT
		
		//public final static int VIDE = 0, MUR = 1, GRENOUILLE = 2, CASE_SERPENT = 3, TETE_SERPENT = 4;
	}
}
