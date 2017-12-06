package vehicle;

public class Bicycle extends Vehicle {
	private int gears;

	public Bicycle(String theOwner, double price, int numberOfGears) {
		super(theOwner, price);
		this.gears = numberOfGears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return "Number of Gears: " + gears + super.toString() + "]";
	}

}
