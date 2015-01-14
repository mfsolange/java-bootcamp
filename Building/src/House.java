import java.util.ArrayList;


public class House {
	//A house is a group of rooms, which are connected between them
	
	private ArrayList<Room> rooms;
	
	public House(){
		rooms = new ArrayList<Room>();
	}
	
	public void addRoom(Room r){
		//You can only add a room to a house if all its neighbors are in the house
		//Another approach would be to add all rooms that are not in the house
		if(alreadyExists(r.getName())){
			System.out.println("The room already exists. Change the name.");
		}
		else{
			if(hasRooms(r.getNeighbours()))
				rooms.add(r);
			else
				System.out.println("There are some rooms not included in this house!");
		}
	}
	
	private boolean hasRooms(ArrayList<Room> neighbors){
		//Checks whether all rooms passed through the parameter are included in the house
		for(Room r : neighbors){
			if(!rooms.contains(r))
				return false;
		}
		return true;
	}
	
	private boolean alreadyExists(String name){
		for(Room r : rooms){
			if(r.getName() == name)
				return true;
		}
		return false;
	}
	
	public void showRooms(){
		//A way to show the house, by printing room by room
		for(Room r : rooms)
			r.show();
	}
	
	public ArrayList<Room> getRooms(){
		return rooms;
	}
	
}
