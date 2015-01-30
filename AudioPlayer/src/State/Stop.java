package State;

import Player.MusicPlayer;

public class Stop implements State{

	public void show() {
		System.out.println("You have stopped listening to your music");
	}

	@Override
	public void next(MusicPlayer player) {
		player.setCurrentTrack(0);
		System.out.println("You cannot change your current track");
	}

	@Override
	public void back(MusicPlayer player) {
		player.setCurrentTrack(0);
		System.out.println("You cannot change your current track");
	}

}
