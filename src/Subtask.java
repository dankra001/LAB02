import java.time.LocalDateTime;

public class Subtask extends Task{

    private String SubtaskName;

    //konstruktor
    public Subtask(String taskName,
                   String taskDescription,
                   CategoryEnum taskCategory,
                   LocalDateTime taskDateTimeStop,
                   String subtaskName) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
        this.SubtaskName = subtaskName;
    }

    //konstruktor domyslny
    public Subtask() {
        super("task0", "Description0", CategoryEnum.NEW, LocalDateTime.now());
        this.SubtaskName = "subtask0";
    }

    //getter
    public String getSubtaskName() {
        return SubtaskName;
    }

    //setter
    public void setSubtaskName(String subtaskName) {
        this.SubtaskName = subtaskName;
    }

    @Override
    public String toString() {
        String output = "";
        output += super.toString();
        output += "Subtask Name = " + SubtaskName + '\n';
        return output;
    }

}