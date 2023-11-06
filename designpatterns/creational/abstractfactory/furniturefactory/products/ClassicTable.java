package creational.abstractfactory.furniturefactory.products;

public class ClassicTable implements Table {
    @Override
    public void material() {
        System.out.println("I'm classic table made of durable wood");
    }
}
