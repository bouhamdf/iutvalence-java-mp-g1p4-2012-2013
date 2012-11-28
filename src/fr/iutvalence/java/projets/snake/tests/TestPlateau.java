package fr.iutvalence.java.projets.snake.tests;
import fr.iutvalence.java.projets.snake.*;

import java.lang.Enum;

/**
 * Classe test Plateau : simule le plateau de jeu en le materielisant par des chiffres (ex: 0 case vide, 1 case mur, 2
 * grenouille, 3 et 4 serpent) Utilise la classe Plateau
 * 
 * @author mahmouho
 * @version 1
 */
public class TestPlateau
{
	/**
	 * méthode simulant le plateau de jeu
	 * @param args
	 * @throws PersonnaliserException 
	 */
	public static void main(String[] args) throws PersonnaliserException
	{
		Plateau p = new Plateau();
		System.out.print(p);
		
		try
		{
			Position pos = new Position (-2,9);
			p.setVide(pos);
		}
		catch(PersonnaliserException e){}
	}
}
