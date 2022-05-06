package Exemple.Decorator;

public class DecoratorCrown extends ADecoratorPizza{
    public DecoratorCrown(APizza pizza) {
        super(pizza);
    }

    @Override
    String getComponente() {
        return super.getComponente() + ", blat crown";
    }

    @Override
    int getPret() {
        return super.getPret() + 5;
    }
}
