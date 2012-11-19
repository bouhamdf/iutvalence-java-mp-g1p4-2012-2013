package fr.iutvalence.java.projets.snake;
import fr.iutvalence.java.projets.snake.*;
import java.lang.Enum;

public enum Case
{
	/**
	 * VIDE représente une case vide
	 */
	VIDE(0),
		
	/**
	 * MUR représente un mur
	 */
	MUR(1),
		
	/**
	 * GRENOUILLE représente une case où se trouvera la grenouille
	 */
	GRENOUILLE(2),
		
	/**
	 * TETE_SERPENT représente la case où se trouvera la tete du serpent
	 */
	TETE_SERPENT(3),
	
	/**
	 * CASE_SERPENT représente une case où se trouvera une case serpent
	 */
	CASE_SERPENT(4),
	
	/**
	 * QUEUE_SERPENT représente la case où se trouvera la tete du serpent
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
	   
	
	//FIXME (NOT FIXED) le nom de la méthode est mal choisi : ca ne renvoie pas un nom mais un numéro!
	/**
	 * Permet de récupérer le nom d'un élément de l'énumération
	 * @return nomCase
	 */
	public int getNomCase()
	{
		return nomCase;
	}
}

