import java.time.LocalDate;

import org.w3c.dom.events.Event;

public interface IEvent {
    Event addActivity(Activity activity);
    LocalDate getDate();
    double getTotalCost();
}
