package Cart;
import java.util.ArrayList;
import java.util.HashMap;

import Item.Item;
import Item.SingleItem;
import Item.Subject;
import Payment.PaymentType;


public class ShoppingCart implements Subject{
	private HashMap<Item, Integer> cart;
	private final Market market;
	private ArrayList<Observer> observers;
	
	public ShoppingCart(Market market){
		cart = new HashMap<Item, Integer>();
		observers = new ArrayList<Observer>();
		this.market = market;
	}
	
	public void addItem(Item i1, int count){
		if(market.hasStock(i1, count)){
			if(cart.containsKey(i1))
				cart.put(i1, count + cart.get(i1)); 
			else
				cart.put(i1, count);
			market.updateStock(i1,count);
			doNotify();
		}
		else
			throw new RuntimeException("There is no stock for the item " + i1.getName());
	}
	
	public void removeItem(SingleItem item, int count){
		if(cart.containsKey(item)){
			if(cart.get(item) <= count){
				count = cart.get(item);
				cart.remove(item);
			}
			else
				cart.put(item, cart.get(item) - count);
			
			market.updateStock(item, count*-1);
		}
	}
	
	public void checkOut(PaymentType payment){
		payment.pay(cart);
		System.out.println("Thanks for your purchase!\n");
	}

	public void showCart(){
		System.out.println("\n\nYour shopping cart contains:\n");
		for(Item i : cart.keySet()){
			i.show();
			System.out.println("\t\tQuantity: " + cart.get(i));
		}
		System.out.println("\n");

	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void doNotify() {
		for(Observer o : observers)
			o.notifyAddingItem();
	}

}
