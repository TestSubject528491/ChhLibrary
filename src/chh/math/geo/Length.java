package chh.math.geo;

/**
 * A wrapper class representing a one-dimensional measurement. Values may be {@code double}s.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.29
 */
public class Length {
	/** The value of this length. */
	private final double value;
	/**
	 * Constructs a new Length object.
	 * @param x the length
	 */
	public Length(double x) {
		this.value = x;
	}

	/**
	 * Returns the value of this length.
	 * @return the value of this length.
	 */
	public final double getValue() {
		return this.value;
	}
}
