package fr.iutvalence.java.projets.snake;

// FIXME (FIXED) écrire un commentaire

/**
 * Position : permet de définir l'abscisse et l'ordonnée (Utilie pour serpent/grenouille)
 * @author bouhamdf
 * @version 1 Position 
 */

public class Position
{

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) écrire un commentaire
	/**
	 * x représente l'abscisse d'un objet (grenouile, serpent)
	 */
	private int x;

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) écrire un commentaire
	/**
	 * y représente l'ordonnée d'un objet (grenouile, serpent)
	 */
	private int y;

	// FIXME (FIXED) écrire un commentaire
	/**
	 * Méthode Position : 
	 * 	Appel du super-constructeur;
	 * 	Initialise les abscisses et ordonnées de l'objet	
	 * @param positionX
	 * @param positionY
	 */
	public Position(int positionX, int positionY)
	{
		super();
		this.x = positionX;
		this.y = positionY;
	}

	
	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Méthode magique getX : Retourne l'abscisse de l'objet
	 * @return x
	 */
	public int getX()
	{
		return x;
	}

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Méthode magique setX : Change l'abscisse de l'objet
	 * @param positionX
	 */
	public void setX(int positionX)
	{
		this.x = positionX;
	}

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Méthode magique getY :
	 * 	Retourne l'ordonnée y de l'objet
	 * @return y
	 */
	public int getY()
	{
		return y;
	}
	
	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Méthode magique setY : Change l'ordonnée de l'objet
	 * @param positionY
	 */
	public void setY(int positionY)
	{
		this.y = positionY;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Position [positionX=" + x + ", positionY=" + y + "]";
	}

}
