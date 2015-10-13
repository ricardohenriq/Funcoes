package GoodPracticesExample;

import java.util.List;

/**
 * Created by thiagodurante on 13/10/15.
 */
public class Client {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        List<String> items = inventory.getStock();
        System.out.println(items.size());
    }
}
