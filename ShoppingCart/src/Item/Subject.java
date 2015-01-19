package Item;

import Cart.Observer;

public interface Subject {
	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void doNotify();
}
