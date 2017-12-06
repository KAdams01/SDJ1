package vehicle;

public class Van extends Car {
	private int maxLoad;

	public Van(String theOwner, double thePrice, String regNo, int maxLoad) {
		super(theOwner, thePrice, regNo);
		this.maxLoad = maxLoad;
	}

	public int getMaxLoad() {
		return this.maxLoad;
	}

	@Override
	public String toString() {
		return "Van max load: " + maxLoad + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Van))
			return false;
		Van other = (Van) obj;
		return super.equals(other) && this.maxLoad == other.maxLoad;
	}

}
