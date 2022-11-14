
public class Circle {
	//instance variables
	private double radius = 5.0;
	private String color = "Green";
	
	//Constructors
	public Circle() {
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	//Returns the area of the circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	//getter methods
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	//setters
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	//overriding toString
	public String toString() {
		String output = "Circle\nRadius: " + radius + "\nArea: " + this.getArea() + "\nColor: " + color;
		return output;
	}
}
