import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = createTasks(); // create tasks
        Mentor mentor = new Mentor("Svetlana", "Alieva", 28); // create a mentor
        Student[] students = createStudents(mentor); // create students

        Random random = new Random();
        /* each student solves all the tasks in the array 'tasks', also the 'taskCountForAll' variable contains
            the amount of solved tasks by all students, so students will solve tasks until each student solved all the tasks from the array */
        while (Student.getTaskCountForAll() < tasks.length * students.length) {
            int tasksAmount = random.nextInt(31); // random amount of tasks
            for (int i = 0; i < students.length; i++) {
                // select random student
                // if some student is selected several times, we check if he`s already solved all the tasks
                if (students[random.nextInt(10)].getTaskCount() != tasks.length) {
                    continue;
                }
                students[random.nextInt(10)].solveTasks(tasksAmount, tasks);
            }
        }
    }

    public static Task[] createTasks() {
        Task[] tasks = new Task[31]; // create an array that 'createTask' will return
        Random random = new Random();
        Task obj = null; // temporary variable where we`ll put our tasks
        for (int i = 0; i < tasks.length; i++) {
            int rand = random.nextInt(3); // random numbers up to 3 (because we have 3 types of tasks)
            switch (rand) {
                case 0 -> obj = new Test(i, "some task text"); // if 0 - type 'Test'
                case 1 -> obj = new DragAndDrop(i, "some task text"); // if 1 - type 'DragAndDrop'
                case 2 -> obj = new Code(i, "some code text"); // if 2 - type 'Code'
            }
            tasks[i] = obj;
        }
        return tasks;
    }

    public static Student[] createStudents(Mentor mentor) {
        String[] names = {"Ivan", "Nikita", "Oleg", "Maksim"};
        String[] surnames = {"Ivanov", "Nikitin", "Olegov", "Maksimov"};
        int[] ages = {19, 21, 24, 27};
        Random random = new Random();
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            int rand = random.nextInt(4);
            students[i] = new Student(names[rand], surnames[rand], ages[rand], mentor);
        }
        return students;
    }
}