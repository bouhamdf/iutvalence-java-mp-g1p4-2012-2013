package fr.iutvalence.java.projets.snake;
import java.awt.event.KeyEvent;

/**
 * @author Florian
 *
 */
public interface Clavier
{
	/**
	 * M�thode clavierDir : permet de g�rer les touches clavier pour la direction du serpent
	 * @param event
	 */
	public void clavierDir(KeyEvent event);
}
