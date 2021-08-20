import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Task task = new TaskBuilder(1)
                .setSummary("summary")
                .setDescription("description")
                .setDone(true)
                .setDueDate(new Date())
                .build();

        System.out.println(task);
    }
}
