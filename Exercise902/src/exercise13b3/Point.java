package exercise13b3;

public class Point {
	private double x,y;

	public Point (double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	public void moveTo(double newX, double newY) {
		this.x=newX;
		this.y=newY;
	}
	public void move(double xDistance, double yDistance) {
		this.x+=xDistance;
		this.y+=yDistance;
	}
	public Point copy() {
		return new Point(x,y);
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	public boolean equals(Point point2) {
		if(point2 instanceof Point && this.x == point2.getX() && this.y == point2.getY())
			return true;
		else
			return false;
	}
}
