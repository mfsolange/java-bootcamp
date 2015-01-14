import java.util.ArrayList;


public class Floor {
	private String specialty;
	private ArrayList <Room> rooms;
	
	public Floor(String specialty){
		this.specialty = specialty;
		rooms = new ArrayList<Room>();
	}
	
	public void addRoom(Room r){
		if(!alreadyExists(r)){
			rooms.add(r);
		}
		else
			System.out.println("Room " + r.getNumber() + " already exists");
	}

	private boolean alreadyExists(Room room) {
		for(Room r : rooms){
			if(r.getNumber()==room.getNumber())
				return true;
		}
		return false;
	}

	public void show() {
		System.out.println("Floor " + specialty);
		for(Room r: rooms)
			r.show();
	}
}
