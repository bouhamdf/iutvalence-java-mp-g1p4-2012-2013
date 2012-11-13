package fr.iutvalence.java.projets.snake.tests;

import java.util.Random;
import fr.iutvalence.java.projets.snake.*;

// FIXME (FIXED) à compléter
/**
 * Classe Test Grenouille : Simule le positionnement au hasard d'une grenouille
 * @author mahmouho
 * @version 1
 */
public class TestGrenouille
{
	
	/**
	 * Simule le positionnement au hasard d'une grenouille
	 * Affiche la position d'une grenouille
	 * 
	 * Tests des fonctions getPosX et getPosY
	 * @param args
	 */
	public static void main(final String[] args)
	{
		Grenouille g = new Grenouille();
		System.out.println(g);
		
		System.out.println("\nTest de getPosX : "+g.getPosX()+"\n");
		
		System.out.println("Test de getPosY : "+g.getPosY()+"\n");
	}
}
