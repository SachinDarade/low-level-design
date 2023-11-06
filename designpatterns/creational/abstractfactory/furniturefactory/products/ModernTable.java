package creational.abstractfactory.furniturefactory.products;

public class ModernTable implements Table {

    @Override
    public void material() {
        System.out.println("I'm a modern table made of glass");
    }
}
