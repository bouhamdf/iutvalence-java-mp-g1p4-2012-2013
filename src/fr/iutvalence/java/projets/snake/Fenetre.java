package fr.iutvalence.java.projets.snake;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe fenetre : le jeu sera affiché dans cette fenêtre
 * @author Florian
 */
public class Fenetre extends JFrame
{
	private Jeu jeu;
	
	/**
	 * Constructeur de fenêtre
	 */
	public Fenetre()
	{
		//Titre de la fenêtre
		this.setTitle("Snake");
		
		//Dimension de la fenêtre
		this.setSize(400,400);
				
		//Création JPanel
		JPanel content = new JPanel();

		//Fenêtre non redimmensionnable
		setResizable(false);
		
		//Fermeture de la fenêtre à la sortie du jeu
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Ajout du JPanel à la fenêtre
		setContentPane(content);
	    
		//Centrage de la fenêtre
	    this.setLocationRelativeTo(null);
	    
		//Affichage de la fenêtre
	    this.setVisible(true);
	    
	    //Afficher texte
	    JLabel label = new JLabel("Bienvenue dans ma modeste application");
	    content.add(label);
	}
}
