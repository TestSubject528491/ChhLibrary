package chh.math.geo;

/**
 * A utility class for functions on geometric objects.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.29
 */
public class Geometry {
	/**
	 * Constructs a new Geometry object.
	 */
	private Geometry() {}
	
	/**
	 * Adds two lengths and returns a length.
	 * @param a the first length
	 * @param b the second length
	 * @return a length equal to the sum of a and b
	 */
	public final Length add(Length a, Length b) {
		return new Length(a.getValue() + b.getValue());
	}
	/**
	 * Adds two areas and returns an area.
	 * @param a the first area
	 * @param b the second area
	 * @return an area equal to the sum of a and b
	 */
	public final Area add(Area a, Area b) {
		return new Area(a.getValue() + b.getValue());
	}
	/**
	 * Multiplies two lengths and returns an area.
	 * @param a the first length
	 * @param b the second length
	 * @return an area equal to the product of a and b
	 */	
	public final Area multiply(Length a, Length b) {
		return new Area(a.getValue() * b.getValue());
	}
	/**
	 * Multiplies a length by an area and returns a volume.
	 * @param a the length
	 * @param b the area
	 * @return a volume equal to the product of a and b
	 */	
	public final Volume multiply(Length a, Area b) {
		return new Volume(a.getValue() * b.getValue());
	}
}
