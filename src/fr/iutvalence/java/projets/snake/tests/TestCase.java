package fr.iutvalence.java.projets.snake.tests;
import fr.iutvalence.java.projets.snake.*;

/**
 * Classe Test Case : test de l'affichage de l'énumération case
 * @author mahmouho
 * @version 1
 */
public class TestCase
{
	/**
	 * test de l'affichage de l'énumération case
	 * @param args
	 */
	public static void main(final String[] args)
	{		
		System.out.println("Case Vide : "+Case.VIDE);
		System.out.println("Case Mur : "+Case.MUR);
		System.out.println("Case Grenouille : "+Case.GRENOUILLE);
		System.out.println("Case Serpent : "+Case.CASE_SERPENT);
		System.out.println("Case Tete Serpent : "+Case.TETE_SERPENT);
		System.out.println("Case Queue Serpent : "+Case.QUEUE_SERPENT);
	}
}
