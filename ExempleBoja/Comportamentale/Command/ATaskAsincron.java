package ExempleBoja.Comportamentale.Command;

public abstract class ATaskAsincron {
    String denumireTask;

    public ATaskAsincron(String denumireTask) {
        this.denumireTask = denumireTask;
    }

    public abstract void executaTask(int prioritate);
}
