package exercise13b3;

public class LineTest {

	public static void main(String[] args) {
		Point pointA = new Point();
		Point pointB = new Point();
		pointA.moveTo(3, 1);
		pointB.moveTo(7, 4);
		Line one = new Line(pointA, pointB, "Blue");
		System.out.println(one);
	}

}
