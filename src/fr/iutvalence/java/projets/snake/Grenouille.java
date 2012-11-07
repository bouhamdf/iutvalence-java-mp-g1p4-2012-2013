package fr.iutvalence.java.projets.snake;
import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;
//FIXME détailler le commentaire (qu'est ce qui caractérise une grenouille)
/**
 * Classe Grenouille : Definit la grenouille (=2)
 * Contient la fonction RandomGrenouille
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	// FIXME écrire un commentaire
	private Position position;
	
	// FIXME écrire un commentaire
	//Constructeur
   public Grenouille()
   {
	   int x = RandomGrenouille();
	   int y = RandomGrenouille();
	 
	   this.position = new Position(x,y);  
   }
   
	// FIXME redéfinir toString
	public String toString()
	{
		
		String result = "Position X = "+this.x+"\n Position Y = "+this.y;
		return result;
	}
	// FIXME (FIXED) écrire (dans une autre classe) une application de test basique
	
   /**
    * position (aléatoire) de la grenouille
    * @return 
    */
	public int RandomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(Plateau.LARGEUR); // génération
		return i;
    }
}

