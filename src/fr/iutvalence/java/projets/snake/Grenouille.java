package fr.iutvalence.java.projets.snake;

import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;

/**
 * Classe Grenouille : Definit la grenouille, caract�ris�e par une position
 * 
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	/**
	 * Repr�sente la position (Coordonn�es X et Y) de Grenouille
	 */
	private Position position;

	// Constructeur
	/**
	 * Constructeur Grenouille, initialisant une grenouille � une position au hasard dans la grille.
	 */
	public Grenouille()
	{

		this.position = randomGrenouille();
	}

	
	// FIXME (FIXED) modifier la m�thode pour qu'elle renvoie directement une position 
	/**
	 * position (al�atoire) de la grenouille retourne un nombre au hasard entre 0 et LARGEUR (Taille max de la grille)
	 * @return pos
	 */
	private Position randomGrenouille()
	{
		Random rand = new Random(); // constructeur
		return new Position(rand.nextInt(Plateau.LARGEUR - 2) + 1, rand.nextInt(Plateau.LARGEUR - 2) + 1);
	}

	
	/**
	 * M�thode getPosition : Retourne la position de la grenouille
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
		this.position = randomGrenouille();
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Position de la Grenouille : " + this.position;
	}
}
