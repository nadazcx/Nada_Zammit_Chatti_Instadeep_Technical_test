import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import jdk.vm.ci.meta.Local;

public class Task {
    String title;
    String description;
    LocalDateTime   dueDate;
    Priority priority;

    public Task (String title, String description, String date,Priority priority){
        this.title=title;
        this.description =description;
        this.priority =priority;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dueDate =LocalDateTime.parse(date,format);


    }
    public  String getTitle(){
        return this.title;

    }
    public String getDescription(){
        return this.description;
    }
    public Priority gePriority(){
        return this.priority;

    }
    // public Category[] getCategories(){
    //     return category;

    // }
    public LocalDateTime getDueDate(){
        return dueDate;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setPriority(Priority priority){
        this.priority=priority;
    }
}