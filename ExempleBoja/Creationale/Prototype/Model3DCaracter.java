package ExempleBoja.Creationale.Prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable{
    String nume;
    String fisierModel;

    ArrayList<Integer> puncte;

    public Model3DCaracter(String nume, String fisierModel) throws InterruptedException {
        this.nume = nume;
        this.fisierModel = fisierModel;

        puncte = new ArrayList<>();
        System.out.println("Se incarca modelul 3D pentru " + nume);

        Thread.sleep(2000);

        Random random = new Random();

        for(int i = 0; i < random.nextInt(1000); i++){
            puncte.add(random.nextInt(500));
        }

        System.out.println("Model incarcat.");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFisierModel() {
        return fisierModel;
    }

    public void setFisierModel(String fisierModel) {
        this.fisierModel = fisierModel;
    }

    private Model3DCaracter(){ //mandatory
        nume = "";
        fisierModel = "";
        puncte = null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Model3DCaracter copie = new Model3DCaracter(this.nume, this.fisierModel); -> never do this
        Model3DCaracter copie = new Model3DCaracter();
        copie.nume = this.nume;
        copie.fisierModel = this.fisierModel;
        copie.puncte = (ArrayList<Integer>) this.puncte.clone(); // works like this.

        return copie;
    }
}
