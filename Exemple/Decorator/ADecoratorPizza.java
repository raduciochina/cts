package Exemple.Decorator;

public class ADecoratorPizza extends APizza{
    protected APizza pizza;
    public ADecoratorPizza(APizza pizza){
        this.pizza = pizza;
    }
    @Override
    String getComponente() {
        return pizza.getComponente();
    }

    @Override
    int getPret() {
        return pizza.getPret();
    }
}
