package exercise13b3;

public class Circle {
	private double radius;
	private Point centerPoint;

	public Circle(double radius, Point centerPoint) {
		this.radius = radius;
		this.centerPoint = centerPoint;
	}

	public double getRadius() {
		return radius;
	}

	public Point getCenterPoint() {
		return centerPoint;
	}

	public double getArea() {
		return (Math.PI * this.radius) * (Math.PI * this.radius);
	}

	public void moveTo(Point centerPoint) {
		this.centerPoint.moveTo(centerPoint.getX(), centerPoint.getY());
	}

	public String toString() {
		return centerPoint.toString();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		return centerPoint.getX() == other.centerPoint.getX() 
				&& centerPoint.getY() == other.centerPoint.getY();
	}
}
