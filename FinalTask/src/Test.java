// one of 3 types of tasks
public class Test extends Task implements Autochecked{
    private String[] answers;


    public Test() {
        super();
        this.answers = new String[]{"a", "b", "c"};
        super.setTaskText("Take test"); //set text of task
    }

    public String[] getAnswers() { // not used
        return answers;
    }

    public void setAnswers(String[] answers) { // not used
        this.answers = answers;
    }
}