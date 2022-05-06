package ExempleBoja.Comportamentale.Observer;

public class Program {
    public static void main(String[] args) {
        //Observer
        ModulMonitorizareConexiune monitorizareConexiune = new ModulMonitorizareConexiune();
        monitorizareConexiune.notificareConexiunePierduta();
        monitorizareConexiune.notificareConexiuneActiva();
        System.out.println("---------------------------------------");
        ModulInterfataJucator interfataJucator = new ModulInterfataJucator();
        ModulStareJoc stareJoc = new ModulStareJoc();
        //abonare observatori
        monitorizareConexiune.registerObservator(interfataJucator);
        monitorizareConexiune.registerObservator(stareJoc);
        monitorizareConexiune.notificareConexiunePierduta();
        monitorizareConexiune.notificareConexiuneActiva();
        System.out.println("---------------------------------------");
        monitorizareConexiune.removeObservator(stareJoc);
        monitorizareConexiune.notificareConexiunePierduta();
        System.out.println("---------------------------------------");

        //exemplu observator anonim (prin clasa anonima)
        monitorizareConexiune.registerObservator(new IStareConexiuneListener() {
            @Override
            public void conexiunePierduta(String timestamp) {
                System.out.println("Aprinde led rosu");
            }

            @Override
            public void conexiuneActiva() {
                System.out.println("Aprinde led verde");
            }
        });
        monitorizareConexiune.notificareConexiunePierduta();
    }
}
