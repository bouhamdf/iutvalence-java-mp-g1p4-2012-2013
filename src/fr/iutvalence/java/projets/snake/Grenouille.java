package fr.iutvalence.java.projets.snake;
import java.util.Random;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;
//FIXME d�tailler le commentaire (qu'est ce qui caract�rise une grenouille)
/**
 * Classe Grenouille : Definit la grenouille (=2)
 * Contient la fonction RandomGrenouille
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	// FIXME �crire un commentaire
	private Position position;
	
	// FIXME �crire un commentaire
	//Constructeur
   public Grenouille()
   {
	   int x = RandomGrenouille();
	   int y = RandomGrenouille();
	 
	   this.position = new Position(x,y);  
   }
   
	// FIXME red�finir toString
	public String toString()
	{
		
		String result = "Position X = "+this.x+"\n Position Y = "+this.y;
		return result;
	}
	// FIXME (FIXED) �crire (dans une autre classe) une application de test basique
	
   /**
    * position (al�atoire) de la grenouille
    * @return 
    */
	public int RandomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(Plateau.LARGEUR); // g�n�ration
		return i;
    }
}

