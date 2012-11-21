package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.*;
import java.lang.Enum;

public enum Case
{
	/**
	 * VIDE repr�sente une case vide
	 */
	VIDE(0),
		
	/**
	 * MUR repr�sente un mur
	 */
	MUR(1),
		
	/**
	 * GRENOUILLE repr�sente une case o� se trouvera la grenouille
	 */
	GRENOUILLE(2),
		
	/**
	 * TETE_SERPENT repr�sente la case o� se trouvera la tete du serpent
	 */
	TETE_SERPENT(3),
	
	/**
	 * CASE_SERPENT repr�sente une case o� se trouvera une case serpent
	 */
	CASE_SERPENT(4),
	
	/**
	 * QUEUE_SERPENT repr�sente la case o� se trouvera la tete du serpent
	 */
	QUEUE_SERPENT(5);

	/**
	 * Num�ro de la case (4 pour CASE_SERPENT, 5 pour QUEUE_SERPENT...)
	 */
	private final int numCase;
	
	//FIXME (FIXED) Commenter
	//Constructeur
	/**
	 * Constructeur de Case : initialise la variable numCase � l'�num�ration correspondante
	 * Ex : 4 pour QUEUE_SERPENT
	 * @param numCase
	 */
	private Case(int numCase)
	{
		this.numCase = numCase;
	}
	   
	@Override
	public String toString()
	{
		return ""+this.numCase;
	}
	
	
}

