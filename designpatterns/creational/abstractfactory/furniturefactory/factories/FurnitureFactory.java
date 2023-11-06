package creational.abstractfactory.furniturefactory.factories;

import creational.abstractfactory.furniturefactory.products.Chair;
import creational.abstractfactory.furniturefactory.products.Table;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();

    public static FurnitureFactory createFactory(String factoryType) {
        if("Classic".equalsIgnoreCase(factoryType)) {
            return new ClassicFurnitureFactory();
        } else if ("Modern".equalsIgnoreCase(factoryType)) {
            return new ModernFurnitureFactory();
        }
        throw new RuntimeException("This factory is not supported");
    }
}
