package fr.iutvalence.java.projets.snake;

//FIXME compl�ter le commentaire
/**
 * 
 * @author bouhamdf
 * @version 1
 */

public class Grenouille
{
	
	// FIXME d�finir des attributs
	
	// FIXME d�finir au moins un constructeur
	
	// FIXME red�finir toString
	
	// FIXME �crire (dans une autre classe) une application de test basique
   
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

