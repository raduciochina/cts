package Exemple.AbstractFactory;

public class FactoryX implements IFactory{
    @Override
    public IPizza crearePizza() {
        return new PizzaRoma();
    }

    @Override
    public IBurger creareBurger() {
        return new BurgerKing();
    }
}
