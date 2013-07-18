package chh;

import chh.util.Number;

/**
 * A Color object represents any 256-bit color that can be displayed in a pixel.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.17
 */
public class Color {
	/** The red component of this color. */
	private final int red;
	/** The green component of this color. */
	private final int green;
	/** The blue component of this color. */
	private final int blue;
	
    /**
     * Constructs a new Color object, given three primary color components.
	 * @param red  the red component of this color. Must be between 0 and 255.
	 * @param green  the green component of this color. Must be between 0 and 255.
	 * @param blue  the blue component of this color. Must be between 0 and 255.
	 */
    public Color(int red, int green, int blue) {
        this.red = (int) Number.bound(red, 0, 255);
		this.green = (int) Number.bound(green, 0, 255);
		this.blue = (int) Number.bound(blue, 0, 255);
    }
	/**
	 * Constructs a new Color, default to black.
	 */
	public Color() {
		this(0,0,0);
	}
	/**
	 * Creates a new color given a hexadecimal code in {@code #RRGGBB} format.
	 * @param hex a six-digit hexadecimal number preceded by a hash symbol ({@code #}), as a String
	 */
	public Color(String hex) {
		this();// FIX THIS
	}
	
	/**
	 * Returns the red component.
	 * @return the red component of this color
	 */
	public final int getRed() {
		return this.red;
	}
	/**
	 * Returns the green component.
	 * @return the green component of this color
	 */
	public final int getGreen() {
		return this.green;
	}
	/**
	 * Returns the blue component.
	 * @return the blue component of this color
	 */
	public final int getBlue() {
		return this.blue;
	}
	/**
	 * Returns the Hue of this color.
	 * @return what "color" this color is
	 */
	public final int getHSV_hue() {
		return 0;// FIX THIS
	}
	/**
	 * Returns the vividness of this color. A lower saturation means the color is closer to white, a higher saturation means the color is more true to its hue.
	 * @return the HSV-version saturation
	 */
	public final double getHSV_sat() {
		return 0;// FIX THIS
	}
	/**
	 * Returns the brightness of this color. A lower value means the color is closer to black, a higher value means the color is more true to its hue.
	 * @return the HSV-version brightness
	 */
	public final double getHSV_val() {
		return 0;// FIX THIS
	}
	/**
	 * Returns the Hue of this color. Same exact value as {@code getHSV_hue()}.
	 * @return {@code this.getHSV_hue();}
	 */
	public final int getHSL_hue() {
		return this.getHSV_hue();
	}
	/**
	 * Returns the amount of "color" in the color. A lower saturation means the color is more grayer, a higher saturation means the color is more colorful.
	 * @return the HSL-version saturation
	 */
	public final int getHSL_sat() {
		return 0;// FIX THIS
	}
	/**
	 * Returns how "light" or "dark" the color is. A lower luminosity means the color is closer to black, a higher luminosity means the color is closer to white.
	 * @return the HSL-version luminosity
	 */
	public final int getHSL_lum() {
		return 0;// FIX THIS
	}
	
	/**
	 * Returns a new Color object, given hue, saturation, and value. The parameters correspond to HSV, *not* HSL. To create a new color with HSL, see the {@code newColorHSL()}  method.
	 * @param hue the "color" of the color. Must be between 0 and 360.
	 * @param saturation the vividness of the color. A lower saturation means the color is closer to white, a higher saturation means the color is more true to its hue. Must be a decimal between 0 and 1.
	 * @param value the brightness of the color. A lower value means the color is closer to black, a higher value means the color is more true to its hue. Must be a decimal between 0 and 1.
	 * @return a new Color object with hsv({@code hue}, {@code sat}, {@code val})
	 */
	public static Color newColorHSV(int hue, double saturation, double value) {
		return new Color();// FIX THIS
	}
	/**
	 * Returns a new Color object, given hue, saturation, and luminosity.
	 * @param hue the "color" of the color. Same as the {@code hue} in HSV. Must be between 0 and 360.
	 * @param saturation the amount of "color" in the color. A lower saturation means the color is more grayer, a higher saturation means the color is more colorful. <em>Not</em> the same as {@code saturation} in HSV. Must be a decimal between 0 and 1.
	 * @param luminosity how "light" or "dark" the color is. A lower luminosity means the color is closer to black, a higher luminosity means the color is closer to white. Must be a decimal between 0 and 1.
	 * @return a new Color object with hsl({@code hue}, {@code sat}, {@code lum})
	 */
	public static Color newColorHSL(int hue, double saturation, double luminosity) {
		return new Color();// FIX THIS
	}
}
