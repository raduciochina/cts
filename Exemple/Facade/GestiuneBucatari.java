package Exemple.Facade;

import java.util.ArrayList;

public class GestiuneBucatari {
    private ArrayList<Bucatar> listaBucatari;

    public GestiuneBucatari(){
        this.listaBucatari = new ArrayList<>();
    }

    public void addBucatar(Bucatar bucatar){
        this.listaBucatari.add(bucatar);
    }

    public Bucatar getBucatar(int index){
        return this.listaBucatari.get(index);
    }

    public int getNrBucatari(){
        return this.listaBucatari.size();
    }
}
