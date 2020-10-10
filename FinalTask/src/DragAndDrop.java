// one of 3 types of tasks
public class DragAndDrop extends Task implements Autochecked{
    private String[][] options;

    public DragAndDrop(int tasksNumber, String taskText) {
        super(tasksNumber, taskText);
        this.options = new String[][]{{"java", "kotlin"}, {"python", "html/css"}, {"frontend", "backend"}};
    }

    public String[][] getOptions() {
        return options;
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }
}