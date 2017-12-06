package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Kevin", 30000);
		Car car1 = new Car(v1.getOwner(), v1.getPrice(), "AB12345");
		Van van1 = new Van(car1.getOwner(), car1.getPrice(), car1.getRegNo(), 10000);
		System.out.println(van1);
		Vehicle veh1 = new Van(null, 0, null, 0);
		System.out.println(veh1);
	}
}