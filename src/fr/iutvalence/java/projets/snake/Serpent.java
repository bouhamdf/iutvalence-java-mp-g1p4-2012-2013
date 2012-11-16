package fr.iutvalence.java.projets.snake;
import java.util.LinkedList;


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
	public int tailleSerpent;
	
	
	/**
	 * Liste de Position : chaque case du tableau repr�sente la position d'un �l�ments du serpent
	 * Ex : 1ere case : t�te du serpent, 2�me case : 1er partie du corps ...
	 */
	private LinkedList<Position> positions;
	
	/**
	 * Pour connaitre la direction que prend le serpent
	 */
	private Direction direction;
	
	
	/**
	 * Constructeur Serpent
	 * Initialise le serpent d'une taille de 4 � des positions pr�d�finies
	 */
	public Serpent()
	{
		//Initialisation de la taille du serpent
		this.tailleSerpent = 5;
		
		//Initialisation de la grille
		this.positions = new LinkedList<Position>();
		
		this.positions.add(new Position(10,12)); //Premiere case : tete
		this.positions.add(new Position(14,12)); //Deuxieme  case : queue
		this.positions.add(new Position(11,12));
		this.positions.add(new Position(12,12));
		this.positions.add(new Position(13,12));
		
		//Direction initiale du serpent
		this.direction = Direction.GAUCHE;
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
		for (Position position : this.positions)
		{
			result = result + "Case " + i + " : " + this.positions.get(i) + "\n";
			i++;
		}
		return result;
	}
	
	/**
	 * Permet d'obtenir la position de la tete du serpent
	 * @return
	 */
	public Position getTete()
	{
		return this.positions.get(0);
	}
	
	/**
	 * Permet d'obtenir la position de la queue du serpent
	 * @return
	 */
	public Position getQueue()
	{
		return this.positions.get(1);
	}	
	
	/**
	 * Permet d'obtenir la position de la partie i du corps du serpent
	 * @param i
	 * @return
	 */
	public Position getCorps(int i)
	{
		return this.positions.get(i);
	}
	
	/**
	 * Permet de red�finir la position de la t�te
	 * @param x
	 * @param y
	 */
	public void setTete(int x, int y)
	{
		Position pos = new Position(x,y);
		this.positions.set(0, pos);
	}
	
	/**
	 * Permet de connaitre dans quelle direction va le serpent
	 * @return
	 */
	public Position getCaseSuivante()
	{
		Position tete = this.getTete();
		switch (this.direction)
		{
			case HAUT:
				return new Position(tete.getX(), tete.getY()-1);
			
			case DROITE:
				return new Position(tete.getX()+1, tete.getY());
				
			case BAS:
				return new Position(tete.getX(), tete.getY()+1);
				
			case GAUCHE:
				return new Position(tete.getX()-1, tete.getY());
		}
		return null;
	}
	
	public void avancer()
	{
		this.positions.getCaseSuivante();
	
	}
}