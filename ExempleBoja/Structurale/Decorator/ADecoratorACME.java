package ExempleBoja.Structurale.Decorator;

public abstract class ADecoratorACME implements ICaracterACME {
    ICaracterACME erou;

    public ADecoratorACME(ICaracterACME erou) { //musai acest constructor
        this.erou = erou;
    }

    //implementare metodele din interfata caracter acme - chiar daca nu esti obligat

    @Override
    public String getNume() {
        return erou.getNume();
    }

    @Override
    public int getPuncteViata() {
        return erou.getPuncteViata();
    }

    @Override
    public void getDescriere() {
        erou.getDescriere();
    }

    @Override
    public void esteAtacat(int puncte) {
        erou.esteAtacat(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        erou.seVindeca(puncte);
    }

}
