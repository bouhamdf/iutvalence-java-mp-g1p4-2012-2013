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
	 * CASE_SERPENT représente une case où se trouvera une case serpent
	 */
	CASE_SERPENT(3),
		
	/**
	 * TETE_SERPENT représente la case où se trouvera la tete du serpent
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

