// check the task automatically
public interface Autochecked {
    default void printTask() { // not used
        System.out.println("Task is done");
    }
}