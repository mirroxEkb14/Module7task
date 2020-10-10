// one of 3 types of tasks
public class DragAndDrop extends Task implements Autochecked{
    private String[][] options;

    public DragAndDrop() {
        super();
        this.options = new String[][]{{"java", "kotlin"}, {"python", "html/css"}, {"frontend", "backend"}};
        super.setTaskText("Select options"); //set text of task
    }

    public String[][] getOptions() { // not used
        return options;
    }

    public void setOptions(String[][] options) { // not used
        this.options = options;
    }
}