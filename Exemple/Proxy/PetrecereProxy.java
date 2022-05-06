package Exemple.Proxy;

public class PetrecereProxy implements IPetrecere{ //proxy

    private Petrecere petrecere; //referinta la entitate

    public PetrecereProxy(Petrecere petrecere) {
        this.petrecere = petrecere;
    }


    @Override
    public void adaugaParticipant(Client cl) { //operatie 1
        if(cl.getVarsta()>=18){
            petrecere.adaugaParticipant(cl);
        }
        else{
            System.out.println("Clientul " +cl.getNume() + " nu are varsta minima de 18 ani");
        }
    }

    @Override
    public void afisareProgram() {
        this.petrecere.afisareProgram();
    } //operatie 2
}
