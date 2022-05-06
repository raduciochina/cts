package ExempleBoja.Structurale.Decorator;

public class Program {
    public static void main(String[] args) {

        //Decorator
        ICaracterACME superman = new CaracterACME("Superman", 1000);
        ICaracterACME batman = new CaracterACME("Batman", 1000);

        superman.getDescriere();
        superman.esteAtacat(200);
        superman.getDescriere();

        DecoratorScut supermanCuScut = new DecoratorScut(superman, "metalic");
        supermanCuScut.esteAtacat(200);
        supermanCuScut.getDescriere();

        DecoratorRanitCritic batmanCuAlerta = new DecoratorRanitCritic(batman);
        batmanCuAlerta.esteAtacat(950);
        batmanCuAlerta.getDescriere();

        //apelare in cascada
        DecoratorRanitCritic supermanCuScutSiCuAlerta = new DecoratorRanitCritic(supermanCuScut);
        supermanCuScutSiCuAlerta.esteAtacat(1300);
        supermanCuScutSiCuAlerta.getDescriere();

    }
}
