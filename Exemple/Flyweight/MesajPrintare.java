package Exemple.Flyweight;

public class MesajPrintare {
    private ETipMesaj tipMesaj;
    private String mesajPrintare;

    public MesajPrintare(ETipMesaj tipMesaj){
        this.tipMesaj = tipMesaj;
        System.out.println("S-a creat un mesaj printare de tipul " + this.tipMesaj);
    }

    public ETipMesaj getTipMesaj(){
        return tipMesaj;
    }
}
