import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

// import jdk.vm.ci.meta.Local;

public class Task {
    static List<Task> tasks= new ArrayList<>();

    String title;
    String description;
    LocalDateTime   dueDate;
    Priority priority;
    List<Category> categories = new ArrayList<>();

    public Task (String title, String description, String date,Priority priority,Category category){
        this.title=title;
        this.description =description;
        this.priority =priority;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dueDate =LocalDateTime.parse(date,format);
        categories.add(category);
        Task.tasks.add(this);

    }
    public List<Task> filterTaskBycategory(Category category){
        List<Task> tasksCategory= new ArrayList<>();
        for( int i=0;i< this.tasks.size();i++){
            if (tasks.get(i).)
        }


       
        return tasksCategory;

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
    public ArrayList getCategories(){
        return (ArrayList) categories;

    }
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
  

    public boolean filterThisByCategory(Category category){
        for ( int i=0;i<this.categories.size();i++){
            if( category in this.categories){
                return true;
            }
        }
    }
}
