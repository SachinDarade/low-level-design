package creational.abstractfactory.furniturefactory.factories;

import creational.abstractfactory.furniturefactory.products.Chair;
import creational.abstractfactory.furniturefactory.products.ModernChair;
import creational.abstractfactory.furniturefactory.products.ModernTable;
import creational.abstractfactory.furniturefactory.products.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Creating modern chair");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
