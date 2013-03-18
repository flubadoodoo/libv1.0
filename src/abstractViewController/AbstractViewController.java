package abstractViewController;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import ui.banner.UIBanner;

/**
 * The Class AbstractViewController.
 */
public abstract class AbstractViewController extends BasicGameState {
	
	/** The color scheme blue. */
	private static final int[] COLOR_SCHEME_BLACK;
	
	/** The Constant COLOR_SCHEME_BLUE. */
	private static final int[] COLOR_SCHEME_BLUE;
	
	/** The Constant COLOR_SCHEME_CREAM. */
	private static final int[] COLOR_SCHEME_CREAM;
	
	/** The Constant COLOR_SCHEME_BROWN. */
	private static final int[] COLOR_SCHEME_BROWN;
	
	/** The ID associated with this view controller. */
	private int ID;
	
	// the GUI elements
	/** The banner. */
	private UIBanner banner;
	
	static {
		COLOR_SCHEME_BLACK = new int[] { 31, 18, 9 };
		COLOR_SCHEME_BLUE = new int[] { 0, 51, 102 };
		COLOR_SCHEME_CREAM = new int[] { 255, 248, 220 };
		COLOR_SCHEME_BROWN = new int[] { 131, 76, 36 };
	}
	
	/**
	 * Instantiates a new abstract view controller.
	 * 
	 * @param ID
	 *            the id
	 */
	public AbstractViewController(int ID) {
		this.ID = ID;
	}
	
	/**
	 * Initializes the login screen view controller.
	 * 
	 * @param container
	 *            the container
	 * @param game
	 *            the game
	 * @throws SlickException
	 *             the slick exception
	 */
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		banner = new UIBanner();
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
	 *             the slick exception
	 */
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		
	}
	
	/**
	 * Updates the login view controller.
	 * 
	 * @param container
	 *            the container
	 * @param game
	 *            the game
	 * @param delta
	 *            the delta
	 * @throws SlickException
	 *             the slick exception
	 */
	abstract public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException;
	
	/**
	 * Gets the id.
	 * 
	 * @return the ID associated with this view controller
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * Sets the id.
	 * 
	 * @param iD
	 *            set the ID associated with this view controller
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	/**
	 * Gets the banner.
	 * 
	 * @return the banner
	 */
	public UIBanner getBanner() {
		return banner;
	}
	
	/**
	 * Sets the banner.
	 * 
	 * @param banner
	 *            the banner to set
	 */
	public void setBanner(UIBanner banner) {
		this.banner = banner;
	}
	
	/**
	 * Gets the color scheme blue.
	 * 
	 * @return the colorSchemeBlue
	 */
	public static int[] getColorSchemeBlue() {
		return COLOR_SCHEME_BLUE;
	}
	
	/**
	 * Gets the color scheme black.
	 * 
	 * @return the colorSchemeBlack
	 */
	public static int[] getColorSchemeBlack() {
		return COLOR_SCHEME_BLACK;
	}
	
	/**
	 * Gets the color scheme cream.
	 * 
	 * @return the colorSchemeCream
	 */
	public static int[] getColorSchemeCream() {
		return COLOR_SCHEME_CREAM;
	}
	
	/**
	 * Gets the color scheme brown.
	 * 
	 * @return the colorSchemeBrown
	 */
	public static int[] getColorSchemeBrown() {
		return COLOR_SCHEME_BROWN;
	}
	
}
