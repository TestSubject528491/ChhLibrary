package chh.math.geo;

/**
 * A quadrilateral is a four-sided polygon.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.27
 */
public class Quadrilateral extends Polygon {
	/** One of the four sides lengths of this quadrilateral. */
	private final double a;
	/** One of the four sides lengths of this quadrilateral. */
	private final double b;
	/** One of the four sides lengths of this quadrilateral. */
	private final double c;
	/** One of the four sides lengths of this quadrilateral. */
	private final double d;
	/** 
	 * Creates a new Quadrilateral object.
	 * @param a one of the four side lengths of this quadrilateral
	 * @param b one of the four side lengths of this quadrilateral
	 * @param c one of the four side lengths of this quadrilateral
	 * @param d one of the four side lengths of this quadrilateral
	 */
	public Quadrilateral(double a, double b, double c, double d) {
		super(4);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	/**
	 * Returns the perimeter of this quadrilateral.
	 * @return the perimeter of this quadrilateral.
	 */
	public final double getPerimeter() {
		return this.a + this.b + this.c + this.d;
	}
}
