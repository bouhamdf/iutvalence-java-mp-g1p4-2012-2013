package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.Plateau;

public enum Case
{
	/**
	 * VIDE représente une case vide
	 */
	VIDE,
		
	/**
	 * MUR représente un mur
	 */
	MUR,
		
	/**
	 * GRENOUILLE représente une case où se trouvera la grenouille
	 */
	GRENOUILLE,
		
	/**
	 * CASE_SERPENT représente une case où se trouvera une case serpent
	 */
	CASE_SERPENT,
		
	/**
	 * TETE_SERPENT représente la case où se trouvera la tete du serpent
	 */
	TETE_SERPENT
		
		//public final static int VIDE = 0, MUR = 1, GRENOUILLE = 2, CASE_SERPENT = 3, TETE_SERPENT = 4;
	}
}
