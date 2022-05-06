package ExempleBoja.Structurale.Decorator;

public class DecoratorRanitCritic extends ADecoratorACME{
    public DecoratorRanitCritic(ICaracterACME erou) {
        super(erou);
    }

    @Override
    public void esteAtacat(int puncte) {
        super.esteAtacat(puncte);
        if(this.erou.getPuncteViata() < 100){
            System.out.println("Atenite! Erou ranit critic");
        }
    }
}
