package ExempleBoja.Structurale.Flyweight;


import java.util.HashMap;

public class FactoryFlyweight {
    private static HashMap<TipModel3D, IFlyweightModel3D> modele3D = new HashMap<>();

    //versoime eager instantiation
//    static { // un fel de constructor static al clasei
//        getModel3D(TipModel3D.COPAC);
//        getModel3D(TipModel3D.SOLDAT);
//        getModel3D(TipModel3D.STANCA);
//    }

    public static IFlyweightModel3D getModel3D(TipModel3D tip){
        //versiune lazy instantiation - amanam crearea modelelor pana in momentul in care avem nevoie de ele
        IFlyweightModel3D model = modele3D.get(tip);

        if(model == null){ //daca modelul nu exista cream unul nou
            switch (tip){
                case COPAC:
                    model = new FlyweightModel3D("copac.img", "Copac");
                    break;
                case STANCA:
                    model = new FlyweightModel3D("stanca.img", "Stanca");
                    break;
                case SOLDAT:
                    model = new FlyweightModel3D("soldat.img", "Soldat");
                    break;
                default:
                    throw new UnsupportedOperationException();
            }

            modele3D.put(tip, model); //important
        }

        return model;

    }

}
