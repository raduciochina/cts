package ExempleBoja.Comportamentale.Command;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<ATaskAsincron> taskuri = new ArrayList<>();

    public void adaugaTask(ATaskAsincron task){
        taskuri.add(task);
    }
    public void executaTask(){
        if(this.taskuri.size() > 0) {
            ATaskAsincron task = taskuri.get(0);
            taskuri.remove(0);
            task.executaTask(1000);
        }
    }
}
