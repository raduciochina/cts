package ExempleBoja.Comportamentale.Command;

public class Program {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        System.out.println("Jocul se ruleaza fara probleme");
        System.out.println("Lansare auto-save...");
        manager.adaugaTask(new TaskAsincron("Backup", 1000, new ModulBackupDate()));

        System.out.println("Jocul se ruleaza fara probleme");
        System.out.println("Lansare update-forum...");
        manager.adaugaTask(new TaskAsincron("Update Forum", 1000, new ModulUpdateForum()));

        System.out.println("Jocul se ruleaza fara probleme");
        manager.executaTask();
        System.out.println("Jocul ruleaza fara probleme");
        manager.executaTask();

    }
}
