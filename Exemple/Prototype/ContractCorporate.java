package Exemple.Prototype;

import java.util.ArrayList;

public class ContractCorporate extends AContract{
    public ContractCorporate(){
        System.out.println("Incarcare contract corporate...");
        //preluare date din baza de date - proces consumator de timp
        listaClauze = new ArrayList<>();
        listaClauze.add("Clauza 1");
        listaClauze.add("Clauza 2");
        this.tip = "corporate";
    }

    @Override
    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }
    @Override
    public AContract clone() {
        AContract clone = super.clone();
        clone.listaClauze = new ArrayList<>();
        for(int i=0; i<this.listaClauze.size(); i++){
            clone.listaClauze.add(this.listaClauze.get(i));
        }

        return clone;
    }

}
