package behaviourial.iterator.iterator;

import behaviourial.iterator.inventory.AmazonInventory;
import behaviourial.iterator.products.Product;

import java.util.Iterator;

public class AmazonProductIterator implements ProductIterator {
    private final AmazonInventory amazonInventory;
    private final Iterator<Product> productsIterator;
    public AmazonProductIterator(AmazonInventory amazonInventory) {
        this.amazonInventory = amazonInventory;
        this.productsIterator = amazonInventory.getProducts().iterator();
    }

    @Override
    public boolean hasNext() {
        return productsIterator.hasNext();
    }

    @Override
    public Product next() {
        if(!productsIterator.hasNext()) {
            throw new RuntimeException("You have seen all the products. Hooray!");
        }
        return productsIterator.next();
    }
}
