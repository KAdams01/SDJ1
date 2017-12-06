package twoDShape;

public class Triangle extends TwoDimensionalShape{
	private double sideA, sideB, sideC;
	
	public Triangle(double x, double y, double sideA, double sideB, double sideC)
	{
		super(x,y);
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}
	public double getSideA() {
		return sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSides(double sideA, double sideB, double sideC) {
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}
	public double getArea() {
		double angleC;
		angleC = Math.acos((sideA*sideA + sideB*sideB - sideC*sideC)/(2*sideA*sideB));
		return 0.5*sideA*sideB*Math.sin(angleC);
	}
	public String toString() {
		return super.toString() + "\nTriangle\nSide one: " + sideA + "\nSide two: " + sideB + "\nSide three: " + sideC + "\nArea: " + getArea();
	}
}
