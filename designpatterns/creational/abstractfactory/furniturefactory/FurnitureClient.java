package creational.abstractfactory.furniturefactory;

import creational.abstractfactory.furniturefactory.factories.FurnitureFactory;
import creational.abstractfactory.furniturefactory.products.Chair;
import creational.abstractfactory.furniturefactory.products.Table;

// This is inspired by example here
// https://refactoring.guru/design-patterns/abstract-factory
public class FurnitureClient {
    public static void main(String[] args) {
        FurnitureFactory classicFactory = FurnitureFactory.createFactory("Classic");
        FurnitureFactory modernFactory = FurnitureFactory.createFactory("Modern");
        Chair classicChair = classicFactory.createChair();
        classicChair.printInfo();
        Table modernTable = modernFactory.createTable();
        modernTable.material();
    }
}
