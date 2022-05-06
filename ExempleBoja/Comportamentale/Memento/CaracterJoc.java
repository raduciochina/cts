package ExempleBoja.Comportamentale.Memento;

public class CaracterJoc { // acesta e Originator-ul (obiectul care poate sa salveze starea - nume si puncte viata)
    String nume;
    int puncteViata;

    public CaracterJoc(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public void ataca(String inamic, int puncteAtac){
        System.out.println(this.nume);
    }

    public void esteLovit(int puncte){
        System.out.println("Este lovit cu " + puncte);
    }

    public void seVindecaTotal(){
        this.puncteViata = 1000;
    }

    //functie generatoare de memento
    public MementoCaracterJoc salvare(){
        return new MementoCaracterJoc(this.nume, this.puncteViata);
    }

    public void reincarcaStare(MementoCaracterJoc salvareAnterioara){
        this.nume = salvareAnterioara.getNume();
        this.puncteViata = salvareAnterioara.getPuncteViata();
    }
}
