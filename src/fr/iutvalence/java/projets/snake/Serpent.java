package fr.iutvalence.java.projets.snake;

/**
 * Classe Serpent : Dans cette Classe nous allons g�rer le d�placement du serpent et nous allons g�n�rer 
 * l'incr�mentation du corps du serpent lorsque celui ci mange une grenouille. 
 * 
 * @author bouhamdf
 * @version 1
 */

public class Serpent

{

	// FIXME compl�ter
	/**
	 * Repr�sente la taille du serpent � un moment donn� de la partie (Initialis� � 4)
	 */
	private int tailleSerpent = 4;
	
	
	/**
	 * Tableau de Position : chaque case du tableau repr�sente la position d'un �l�ments du serpent
	 * Ex : 1ere case : t�te du serpent, 2�me case : 1er partie du corps ...
	 */
	private Position[] positions;

	
	/**
	 * Constructeur Serpent
	 * Initialise le serpent d'une taille de 4 � des positions pr�d�finies
	 */
	public Serpent()
	{
		//Initialisation de la grille
		this.positions = new Position[tailleSerpent];
		
		this.positions[0] = new Position(10,15);
		this.positions[1] = new Position(11,15);
		this.positions[2] = new Position(12,15);
		this.positions[3] = new Position(13,15);
	}
	
	/**
	 * toString Serpent
	 * retourne le tableau de Position
	 * @return result
	 */
	public String toString()
	{
		String result = "";
		int i = 0;
		for (Position position : positions)
		{
			result = result + this.positions[i] + "\n";
		}
		return result;
	}
	
}