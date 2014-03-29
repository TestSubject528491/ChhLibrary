package chh.math.geo;

/**
 * A cylinder is a prism whose base is a circle.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2014.03.27
 */
public class Cylinder {
    /** The radius of this cylinder. */
	private final double radius;
    /** The height of this cylinder. */
	private final double height;
	
	/** The base face of this cylinder. */
	private final Circle base = new Circle(this.getRadius());
	
	/** 
	 * Creates a new Cylinder object.
	 * @param radius the radius of this cylinder
	 * @param height the height of this cylinder
	 */
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	/**
	 * Returns the radius of this cylinder.
	 * @return the radius of this cylinder
	 */
	public final double getRadius() {
		return this.radius;
	}
	/**
	 * Returns the height of this cylinder.
	 * @return the height of this cylinder
	 */
	public final double getHeight() {
		return this.height;
	}

	/**
	 * Returns the volume of this cylinder.
	 * @return the volume of this cylinder
	 */
	public final double getVolume() {
		return this.base.getArea() * this.getHeight();
	}
	/**
	 * Returns the surface area of this cylinder.
	 * @return the surface area of this cylinder
	 */
	public final double getSurfaceArea() {
		double bottom = this.base.getArea();
		double side = new Rectangle(this.base.getCircumference(), this.getHeight()).getArea();
		return 2 * bottom + side;
	}
}
