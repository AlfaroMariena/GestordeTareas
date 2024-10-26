import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Gestión de Tareas");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear proyecto");
            System.out.println("2. Agregar tarea a proyecto");
            System.out.println("3. Ver proyectos y tareas");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del proyecto:");
                String projectName = scanner.nextLine();
                Project project = new Project(projectName);
                taskManager.addProject(project);
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre de la tarea:");
                String taskDescription = scanner.nextLine();
                Task task = new Task(taskDescription);

                System.out.println("Ingrese el nombre del proyecto para asignar la tarea:");
                String projectName = scanner.nextLine();

                for (Project project : taskManager.getProjects()) {
                    if (project.getName().equals(projectName)) {
                        taskManager.assignTaskToProject(task, project);
                        System.out.println("Tarea asignada al proyecto.");
                        break;
                    }
                }
            } else if (opcion == 3) {
                taskManager.displayProjects();
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            }
        }
    }
}
