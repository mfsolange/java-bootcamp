package State;

import Player.MusicPlayer;

public class Pause implements State{


	public void show() {
		System.out.println("The music is paused right now");
	}

	@Override
	public void next(MusicPlayer player) {
		int currentTrack = player.getCurrentTrack() +1;
		if(currentTrack == player.getMusic().size())
			currentTrack = 0;
		player.setCurrentTrack(currentTrack);
		System.out.println("You are going to listen to:");
		player.showCurrentTrack();
	}

	@Override
	public void back(MusicPlayer player) {
		int currentTrack = player.getCurrentTrack() -1;
		if(currentTrack < 0)
			currentTrack = player.getMusic().size() - 1;
		player.setCurrentTrack(currentTrack);
		System.out.println("You are going to listen to:");
		player.showCurrentTrack();
	}

}
