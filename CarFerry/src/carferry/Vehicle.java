package carferry;

public class Vehicle {
private String licensePlate;
private double weight;

public Vehicle(String licensePlate, double weight) {
	this.licensePlate=licensePlate;
	this.weight=weight;
}
public String getLicensePlate() {
	return this.licensePlate;
}
public double getWeight() {
	return this.weight;
}
public String toString() {
	return "License Plate: " + this.licensePlate + "\nWeight: " + this.weight;
}
public boolean equals(Vehicle other) {
	if (other instanceof Vehicle 
			&& other.licensePlate.equals(this.licensePlate) 
			&& other.weight==this.weight)
		return true;
	else
		return false;
		
}
}
