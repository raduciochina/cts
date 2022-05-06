package ExempleBoja.Structurale.Composite;

public class Program {
    public static void main(String[] args) {
        //Composite
        CaracterJoc superman = new CaracterJoc("Superman");
        CaracterJoc batman = new CaracterJoc("Batman");

        Grup echipa1 = new Grup("Red-Team");
        echipa1.adauga(batman);
        echipa1.adauga(superman);

        Grup echipa2 = new Grup("Super-Team");
        echipa2.adauga(echipa1);
        echipa2.adauga(new CaracterJoc("Catwoman"));

        echipa2.ataca("Joker");
        echipa2.seApara();
        echipa2.getNod("Catwoman").seVindeca(100);

    }
}
