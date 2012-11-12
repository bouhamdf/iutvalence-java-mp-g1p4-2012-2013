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
	 * CASE_SERPENT repr�sente une case o� se trouvera une case serpent
	 */
	CASE_SERPENT(3),
		
	/**
	 * TETE_SERPENT repr�sente la case o� se trouvera la tete du serpent
	 */
	TETE_SERPENT(4);

	private final int nomCase;
	   
	//Constructeur
	Case(int nomCase)
	{
		this.nomCase = nomCase;
	}
	   
	public int nomCase()
	{
		return nomCase;
	}
}

