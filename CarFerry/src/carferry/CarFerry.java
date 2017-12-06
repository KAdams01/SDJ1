package carferry;

import java.util.ArrayList;

public class CarFerry {
	private String name;
	private double weight;
	private double maxWeight;
	// ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	Vehicle[] vehicles = new Vehicle[10];

	public CarFerry(String name, double weight, double maxWeight) {
		this.name = name;
		this.weight = weight;
		this.maxWeight = maxWeight;
	}

	public void addVehicle(Vehicle vehicle) {
		int count = 0;
		vehicles[count] = vehicle;
		count++;
	}

	// public void addVehicle(Vehicle vehicle) {
	// vehicles.add(vehicle);
	// }
	// public void removeVehicle(Vehicle vehicle) {
	// vehicles.remove(vehicle);
	// }
	// public Vehicle getVehicle(String licensePlate) {
	// Vehicle veh1 = new Vehicle("None", 0);
	// for (int i=0; i<vehicles.size();i++)
	// if (licensePlate.equals(vehicles.get(i).getLicensePlate()))
	// return vehicles.get(i);
	// return veh1;
	// }
	public Vehicle getVehicle(String licensePlate) {
		Vehicle veh1 = new Vehicle("None", 0);
		for (int i = 0; i < vehicles.length - 1; i++) {
			if (licensePlate.equals(vehicles[i].getLicensePlate())) {
				return vehicles[i];
			}
			else return veh1;
		}
		return veh1;
	}
}
