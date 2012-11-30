package fr.iutvalence.java.projets.snake;

/**
 * 
 * Classe Direction : Sert � repr�senter la direction que prend le serpent
 * @author bouhamdf
 * @version 1 
 */

public enum Direction
{

	/**
	 * repr�sente la direction Haut
	 */
	HAUT, 
	
	/**
	 * repr�sente la direction Droite
	 */
	DROITE, 
	
	/**
	 * repr�sente la direction Gauche
	 */
	GAUCHE, 
	
	/**
	 * repr�sente la direction Bas
	 */
	BAS;
	
	/**
	 * M�thode estInverse : renvoie vrai si la direction est l'inverse de la direction du serpent
	 * @param choixdir 
	 * @param dirSerp 
	 * @return
	 */
	public boolean estInverse(Direction choixdir, Direction dirSerp)
	{
		return (choixdir  == Direction.HAUT && dirSerp == Direction.BAS
			|| choixdir == Direction.BAS && dirSerp == Direction.HAUT
			|| choixdir == Direction.DROITE && dirSerp == Direction.GAUCHE
			|| choixdir == Direction.GAUCHE && dirSerp == Direction.DROITE);

	}
}
