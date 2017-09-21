package exercise804;

public class Car {
	private String carColour;
	private String carOwner;
	private String carReg;
	
	public Car(String cC, String cO, String cR) {
		carColour=cC;
		carOwner=cO;
		carReg=cR;		
	}
	public void setCarColour(String cC) {
		carColour=cC;
	}
	public void setCarOwner(String cO) {
		carOwner=cO;
	}
	public void setCarReg(String cR) {
		carReg=cR;
	}
	public String getCarColour() {
		return carColour;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public String getCarReg() {
		return carReg;
	}
	public String toString() {
		return carColour + " " + carOwner + " " + carReg;
	}
	
}
