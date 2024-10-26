import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Project> projects;

    public TaskManager() {
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void assignTaskToProject(Task task, Project project) {
        project.addTask(task);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void displayProjects() {
        for (Project project : projects) {
            System.out.println("Proyecto: " + project.getName());
            for (Task task : project.getTasks()) {
                System.out.println("  - Tarea: " + task.getDescription() + " [Completada: " + task.isCompleted() + "]");
            }
        }
    }
}
