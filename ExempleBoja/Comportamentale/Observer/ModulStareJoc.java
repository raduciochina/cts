package ExempleBoja.Comportamentale.Observer;

public class ModulStareJoc implements IStareConexiuneListener{//observatorul 2
    @Override
    public void conexiunePierduta(String timestamp) {
        System.out.println("Salvare stare curenta joc.");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Restaurare stare curenta joc.");

    }
}
