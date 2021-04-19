import java.time.LocalDateTime;

public class Task {
//pola klasowe
    private String taskName;
    private String taskDescription;
    private CategoryEnum taskCategory;
    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop;

    public Task(String taskName,
                String taskDescription,
                CategoryEnum taskCategory,
                LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
        this.taskDateTimeStart = LocalDateTime.now();
    }

    public String getTaskName() {
        return taskName;
    }

    //gettery
    public String getTaskDescription() { return taskDescription; }

    public CategoryEnum getTaskCategory() { return taskCategory; }

    public LocalDateTime getTaskDateTimeStart() { return taskDateTimeStart; }

    public LocalDateTime getTaskDateTimeStop() { return taskDateTimeStop; }

    //settery
    public void setTaskName(String newTaskName) { this.taskName = newTaskName; }

    public void setTaskDescription(String taskDescription) { this.taskDescription = taskDescription; }

    public void setTaskCategory(CategoryEnum taskCategory) { this.taskCategory = taskCategory; }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) { this.taskDateTimeStart = taskDateTimeStart; }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) { this.taskDateTimeStop = taskDateTimeStop; }

    @Override
    public String toString(){
        String output = "";
        output += "Task Name = " + taskName + '\n';
        output += "Task Description = " + taskDescription + '\n';
        output += "Category = " + taskCategory + '\n';
        output += "Task Start = " + taskDateTimeStart + '\n';
        output += "Task Stop = " + taskDateTimeStop + '\n';
        return output;
    }


}












