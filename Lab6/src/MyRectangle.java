
public class MyRectangle {
	
	private int startX;
	private int startY;
	private int height;
	private int width;
	
	//Constructor meathods
	public MyRectangle() {
		startX = 0;
		startY = 0;
		width = 0;
		height = 0;
	}
	
	public MyRectangle(int x, int y, int w, int h) {
		this.startX = x;
		this.startY = y;
		this.width = w;
		this.height = h;
	}
	
	//Multiplies width and height and returns the solution for area of a rectangle
	public int area() {
		return width * height;
	}
	
	//Returns a String of the rectangles properties
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	
	//Returns whether or not a given point is in the rectangle
	public boolean isInside(int x, int y) {
		
		if((x > startX) && (x < startX + width)) {
			if((y > startY) && (y < startY + height)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	//Sets the width and height of the rectangle
	public void setSize(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	//Sets the starting x and y position of the rectangle
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}
}
