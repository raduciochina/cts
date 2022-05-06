package Exemple.Builder.Varianta2;

public class Program {
    public static void main(String[] args) {
        PetrecereBuilder petrecereBuilder = new PetrecereBuilder();
        Petrecere petrecere = petrecereBuilder.setAreArtificii(true).setNrPersoane(200).build();
        System.out.println(petrecere);
    }
}
