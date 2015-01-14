import java.util.ArrayList;


public class StudentApartmentBuilder implements Builder {

	private House house;
	
	public StudentApartmentBuilder(){
		house = new House();
	}
	@Override
	public void addRooms() {
		Room r1 = new Room("Kitchen/LivingRoom");
		Room r2 = new Room("Bedroom");
		Room r3 = new Room("Bathroom");
		Room r4 = new Room("SmallPatio");
		
		r1.addNeighbour(r2);
		r1.addNeighbour(r3);
		r1.addNeighbour(r4);
		
		r2.addNeighbour(r4);
		
		house.addRoom(r4);
		house.addRoom(r3);
		house.addRoom(r2);
		house.addRoom(r1);
	}

	@Override
	public House getHouse() {
		return house;
	}

}
