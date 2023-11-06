package creational.abstractfactory.furniturefactory.products;

public class ClassicChair implements Chair {
    @Override
    public void printInfo() {
        System.out.println("I'm a Dracula inspired chair");
    }
}
