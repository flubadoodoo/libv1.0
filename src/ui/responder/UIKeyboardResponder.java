/**
 * 
 */
package ui.responder;

import org.newdawn.slick.KeyListener;

/**
 * The Interface UIKeyboardResponder.
 * 
 * @author hamdan
 */
public interface UIKeyboardResponder extends KeyListener {
	
	/**
	 * Checks if is accepting input.
	 * 
	 * @return whether this responder is responding to keyboard input
	 */
	public boolean isAcceptingInput();
	
	/**
	 * Key pressed.
	 * 
	 * @param key
	 *            the pressed key
	 * @param c
	 *            the pressed char
	 */
	public void keyPressed(int key, char c);
	
	/**
	 * Key released.
	 * 
	 * @param key
	 *            the released key
	 * @param c
	 *            the released c
	 */
	public void keyReleased(int key, char c);
	
}
