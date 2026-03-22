import java.util.*;
public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(Task t) {
        tasks.add(t);
        System.out.println("task added!");
    }

    public void viewTasks() {
        if(tasks.size() == 0)
            System.out.println("no tasks! 😎");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void removeTask(int index) {
        if(index >= 1 && index < tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("task removed!");
        }
        else{ System.out.println("out of bounds ☹️");}
    }

    public void markComplete(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.get(index - 1).setComplete(true);
            System.out.println("Task marked complete!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
