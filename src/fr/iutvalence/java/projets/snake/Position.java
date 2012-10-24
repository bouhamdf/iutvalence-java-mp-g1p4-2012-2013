package fr.iutvalence.java.projets.snake;

// FIXME écrire un commentaire
public class Position
{

	// FIXME renommer plus simplement
	// FIXME écrire un commentaire
	private int positionX;

	// FIXME renommer plus simplement
	// FIXME écrire un commentaire
	private int positionY;

	// FIXME écrire un commentaire
	public Position(int positionX, int positionY)
	{
		super();
		this.positionX = positionX;
		this.positionY = positionY;
	}

	// FIXME renommer plus simplement
	// FIXME écrire un commentaire
	public int getPositionX()
	{
		return positionX;
	}

	// FIXME renommer plus simplement
	// FIXME écrire un commentaire
	public void setPositionX(int positionX)
	{
		this.positionX = positionX;
	}

	// FIXME renommer plus simplement
	// FIXME écrire un commentaire
	public int getPositionY()
	{
		return positionY;
	}
	// FIXME renommer plus simplement
	// FIXME écrire un commentaire
	public void setPositionY(int positionY)
	{
		this.positionY = positionY;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + positionX;
		result = prime * result + positionY;
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
		if (positionX != other.positionX)
			return false;
		if (positionY != other.positionY)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Position [positionX=" + positionX + ", positionY=" + positionY + "]";
	}

}
