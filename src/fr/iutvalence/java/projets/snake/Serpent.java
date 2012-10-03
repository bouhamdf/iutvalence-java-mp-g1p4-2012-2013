package fr.iutvalence.java.projets.snake;
/**
 * 
 * @author bouhamdf
 	* @version 1
 */

public class Serpent
{
	// FIXME cette constante, qui a un lien avec le contenu des cases du tableau dans Plateau, devrait être définie dans Plateau
	/**
	 * 3 représente une case ou se trouvera une case serpent
	 */
	public final static int CASE_SERPENT = 3;
	
	// FIXME cette constante, qui a un lien avec le contenu des cases du tableau dans Plateau, devrait être définie dans Plateau
   /**
	 * 4 représente une case ou se trouvera la tete du serpent
	 */
   
   public final static int TETE_SERPENT = 4; 
   
   
   // FIXME constante ou attribut ?
	/**
	 * La taille initiale du serpent
	 */
   
   public int TAILLE_SERPENT;
   
   /**
	 * La position initiale du serpent
	 */

   
   public final static int POSITION_SERPENT;


   // FIXME constante ou attribut ?
   // FIXME la position est un entier ???


   public Serpent(){
   this.TAILLE_SERPENT = CASE_SERPENT;
   }
   }
