package fr.iutvalence.java.projets.snake;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe fenetre : le jeu sera affich� dans cette fen�tre
 * @author Florian
 */
public class Fenetre extends JFrame
{
	private Jeu jeu;
	
	/**
	 * Constructeur de fen�tre
	 */
	public Fenetre()
	{
		//Titre de la fen�tre
		this.setTitle("Snake");
		
		//Dimension de la fen�tre
		this.setSize(400,400);
				
		//Cr�ation JPanel
		JPanel content = new JPanel();

		//Fen�tre non redimmensionnable
		setResizable(false);
		
		//Fermeture de la fen�tre � la sortie du jeu
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Ajout du JPanel � la fen�tre
		setContentPane(content);
	    
		//Centrage de la fen�tre
	    this.setLocationRelativeTo(null);
	    
		//Affichage de la fen�tre
	    this.setVisible(true);
	    
	    //Afficher texte
	    JLabel label = new JLabel("Bienvenue dans ma modeste application");
	    content.add(label);
	}
}
