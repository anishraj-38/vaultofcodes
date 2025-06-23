package MiniProject;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {

        static ArrayList<String> tasks = new ArrayList<>();
        static ArrayList<Boolean> completed = new ArrayList<>();

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- TO-DO LIST MENU ---");
                System.out.println("1. Add Task");
                System.out.println("2. Delete Task");
                System.out.println("3. Update Task");
                System.out.println("4. Display Tasks");
                System.out.println("5. Mark Task as Complete");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        addTask(sc);
                        break;
                    case 2:
                        deleteTask(sc);
                        break;
                    case 3:
                        updateTask(sc);
                        break;
                    case 4:
                        displayTasks();
                        break;
                    case 5:
                        markTaskAsComplete(sc);
                        break;
                    case 6:
                        System.out.println("Exiting To-Do List App. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 6);

            sc.close();
        }

        public static void addTask(Scanner sc) {
            System.out.print("Enter task to add: ");
            String task = sc.nextLine();
            tasks.add(task);
            completed.add(false);
            System.out.println("Task added successfully!");
        }

        public static void deleteTask(Scanner sc) {
            displayTasks();
            System.out.print("Enter task number to delete: ");
            int index = sc.nextInt();
            if (index >= 1 && index <= tasks.size()) {
                tasks.remove(index - 1);
                completed.remove(index - 1);
                System.out.println("Task deleted successfully!");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        public static void updateTask(Scanner sc) {
            displayTasks();
            System.out.print("Enter task number to update: ");
            int index = sc.nextInt();

            if (index >= 1 && index <= tasks.size()) {
                System.out.print("Enter new task description: ");
                String newTask = sc.nextLine();
                tasks.set(index - 1, newTask);
                System.out.println("Task updated successfully!");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        public static void displayTasks() {
            System.out.println("\n--- TO-DO LIST ---");
            if (tasks.isEmpty()) {
                System.out.println("No tasks found.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    String status = completed.get(i) ? "✓ Done" : "✗ Not Done";
                    System.out.println((i + 1) + ". " + tasks.get(i) + " [" + status + "]");
                }
            }
        }

        public static void markTaskAsComplete(Scanner sc) {
            displayTasks();
            System.out.print("Enter task number to mark as complete: ");
            int index = sc.nextInt();
            if (index >= 1 && index <= tasks.size()) {
                completed.set(index - 1, true);
                System.out.println("Task marked as complete!");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

