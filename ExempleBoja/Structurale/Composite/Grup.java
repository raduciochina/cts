package ExempleBoja.Structurale.Composite;

import java.util.ArrayList;

public class Grup extends NodAbstract{ //clasa structura/composite

    ArrayList<NodAbstract> noduri = new ArrayList<>(); //colectie de noduri frunza

    public Grup(String nume) {
        super(nume);
    }

    @Override
    public void ataca(String inamic) { //aici facem override deoarece are sens metoda la nivel de grup
        for (NodAbstract nod:
             noduri) {
            nod.ataca(inamic);
        }
    }

    @Override
    public void seApara() {
        for (NodAbstract nod :
                noduri) {
            if(nod instanceof CaracterJoc){ //important
                nod.seApara();
            }
        }
    }

    @Override
    public void seVindeca(int puncte) {
        throw new UnsupportedOperationException(); //deoarece nu are sens aceasta metoda la nivelul clasei acestea (grupului)
    }

    @Override
    public void adauga(NodAbstract nod) {
        this.noduri.add(nod);
    }

    @Override
    public void sterge(int index) {
        if(index >= 0 && index < this.noduri.size()){
            this.noduri.remove(index);
        }
    }

    @Override
    public NodAbstract getNod(String nume) {
        NodAbstract referinta = null;
        for(NodAbstract nod : noduri)
            if(nod.nume.equals(nume))
                referinta = nod;
        return referinta;
    }
}
