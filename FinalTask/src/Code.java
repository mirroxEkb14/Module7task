// one of 3 types of tasks
public class Code extends Task{
    private String codeText;

    public Code(int tasksNumber, String taskText) {
        super(tasksNumber, taskText);
        this.codeText = "some code text";
    }

    public String getCodeText() {
        return codeText;
    }

    public void setCodeText(String codeText) {
        this.codeText = codeText;
    }
}