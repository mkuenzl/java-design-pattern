import java.util.Date;

public class Task
{
    private final long id;
    private Date dueDate;
    private boolean done;
    private String summary;
    private String description;

    public Task(long id) {
        this.id = id;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public Date getDueDate() {
        return new Date(dueDate.getTime());
    }

    public boolean isDone() {
        return done;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }
}
