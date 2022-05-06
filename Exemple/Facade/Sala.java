package Exemple.Facade;

public class Sala {
    private String denumire;
    private int nrMinParticipanti;
    private int nrMaxParticipanti;

    public Sala(String denumire, int nrMinParticipanti, int nrMaxParticipanti) {
        this.denumire = denumire;
        this.nrMinParticipanti = nrMinParticipanti;
        this.nrMaxParticipanti = nrMaxParticipanti;
    }
}
