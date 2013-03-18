/**
 * 
 */
package ui.abstractUI;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

/**
 * The Class AbstractUI.
 * 
 * @author hamdan
 */
public abstract class AbstractUI {
	
	/** The frame. */
	private Rectangle frame; // the view in its super view's coordinate system
	
	/** The bounds. */
	// the view in its own coordinate system, with the top left corner being (0, 0)
	private Rectangle bounds;
	
	/**
	 * Instantiates a new abstract UI element.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public AbstractUI(float x, float y, float width, float height) {
		frame = new Rectangle(x, y, width, height);
		bounds = new Rectangle(0, 0, width, height);
	}
	
	/**
	 * Draw view.
	 * 
	 * @param g
	 *            the graphics context
	 */
	abstract public void drawView(Graphics g);
	
	/**
	 * Prepare context for drawing.
	 * 
	 * @param g
	 *            the graphics context
	 */
	protected void prepareContextForDrawing(Graphics g) {
		g.pushTransform();
		g.translate(frame.getX(), frame.getY());
		g.setWorldClip(bounds);
	}
	
	/**
	 * Restore context.
	 * 
	 * @param g
	 *            the g
	 */
	protected void restoreContext(Graphics g) {
		g.clearWorldClip();
		g.popTransform();
	}
	
}
