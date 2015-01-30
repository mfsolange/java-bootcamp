package Cart;
import java.util.HashMap;

import Item.Item;

public class Market implements Observer{
	private final HashMap<Item, Integer> stock;
	
	public Market(HashMap<Item,Integer> stock){
		this.stock = stock;
	}
	
	public boolean hasStock(Item item, int count){
		return (stock.get(item) >= count);
	}
	
	public void updateStock(Item item, int count){
		stock.put(item, stock.get(item) + count);
	}
	
	public void showStock(){
		System.out.println("\nThe current stock includes the next items\n");
		for(Item i : stock.keySet())
			i.show();
		System.out.println("\n");
	}

	public void notifyPriceChange(Item item) {
		System.out.println("The market was notified that the price of " + item.getName() + " has changed to " + item.getPrice());
	}

	public void notifyAddingItem() {
		System.out.println("The market was notified that a new item has been added to a shopping cart");
	}

	public void notifyNewTransaction(int ID) {
		System.out.println("The market was notified that there was a new transaction with number " + ID);
	}
}
