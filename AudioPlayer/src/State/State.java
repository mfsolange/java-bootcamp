package State;
import Player.MusicPlayer;


public interface State {
	public void next(MusicPlayer player);
	public void back(MusicPlayer player);
	public void show();
}
