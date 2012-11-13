package fr.iutvalence.java.projets.snake;
import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;
//FIXME (FIXED) d�tailler le commentaire (qu'est ce qui caract�rise une grenouille)
/**
 * Classe Grenouille : Definit la grenouille (=2)
 * Contient la fonction RandomGrenouille
 * Une grenouille est caract�ris�e par une position
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	// FIXME (FIXED) �crire un commentaire
	/**
	 * Repr�sente la position (Coordonn�es X et Y) de Grenouille
	 */
	private Position position;
	
	// FIXME (FIXED) �crire un commentaire
	//Constructeur
   /**
    * Constructeur Grenouille
    * La m�thode RandomGrenouille est utilis�e pour �tablir une position au hasard dans la grille.
    */
	public Grenouille()
	{
		int x = randomGrenouille();
		int y = randomGrenouille();
	 
		this.position = new Position(x,y);  
	}
   
	// FIXME (FIXED) red�finir toString
	/**
	 * toString Grenouille
	 * @return la position de la grenouille
	 */
	public String toString()
	{
		return "Position de la Grenouille : " + this.position;
	}
	
	// FIXME (FIXED) �crire (dans une autre classe) une application de test basique
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

