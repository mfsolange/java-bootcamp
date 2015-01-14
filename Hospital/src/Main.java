
public class Main {

	public static void main(String[] args) {
		
		Builder builder = new HeartHospitalBuilder();
		HospitalDirector director = new HospitalDirector(builder);
		director.constructHospital();
		HospitalBuilding hospital = director.getHospital();
		
		hospital.show();
	}
}
