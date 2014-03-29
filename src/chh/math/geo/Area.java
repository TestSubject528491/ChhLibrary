package chh.math.geo;

/**
 * A wrapper class representing a two-dimensional measurement. Values may be {@code double}s.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.29
 */
public class Area {
	/** The value of this area. */
	private final double value;
	/**
	 * Constructs a new Area object.
	 * @param x the area
	 */
	public Area(double x) {
		this.value = x;
	}

	/**
	 * Returns the value of this area.
	 * @return the value of this area.
	 */
	public final double getValue() {
		return this.value;
	}
}
