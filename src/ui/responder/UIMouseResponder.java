/**
 * 
 */
package ui.responder;

import org.newdawn.slick.MouseListener;

/**
 * The Interface UIMouseResponder.
 * 
 * @author hamdan
 */
public interface UIMouseResponder extends MouseListener {
	
	/**
	 * Checks if is accepting mouse input.
	 * 
	 * @return whether this responder is responding to mouse input
	 */
	public boolean isAcceptingInput();
	
	/**
	 * Mouse clicked.
	 * 
	 * @param button
	 *            the button
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param clickCount
	 *            the click count
	 */
	public void mouseClicked(int button, int x, int y, int clickCount);
	
	/**
	 * Mouse dragged.
	 * 
	 * @param oldx
	 *            the old x
	 * @param oldy
	 *            the old y
	 * @param newx
	 *            the new x
	 * @param newy
	 *            the new y
	 */
	public void mouseDragged(int oldx, int oldy, int newx, int newy);
	
	/**
	 * Mouse pressed.
	 * 
	 * @param button
	 *            the button
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public void mousePressed(int button, int x, int y);
	
	/**
	 * Mouse released.
	 * 
	 * @param button
	 *            the button
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public void mouseReleased(int button, int x, int y);
	
	/**
	 * Mouse wheel moved.
	 * 
	 * @param change
	 *            the change
	 */
	public void mouseWheelMoved(int change);
	
}
