package loginScreenViewController;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import ui.responder.UIKeyboardResponder;
import abstractViewController.AbstractViewController;

/**
 * The Class LoginScreenViewController.
 */
public class LoginScreenViewController extends AbstractViewController implements UIKeyboardResponder {
	
	/**
	 * Instantiates a new login screen view controller.
	 * 
	 * @param ID
	 *            the ID associated with this view controller
	 */
	public LoginScreenViewController(int ID) {
		super(ID);
	}
	
	/**
	 * Initializes the login screen view controller.
	 * 
	 * @param container
	 *            the game container
	 * @param game
	 *            the game
	 * @throws SlickException
	 *             if the view controller could not initialize properly
	 */
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		
	}
	
	/**
	 * Renders the login screen view controller.
	 * 
	 * @param container
	 *            the container
	 * @param game
	 *            the game
	 * @param g
	 *            the g
	 * @throws SlickException
	 *             if the view controller could not render properly
	 */
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		
	}
	
	/**
	 * Updates the login screen view controller.
	 * 
	 * @param container
	 *            the container
	 * @param game
	 *            the game
	 * @param delta
	 *            the delta
	 * @throws SlickException
	 *             the view controller could not update properly
	 */
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		
	}
	
}
