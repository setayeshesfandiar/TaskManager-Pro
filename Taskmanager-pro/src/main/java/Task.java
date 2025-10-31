public class Task {
    String title;
    String description;
    String status = "PENDING";

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void markComplete() {
        status = "COMPLETED";
    }

    @Override
    public String toString() {
        return title + " (" + status + ")";
    }
}
