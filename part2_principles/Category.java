import java.util.ArrayList;
import java.util.List;

class Category{

  
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
