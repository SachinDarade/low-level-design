package behaviourial.iterator.inventory;

import behaviourial.iterator.iterator.ProductIterator;

public interface Inventory {
    public ProductIterator createIterator();
}
