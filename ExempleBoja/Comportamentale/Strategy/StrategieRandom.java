package ExempleBoja.Comportamentale.Strategy;

import java.util.Random;

public class StrategieRandom implements ICalculPuncteBonus{
    @Override
    public int getPuncteBonus() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
