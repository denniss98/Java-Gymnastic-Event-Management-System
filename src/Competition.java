import java.util.ArrayList;
import java.util.List;

public class Competition {

    List<Event> events;

    public Competition() {
        this.events = new ArrayList<Event>();
    }

    public void setEvent(Event e)
    {
        this.events.add(e);
    }
    
    public List<Event> getEvents()
    {
        return this.events;
    }
}