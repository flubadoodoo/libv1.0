/**
 * 
 */
package ui.responder;

/**
 * The Interface UIResponder.
 * 
 * @author hamdan
 */
public interface UIResponder extends UIKeyboardResponder, UIMouseResponder {
	
	/**
	 * @return
	 */
	public boolean isAcceptingInput();
	
	/**
	 * Key pressed.
	 * 
	 * @param key
	 *            the key
	 * @param c
	 *            the c
	 */
	public void keyPressed(int key, char c);
	
	/**
	 * Key released.
	 * 
	 * @param key
	 *            the key
	 * @param c
	 *            the c
	 */
	public void keyReleased(int key, char c);
	
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
	 *            the oldx
	 * @param oldy
	 *            the oldy
	 * @param newx
	 *            the newx
	 * @param newy
	 *            the newy
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
