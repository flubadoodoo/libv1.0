/**
 * 
 */
package ui.banner;

import java.awt.Font;

import main.Main;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

import ui.abstractUI.AbstractUI;
import abstractViewController.AbstractViewController;

/**
 * The Class AbstractUIBanner.
 * 
 * @author hamdan
 */
@SuppressWarnings("unchecked")
public abstract class AbstractUIBanner extends AbstractUI {
	
	/** The Constant BANNER_WIDTH. */
	private static final int BANNER_WIDTH;
	
	/** The Constant BANNER_HEIGHT. */
	private static final int BANNER_HEIGHT;
	
	/** The title font. */
	private static UnicodeFont titleFont;
	
	/** The Constant titleFontSize. */
	private static final int titleFontSize;
	
	/** The title. */
	private String title;
	
	static {
		BANNER_WIDTH = Main.getDisplayWidth();
		BANNER_HEIGHT = 100; // set the banner's height to 100 pixels
		
		// initialize the title font
		titleFontSize = 65;
		titleFont = new UnicodeFont(new Font("/ui/text/font/Black.ttf", Font.PLAIN, titleFontSize));
		titleFont.getEffects().add(new ColorEffect(new java.awt.Color(AbstractViewController.getColorSchemeCream()[0], AbstractViewController.getColorSchemeCream()[1], AbstractViewController.getColorSchemeCream()[2])));
		titleFont.addAsciiGlyphs();
		try {
			titleFont.loadGlyphs();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Instantiates a new abstract UI banner.
	 * 
	 */
	public AbstractUIBanner() {
		super(0, 0, AbstractUIBanner.getBannerWidth(), AbstractUIBanner.getBannerHeight());
	}
	
	/**
	 * Draw the banner.
	 * 
	 * @param g
	 *            the graphics context
	 */
	public void drawView(Graphics g) {
		super.prepareContextForDrawing(g);
		drawBackground(g);
		drawTitle(g);
		super.restoreContext(g);
	}
	
	/**
	 * Draw title of the banner.
	 * 
	 * @param g
	 *            the g
	 */
	private void drawTitle(Graphics g) {
		getTitleFont().drawString(10, 10, "Library");
	}
	
	/**
	 * Draw background of the banner.
	 * 
	 * @param g
	 *            the graphics context
	 */
	private void drawBackground(Graphics g) {
		g.setColor(new Color(AbstractViewController.getColorSchemeBlue()[0], AbstractViewController.getColorSchemeBlue()[1], AbstractViewController.getColorSchemeBlue()[2]));
		g.fill(getBounds());
	}
	
	/**
	 * Gets the banner width.
	 * 
	 * @return the bannerWidth
	 */
	public static int getBannerWidth() {
		return BANNER_WIDTH;
	}
	
	/**
	 * Gets the banner height.
	 * 
	 * @return the bannerHeight
	 */
	public static int getBannerHeight() {
		return BANNER_HEIGHT;
	}
	
	/**
	 * Gets the title font.
	 * 
	 * @return the titleFont
	 */
	public static UnicodeFont getTitleFont() {
		return titleFont;
	}
	
	/**
	 * Sets the title font.
	 * 
	 * @param titleFont
	 *            the titleFont to set
	 */
	public static void setTitleFont(UnicodeFont titleFont) {
		AbstractUIBanner.titleFont = titleFont;
	}
	
	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 * 
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
