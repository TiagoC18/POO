import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event implements IEvent {
    private LocalDate date;
    public List<Activity> activities = new ArrayList<Activity>();
    
    public Event(LocalDate date, List<Activity> activities) {
        this.date = date;
        this.activities = activities;
    }

    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public org.w3c.dom.events.Event addActivity(Activity activity) {
        activities.add(activity);
        return null;
    }


    public double getTotalCost() {
        return 0;
    }
}
