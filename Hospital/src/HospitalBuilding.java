import java.util.ArrayList;


public class HospitalBuilding {
	private String name;
	private ArrayList <Floor> floors;
	
	public HospitalBuilding(String name){
		this.name = name;
		floors = new ArrayList<Floor>();
	}
	
	public void addFloor(Floor f){
		floors.add(f);
	}

	public void show() {
		System.out.println(name + "\n");
		for(Floor f: floors)
			f.show();
	}
}
