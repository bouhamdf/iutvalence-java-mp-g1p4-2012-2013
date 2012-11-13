package fr.iutvalence.java.projets.snake;
import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;

/**
 * Classe Grenouille : Definit la grenouille, caractérisée par une position
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	/**
	 * Représente la position (Coordonnées X et Y) de Grenouille
	 */
	private Position position;
	
	//Constructeur
   /**
    * Constructeur Grenouille, initialisant une grenouille à une position au hasard dans la grille.
    */
public Grenouille()
   {
	// FIXME réécrire la même chose en une seule ligne
	   int x = randomGrenouille();
	   int y = randomGrenouille();
	 
		this.position = new Position(x,y);  
	}
   

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Position de la Grenouille : " + this.position;
	}
	
	// FIXME déclarer cette méthode en privé, elle n'est utilisée qu'en interne
   /**
    * position (aléatoire) de la grenouille
    * retourne un nombre au hasard entre 0 et LARGEUR (Taille max de la grille)
    * @return i
    */
	public int randomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(Plateau.LARGEUR); // génération
		return i;
    }
	
	
	/**
	 * Méthode magique getPosX : Retourne l'abscisse d'une grenouille
	 * @return x
	 */
	public int getPosX()
	{
		int x = this.position.getX();
		return x;
	}
	
	/**
	 * Méthode magique getPosY : Retourne l'ordonnée d'une grenouille
	 * @return y
	 */
	public int getPosY()
	{
		int y = this.position.getY();
		return y;
	}
}

