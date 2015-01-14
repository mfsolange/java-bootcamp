
public class HospitalDirector {
	private Builder builder;
	
	public HospitalDirector(Builder builder){
		this.builder = builder;
	}
	
	public void constructHospital(){
		builder.createRooms();
		builder.createFloors();
		builder.createHospital();
	}
	
	public HospitalBuilding getHospital(){
		return builder.getHospital();
	}
}
