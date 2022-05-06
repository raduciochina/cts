package Exemple.Builder.Varianta3;

public class Program {
    public static void main(String[] args) {
        Petrecere petrecere = Petrecere.builder().setAreArtificii(true).setNrPersoane(125).build();
        System.out.println(petrecere);

    }
}
