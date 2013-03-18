package main;

import loginScreenViewController.LoginScreenViewController;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.Log;

/**
 * The Class Main.
 */
public class Main extends StateBasedGame {
	
	/** The Constant DISPLAY_WIDTH. */
	private static final int DISPLAY_WIDTH; // width of the window
	
	/** The Constant DISPLAY_HEIGHT. */
	private static final int DISPLAY_HEIGHT; // height of the window
	
	/** The Constant DISPLAY_IS_FULLSCREEN. */
	private static final boolean DISPLAY_IS_FULLSCREEN; // whether the program runs in full screen mode
	
	/** The Constant DISPLAY_TARGET_FRAME_RATE. */
	private static final int DISPLAY_TARGET_FRAME_RATE; // the frame rate of the program
	
	static {
		// the screen has an aspect ratio of 1280/720, which is about 1.67 : 1
		DISPLAY_WIDTH = 1000; // 1000 pixels wide
		DISPLAY_HEIGHT = 562; // 562 pixels in height
		DISPLAY_IS_FULLSCREEN = false; // run in a window
		DISPLAY_TARGET_FRAME_RATE = 60; // go through program loop 60 times a second
	}
	
	/**
	 * The main method creates an AppGameContainer that holds the library
	 * program. A new instance of this class is created. The display mode of the
	 * AppGameContainer is set, as well as the target frame rate. Finally, the
	 * library system is started and the program proceeds to the
	 * initStatesList() method.
	 * 
	 * @param args
	 *            the command line arguments
	 * @throws SlickException
	 *             the slick exception
	 */
	public static void main(String[] args) throws SlickException {
		// create new AppGameContainer, call the title of the window "libv1.0"
		AppGameContainer gameContainer = new AppGameContainer(new Main("libv1.0"));
		// set the display mode of the window (width, height and full screen)
		gameContainer.setDisplayMode(DISPLAY_WIDTH, DISPLAY_HEIGHT, DISPLAY_IS_FULLSCREEN);
		// set the frame rate
		gameContainer.setTargetFrameRate(DISPLAY_TARGET_FRAME_RATE);
		// set verbose to false to the program doesn't print unnecessary info to the console
		Log.setVerbose(false);
		// start the program
		gameContainer.start();
	}
	
	/**
	 * Instantiates a new main.
	 * 
	 * @param name
	 *            the name
	 */
	public Main(String name) {
		super(name);
	}
	
	/**
	 * Initialize the states.
	 * 
	 * @param container
	 *            the container
	 * @throws SlickException
	 *             if a state could not be initialized properly
	 */
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new LoginScreenViewController());
	}
	
	/**
	 * Gets the display width.
	 * 
	 * @return the displayWidth
	 */
	public static int getDisplayWidth() {
		return DISPLAY_WIDTH;
	}
	
	/**
	 * Gets the display height.
	 * 
	 * @return the displayHeight
	 */
	public static int getDisplayHeight() {
		return DISPLAY_HEIGHT;
	}
	
	/**
	 * Checks if is display is full screen.
	 * 
	 * @return the displayIsFullscreen
	 */
	public static boolean isDisplayIsFullscreen() {
		return DISPLAY_IS_FULLSCREEN;
	}
	
	/**
	 * Gets the display target frame rate.
	 * 
	 * @return the displayTargetFrameRate
	 */
	public static int getDisplayTargetFrameRate() {
		return DISPLAY_TARGET_FRAME_RATE;
	}
	
}
