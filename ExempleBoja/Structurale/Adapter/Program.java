package ExempleBoja.Structurale.Adapter;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        //fara adapter
        ArrayList<ICaracterACME> eroi = new ArrayList<>();
        eroi.add(new CaracterACME("Superman",1000));
        eroi.add(new CaracterACME("Batman", 890));

        for (ICaracterACME erou : eroi) {
            erou.getDescriere();
            erou.esteAtacat(10);
        }

        ACaracterDisney tweety = new LooneyTune("Tweety", 200);
        ArrayList<ACaracterDisney> caractereDisney = new ArrayList<>();
        caractereDisney.add(tweety);

        //cu adapter
        //eroi.add(tweety) - scopul adaptorului
        AdaptorDisney2ACME adaptorTweety = new AdaptorDisney2ACME(tweety); //obiect disney ascuns intr-o cutie acme
        eroi.add(adaptorTweety);
        System.out.println("-------------------------------------");
        for (ICaracterACME erou : eroi) {
            erou.getDescriere();
            erou.esteAtacat(10);
        }

    }
}
