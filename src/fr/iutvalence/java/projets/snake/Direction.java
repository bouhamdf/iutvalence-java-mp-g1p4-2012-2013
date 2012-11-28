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
	 * @param choixSerp 
	 * @return
	 */
	public boolean estInverse(Direction choixdir, Direction choixSerp)
	{
		return (choixdir == Direction.HAUT && choixSerp == Direction.BAS
			|| choixdir == Direction.BAS && choixSerp == Direction.HAUT
			|| choixdir == Direction.DROITE && choixSerp == Direction.GAUCHE
			|| choixdir == Direction.GAUCHE && choixSerp == Direction.DROITE);

	}
}
