package fr.iutvalence.java.projets.snake;

import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;

/**
 * Classe Grenouille : Definit la grenouille, caractérisée par une position
 * 
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	/**
	 * Représente la position (Coordonnées X et Y) de Grenouille
	 */
	private Position position;

	// Constructeur
	/**
	 * Constructeur Grenouille, initialisant une grenouille à une position au hasard dans la grille.
	 */
	public Grenouille()
	{
		// FIXME (NOT FIXED ...) réécrire la même chose en une seule ligne en se passant des variables x et y
		int x = randomGrenouille(), y = randomGrenouille();

		this.position = new Position(x, y);
	}

	

	/**
	 * position (aléatoire) de la grenouille retourne un nombre au hasard entre 0 et LARGEUR (Taille max de la grille)
	 * 
	 * @return i
	 */
	private int randomGrenouille()
	{
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(Plateau.LARGEUR - 2) + 1; // génération
		return i;
	}

	
	// FIXME remplacer les 2 méthodes par une seule getPosition()
	/**
	 * Méthode magique getPosX : Retourne l'abscisse d'une grenouille
	 * 
	 * @return x
	 */
	public int getPosX()
	{
		int x = this.position.getX();
		return x;
	}

	/**
	 * Méthode magique getPosY : Retourne l'ordonnée d'une grenouille
	 * 
	 * @return y
	 */
	public int getPosY()
	{
		int y = this.position.getY();
		return y;
	}

	
	//FIXME le nom est mal choisi !
	/**
	 * Change la position de la grenouille (utile dans le cas ou elle est sur le serpent)
	 */
	public void setPos()
	{
		int x = randomGrenouille(), y = randomGrenouille();
		this.position = new Position(x, y);
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Position de la Grenouille : " + this.position;
	}
}
