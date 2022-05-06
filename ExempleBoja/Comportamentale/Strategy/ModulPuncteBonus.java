package ExempleBoja.Comportamentale.Strategy;

public class ModulPuncteBonus { //cel care acorda punctele

    ICalculPuncteBonus strategieCurenta = null;

    //optional
    public ModulPuncteBonus(ICalculPuncteBonus strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void setStrategieCurenta(ICalculPuncteBonus strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public int getPuncteBonusJucator(String nume, int timpJoc){
        if(strategieCurenta != null){
            return strategieCurenta.getPuncteBonus(); //delegarea/callback/suna un prieten
        }
        else{
            throw new UnsupportedOperationException();
        }
    }

}
