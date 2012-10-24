package fr.iutvalence.java.projets.snake;

// FIXME (FIXED) �crire un commentaire

/**
 * Position : permet de d�finir l'abscisse et l'ordonn�e (Utilie pour serpent/grenouille)
 * @author bouhamdf
 * @version 1 Position 
 */

public class Position
{

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) �crire un commentaire
	/**
	 * x repr�sente l'abscisse d'un objet (grenouile, serpent)
	 */
	private int x;

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) �crire un commentaire
	/**
	 * y repr�sente l'ordonn�e d'un objet (grenouile, serpent)
	 */
	private int y;

	// FIXME (FIXED) �crire un commentaire
	/**
	 * M�thode Position : 
	 * 	Appel du super-constructeur;
	 * 	Initialise les abscisses et ordonn�es de l'objet	
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
	// FIXME (FIXED) �crire un commentaire
	/**
	 * M�thode magique getX : Retourne l'abscisse de l'objet
	 * @return x
	 */
	public int getX()
	{
		return x;
	}

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) �crire un commentaire
	/**
	 * M�thode magique setX : Change l'abscisse de l'objet
	 * @param positionX
	 */
	public void setX(int positionX)
	{
		this.x = positionX;
	}

	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) �crire un commentaire
	/**
	 * M�thode magique getY :
	 * 	Retourne l'ordonn�e y de l'objet
	 * @return y
	 */
	public int getY()
	{
		return y;
	}
	
	// FIXME (FIXED) renommer plus simplement
	// FIXME (FIXED) �crire un commentaire
	/**
	 * M�thode magique setY : Change l'ordonn�e de l'objet
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
