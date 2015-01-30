package Player;

public class Track {
	private final String name;
	private final String singer;
	private final int year;
	
	public Track(String name, String singer, int year){
		this.name = name;
		this.singer = singer;
		this.year = year;
	}
	
	public void show(){
		System.out.println(name + " - " + singer + " (" + year + ") ");
	}
}
