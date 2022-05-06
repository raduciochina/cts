package ExempleBoja.Comportamentale.Observer;

public class ModulInterfataJucator implements IStareConexiuneListener{ //observatorul 1
    @Override
    public void conexiunePierduta(String timestamp) {
        System.out.println("Alerta! Conexiune pierduta la " + timestamp);
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Conexiune activa");
    }
}
