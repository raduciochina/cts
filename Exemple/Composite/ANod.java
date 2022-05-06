package Exemple.Composite;

public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getPret();

    public String getInfo(){
        return this.getDenumire() + " " + this.getPret();
    }

    public void adaugaNod(ANod nod){
        throw new UnsupportedOperationException();
    }
    public void eliminaNod(ANod nod){
        throw new UnsupportedOperationException();
    }
    public ANod getNod(int i){
        throw new UnsupportedOperationException();
    }
}
