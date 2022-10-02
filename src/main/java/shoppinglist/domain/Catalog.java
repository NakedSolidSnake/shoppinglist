package shoppinglist.domain;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	private List <ShoppingList> shoppingLists = new ArrayList<ShoppingList>();
	
	public void add (ShoppingList list) {
		shoppingLists.add(list);
	}
	
	public void remove (ShoppingList shoppingList) {
		shoppingLists.remove(shoppingList);
	}
}
