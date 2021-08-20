import java.util.Date;

public class TaskBuilder
{
    private Task task;

    public TaskBuilder(long id){
        task = new Task(id);
    }

    public TaskBuilder setSummary(String summary)
    {
        task.setSummary(summary);
        return this;
    }

    public TaskBuilder setDescription(String description)
    {
        task.setDescription(description);
        return this;
    }

    public TaskBuilder setDueDate(Date date)
    {
        task.setDueDate(date);
        return this;
    }

    public TaskBuilder setDone(boolean done)
    {
        task.setDone(done);
        return this;
    }

    public Task build()
    {
        return task;
    }
}
