package ExempleBoja.Structurale.Flyweight;

import java.util.Random;

public class Program {
    public static void main(String[] args) {

        //fara Flyweight

//        FlyweightModel3D copac1 = new FlyweightModel3D("copac.img", "Copac");
//        FlyweightModel3D copac2 = new FlyweightModel3D("copac.img", "Copac");
//        FlyweightModel3D copac3 = new FlyweightModel3D("copac.img", "Copac");

        //cu Flyweight

        FlyweightModel3D copac1 = (FlyweightModel3D) FactoryFlyweight.getModel3D(TipModel3D.COPAC);
        FlyweightModel3D copac2 = (FlyweightModel3D) FactoryFlyweight.getModel3D(TipModel3D.COPAC);
        FlyweightModel3D copac3 = (FlyweightModel3D) FactoryFlyweight.getModel3D(TipModel3D.COPAC);

        Random random = new Random();
        String[] culori = new String[] {"rosu", "verde", "albastru"};

        copac1.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(100), culori[random.nextInt(3)]));
        copac2.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(100), culori[random.nextInt(3)]));
        copac3.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(100), culori[random.nextInt(3)]));



    }
}
