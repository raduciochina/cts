package Exemple.Facade;

import java.util.ArrayList;

public class GestiuneSali {
    private ArrayList<Sala> listaSali;

    public GestiuneSali(){
        this.listaSali = new ArrayList<>();
    }

    public void addSala(Sala sala){
        this.listaSali.add(sala);
    }
}
