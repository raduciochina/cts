package Exemple.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere{ //entitate
    private String data;
    private List<String> listaInvitati;
    private List<Client> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati) {
        super();
        this.data = data;
        this.listaInvitati = listaInvitati;
        this.listaParticipanti=new ArrayList<>();
    }

    @Override
    public void adaugaParticipant(Client cl) { //operatie 1
        this.listaParticipanti.add(cl);
        System.out.println("Clientul " + cl+ " a fost adaugat la petrecere");

    }

    @Override
    public void afisareProgram() { //operatie 2
        // TODO Auto-generated method stub

    }

}
