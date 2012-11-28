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
