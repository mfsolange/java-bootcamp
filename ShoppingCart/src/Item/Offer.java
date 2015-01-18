package Item;

import java.util.ArrayList;
import java.util.List;

import Cart.Observer;

public class Offer extends Item{

	List<Item> items;
	public Offer(String name, float price, List<Item> items) {
		observers = new ArrayList<Observer>();
		this.items = items;
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println(name + "......... $" + price);
		for(Item i : items){
			System.out.print("\t\t");
			i.show();
		}
	}

	

}
