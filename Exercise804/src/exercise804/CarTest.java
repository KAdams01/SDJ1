package exercise804;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Car car = new Car("","","");
		System.out.println("Please enter the colour of your car: ");
		car.setCarColour(input.nextLine());
		System.out.println("Please enter the name of the car owner: ");
		car.setCarOwner(input.nextLine());
		System.out.println("Please enter the registration of the car: ");
		car.setCarReg(input.nextLine());
		System.out.println("Car Colour: "+car.getCarColour());
		System.out.println("Car Owner: "+car.getCarOwner());
		System.out.println("Car Registration: "+car.getCarReg());
		System.out.println("Car info: "+car.toString());
		input.close();
	}

}
