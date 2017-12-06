package exercise13b3;

public class LineTest {

	public static void main(String[] args) {
		Point pointA = new Point(3,1);
		Point pointB = new Point(7,4);
		Line one = new Line(pointA, pointB, "Blue");
		System.out.println(one);
	}
}
