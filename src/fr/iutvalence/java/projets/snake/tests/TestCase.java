package fr.iutvalence.java.projets.snake.tests;
import fr.iutvalence.java.projets.snake.*;

/**
 * Classe Test Case : test de l'affichage de l'�num�ration case
 * @author mahmouho
 * @version 1
 */
public class TestCase
{
	/**
	 * test de l'affichage de l'�num�ration case
	 * @param args
	 */
	public static void main(final String[] args)
	{		
		String cases = "Case Vide : "+Case.VIDE.getNumCase()+"\nCase Mur : "+Case.MUR.getNumCase()+"\nCase Grenouille : "+Case.GRENOUILLE.getNumCase()+"\nCase Serpent : "+Case.CASE_SERPENT.getNumCase()+"\nCase T�te Serpent : "+Case.TETE_SERPENT.getNumCase()+"\nCase Queue Serpent : "+Case.QUEUE_SERPENT.getNumCase();
		System.out.println(cases);
	}
}
