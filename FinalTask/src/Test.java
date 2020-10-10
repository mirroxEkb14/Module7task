// one of 3 types of tasks
public class Test extends Task implements Autochecked{
    private String[] answers;


    public Test(int tasksNumber, String taskText) {
        super(tasksNumber, taskText);
        this.answers = new String[]{"a", "b", "c"};
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}