package Payment;

import java.util.HashMap;

import Item.Item;

public class Cash extends PaymentType{

	protected float calculateTotal(HashMap<Item, Integer> cart) {
		float max = 0;
		float total = 0;
		for(Item i : cart.keySet()){
			total += i.getPrice() * cart.get(i);
			if(i.getPrice() > max)
				max = i.getPrice();
		}
		return (float) (total - max*0.9);
	}



}
