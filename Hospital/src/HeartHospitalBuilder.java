import java.util.ArrayList;


public class HeartHospitalBuilder implements Builder{

	private HospitalBuilding hospital;
	
	private ArrayList<Room> rooms;
	private ArrayList<Floor> floors;
	
	public HeartHospitalBuilder() {
		hospital = new HospitalBuilding("Heart Hospital");
		rooms = new ArrayList<Room>();
		floors = new ArrayList<Floor>();
	}
	@Override
	public void createRooms() {
		rooms.add(new Room(100, 0));
		rooms.add(new Room(101, 2));
		rooms.add(new Room(102, 3));
		rooms.add(new Room(103, 1));
		rooms.add(new Room(104, 2));
		rooms.add(new Room(200, 0));
		rooms.add(new Room(201, 1));
		rooms.add(new Room(202, 1));
		rooms.add(new Room(203, 2));
		rooms.add(new Room(204, 2));
		
	}

	@Override
	public void createFloors() {
		Floor f1 = new Floor("simple patients");
		Floor f2 = new Floor("surgery");
		
		for(int i = 0; i < 5; i++){
			f1.addRoom(rooms.get(i));
		}
		for(int i = 5; i < 10; i++){
			f2.addRoom(rooms.get(i));
		}
		
		floors.add(f1);
		floors.add(f2);
		
	}

	@Override
	public void createHospital() {
		for(Floor f:floors)
			hospital.addFloor(f);
	}

	@Override
	public HospitalBuilding getHospital() {
		return hospital;
	}

}
