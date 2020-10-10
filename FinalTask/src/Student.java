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

    public int getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public static int getTaskCountForAll() {
        return taskCountForAll;
    }

    public static void setTaskCountForAll(int taskCountForAll) {
        Student.taskCountForAll = taskCountForAll;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isAllTasksDone() {
        return allTasksDone;
    }

    public void setAllTasksDone(boolean allTasksDone) {
        this.allTasksDone = allTasksDone;
    }

    public void solveTasks(int tasksNumber, Task[] tasks) {
        if (tasksNumber + taskCount > tasks.length) { // if the student is given more tasks than he needs to solve
            System.out.printf("You want to solve more tasks than we have!\n(%d left)", tasks.length - taskCount);
        } else {
            // the student begins solving tasks from the last solved task last time
            for (int i = tasks.length - taskCount; i < taskCount + tasksNumber; i++) {
                solveTask(tasks[i]);
            }
            // if the loop ends, it means the student has solved all the tasks
            System.out.println("All tasks are done!");
            allTasksDone = true;
        }
    }

    private void solveTask(Task task) {
        // if task`s type is 'Test' or 'DragAndDrop', we check the task automatically
        if (task instanceof Autochecked) {
            System.out.println("Task is done");
            taskCount++;
            taskCountForAll++;
        } else { // or we send the task to the mentor
            // we send the mentor our task until she checks it
            while (true) {
                if (mentor.checkCode(task)) {
                    taskCount++;
                    taskCountForAll++;
                    break;
                }
            }
        }
    }
}