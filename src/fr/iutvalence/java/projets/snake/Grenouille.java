package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.Plateau;

//FIXME (FIXED) compl�ter le commentaire
/**
 * Classe Grenouille : Definit la grenouille (=2)
 * Contient la fonction RandomGrenouille
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	
	// FIXME (FIXED) d�finir des attributs
	private Position position;
	
	// FIXME (FIXED) d�finir au moins un constructeur
	//Constructeur
   public Grenouille(position){
	   this.position = new Position();   
   }
   
	// FIXME red�finir toString
	
	// FIXME (FIXED) �crire (dans une autre classe) une application de test basique
	
   /**
    * position (al�atoire) de la grenouille
    */
	public void RandomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int l = rand.nextInt(LARGEUR); // g�n�ration
		int h = rand.nextInt(HAUTEUR); // g�n�ration
		System.out.println(i); // affichage 
    }
}

