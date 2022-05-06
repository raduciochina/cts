package Exemple.AbstractFactory;

public class Program {
    public static void main(String[] args) {
        IFactory factory = new FactoryX();

        IPizza pizza = factory.crearePizza();
        IBurger burger = factory.creareBurger();

        pizza.afisare();
        burger.afisare();
        System.out.println("--------------------------------------");
        IFactory factory1 = new FactoryY();

        IPizza pizza1 = factory1.crearePizza();
        IBurger burger1 = factory1.creareBurger();

        pizza1.afisare();
        burger1.afisare();

    }
}
