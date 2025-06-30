import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    // Add task
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();

                    if (task.trim().isEmpty()) {
                        System.out.println("⚠️ Task cannot be empty.");
                    } else {
                        tasks.add(task);
                        System.out.println("✅ Task added.");
                    }
                    break;

                case 2:
                    // View tasks
                    System.out.println("\n📝 Your Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    // Remove task
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer

                    if (removeIndex > 0 && removeIndex <= tasks.size()) {
                        String removedTask = tasks.remove(removeIndex - 1);
                        System.out.println("🗑️ Task removed: " + removedTask);
                    } else {
                        System.out.println("⚠️ Invalid task number.");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("👋 Exiting To-Do List. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid option. Try again.");
            }
        }
    }
}
// This is a simple To-Do List application in Java.
// It allows users to add, view, and remove tasks from their list.