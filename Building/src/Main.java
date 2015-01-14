
public class Main {

	public static void main(String[] args) {
	
		Builder builder = new StudentApartmentBuilder();
		HouseDirector director = new HouseDirector(builder);
		director.constructHouse();
		House house = director.getHouse();
		
		house.showRooms();
	}

}
