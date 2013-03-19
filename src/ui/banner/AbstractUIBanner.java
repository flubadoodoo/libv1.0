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
import org.newdawn.slick.geom.Rectangle;

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
	
	private static final int BANNER_BORDER_HEIGHT;
	
	private static final Rectangle BANNER_BORDER_SHAPE;
	
	/** The Constant BANNER_BORDER_COLOR. */
	private static final Color BANNER_BORDER_COLOR;
	
	/** The Constant BANNER_BACK_COLOR. */
	private static final Color BANNER_BACK_COLOR;
	
	/** The Constant BANNER_TITLE_COLOR. */
	private static final Color BANNER_TITLE_COLOR;
	
	/** The title font. */
	private static final UnicodeFont titleFont;
	
	/** The Constant titleFontSize. */
	private static final int titleFontSize;
	
	/** The title. */
	private String title;
	
	static {
		BANNER_WIDTH = Main.getDisplayWidth();
		BANNER_HEIGHT = 100; // set the banner's height to 100 pixels
		BANNER_BORDER_HEIGHT = 5;
		BANNER_BORDER_SHAPE = new Rectangle(0, getBannerHeight() - getBannerBorderHeight(), getBannerWidth(), getBannerBorderHeight());
		
		BANNER_BORDER_COLOR = new Color(AbstractViewController.getColorSchemeBrown());
		BANNER_BACK_COLOR = new Color(AbstractViewController.getColorSchemeBlue());
		BANNER_TITLE_COLOR = new Color(AbstractViewController.getColorSchemeCream());
		
		// initialize the title font
		titleFontSize = 65;
		titleFont = new UnicodeFont(new Font("/ui/text/font/Black.ttf", Font.PLAIN, titleFontSize));
		titleFont.getEffects().add(new ColorEffect(new java.awt.Color(getBannerTitleColor().getRed(), getBannerTitleColor().getGreen(), getBannerTitleColor().getBlue())));
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
		drawBorder(g);
		drawTitle(g);
		super.restoreContext(g);
	}
	
	/**
	 * Draw border.
	 * 
	 * @param g
	 *            the graphics context
	 */
	private void drawBorder(Graphics g) {
		g.setColor(getBannerBorderColor());
		g.fill(getBannerBorderShape());
	}
	
	/**
	 * Draw title of the banner.
	 * 
	 * @param g
	 *            the g
	 */
	private void drawTitle(Graphics g) {
		getTitleFont().drawString(13, 7, "Library");
	}
	
	/**
	 * Draw background of the banner.
	 * 
	 * @param g
	 *            the graphics context
	 */
	private void drawBackground(Graphics g) {
		g.setColor(getBannerBackColor());
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
	
	/**
	 * Gets the banner back color.
	 * 
	 * @return the bannerBackColor
	 */
	public static Color getBannerBackColor() {
		return BANNER_BACK_COLOR;
	}
	
	/**
	 * Gets the banner title color.
	 * 
	 * @return the bannerTitleColor
	 */
	public static Color getBannerTitleColor() {
		return BANNER_TITLE_COLOR;
	}
	
	/**
	 * Gets the titlefont.
	 * 
	 * @return the titlefont
	 */
	public static UnicodeFont getTitlefont() {
		return titleFont;
	}
	
	/**
	 * Gets the titlefontsize.
	 * 
	 * @return the titlefontsize
	 */
	public static int getTitlefontsize() {
		return titleFontSize;
	}
	
	/**
	 * @return the bannerBorderHeight
	 */
	public static int getBannerBorderHeight() {
		return BANNER_BORDER_HEIGHT;
	}
	
	/**
	 * @return the bannerBorderShape
	 */
	public static Rectangle getBannerBorderShape() {
		return BANNER_BORDER_SHAPE;
	}
	
	/**
	 * @return the bannerBorderColor
	 */
	public static Color getBannerBorderColor() {
		return BANNER_BORDER_COLOR;
	}
	
}
