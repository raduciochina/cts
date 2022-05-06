package Exemple.Builder.Varianta1;

public class Program {
    public static void main(String[] args) {
        PetrecereBuilder petrecereBuilder = new PetrecereBuilder();
        Petrecere petrecere = petrecereBuilder.setAreArtificii(true).setNrPersoane(24).setAreTort(true).build();
        System.out.println(petrecere);
    }
}
