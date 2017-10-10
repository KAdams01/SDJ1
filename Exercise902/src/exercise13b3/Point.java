package exercise13b3;

public class Point {
	private double x,y;

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
		this.x=this.x+xDistance;
		this.y=this.y+yDistance;
	}
	public Point copy() {
		Point point=new Point();
		return point;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
}
