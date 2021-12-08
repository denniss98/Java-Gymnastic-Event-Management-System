import java.util.ArrayList;
import java.util.List;

public class CommitteeMember {
    
    private String name;
    private List<Event> eventsOrganized; 
    
    public CommitteeMember(String name) {

        this.name = name;
        this.eventsOrganized = new ArrayList<Event>();
    }
    
    public String getName(){

    return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void addEventsOrganized(Event e)
    {
        this.eventsOrganized.add(e);
    }

    public List<Event> geteventsOrganized()
    {
        return this.eventsOrganized;
    }
}
