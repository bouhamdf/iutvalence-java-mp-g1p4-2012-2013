package fr.iutvalence.java.projets.snake;
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
   
   /**
    * position (al�atoire) de la grenouille
    */
	public void RandomGrenouille()
    {
		Random rand = new Random(); // constructeur
		int i = rand.nextInt(25); // g�n�ration
		int j = rand.nextInt(25); // g�n�ration
		System.out.println(i); // affichage 
    }
}

