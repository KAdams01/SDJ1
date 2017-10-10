package exercise13b;

public class Room {
	private int number;
	private Guest guest;
	private Bed bed;

	public Room(int number, String bedType) {
		this.number = number;
		this.bed = new Bed(bedType);
		this.guest = null;
	}

	public int getNumber() {
		return this.number;
	}

	public int getFloor() {
		return this.number / 100;
	}

	public double getPrice() {
		if (this.bed.isSingle()) {
			return 59.50;
		}
		if (this.bed.isDouble()) {
			return 72.40;
		}
		if (this.bed.isKingSize()) {
			return 89.00;
		} else
			return 89.00;
	}

	public boolean isOccupied() {
		if (this.guest == null)
			return false;
		else
			return true;
	}

	public void registerGuest(Guest guest) {
		this.guest = guest;
	}

	public void vacate() {
		this.guest = null;
	}

	public String getBedType() {
		if (this.bed.isSingle())
			return "Single";
		if (this.bed.isDouble())
			return "Double";
		else
			return "King Size";
	}

	public Guest getGuest() {
		return guest;
	}
}