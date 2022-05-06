package Exemple.Decorator;

public class PizzaVegetariana extends APizza{
    @Override
    String getComponente() {
        return "blat, sos rosii, ciuperci, ceapa, ardei";
    }

    @Override
    int getPret() {
        return 20;
    }
}
