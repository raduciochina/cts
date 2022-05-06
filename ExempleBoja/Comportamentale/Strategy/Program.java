package ExempleBoja.Comportamentale.Strategy;

public class Program {
    public static void main(String[] args) {

        ModulPuncteBonus modulPuncteBonus = new ModulPuncteBonus(new StrategieFixa());

        int puncte = modulPuncteBonus.getPuncteBonusJucator("Gigel", 1000);
        System.out.println("Gigel a primit " + puncte);

        //modificare strategie
        modulPuncteBonus.setStrategieCurenta(new StrategieRandom());

        puncte = modulPuncteBonus.getPuncteBonusJucator("Gigel", 1000);
        System.out.println("Gigel a primit " + puncte + " de puncte");

        modulPuncteBonus.setStrategieCurenta(new ICalculPuncteBonus() {
            @Override
            public int getPuncteBonus() {
                return 10000;
            }
        });

        puncte = modulPuncteBonus.getPuncteBonusJucator("Gigel", 1000);
        System.out.println("Gigel a primit " + puncte);
    }
}
