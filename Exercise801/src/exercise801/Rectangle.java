package exercise801;

public class Rectangle {

	private double length;
	private double width;
	
	
	public void setWidth(double w) {
		width=w;
	}
	public void setLength(double len) {
		length=len;
	}
	public Rectangle(double len, double w) {
		width=w;
		length=len;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return length*width;
	}

}