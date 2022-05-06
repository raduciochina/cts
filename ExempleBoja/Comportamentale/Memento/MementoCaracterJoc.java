package ExempleBoja.Comportamentale.Memento;

public class MementoCaracterJoc {
    String nume;
    int puncteViata;

    public MementoCaracterJoc(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public String getNume() {
        return nume;
    }

    public int getPuncteViata() {
        return puncteViata;
    }
}
