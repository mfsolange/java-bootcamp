import java.util.ArrayList;


public class Room {
	private String name;
	private ArrayList<Room> neighbors;
	
	public Room(String name){
		//You can build a room just with its name
		this.name = name;
		neighbors = new ArrayList<Room>();
	}
	
	public String getName(){
		return name;
	}
	
	public boolean canEnter(Room r){
		return neighbors.contains(r.getName());
	}
	
	public void addNeighbour(Room r){
		if(!neighbors.contains(r))
			neighbors.add(r);
		else
			System.out.println("Already contains room");
	}

	public void show() {
		//A way to show a room, and all its neighbors
		String s = name + " is neighbour with: ";
		for(Room r : neighbors)
			s += r.getName() + "  ";
		s += "\n";
		System.out.println(s);
	}

	public ArrayList<Room> getNeighbours() {
		return neighbors;
	}
	
	
}
