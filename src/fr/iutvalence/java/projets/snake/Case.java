package fr.iutvalence.java.projets.snake;

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

	/**
	 * Numéro de la case (4 pour CASE_SERPENT, 5 pour QUEUE_SERPENT...)
	 */
	private final int numCase;
	
	/**
	 * Constructeur de Case : initialise la variable numCase à l'énumération correspondante
	 * Ex : 4 pour QUEUE_SERPENT
	 * @param numCase
	 */
	private Case(int numCase)
	{
		this.numCase = numCase;
	}
	   
	// FIXME si l'attribut sert juste dans toString, il faudrait mieux faire un switch case et renvoyer directement une valeur
	@Override
	public String toString()
	{
		return ""+this.numCase;
	}
	
	
}

