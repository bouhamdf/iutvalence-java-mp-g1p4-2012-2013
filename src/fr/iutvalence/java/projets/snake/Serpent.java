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
	 * Public car utilis� dans la classe Plateau
	 */
	public int tailleSerpent = 5;
	
	
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
		
		this.positions[0] = new Position(12,10);
		this.positions[1] = new Position(12,11);
		this.positions[2] = new Position(12,12);
		this.positions[3] = new Position(12,13);
		this.positions[4] = new Position(12,14);
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
			result = result + "Case " + i + " : " + this.positions[i] + "\n";
			i++;
		}
		return result;
	}
	
	/**
	 * Permet d'obtenir la position d'un �l�ment du serpent se trouvant dans la case numCase
	 * @param numCase
	 * @return une position
	 */
	public Position getElements(int numCase)
	{
		return this.positions[numCase];
	}
	
	//FIXME flo : commentaire a compl�ter
	/**
	 * Fais avancer le serpent
	 * @return
	 */
	public void avancer()
	{ 
		for (int i = 0; i < this.tailleSerpent; i++)
		{
			Position pos = this.getElements(i);
			int x = pos.getX();
			int y = pos.getY();
		
			this.positions[i] = new Position(x,y-1);			
		}
	}
}