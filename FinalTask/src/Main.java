import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Task[] tasks = createTasks(); // create tasks
        Mentor mentorOne = new Mentor("Svetlana", "Alieva", 28, random); // create a mentor number 1
        Mentor mentorTwo = new Mentor("Alexander", "Nogiev", 35, random); // create a mentor number 2
        Student[] students = createStudents(mentorOne, mentorTwo); // create students

        /* each student solves all the tasks in the array 'tasks', also the 'taskCountForAll' variable contains
            the amount of solved tasks by all students, so students will solve tasks until each student solved all the tasks from the array */
        while (Student.getTaskCountForAll() < tasks.length * students.length) {
            for (int i = 0; i < students.length; i++) {
                if (!students[i].isAllTasksDone()) { // if the student has not solved all the tasks yet
                    int tasksAmount = random.nextInt(tasks.length); // random number of tasks
                    students[i].solveTasks(tasksAmount, tasks);
                }
            }
        }
    }

    public static Task[] createTasks() {
        Task[] tasks = new Task[31]; // create an array that 'createTask' will return
        Random random = new Random();
        Task task = null; // temporary variable where we`ll put our tasks
        for (int i = 0; i < tasks.length; i++) {
            int rand = random.nextInt(3); // random numbers up to 3 (because we have 3 types of tasks)
            switch (rand) {
                // set text of task
                case 0 -> task = new Test(); // if 0 - type 'Test'
                case 1 -> task = new DragAndDrop(); // if 1 - type 'DragAndDrop'
                case 2 -> task = new Code(); // if 2 - type 'Code'
            }
            task.setTaskNumber(i); // set number of task
            tasks[i] = task;
        }
        return tasks;
    }

    public static Student[] createStudents(Mentor mentorOne, Mentor mentorTwo) {
        String[] names = {"Ivan", "Nikita", "Oleg", "Maksim"};
        String[] surnames = {"Ivanov", "Nikitin", "Olegov", "Maksimov"};
        int[] ages = {19, 21, 24, 27};
        Random random = new Random();
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            int rand = random.nextInt(4);
            if (i % 2 == 0) {
                students[i] = new Student(names[rand], surnames[rand], ages[rand], mentorOne);
            } else {
                students[i] = new Student(names[rand], surnames[rand], ages[rand], mentorTwo);
            }
        }
        return students;
    }
}