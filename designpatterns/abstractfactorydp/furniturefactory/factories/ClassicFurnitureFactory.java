package abstractfactorydp.furniturefactory.factories;

import abstractfactorydp.furniturefactory.products.Chair;
import abstractfactorydp.furniturefactory.products.ClassicChair;
import abstractfactorydp.furniturefactory.products.ClassicTable;
import abstractfactorydp.furniturefactory.products.Table;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Creating classic chair");
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
