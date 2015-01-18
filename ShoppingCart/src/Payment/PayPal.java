package Payment;

import java.util.HashMap;

import Item.Item;

public class PayPal extends PaymentType{
	private final String email;
	private final String password;
	
	public PayPal(String email, String password){
		this.email = email;
		this.password = password;
	}

	protected float calculateTotal(HashMap<Item, Integer> cart) {
		float min = Float.MAX_VALUE;
		float total = 0;
		for(Item i : cart.keySet()){
			total += i.getPrice() * cart.get(i);
			if(i.getPrice() < min)
				min = i.getPrice();
		}
		return total - min;
	}
}
