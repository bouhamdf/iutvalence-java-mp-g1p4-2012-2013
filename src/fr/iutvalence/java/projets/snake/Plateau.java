package fr.iutvalence.java.projets.snake;
import java.awt.Graphics;

import fr.iutvalence.java.projets.snake.*;
/**
 * Classe Plateau : Défini tous les éléments du plateau (taille et contenu des cases)
 * 
 * @author bouhamdf
 * @version 1
 */

public class Plateau
{
	/**
	 * Représente de la largeur
	 */
	public final static int LARGEUR = 25;

	/**
	 * Représente de la hauteur
	 */
	public final static int HAUTEUR = 25;		

	
	/**
	 * Représente la grille à deux dimensions du jeu.
	 * Les cases contiennent les valeurs de l'énumération définies dans la classe Case
	 */
	private Case[][] grille;
	
	/**
	 * Matérialise un nouveau Plateau de x cases hauteur et largeur. 
	 * La plateau est initialisé avec des "VIDE" dans toute la grille,
	 * Puis avec un MUR tout autour de la grille,
	 * Ensuite le SERPENT sur la grille,
	 * Enfin la grenouille est initialisée aléatoirement. 
	 */
	public Plateau()
	{				
		//Initialisation de la grille
		this.grille = new Case[LARGEUR][HAUTEUR];
		
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				//Gestion cases vides et murs
				this.grille[j][i] = Case.VIDE;		// On rempli le tableau de 0
				
				this.grille[0][i] = Case.MUR; // On modélise le mur du haut
				this.grille[j][0] = Case.MUR;	// On modélise le mur de gauche
				this.grille[j][HAUTEUR - 1] = Case.MUR; // On modélise le mur de droite (la derniere ligne de la grille)
				this.grille[LARGEUR - 1][i] = Case.MUR; // On modélise le mur de du bas (la derniere colonn de la grille)
			}
		}			
	}
	
	/**
	 * Insère le serpent dans la grille
	 * @param s
	 */
	public void setSerpent(Serpent s)
	{
		int taille = s.getTailleSerpent();		
		
		int posX = s.getTete().getX();
		int posY = s.getTete().getY();

		//Insertion du serpent		
			//Insertion tete
		int xTete = s.getTete().getX(), yTete = s.getTete().getY();
		this.grille[xTete][yTete] = Case.TETE_SERPENT;
		
			//Insertion Corps
		for(int k = 1; k < taille-1; k++)
		{
			int x = s.getCorps(k).getX(), y = s.getCorps(k).getY();
			this.grille[x][y] = Case.CASE_SERPENT;
		}
		
			//Insertion queue du serpent
		int xQueue = s.getQueue().getX(), yQueue = s.getQueue().getY();
		this.grille[xQueue][yQueue] = Case.QUEUE_SERPENT;
	}
	
	/**
	 * Insère la grenouille dans la grille
	 * @param g
	 */
	public void setGrenouille(Grenouille g)
	{
		//Insertion de la grenouille
		this.grille[g.getPosition().getX()][g.getPosition().getY()] = Case.GRENOUILLE;
	}
	
	/**
	 * Met un zero dans la grille à la position donnée
	 * @param pos
	 * @throws PersonnaliserException 
	 */
	public void setVide(Position pos) throws PersonnaliserException
	{
		if(0<pos.getX() && pos.getX()<LARGEUR && 0<pos.getY() && pos.getY()<HAUTEUR)
		{
			int x = pos.getX(), y = pos.getY();
			this.grille[x][y] = Case.VIDE;
		}
		// FIXME tester d'abord les cas d'erreurs, cela évite le else
		else
			// FIXME trouver un nom correct
			throw new PersonnaliserException();
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{

		String result = "";
		for (int i = 0; i < HAUTEUR; i++)
		{
			for (int j = 0; j < LARGEUR; j++)
			{
				result = result + this.grille[j][i];
			}
			result = result + '\n';
		}
		return result;
	}
}
