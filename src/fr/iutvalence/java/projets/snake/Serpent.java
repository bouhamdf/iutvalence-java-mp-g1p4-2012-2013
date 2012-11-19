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
	// FIXME (FIXED) compl�ter
	/**
	 * Repr�sente la taille du serpent � un moment donn� de la partie :
	 * la taille augmente lorsque le serpent mange une grenouille
	 * (Initialis� � 5)
	 */
	private int tailleSerpent;
	
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
	 * Cette variable prendra la position de l'�lement que l'on va supprimer (afin de mettre un 0 dans la grille)
	 */
	private Position dernierElement;
	
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
		this.positions.add(new Position(11,12));
		this.positions.add(new Position(12,12));
		this.positions.add(new Position(13,12));
		this.positions.add(new Position(14,12));
		
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
		return this.positions.get(this.tailleSerpent-1);
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
	 * Permet d'obtenir le dernier element
	 * @return
	 */
	public Position getDernierElement()
	{
		return this.dernierElement;
	}
	
	/**
	 * Permet d'obtenir la taille du serpent
	 * @return
	 */
	public int getTailleSerpent()
	{
		return this.tailleSerpent;
	}
	/**
	 * Permet de red�finir la position de la t�te
	 * @param x
	 * @param y
	 */
	public void setTete(Position pos)
	{
		Position posTete = new Position(pos.getX(),pos.getY());
		this.positions.set(0, posTete);
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
	
	/**
	 * Modifie la tete du serpent et supprime le dernier element
	 */
	public void avancer()
	{
		this.dernierElement = this.positions.getLast();
		this.positions.addFirst(this.getCaseSuivante());
		this.positions.removeLast();
	}
	
	/**
	 * M�thode grandir : ajoute 1 � la taille du serpent, m�thode appel�e lorsque le serpent mange une grenouille
	 */
	public void grandir()
	{
		this.tailleSerpent = this.tailleSerpent+1;
	}
}