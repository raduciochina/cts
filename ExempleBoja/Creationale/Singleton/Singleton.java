package ExempleBoja.Creationale.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance = null;

    //bloc de initializare static - se executa o singura data inainte de a folosi clasa - kinda constructor static al clasei --optional
    static {
        System.out.println("Inainte de a incarca clasa");
    }
    //bloc de initializare - se executa inainte oricarui constructor --optional
    {
        System.out.println("Inainte de creare obiecte");
    }

    //constructor privat
    private Singleton() throws Exception{
        if(instance!=null){
            throw new Exception("Singleton deja creat");
        }
    }

    //metoda publica statica
    public static synchronized Singleton getInstance() throws Exception{
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    //Pt deserializare singleton --optional
    private Object readResolve() throws Exception{
        return Singleton.getInstance();
    }
}
