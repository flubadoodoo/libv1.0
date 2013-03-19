package abstractViewController;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import ui.banner.UIBanner;

/**
 * The Class AbstractViewController.
 */
public abstract class AbstractViewController extends BasicGameState {
	
	/** The color scheme blue. */
	private static final Color COLOR_SCHEME_BLACK;
	
	/** The Constant COLOR_SCHEME_BLUE. */
	private static final Color COLOR_SCHEME_BLUE;
	
	/** The Constant COLOR_SCHEME_CREAM. */
	private static final Color COLOR_SCHEME_CREAM;
	
	/** The Constant COLOR_SCHEME_BROWN. */
	private static final Color COLOR_SCHEME_BROWN;
	
	/** The ID associated with this view controller. */
	private int ID;
	
	// the GUI elements
	/** The banner. */
	private UIBanner banner;
	
	static {
		COLOR_SCHEME_BLACK = new Color(31, 18, 9);
		COLOR_SCHEME_BLUE = new Color(0, 51, 102);
		COLOR_SCHEME_CREAM = new Color(255, 248, 220);
		COLOR_SCHEME_BROWN = new Color(131, 76, 36);
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
		// initialize the UI elements
		banner = new UIBanner("Library");
	}
	
	/**
	 * Entering this view controller.
	 * 
	 * @param container
	 *            the container
	 * @param game
	 *            the game
	 * @throws SlickException
	 *             the slick exception
	 */
	public void enter(GameContainer container, StateBasedGame game) throws SlickException {
		super.enter(container, game);
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
		g.setBackground(getColorSchemeCream());
		banner.drawView(g);
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
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		if (container.getInput().isKeyPressed(Input.KEY_ESCAPE)) {
			System.exit(0);
		}
	}
	
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
	 * Gets the color scheme black.
	 * 
	 * @return the colorSchemeBlack
	 */
	public static Color getColorSchemeBlack() {
		return COLOR_SCHEME_BLACK;
	}
	
	/**
	 * Gets the color scheme blue.
	 * 
	 * @return the colorSchemeBlue
	 */
	public static Color getColorSchemeBlue() {
		return COLOR_SCHEME_BLUE;
	}
	
	/**
	 * Gets the color scheme cream.
	 * 
	 * @return the colorSchemeCream
	 */
	public static Color getColorSchemeCream() {
		return COLOR_SCHEME_CREAM;
	}
	
	/**
	 * Gets the color scheme brown.
	 * 
	 * @return the colorSchemeBrown
	 */
	public static Color getColorSchemeBrown() {
		return COLOR_SCHEME_BROWN;
	}
	
}
