package abstractfactorydp.furniturefactory;

import abstractfactorydp.furniturefactory.factories.FurnitureFactory;
import abstractfactorydp.furniturefactory.products.Chair;
import abstractfactorydp.furniturefactory.products.Table;

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
