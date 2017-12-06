package twoDShape;

public class Rectangle extends TwoDimensionalShape{
private double width, height;
public Rectangle(double x, double y, double height, double width) {
	super(x,y);
	this.height=height;
	this.width=width;
}
public double getWidth() {
	return width;
}
public double getHeight() {
	return height;
}
public void setSides(double width, double height) {
	this.width=width;
	this.height=height;
}
public double getArea() {
	return height*width;
}
public String toString() {
	return super.toString() + "\nRectangle\nHeight: " + height + "\nWidth: " + width + "\nArea: " + getArea();
}
}
