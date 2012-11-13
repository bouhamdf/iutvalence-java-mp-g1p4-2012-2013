package fr.iutvalence.java.projets.snake;
import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;

/**
 * Classe Grenouille : Definit la grenouille, caract�ris�e par une position
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	/**
	 * Repr�sente la position (Coordonn�es X et Y) de Grenouille
	 */
	private Position position;
	
	//Constructeur
   /**
    * Constructeur Grenouille, initialisant une grenouille � une position au hasard dans la grille.
    */
public Grenouille()
   {
	// FIXME r��crire la m�me chose en une seule ligne
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
	
	// FIXME d�clarer cette m�thode en priv�, elle n'est utilis�e qu'en interne
   /**
    * position (al�atoire) de la grenouille
    * retourne un nombre au hasard entre 0 et LARGEUR (Taille max de la grille)
    * @return i
    */
	public int randomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(Plateau.LARGEUR); // g�n�ration
		return i;
    }
	
	
	/**
	 * M�thode magique getPosX : Retourne l'abscisse d'une grenouille
	 * @return x
	 */
	public int getPosX()
	{
		int x = this.position.getX();
		return x;
	}
	
	/**
	 * M�thode magique getPosY : Retourne l'ordonn�e d'une grenouille
	 * @return y
	 */
	public int getPosY()
	{
		int y = this.position.getY();
		return y;
	}
}

