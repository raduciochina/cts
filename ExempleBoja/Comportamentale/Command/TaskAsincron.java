package ExempleBoja.Comportamentale.Command;

public class TaskAsincron extends ATaskAsincron{
    //stare specifica task-ului
    float timeout;
    //referinta catre executant
    IModuleJoc modul;

    public TaskAsincron(String denumireTask, float timeout, IModuleJoc modulExecutant) {
        super(denumireTask);
        this.timeout = timeout;
        this.modul = modulExecutant;
    }

    @Override
    public void executaTask(int prioritate) {
        this.modul.executaActiune();
    }
}
