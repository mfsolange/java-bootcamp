package Item;

import java.util.ArrayList;

import Cart.Observer;

public class SingleItem extends Item{
	
	public SingleItem(String name, float price){
		observers = new ArrayList<Observer>();
		this.name = name;
		this.price = price;
	}

	public void show() {
		System.out.println(name + "......... $" + price);
	}
	
}
