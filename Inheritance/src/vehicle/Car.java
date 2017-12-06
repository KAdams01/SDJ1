package vehicle;

public class Car extends Vehicle {
	private String regNo;

	public Car(String theOwner, double thePrice, String regNo) {
		super(theOwner, thePrice);
		this.regNo = regNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	@Override
	public String toString() {
		return "\nRegistration No: " + regNo + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (regNo == null) {
			if (other.regNo != null)
				return false;
		} else if (!regNo.equals(other.regNo))
			return false;
		return true;
	}

}
