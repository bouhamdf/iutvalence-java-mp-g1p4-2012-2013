package fr.iutvalence.java.projets.snake;
import java.awt.Graphics;

import fr.iutvalence.java.projets.snake.Grenouille;
import fr.iutvalence.java.projets.snake.PersonnaliserException;
import fr.iutvalence.java.projets.snake.Plateau;
import fr.iutvalence.java.projets.snake.Position;
import fr.iutvalence.java.projets.snake.Serpent;

/**
 * PartieAuto : Contient toutes les éléments liés à une Partie, le serpent avance automatiquement
 * @author bouhamdf
 * @version 1 Classe 
 */

public class Partie
{
	// attributs

	/**
	 * le plateau de jeu sur lequel la partie sera lancée
	 */
	private Plateau terrain;

	/**
	 *  le serpent du jeu
	 */
	private Serpent serpent;


	/**
	 *  la (les) grenouille(s)
	 */
	private Grenouille grenouille;

	// constructeur
	/**
	 * Nouvelle partie composée d'un plateau de jeu, d'une grenouille et d'un serpent.
	 * Partie : Iniatialise un nouveau Plateau, un Serpent et une Grenouille
	 * @param: aucun
	 */
	public Partie()
	{
		this.terrain = new Plateau();
		this.serpent = new Serpent();
		this.grenouille = new Grenouille();
		
		this.grenouille.verifPosGrenouille(this.serpent); //On vérifie la position de la grenouille 
		this.terrain.setGrenouille(this.grenouille); //Insertion de la grenouille dans le plateau
	}
	
	/**
	 * Demarre une partie
	 */
	public void demarrer()
	{		
		//Tant que la partie n'est pas perdu en continue
		while(!perdu())
		{	
			//On verifie si le serpent a mangé la grenouille
			if(this.serpent.manger(this.grenouille.getPosition()))
			{
				this.serpent.grandir();
				this.grenouille = new Grenouille();
				this.terrain.setGrenouille(this.grenouille); //Insertion de la nouvelle grenouille dans le plateau
			}
			
			Direction choixDir = this.serpent.choixDirection(); //On met la direction choisie dans une variable
			
			//Tq la direction choisie est l'inverse de celle du serpent, on continue de choisir une direction
			while(this.serpent.getDirection().estInverse(choixDir, this.serpent.getDirection()))
			{
				choixDir = this.serpent.choixDirection();
			}
			
			this.serpent.setDirection(choixDir);	//On change la direction du serpent avec la nouvelle direction
			this.serpent.avancerSerpent();	//serpent avance
			
			if(perdu())//serpent touche mur, se mord
			{
				System.out.println("GAME OVER");break;
			}
			
			this.terrain.setSerpent(this.serpent);//insertion du serpent dans la grille
			
			try
			{
				this.terrain.setVide(this.serpent.getDernierElement()); //insère un 0
			}
			catch (PersonnaliserException e1)
			{
				// ca ne peut pas arriver
			}
			
			System.out.println(this.terrain);//affiche le plateau
	
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				// à ignorer
			}
		}
	}
	
	/**
	 * Méthode qui renvoie true Si le serpent touche le mur ou bien un de ses éléments
	 * @return true/false
	 */
	public boolean perdu()
	{
		Position tete = this.serpent.getTete();
		//Touche un mur
		if(tete.getX()==0 || tete.getX()==this.terrain.LARGEUR-1 || tete.getY()==0 || tete.getY()==this.terrain.HAUTEUR-1)
		{
			return true;
		}
		
		//Touche un élément de serpent
		for(int i=1;i<this.serpent.getTailleSerpent()-1;i++)
		{
			if(this.serpent.getCorps(i)== tete)
			{
				return true;
			}
		}
		
		return false;
	}
}
