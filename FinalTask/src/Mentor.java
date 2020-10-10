import java.util.Random;

public class Mentor extends Person implements Staff{
    private boolean isMood; // mentor`s mood
    private Random RANDOM; // constant

    public Mentor(String name, String surname, int age, Random RANDOM) {
        super(name, surname, age); // superclass constructor
        this.isMood = true; // the mentor is in a good mood by default
        this.RANDOM = RANDOM; // the object of class 'Random'
    }

    @Override
    public void helpStudent(Student student) { // if the student needs help, we cheer him up
        System.out.printf("Keep it up, %s, you`re doing great!", student.getName());
    }

    public boolean checkCode(Task task) {
        boolean isAccepted;
        int randomDigit = RANDOM.nextInt();
        isMood = randomDigit > 1000;
        if (!isMood) { // if the 'randomDigit' variable less than 1000, the mentor does not check the task
            System.out.printf("Task #%d was not accepted, I am in a bad mood\n", task.getTasksNumber());
            isAccepted = false;
        } else {
            System.out.println("Task was accepted");
            isAccepted = true;
        }
        return isAccepted;
    }

    public boolean isMood() { // not used
        return isMood;
    }

    public void setMood(boolean mood) { // not used
        isMood = mood;
    }

    public Random getRANDOM() { // not used
        return RANDOM;
    }

    public void setRANDOM(Random RANDOM) { // not used
        this.RANDOM = RANDOM;
    }
}