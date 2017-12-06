package carferry;

public class CarFerryTest {

	public static void main(String[] args) {
		CarFerry ferry1 = new CarFerry("Kathrine", 10000, 20000);
		Vehicle veh1 = new Vehicle("1234", 700);
		Vehicle veh2 = new Vehicle("2345",600);
		ferry1.addVehicle(veh1);
		System.out.println(ferry1.getVehicle("124"));
		ferry1.addVehicle(veh2);
		System.out.println(ferry1.getVehicle("2345"));
	}

}
