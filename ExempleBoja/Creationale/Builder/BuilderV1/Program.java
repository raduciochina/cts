package ExempleBoja.Creationale.Builder.BuilderV1;

public class Program {
    public static void main(String[] args) {

        SmartDevice device1 = new SmartDevice.SmartDeviceBuilder("13","Apple").adaugaMemorie(new SDCard(64)).build();

        System.out.println(device1.toString());
    }
}
