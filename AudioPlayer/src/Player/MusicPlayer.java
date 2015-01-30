package Player;
import java.util.List;

import State.State;


public class MusicPlayer {
	private final List<Track> music;
	private int currentTrack = 0;
	private State state;
	
	public MusicPlayer(List<Track> music){
		this.music = music;
		state = null;
	}
	
	public void next(){
		state.next(this);
	}
	
	public void back() {
		state.back(this);	
	}
	
	public void showCurrentTrack(){
		music.get(currentTrack).show();
	}
	
	public void setState(State state){
		this.state = state;
		state.show();
	}
	
	public void setCurrentTrack(int i){
		if(i>= 0 && i < music.size())
			currentTrack = i;
		else
			throw new RuntimeException("track not available");
	}

	public int getCurrentTrack() {
		return currentTrack;
	}

	public List<Track> getMusic() {
		return music;
	}

	
}
