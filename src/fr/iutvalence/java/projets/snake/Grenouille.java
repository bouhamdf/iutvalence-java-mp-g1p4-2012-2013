package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.Plateau;

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
   public Grenouille(position){
	   this.position = new Position();   
   }
   
	// FIXME redéfinir toString
	
	// FIXME (FIXED) écrire (dans une autre classe) une application de test basique
	
   /**
    * position (aléatoire) de la grenouille
    */
	public void RandomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int l = rand.nextInt(LARGEUR); // génération
		int h = rand.nextInt(HAUTEUR); // génération
		System.out.println(i); // affichage 
    }
}

