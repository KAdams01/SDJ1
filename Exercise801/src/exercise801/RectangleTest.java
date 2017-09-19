package exercise801;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,10);
		r.setLength(10);
		r.setWidth(10);
		
		System.out.println("Length = "+r.getLength());
		System.out.println("Width = "+r.getWidth());
		System.out.println("Area = "+r.getArea());
		
		r.setLength(20);
		r.setWidth(10);
		System.out.println("Length = "+r.getLength());
		System.out.println("Width = "+r.getWidth());
		System.out.println("Area = "+r.getArea());

	}

}
