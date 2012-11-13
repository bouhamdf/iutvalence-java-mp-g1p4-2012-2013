package fr.iutvalence.java.projets.snake;
import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;
//FIXME (FIXED) détailler le commentaire (qu'est ce qui caractérise une grenouille)
/**
 * Classe Grenouille : Definit la grenouille (=2)
 * Contient la fonction RandomGrenouille
 * Une grenouille est caractérisée par une position
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Représente la position (Coordonnées X et Y) de Grenouille
	 */
	private Position position;
	
	// FIXME (FIXED) écrire un commentaire
	//Constructeur
   /**
    * Constructeur Grenouille
    * La méthode RandomGrenouille est utilisée pour établir une position au hasard dans la grille.
    */
	public Grenouille()
	{
		int x = randomGrenouille();
		int y = randomGrenouille();
	 
		this.position = new Position(x,y);  
	}
   
	// FIXME (FIXED) redéfinir toString
	/**
	 * toString Grenouille
	 * @return la position de la grenouille
	 */
	public String toString()
	{
		return "Position de la Grenouille : " + this.position;
	}
	
	// FIXME (FIXED) écrire (dans une autre classe) une application de test basique
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

