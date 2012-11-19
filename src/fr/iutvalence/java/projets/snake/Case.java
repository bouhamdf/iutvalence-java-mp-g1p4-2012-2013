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

	private final int nomCase;
	
	//FIXME Commenter
	//Constructeur
	/**
	 * Constructeur Case
	 * @param nomCase
	 */
	private Case(int nomCase)
	{
		this.nomCase = nomCase;
	}
	   
	
	//FIXME (NOT FIXED) le nom de la m�thode est mal choisi : ca ne renvoie pas un nom mais un num�ro!
	/**
	 * Permet de r�cup�rer le nom d'un �l�ment de l'�num�ration
	 * @return nomCase
	 */
	public int getNomCase()
	{
		return nomCase;
	}
}

