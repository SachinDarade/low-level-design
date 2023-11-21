package behaviourial.iterator.inventory;

import behaviourial.iterator.iterator.AmazonProductIterator;
import behaviourial.iterator.iterator.ProductIterator;
import behaviourial.iterator.products.Product;

import java.util.LinkedList;
import java.util.List;

public class AmazonInventory implements Inventory {
    private final List<Product> products;

    public AmazonInventory(List<Product> products) {
        this.products = products;
    }

    public AmazonInventory() {
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public ProductIterator createIterator() {
        return new AmazonProductIterator(this);
    }
}
