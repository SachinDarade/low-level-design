package abstractfactorydp.furniturefactory.factories;

import abstractfactorydp.furniturefactory.products.Chair;
import abstractfactorydp.furniturefactory.products.Table;

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
