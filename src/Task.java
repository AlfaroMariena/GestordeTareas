public class Task implements Completable {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    @Override
    public void completeTask() {
        this.completed = true;
    }

    @Override
    public boolean isCompleted() {
        return this.completed;
    }

    public String getDescription() {
        return description;
    }
}

