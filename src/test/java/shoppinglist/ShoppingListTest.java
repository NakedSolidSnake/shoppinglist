package shoppinglist;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import shoppinglist.domain.Item;
import shoppinglist.domain.ShoppingList;

public class ShoppingListTest {

    @Test
    public void addTwoItensAndVerifyTotal() {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(new Item("banana", 3.04, 4.0, false));
        shoppingList.add(new Item("apple", 3.67, 2.0, false));
        Assertions.assertEquals(19.5, shoppingList.getTotal());
    }

    @Test
    public void verifyWrongTotal() {
        ShoppingList shoppingList = new ShoppingList();
        Assertions.assertNotEquals(1.0, shoppingList.getTotal());
    }
    
    @Test
    public void tryRemoveItemFromEmptyList() {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.remove(null);
        
    }
        
    @Test
    public void tryAddNullItem() throws NullPointerException {
        assertThrows(NullPointerException.class, new Executable() {

            public void execute() throws Throwable {
                  ShoppingList shoppingList = new ShoppingList();
                  shoppingList.add(null);
            }
        });
    }   
}
