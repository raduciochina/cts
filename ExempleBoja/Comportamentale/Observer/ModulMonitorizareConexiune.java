package ExempleBoja.Comportamentale.Observer;

import java.util.ArrayList;

public class ModulMonitorizareConexiune { //observabil
    //mandatory
    ArrayList<IStareConexiuneListener> observatori = new ArrayList<>();
    //metode specifice si obligatorii ale observabilului
    public void registerObservator(IStareConexiuneListener listener){
        this.observatori.add(listener);
    }
    public void removeObservator(IStareConexiuneListener listener){
        this.observatori.remove(listener);
    }
    //metoda(e) care lanseaza event-ul si care notifica observatorii
    public void notificareConexiunePierduta(){
        for (IStareConexiuneListener observator : this.observatori) { //trecem prin toata lista de observatori si ii anuntam ca am pierdut conexiunea
            observator.conexiunePierduta(System.currentTimeMillis() + "");
        }
    }
    public void notificareConexiuneActiva(){
        for (IStareConexiuneListener observator : this.observatori) { //trecem prin toata lista de observatori si ii anuntam ca am activat conexiunea
            observator.conexiuneActiva();
        }
    }

    public void add(IStareConexiuneListener listener) {
    }
}
