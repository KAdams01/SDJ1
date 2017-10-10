package exercise13b;

public class HotelTest {

	public static void main(String[] args) {
		Room room = new Room(801, "Single");
		Guest guest1 = new Guest("Kevin");
		System.out.println(room.isOccupied());
		room.registerGuest(guest1);
		System.out.println(room.isOccupied());
		room.vacate();
		System.out.println(room.isOccupied());
	}

}
