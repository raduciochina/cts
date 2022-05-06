package ExempleBoja.Structurale.Adapter;


public class AdaptorDisney2ACME implements ICaracterACME { //adaptam disney la acme deoarece noi avem deja acme - clasa wrapper
    ACaracterDisney caracter; //referinta la obiectul pe care vrem sa-l adaptam

    public AdaptorDisney2ACME(ACaracterDisney caracter) { //neaparat constructor pt a evita null pointer exception
        super();
        this.caracter = caracter;
    }

    //daca e nev folosesti caracter.metoda
    @Override
    public String getNume() {
        return caracter.getDenumire();
    }

    @Override
    public int getPuncteViata() {
        return (int) caracter.getNivelEnergie();
    }

    @Override
    public void getDescriere() {
        System.out.println(caracter.getDenumire() + " - " + caracter.getNivelEnergie());
    }

    @Override
    public void esteAtacat(int puncte) {
        caracter.interactioneaza(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        caracter.resetareEnergie();
    }
}
