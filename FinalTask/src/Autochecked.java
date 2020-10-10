// check the task automatically
public interface Autochecked {
    default void solveTask() {
        System.out.println("Task is done");
    }
}