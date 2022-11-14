
public final class Cylinder extends Circle {
	//instance variables
	private double height = 1.0;
	
	//constructors
	public Cylinder() {
		super();
	}
	
	public Cylinder(double r, double h) {
		super(r);
		this.height = h;
	}
	
	public Cylinder(double r, double h, String c) {
		super(r, c);
		this.height = h;
	}
	
	//returns the volume of the cylinder
	public double getArea() {
		return (super.getArea() * height) + (2 * Math.PI * super.getRadius() + height);
	}
	
	
	//getters
	public double getHeight() {
		return height;
	}
	
	
	//setters
	public void setHeight(double h) {
		this.height = h;
	}
	
	//overriding toString
	public String toString() {
		String output = "Cylinder\nRadius: " + super.getRadius() + "\nHeight: " + height + "\nArea: " + this.getArea() + "\nColor: " + super.getColor();
		return output;
	}
}
