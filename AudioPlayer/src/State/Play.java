package State;

import Player.MusicPlayer;

public class Play implements State{

	public void show() {
		System.out.println("You are playing right now");
	}

	@Override
	public void next(MusicPlayer player) {
		int currentTrack = player.getCurrentTrack() +1;
		if(currentTrack == player.getMusic().size())
			currentTrack = 0;
		player.setCurrentTrack(currentTrack);
		System.out.println("You are now listening to:");
		player.showCurrentTrack();
	}

	@Override
	public void back(MusicPlayer player) {
		int currentTrack = player.getCurrentTrack() -1;
		if(currentTrack < 0)
			currentTrack = player.getMusic().size() - 1;
		player.setCurrentTrack(currentTrack);
		System.out.println("You are now listening to:");
		player.showCurrentTrack();
	}

}
