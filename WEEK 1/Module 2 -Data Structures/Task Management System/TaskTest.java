public class TaskTest {

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(
            new Task(101,
                     "Design Database",
                     "Pending"));

        tm.addTask(
            new Task(102,
                     "Develop Module",
                     "In Progress"));

        tm.addTask(
            new Task(103,
                     "Testing",
                     "Pending"));

        System.out.println("\nAll Tasks:");
        tm.traverseTasks();

        System.out.println("\nSearch Task:");
        tm.searchTask(102);

        System.out.println("\nDelete Task:");
        tm.deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        tm.traverseTasks();
    }
}