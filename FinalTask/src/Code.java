// one of 3 types of tasks
public class Code extends Task{
    private String codeText;

    public Code() {
        super();
        this.codeText = "some code text";
        super.setTaskText("Write code"); //set text of task
    }

    public String getCodeText() { // not used
        return codeText;
    }

    public void setCodeText(String codeText) { // not used
        this.codeText = codeText;
    }
}