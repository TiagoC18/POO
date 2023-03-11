import java.util.ArrayList;
import java.util.List;

public class Activity{
    private int preco;
    public List<Activity> activities = new ArrayList<Activity>();
    
   
   

    public double getTotalCost() {
        for (Activity activity : activities) {
            preco += activity.preco;
        }
        return preco;
    }




    


   



}
