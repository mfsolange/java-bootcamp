package Item;

import java.util.ArrayList;

import Cart.Observer;

public abstract class Item implements Subject{
	String name;
	float price;
	ArrayList<Observer> observers;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		doNotify();
	}
	
	public abstract void show();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void doNotify() {
		for(Observer o : observers)
			o.notifyPriceChange(this);
	}
}
