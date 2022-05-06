package Exemple.Facade;

public class Facade {
    public static boolean verificaDisponibilitateBucatari(int nrBucatari, String data) {
        GestiuneBucatari bucatari = new GestiuneBucatari();
        int contor = 0;
        for(int i = 0; i<bucatari.getNrBucatari(); i++){
            if(bucatari.getBucatar(i).verificaDisponibilitate(data))
                contor++;
        if(contor >= nrBucatari)
            return true;
        }
        return false;
    }

}
