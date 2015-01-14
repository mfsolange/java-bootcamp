
public class HouseDirector {
	private Builder builder;
	
	public HouseDirector(Builder builder){
		this.builder = builder;
	}
	
	public void constructHouse(){
		builder.addRooms();
	}
	
	public House getHouse(){
		return builder.getHouse();
	}
}
