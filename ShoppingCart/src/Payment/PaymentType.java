package Payment;

import java.util.ArrayList;
import java.util.HashMap;

import Cart.Observer;
import Item.Item;
import Item.Subject;

public abstract class PaymentType implements Subject{
	
	protected ArrayList<Observer> observers = new ArrayList<Observer>();
	
	protected static int counter = 0;
	
	public void pay(HashMap<Item,Integer> cart) {
		counter++;
		float total = calculateTotal(cart);
		System.out.println("Payment complete\nYour total was: $" + total + "\nYour transaction number is " + counter);
		doNotify();
		
	}
	
	protected abstract float calculateTotal(HashMap<Item,Integer> cart);
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void doNotify() {
		for(Observer o : observers)
			o.notifyNewTransaction(counter);
	}
}
