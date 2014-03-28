package chh.math.geo;

/**
 * A circle is the set of points equidistant from a point.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.27
 */
public class Circle {
	/** The radius of this circle. */
	private final double radius;

	/** 
	 * Creates a new Circle object.
	 * @param r the radius of this circle
	 */
	public Circle(double r) {
		this.radius = r;
	}
	
	/**
	 * Returns the radius of this circle.
	 * @return the radius of this circle
	 */
	public final double getRadius() {
		return this.radius;
	}
	
	/**
	 * Returns the circumference of this circle.
	 * @return the circumference of this circle.
	 */
	public final double getCircumference() {
		return 2 * Math.PI * this.getRadius();
	}
	/**
	 * Returns the area of this circle.
	 * @return the area of this circle
	 */
	public final double getArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}
}
