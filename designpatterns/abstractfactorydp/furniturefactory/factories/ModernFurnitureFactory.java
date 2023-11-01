package abstractfactorydp.furniturefactory.factories;

import abstractfactorydp.furniturefactory.products.Chair;
import abstractfactorydp.furniturefactory.products.ModernChair;
import abstractfactorydp.furniturefactory.products.ModernTable;
import abstractfactorydp.furniturefactory.products.Table;

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
