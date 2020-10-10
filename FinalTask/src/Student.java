public class Student extends Person{
    private int taskCount; // how many tasks each student solved
    private static int taskCountForAll; // how many tasks all the students solved
    private Mentor mentor; // for the student there`s his mentor who, if necessary, checks the tasks
    private boolean allTasksDone; // if the student solved all the tasks

    public Student(String name, String surname, int age, Mentor mentor) {
        super(name, surname, age); // superclass constructor
        this.taskCount = 0;
        this.mentor = mentor;
        this.allTasksDone = false;
    }

    public void solveTasks(int tasksNumber, Task[] tasks) {
        // the student begins solving tasks from the last solved task last time
        for (int i = taskCount; i < taskCount + tasksNumber; i++) {
            if (i < tasks.length) {
                solveTask(tasks[i]);
            } else {
                break;
            }
        }
        if (taskCount == tasks.length) {
            System.out.println("\nAll tasks are done!");
            allTasksDone = true;
        } else {
            System.out.println("Not all the tasks are solved yet");
        }
    }

    private void solveTask(Task task) {
        // if task`s type is 'Test' or 'DragAndDrop', we check the task automatically
        if (task instanceof Autochecked) {
            System.out.println("Task is done");
        } else { // or we send the task to the mentor
            // we send the mentor our task until she checks it
            while (true) {
                if (mentor.checkCode(task)) {
                    break;
                }
            }
        }
        taskCount++;
        taskCountForAll++;
    }

    public int getTaskCount() { // not used
        return taskCount;
    }

    public void setTaskCount(int taskCount) { // not used
        this.taskCount = taskCount;
    }

    public static int getTaskCountForAll() {
        return taskCountForAll;
    }

    public static void setTaskCountForAll(int taskCountForAll) { // not used
        Student.taskCountForAll = taskCountForAll;
    }

    public Mentor getMentor() { // not used
        return mentor;
    }

    public void setMentor(Mentor mentor) { // not used
        this.mentor = mentor;
    }

    public boolean isAllTasksDone() {
        return allTasksDone;
    }

    public void setAllTasksDone(boolean allTasksDone) { // not used
        this.allTasksDone = allTasksDone;
    }
}