package ExempleBoja.Structurale.Decorator;

public class DecoratorScut extends ADecoratorACME{
    String scut;

    public DecoratorScut(ICaracterACME erou, String scut) {
        super(erou);
        this.scut = scut; //adaugare atribute noi
    }

    @Override
    public void esteAtacat(int puncte) { //modifcare metoda existenta
        System.out.println("Se apara cu un scut "  + scut);
        super.esteAtacat(puncte/2);
    }

    public ICaracterACME eliminaScut(){
        return this.erou;
    }
}
