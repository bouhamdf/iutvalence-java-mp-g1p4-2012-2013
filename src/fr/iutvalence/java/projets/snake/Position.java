package fr.iutvalence.java.projets.snake;

/**
 * Position : permet de définir l'abscisse et l'ordonnée d'un objet
 * @author bouhamdf
 * @version 1 Position 
 */

public class Position
{

	/**
	 * x représente l'abscisse d'un objet 
	 */
	private int x;

	/**
	 * y représente l'ordonnée d'un objet 
	 */
	private int y;

	/**
	 * 	Initialise les abscisses et ordonnées de l'objet, avec des valeurs passées en paramètre	
	 * @param positionX
	 * @param positionY
	 */
	public Position(int positionX, int positionY)
	{
		super();
		this.x = positionX;
		this.y = positionY;
	}

	/**
	 * Retourne l'abscisse de l'objet
	 * @return l'abscisse de l'objet
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * Change l'abscisse de l'objet
	 * @param positionX
	 */
	public void setX(int positionX)
	{
		this.x = positionX;
	}

	/**
	 * l'ordonnée y de l'objet
	 * @return l'ordonnée y de l'objet
	 */
	public int getY()
	{
		return y;
	}
	

	/**
	 * Change l'ordonnée de l'objet
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
