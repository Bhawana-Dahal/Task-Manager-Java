import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager m = new TaskManager();

        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Mark Complete");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Task name: ");
                String name = input.nextLine();

                System.out.print("Due date: ");
                String due = input.nextLine();

                System.out.print("Priority: ");
                int priority = input.nextInt();
                input.nextLine(); // clear buffer

                Task t = new Task(name, due, priority);
                m.addTask(t);

            } else if (choice == 2) {
                m.viewTasks();

            } else if (choice == 3) {
                m.viewTasks();
                System.out.print("Enter task number to remove: ");
                int num = input.nextInt();
                input.nextLine();

                m.removeTask(num);

            } else if (choice == 4) {
                m.viewTasks();
                System.out.print("Enter task number to mark complete: ");
                int num = input.nextInt();
                input.nextLine();

                m.markComplete(num);

            } else if (choice == 5) {
                running = false;
                System.out.println("Bye bye!");

            } else {
                System.out.println("Invalid choice! ");
            }
        }
    }
}
