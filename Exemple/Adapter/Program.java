package Exemple.Adapter;

public class Program {
    public static void main(String[] args) {
        int[] costEvenimente = new int[]{1000,2000,3000,4000,5000};
        Client client = new Client("Dorel", 5, costEvenimente);
        IEvaluareClientFirmaB evaluareClientB = new AdaptorEvaluareClient();
        evaluareClientB.analizaClientFirmaB(client);
    }
}
