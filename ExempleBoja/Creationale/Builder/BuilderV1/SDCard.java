package ExempleBoja.Creationale.Builder.BuilderV1;

public class SDCard implements InterfataExternalMemory{
    private int capacitate;

    public SDCard(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "SDCard{" +
                "capacitate=" + capacitate +
                '}';
    }
}
