package ExempleBoja.Creationale.Singleton;

public class SingletonV2 {
    //referinta instanta unica
    public static final SingletonV2 instance;

    static {
        instance = new SingletonV2();
    }
    //ctor privat
    private SingletonV2(){

    }
}
