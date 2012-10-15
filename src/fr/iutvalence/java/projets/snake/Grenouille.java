package fr.iutvalence.java.projets.snake;
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
   
   /**
    * position (aléatoire) de la grenouille
    */
	public void RandomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(25); // génération
		int j = rand.nextInt(25); // génération
		System.out.println(i); // affichage 
    }
}

