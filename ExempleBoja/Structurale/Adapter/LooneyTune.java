package ExempleBoja.Structurale.Adapter;

public class LooneyTune extends ACaracterDisney{
    public LooneyTune(String denumire, float nivelEnergie) {
        super(denumire, nivelEnergie);
    }

    @Override
    public void interactioneaza(float energie) {
        System.out.println("Disney: " + denumire);
        this.nivelEnergie -= energie;
    }

    @Override
    public void resetareEnergie() {
        System.out.println("Resetting energy level");
        this.nivelEnergie = 100;
    }
}
