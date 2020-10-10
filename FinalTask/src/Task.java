// contains task number and its text
abstract class Task {
    private int tasksNumber;
    private String taskText;

    public Task() {
        this.tasksNumber = 0;
        this.taskText = "";
    }

    public int getTasksNumber() {
        return tasksNumber;
    }

    public void setTaskNumber(int tasksNumber) {
        this.tasksNumber = tasksNumber;
    }

    public String getTaskText() { // not used
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}