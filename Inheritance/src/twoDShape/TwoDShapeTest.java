package twoDShape;

public class TwoDShapeTest {

	public static void main(String[] args) {
		TwoDimensionalShape[] shape1 = new TwoDimensionalShape[3];
		shape1[0] = new Circle(1,2,5);
		shape1[1] = new Rectangle(0,0,2,2);
		shape1[2] = new Triangle(0,0,2,4,5);
		
		for (int i = 0; i<shape1.length; i++)
			System.out.println(shape1[i].toString());

	}

}
