// contains task number and its text
public abstract class Task {
    private int tasksNumber;
    private String taskText;

    public Task(int tasksNumber, String taskText) {
        this.tasksNumber = tasksNumber;
        this.taskText = taskText;
    }

    public int getTasksNumber() {
        return tasksNumber;
    }

    public void setTasksNumber(int tasksNumber) {
        this.tasksNumber = tasksNumber;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}