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
		//Cr�ation d'un serpent s
		Serpent s = new Serpent();
		
		//test constructeur et toString
		System.out.println(new Serpent());
		
		//test m�thode getPos
		int i = 0;
		System.out.println("\nPosition de la case " + i + " " + s.getPos(i));
	}
}
