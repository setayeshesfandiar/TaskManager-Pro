
import java.util.ArrayList;

public class Project {
    String name;
    String description;
    ArrayList<Task> tasks = new ArrayList<>();

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
