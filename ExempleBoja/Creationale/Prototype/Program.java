package ExempleBoja.Creationale.Prototype;

public class Program {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        // fara Prototype
//        Model3DCaracter soldat1 = new Model3DCaracter("Private Ryan", "soldat.3d");
//        Model3DCaracter soldat2 = new Model3DCaracter("Sergent Bob", "soldat.3d");
//        Model3DCaracter soldat3 = new Model3DCaracter("G.I Joe", "soldat.3d");

        // cu Prototype
        Model3DCaracter soldatGeneric = new Model3DCaracter("Soldat", "soldat.3d");

        Model3DCaracter soldat1 = (Model3DCaracter) soldatGeneric.clone();
        soldat1.setNume("Plutionier Dorel");
        Model3DCaracter soldat2 = (Model3DCaracter) soldatGeneric.clone();
        soldat2.setNume("Capitan Vlad");
        Model3DCaracter soldat3 = (Model3DCaracter) soldatGeneric.clone();
        soldat3.setNume("Locotent Popescu");
        System.out.println("Caractere generate.");
    }
}
