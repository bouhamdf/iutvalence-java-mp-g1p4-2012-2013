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
		String cases = "Case Vide : "+Case.VIDE.nomCase()+"\nCase Mur : "+Case.MUR.nomCase()+"\nCase Grenouille : "+Case.GRENOUILLE.nomCase()+"\nCase Serpent : "+Case.CASE_SERPENT.nomCase()+"\nCase Tête Serpent : "+Case.TETE_SERPENT.nomCase();
		System.out.println(cases);
	}
}
