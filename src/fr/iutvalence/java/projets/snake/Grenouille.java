package fr.iutvalence.java.projets.snake;

//FIXME compléter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	
	// FIXME définir des attributs
	
	// FIXME définir au moins un constructeur
	
	// FIXME redéfinir toString
	
	// FIXME écrire (dans une autre classe) une application de test basique
   
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

