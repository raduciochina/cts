package Exemple.Composite;

import java.util.ArrayList;

public class Structura extends ANod{
    ArrayList<ANod> structura = new ArrayList<>();
    String numeStructura;

    public Structura(String numeStructura){
        this.numeStructura = numeStructura;
    }

    @Override
    public String getInfo() {
        String info = "";
        info += this.numeStructura + "\n";
        for(ANod n : structura){
            info += " " + n.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod nod) {
        structura.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        structura.remove(nod);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }
}
