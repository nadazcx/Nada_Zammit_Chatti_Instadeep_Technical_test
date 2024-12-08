import java.util.ArrayList;
import java.util.List;

class Category{
    List<Task> tasks= new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }
    public filterTaskByCategory()
    
  
}

class FinancialCategory extends Category {
    int budget;
    public FinancialCategory(int budget){
        this.budget=budget;
    }

}
class LogisticCategory extends Category{
    int numberOfCars;
    public  LogisticCategory(int numberOfCars){
        this.numberOfCars=numberOfCars;

    }


}
