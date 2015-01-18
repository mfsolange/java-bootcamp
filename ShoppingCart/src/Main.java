import java.util.ArrayList;
import java.util.HashMap;

import Cart.Market;
import Cart.ShoppingCart;
import Item.*;
import Payment.*;


public class Main {
	public static void main(String[] args){
		HashMap<Item,Integer> stock = new HashMap<Item,Integer>();
		
		Item i1 = new SingleItem("celular", 2000);		
		Item i2 = new SingleItem("bateria", 500);
		Item i3 = new SingleItem("computadora", 10000);
		
		ArrayList<Item> offerItems = new ArrayList<Item>();
		offerItems.add(i1);
		offerItems.add(i2);
		
		Item o1 = new Offer("celular kit", 2200, offerItems);
		
		stock.put(i1, 25);
		stock.put(i2, 200);
		stock.put(i3, 5);
		stock.put(o1, 5);
		
		Market market = new Market(stock);
		market.showStock();
		
		i1.addObserver(market);
		i2.addObserver(market);
		i3.addObserver(market);
		o1.addObserver(market);
		
		ShoppingCart cart = new ShoppingCart(market);
		cart.addObserver(market);
		
		cart.addItem(i1, 2);
		cart.addItem(o1,1);
		cart.addItem(i3, 5);
		
		cart.showCart();
		
		i1.setPrice(50);
		
		PaymentType payment1 = new CreditCard("Solange",12341234);
		PaymentType payment2 = new PayPal("Solange@Solange.com","hola");
		PaymentType payment3 = new Cash();
		
		payment1.addObserver(market);
		payment2.addObserver(market);
		payment3.addObserver(market);
		
		cart.checkOut(payment1);
		
		cart.checkOut(payment2);
		
		cart.checkOut(payment3);
	}
}
