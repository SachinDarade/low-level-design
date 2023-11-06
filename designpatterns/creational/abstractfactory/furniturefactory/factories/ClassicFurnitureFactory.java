package creational.abstractfactory.furniturefactory.factories;

import creational.abstractfactory.furniturefactory.products.Chair;
import creational.abstractfactory.furniturefactory.products.ClassicChair;
import creational.abstractfactory.furniturefactory.products.ClassicTable;
import creational.abstractfactory.furniturefactory.products.Table;

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
