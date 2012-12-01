package fr.iutvalence.java.projets.snake;
import java.util.LinkedList;
import java.util.Random;


/**
 * Classe Serpent : Dans cette Classe nous allons gérer le déplacement du serpent et nous allons générer 
 * l'incrémentation du corps du serpent lorsque celui ci mange une grenouille. 
 * 
 * @author bouhamdf
 * @version 1
 */

public class Serpent
{
	/**
	 * Représente la taille du serpent à un moment donné de la partie :
	 * la taille augmente lorsque le serpent mange une grenouille
	 * (Initialisé à 5)
	 */
	private int tailleSerpent;
	
	/**
	 * Liste de Position : chaque case du tableau représente la position d'un éléments du serpent
	 * Ex : 1ere case : tête du serpent, 2ème case : 1er partie du corps ...
	 */
	private LinkedList<Position> positions;
	
	/**
	 * Pour connaitre la direction que prend le serpent
	 */
	private Direction direction;
	
	/**
	 * Cette variable prendra la position de l'élement que l'on va supprimer (afin de mettre un 0 dans la grille)
	 */
	private Position dernierElement;
	
	/**
	 * Constructeur Serpent
	 * Initialise le serpent d'une taille de 4 à des positions prédéfinies
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
	 * Permet d'obtenir la direction du serpent
	 * @return
	 */
	public Direction getDirection()
	{
		return this.direction;
	}
	
	/**
	 * Permet de modifier la direction du serpent
	 * @param dir 
	 */
	public void setDirection(Direction dir)
	{
		this.direction = dir;
	}
	
	/**
	 * Permet de redéfinir la position de la tête
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
		switch(this.direction)
		{
			case HAUT:
				return new Position(this.getTete().getX(), this.getTete().getY()-1);
			
			case DROITE:
				return new Position(this.getTete().getX()+1, this.getTete().getY());
				
			case BAS:
				return new Position(this.getTete().getX(), this.getTete().getY()+1);
				
			case GAUCHE:
				return new Position(this.getTete().getX()-1, this.getTete().getY());
		}
		return null;
	}
	
	/**
	 * Modifie la tete du serpent et supprime le dernier element
	 */
	public void avancerSerpent()
	{
		this.dernierElement = this.positions.getLast();
		this.positions.addFirst(this.getCaseSuivante());
		this.positions.removeLast();
	}
	
	/**
	 * Méthode provisoire : renvoie la prochaine direction du serpent
	 * @return direction
	 */
	public Direction choixDirection()
	{
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(3); // génération
			switch(i)
			{
				case 0:
					return Direction.HAUT;
				
				case 1:
					return Direction.DROITE;
					
				case 2:
					return Direction.BAS;
					
				case 3:
					return Direction.GAUCHE;
			}
		return null;
	}
	
	/**
	 * Méthode grandir : ajoute 1 à la taille du serpent, méthode appelée lorsque le serpent mange une grenouille
	 */
	public void grandir()
	{
		this.tailleSerpent = this.tailleSerpent+1;
		this.positions.addLast(this.getCaseSuivante());
	}
	
	/**
	 * Méthode manger : vérifie si le serpent a mangé la grenouille
	 * @param posGrenouille 
	 * @return 
	 */
	public boolean manger(Position posGrenouille)
	{
		return (this.getTete().getX() == posGrenouille.getX() && this.getTete().getY() == posGrenouille.getY());
	}
}