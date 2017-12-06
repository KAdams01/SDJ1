package exercise13b3;

public class TestPoint {

	public static void main(String[] args) {
		Point one = new Point(3,1);
		System.out.println(one.toString());
		one.moveTo(5, 70);
		System.out.println(one.toString());
		one.move(20, -20);
		System.out.println(one.toString());
	}

}
