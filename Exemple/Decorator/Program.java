package Exemple.Decorator;

public class Program {
    public static void main(String[] args) {
        APizza pizzaVeg = new PizzaVegetariana();
        System.out.println(pizzaVeg.getComponente());
        System.out.println(pizzaVeg.getPret());

        APizza pizzaVegCrown = new DecoratorCrown(pizzaVeg);
        System.out.println(pizzaVegCrown.getComponente());
        System.out.println(pizzaVegCrown.getPret());
    }
}
