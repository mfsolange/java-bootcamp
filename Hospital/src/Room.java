
public class Room {
	//Rooms in hospitals don't communicate with each other, so I don't include a neighbors list.
	private int number;
	private int capacity; // Determines the number of patients it can hold. If it's 0, it means it's an office.
	private int patients = 0;
	
	public Room(int number, int capacity){
		this.number = number;
		this.capacity = capacity;
	}
	
	public int getNumber(){
		return number;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public void addPatient(){
		if(patients < capacity)
			patients++;
		else
			System.out.println("Room " + number + " is full");
	}
	
	public boolean isFull(){
		return (patients == capacity);
	}

	public void show() {
		System.out.println("\tRoom " + number + " has capacity of " + capacity);
	}
}
