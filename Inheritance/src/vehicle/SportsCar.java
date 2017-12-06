package vehicle;

public class SportsCar extends Car {
	private int maxVelocity;

	public SportsCar(String theOwner, double thePrice, String regNo, int maxVelocity) {
		super(theOwner, thePrice, regNo);
		this.maxVelocity = maxVelocity;
	}

	public int getMaxVelocity() {
		return this.maxVelocity;
	}

	@Override
	public String toString() {
		return "Sportscar max speed: " + maxVelocity + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportsCar other = (SportsCar) obj;
		if (maxVelocity != other.maxVelocity)
			return false;
		return true;
	}

}
