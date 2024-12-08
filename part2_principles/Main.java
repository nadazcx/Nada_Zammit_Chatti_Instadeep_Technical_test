import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args){
        Priority Low;
        String date = "2024-03-08";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime=LocalDateTime.parse(date,format);
        Task task= Task("Task1","todo ",date, Low);

       


    
}
