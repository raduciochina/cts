package ExempleBoja.Structurale.Composite;

public class CaracterJoc extends NodAbstract{ //nod frunza


    public CaracterJoc(String nume) {
        super(nume);
    }

    @Override
    public void ataca(String inamic) {
        System.out.println(this.nume + " ataca pe " + inamic);
    }

    @Override
    public void seApara() {
        System.out.println(this.nume + " se apara");
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.println(this.nume + " se vindeca");
    }

    //suntem obligati sa avem aceste 3 metode aici
    //varianta 1
    @Override
    public void adauga(NodAbstract nod) {
       throw new UnsupportedOperationException(); // aruncam exceptie ptc nu are sens metoda la nivelul acestei clase
    }

    @Override
    public void sterge(int index) {
        throw new UnsupportedOperationException(); // aruncam exceptie ptc nu are sens metoda la nivelul acestei clase
    }

    @Override
    public NodAbstract getNod(String nume) {
        throw new UnsupportedOperationException(); // aruncam exceptie ptc nu are sens metoda la nivelul acestei clase
    }
}
