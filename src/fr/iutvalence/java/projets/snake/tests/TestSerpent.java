package fr.iutvalence.java.projets.snake.tests;
import fr.iutvalence.java.projets.snake.*;

/**
 * @author bouhamdf
 *
 */
public class TestSerpent
{
	public static void main(String[] args)
	{
		//Création d'un serpent s
		Serpent s = new Serpent();
		
		//test constructeur et toString
		System.out.println(new Serpent());
		
		//test méthode getPos
		int i = 0;
		Position p = s.getElements(i);
		
		System.out.println("\nPosition de la case " + i + " " + p);
		
		System.out.println("\nPosition X : " + s.getPosX(p));
		
		System.out.println("\nPosition Y : " + s.getPosY(p));
		
		for(int z = 0; z < 3; z++)
		{
			System.out.println(s.avancer());
		}
	
	}
}
