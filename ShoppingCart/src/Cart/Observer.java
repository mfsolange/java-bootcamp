package Cart;

import Item.Item;

public interface Observer {
	public void notifyPriceChange(Item item);
	public void notifyAddingItem();
	public void notifyNewTransaction(int ID);
}
