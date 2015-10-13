package BadPracticesExample;

import java.util.*;

/**
 * Created by thiagodurante on 13/10/15.
 */
public class Inventory {

    // No null keys or values
    // synchronized
    // Product name and quantity
    private Hashtable<String, Integer> items;

    public Inventory() {
        items = new Hashtable<String, Integer>();
        //initializeInventory();
    }

    public List<String> getStock(){
        List<String> stock = new ArrayList<String>();
        Enumeration keys = items.keys();
        while(keys.hasMoreElements()){
            Object value = keys.nextElement();
            if(items.get(value) != 0){
                stock.add((String) value);
            }
        }
        if(stock.size() == 0){
            return null;
        } else {
            return stock;
        }
    }

    private void initializeInventory(){
        // Add items to the inventory
        items.put("Shirt", 10);
        items.put("Spoon", 3);
        items.put("Table", 1);
        items.put("Bike", 0);
    }
}
