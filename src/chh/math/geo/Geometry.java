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
	 * @return a length equal to the sum of both lengths
	 */
	public static final Length add(Length a, Length b) {
		return new Length(a.getValue() + b.getValue());
	}
	/**
	 * Adds an array of lengths and returns a length.
	 * @param arr the array of lengths to add
	 * @return a length equal to the sum of all the lengths in the array
	 */
	public static final Length add(Length[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getValue();
		}
		return new Length(sum);
	}
	/**
	 * Adds two areas and returns an area.
	 * @param a the first area
	 * @param b the second area
	 * @return an area equal to the sum of both areas
	 */
	public static final Area add(Area a, Area b) {
		return new Area(a.getValue() + b.getValue());
	}
	/**
	 * Adds an array of areas and returns an area.
	 * @param arr the array of areas to add
	 * @return an area equal to the sum of all the areas in the array
	 */
	public static final Area add(Area[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getValue();
		}
		return new Area(sum);
	}
	/**
	 * Multiplies two lengths and returns an area.
	 * @param a the first length
	 * @param b the second length
	 * @return an area equal to the product of a and b
	 */	
	public static final Area multiply(Length a, Length b) {
		return new Area(a.getValue() * b.getValue());
	}
	/**
	 * Multiplies a length by an area and returns a volume.
	 * @param a the length
	 * @param b the area
	 * @return a volume equal to the product of both lengths
	 */	
	public static final Volume multiply(Length a, Area b) {
		return new Volume(a.getValue() * b.getValue());
	}
	/**
	 * Multiplies an area by a length and returns a volume.
	 * Equivalent to {@see multiply(Length, Area)}.
	 * @param a the area
	 * @param b the length
	 * @return a volume equal to the product of a and b
	 */	
	public static final Volume multiply(Area a, Length b) {
		return Geometry.multiply(b, a);
	}
	/**
	 * Returns a scale factor of a given length.
	 * @param a the length to be scaled.
	 * @param k the factor by which to scale
	 * @return the product of the length and the scale factor
	 */
	public static final Length scale(Length a, double k) {
		return new Length(a.getValue() * k);
	}
	/**
	 * Returns a scale factor of a given area.
	 * @param a the area to be scaled.
	 * @param k the factor by which to scale
	 * @return the product of the area and the scale factor
	 */
	public static final Area scale(Area a, double k) {
		return new Area(a.getValue() * k);
	}
}
