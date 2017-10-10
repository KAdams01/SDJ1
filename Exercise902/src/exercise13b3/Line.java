package exercise13b3;

public class Line {
	private String colour;
	private Point pointA, pointB;

	public Line(Point pointA, Point pointB, String colour) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.colour = colour;
	}

	public Line(Point pointA, Point pointB) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.colour = "Not defined";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public double getLength() {
		return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) + (Math.pow(pointA.getY() - pointB.getY(), 2)));
	}

	public String toString() {
		return "A " + this.colour + " line from (" + pointA.getX() + "," + pointB.getX() + ") " + "to (" + pointA.getY()
				+ "," + pointB.getY() + ") with a length equal to " + getLength();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Line))
			return false;
		Line other = (Line) obj;
		return colour.equals(other.colour) 
				&& pointA.getX() == pointB.getX() 
				&& pointA.getY() == pointB.getY();
	}
}
