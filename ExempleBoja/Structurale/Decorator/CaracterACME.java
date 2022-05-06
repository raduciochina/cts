package ExempleBoja.Structurale.Decorator;

public class CaracterACME implements ICaracterACME {
    protected String nume;
    protected int puncteViata;

    public CaracterACME(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getPuncteViata() {
        return this.puncteViata;
    }

    @Override
    public void getDescriere() {
        System.out.println(nume + "-" + puncteViata);
    }

    @Override
    public void esteAtacat(int puncte) {
        System.out.println(nume + " este atacat");
        this.puncteViata -= puncte;
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.println(nume + " se vindeca");
        this.puncteViata += puncte;
    }
}
