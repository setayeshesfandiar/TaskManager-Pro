import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Project> projects = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SIMPLE PROJECT MANAGER ===");
            System.out.println("1. Create Project");
            System.out.println("2. Add Task");
            System.out.println("3. View Projects");
            System.out.println("4. View Tasks");
            System.out.println("5. Mark Task Complete");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 -> createProject();
                case 2 -> addTask();
                case 3 -> viewProjects();
                case 4 -> viewTasks();
                case 5 -> markComplete();
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void createProject() {
        System.out.print("Enter project name: ");
        String name = input.nextLine();
        System.out.print("Enter description: ");
        String desc = input.nextLine();
        projects.add(new Project(name, desc));
        System.out.println("✅ Project created successfully!");
    }

    static void addTask() {
        if (projects.isEmpty()) {
            System.out.println("⚠️ No projects available. Create one first!");
            return;
        }

        viewProjects();
        System.out.print("Select project number: ");
        int num = Integer.parseInt(input.nextLine()) - 1;

        if (num < 0 || num >= projects.size()) {
            System.out.println("Invalid project!");
            return;
        }

        System.out.print("Enter task title: ");
        String title = input.nextLine();
        System.out.print("Enter description: ");
        String desc = input.nextLine();

        projects.get(num).addTask(new Task(title, desc));
        System.out.println("✅ Task added!");
    }

    static void viewProjects() {
        if (projects.isEmpty()) {
            System.out.println("No projects found!");
            return;
        }
        System.out.println("\n--- Projects ---");
        for (int i = 0; i < projects.size(); i++) {
            System.out.println((i + 1) + ". " + projects.get(i).name);
        }
    }

    static void viewTasks() {
        if (projects.isEmpty()) {
            System.out.println("No projects yet!");
            return;
        }

        viewProjects();
        System.out.print("Select project number: ");
        int num = Integer.parseInt(input.nextLine()) - 1;

        if (num < 0 || num >= projects.size()) {
            System.out.println("Invalid project!");
            return;
        }

        System.out.println("\n--- Tasks for " + projects.get(num).name + " ---");
        projects.get(num).viewTasks();
    }

    static void markComplete() {
        if (projects.isEmpty()) {
            System.out.println("No projects yet!");
            return;
        }

        viewProjects();
        System.out.print("Select project number: ");
        int pIndex = Integer.parseInt(input.nextLine()) - 1;

        if (pIndex < 0 || pIndex >= projects.size()) {
            System.out.println("Invalid project!");
            return;
        }

        Project p = projects.get(pIndex);
        if (p.tasks.isEmpty()) {
            System.out.println("No tasks to mark!");
            return;
        }

        p.viewTasks();
        System.out.print("Select task number: ");
        int tIndex = Integer.parseInt(input.nextLine()) - 1;

        if (tIndex < 0 || tIndex >= p.tasks.size()) {
            System.out.println("Invalid task!");
            return;
        }

        p.tasks.get(tIndex).markComplete();
        System.out.println("🎉 Task marked as complete!");
    }
    }
