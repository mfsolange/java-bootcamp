package Payment;

import java.util.HashMap;

import Item.Item;

public class CreditCard extends PaymentType{

	private final String name;
	private final int cardNumber;
	private int transactionID;
	
	public CreditCard(String name, int cardNumber){
		this.name = name;
		this.cardNumber = cardNumber;
	}
	

	protected float calculateTotal(HashMap<Item,Integer> cart) {
		float total = 0;
		for(Item i : cart.keySet()){
			total += i.getPrice() * cart.get(i);
		}
		return (float) (total* 0.9) ;
	}
	

}
