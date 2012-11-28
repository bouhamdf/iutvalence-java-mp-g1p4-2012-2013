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

		this.position = new Position(randomGrenouille(), randomGrenouille());
	}

	
	// FIXME modifer la méthode pour qu'elle renvoie directement une position 
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

	
	/**
	 * Méthode getPosition : Retourne la position de la grenouille
	 * @return position
	 */
	public Position getPosition()
	{
		return this.position;
	}
	
	/**
	 * Change la position de la grenouille (utile dans le cas ou elle est sur le serpent)
	 */
	public void changerPosGrenouille()
	{
		this.position = new Position(randomGrenouille(), randomGrenouille());
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Position de la Grenouille : " + this.position;
	}
}
