package Exemple.Composite;

public class Program {
    public static void main(String[] args) {
        //definire nivel 0 de arborescenta
        Structura structuraMeniu = new Structura("Meniu restaurant");

        Meniu meniu = new Meniu(structuraMeniu, "Restaurant ANNA");

        //definire nivel 1 de arborescenta
        Structura structuraBauturi = new Structura("Bauturi");
        Structura structuraMancare = new Structura("Mancare");
        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraMancare);

        //definire noduri nivel 2 de arborescenta (Bauturi)
        structuraBauturi.adaugaNod(new Produs("Coca-Cola", 10));
        structuraBauturi.adaugaNod(new Produs("Sprite",10));

        //definire noduri nivel 2 de arborescenta (Mancare)
        Structura structuraMancarePizza = new Structura("Pizza");
        Structura structuraMancareBurger = new Structura("Burger");
        structuraMancare.adaugaNod(structuraMancareBurger);
        structuraMancare.adaugaNod(structuraMancarePizza);

        //definire noduri nivel 3 de arborescenta (Mancare-Pizza)
        structuraMancarePizza.adaugaNod(new Produs("Pizza Anna", 26));
        structuraMancarePizza.adaugaNod(new Produs("Pizza Capriciosa", 24));

        //definire noduri nivel 3 de arborescenta (Mancare-Burger)
        structuraMancareBurger.adaugaNod(new Produs("Burger Angus", 36));
        structuraMancareBurger.adaugaNod(new Produs("Burger Pui", 28));

        //afisare structura meniu
        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());
    }
}
