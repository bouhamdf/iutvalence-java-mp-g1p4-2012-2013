package fr.iutvalence.java.projets.snake;
import java.awt.event.KeyEvent;

/**
 * @author Florian
 *
 */
public interface Clavier
{
	/**
	 * Méthode clavierDir : permet de gérer les touches clavier pour la direction du serpent
	 * @param event
	 */
	public void clavierDir(KeyEvent event);
}
