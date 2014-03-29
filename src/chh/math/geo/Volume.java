package chh.math.geo;

/**
 * A wrapper class representing a three-dimensional measurement. Values may be {@code double}s.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.29
 */
public class Volume {
	/** The value of this volume. */
	private final double value;
	/**
	 * Constructs a new Volume object.
	 * @param x the volume
	 */
	public Volume(double x) {
		this.value = x;
	}

	/**
	 * Returns the value of this volume.
	 * @return the value of this volume.
	 */
	public final double getValue() {
		return this.value;
	}
}
