package ExempleBoja.Structurale.Composite;

public abstract class NodAbstract {
    String nume;

    public NodAbstract(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    //metode specifice caracterelor din joc
    public abstract void ataca(String inamic);
    public abstract void seApara();
    public abstract void seVindeca(int puncte);

    //metode specifice grupurilor
    public abstract void adauga(NodAbstract nod);
    public abstract void sterge(int index);
    public abstract NodAbstract getNod(String nume);

}
