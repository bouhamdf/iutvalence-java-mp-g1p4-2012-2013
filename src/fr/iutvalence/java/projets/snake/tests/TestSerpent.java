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
		System.out.println(s);
		
		//test m�thode getTete
		System.out.println("\nPosition de la t�te : " + s.getTete());
		
		//test m�thode getQueue
		System.out.println("\nPosition de la Queue : " + s.getQueue());

		//test getX et getY sur la queue
		System.out.println("\nPosition X de la queue : " + s.getQueue().getX());
		System.out.println("\nPosition Y de la queue : " + s.getQueue().getY());
		
		//test changement de la position de la tete du serpent
		//Position pos = new Position(55,77);
		//s.setTete(pos);
		System.out.println("\nChangement de la position de la tete : " + s);
		
		//test avancer()
		System.out.println("Avancer");
		Plateau p = new Plateau();
		for(int i=0;i<3;i++)
		{
			System.out.println("\nPosition de la Queue : " + s.getQueue());
			s.avancerSerpent();System.out.println(s);
			
		}
		
		//test grandir
		System.out.println("\nTaille du serpent : " + s.getTailleSerpent());
		s.grandir();
		System.out.println("\nTaille du serpent : " + s.getTailleSerpent()+"\n");		
	}
}
