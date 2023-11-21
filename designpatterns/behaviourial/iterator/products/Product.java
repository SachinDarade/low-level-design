package behaviourial.iterator.products;

public abstract class Product {
    private final String name;
    private final String price;

    protected Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
