package fr.iutvalence.java.projets.snake;

/**
 * 
 * Classe Direction : Sert à représenter la direction que prend le serpent
 * @author bouhamdf
 * @version 1 
 */

public enum Direction
{

	/**
	 * représente la direction Haut
	 */
	HAUT, 
	
	/**
	 * représente la direction Droite
	 */
	DROITE, 
	
	/**
	 * représente la direction Gauche
	 */
	GAUCHE, 
	
	/**
	 * représente la direction Bas
	 */
	BAS;
	
	/**
	 * Méthode estInverse : renvoie vrai si la direction est l'inverse de la direction du serpent
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
