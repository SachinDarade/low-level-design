package behaviourial.iterator;

import behaviourial.iterator.inventory.AmazonInventory;
import behaviourial.iterator.iterator.ProductIterator;
import behaviourial.iterator.products.ElectronicsProduct;
import behaviourial.iterator.products.HouseHoldProduct;

/**
 * Creates an amazon inventory and then iterates through the items printing their costs
 */
public class ClientApplication {
    public static void main(String[] args) {
        // Initialize inventory
        AmazonInventory amazonInventory = new AmazonInventory();
        amazonInventory.addProduct(new HouseHoldProduct("Harpic", "129.00"));
        amazonInventory.addProduct(new ElectronicsProduct("Macbook Pro", "1290.00"));
        ProductIterator productsProductIterator = amazonInventory.createIterator();
        while(productsProductIterator.hasNext()) {
            System.out.println(productsProductIterator.next().getName());
        }
    }

}
