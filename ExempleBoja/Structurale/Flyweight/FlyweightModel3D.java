package ExempleBoja.Structurale.Flyweight;

import java.util.ArrayList;
import java.util.Random;

public class FlyweightModel3D implements IFlyweightModel3D{ //poate fi clasa de baza pentru familia de flyweight-uri

    //starea permanenta
    String fisierModel;
    String numeModel;
    ArrayList<Integer> puncte;

    //starea temporara este data de detalii (X, Y si culoarea)

    public FlyweightModel3D(String fisierModel, String numeModel) {
        this.fisierModel = fisierModel;
        this.numeModel = numeModel;

        //generare puncte
        Random random = new Random();
        this.puncte = new ArrayList<>(random.nextInt(1000));

        System.out.println("Generare model pentru " + numeModel);
    }

    @Override
    public void afisareEcran(DetaliiAfisareEcran detaliiAfisareEcran) {
        System.out.println("Afisare model 3D pentru " + numeModel);
        System.out.println("Numarul de puncte: " + this.puncte.size());
        System.out.println(String.format("Coordonate X = %d, Y = %d. Culoare = %s", detaliiAfisareEcran.X, detaliiAfisareEcran.Y, detaliiAfisareEcran.culoare));
    }
}
