package chh.math.geo;

/**
 * A rectangular prism is a polyhedron that has 6 faces, each of which is a 
 * rectangle and that intersect at right angles.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.27
 */
public class RectPrism {
    /** The length of this prism. */
	private final double length;
    /** The width of this prism. */
	private final double width;
    /** The height of this prism. */
	private final double height;
	
	/** The base face of this prism. */
	private final Rectangle Base = new Rectangle(this.getLength(), this.getWidth());
	
	/** 
	 * Creates a new RectPrism object.
	 * @param length the length of this prism
	 * @param width the width of this prism
	 * @param height the height of this prism
	 */
	public RectPrism(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Returns the length of this prism.
	 * @return the length of this prism
	 */
	public final double getLength() {
		return this.length;
	}
	/**
	 * Returns the width of this prism.
	 * @return the width of this prism
	 */
	public final double getWidth() {
		return this.width;
	}
	/**
	 * Returns the height of this prism.
	 * @return the height of this prism
	 */
	public final double getHeight() {
		return this.height;
	}

	/**
	 * Returns the volume of this prism.
	 * @return the volume of this prism
	 */
	public final double getVolume() {
		return this.Base.getArea() * this.getHeight();
	}
	/**
	 * Returns the surface area of this prism.
	 * @return the surface area of this prism
	 */
	public final double getSurfaceArea() {
		Rectangle lw = new Rectangle(this.getLength(), this.getWidth());
		Rectangle lh = new Rectangle(this.getLength(), this.getHeight());
		Rectangle wh = new Rectangle(this.getWidth(), this.getHeight());
		return 2 * (lw.getArea() + lh.getArea() + wh.getArea());
	}
}
