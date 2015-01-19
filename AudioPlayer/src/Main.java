import java.util.ArrayList;

import Player.*;
import State.*;


public class Main {
	public static void main(String[] args){
		ArrayList<Track> music = new ArrayList<Track>();
		music.add(new Track("Inevitable", "Shakira", 1998));
		music.add(new Track("Wonderwall", "Oasis", 1995));
		music.add(new Track("Te amo", "Fito Paez", 2014));
		
		MusicPlayer player = new MusicPlayer(music);
		
		State play = new Play();
		State pause = new Pause();
		State stop = new Stop();
		
		player.setState(play);
		
		player.showCurrentTrack();
		player.next();
		
		player.setState(pause);
		player.next();
		player.back();
		
		player.setState(stop);
		player.back();
		
	}
}
