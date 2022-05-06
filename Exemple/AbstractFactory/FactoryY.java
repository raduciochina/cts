package Exemple.AbstractFactory;

public class FactoryY implements IFactory{
    @Override
    public IPizza crearePizza() {
        return new PizzaVegetariana();
    }

    @Override
    public IBurger creareBurger() {
        return new BurgerMac();
    }
}
