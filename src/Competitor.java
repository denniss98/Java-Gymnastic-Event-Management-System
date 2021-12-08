import java.util.ArrayList;
import java.util.List;

public class Competitor{
    
    private int competitionNumber;
    private String name;
    private List<Attempt> attempt;
    private String gender;
    private List<Event> events;
    
    public Competitor(int competitionNumber, String name, String gender)
    {
        this.competitionNumber = competitionNumber;
        this.name = name;
        this.gender = gender;
        attempt = new ArrayList<Attempt>();
        events = new ArrayList<Event>();
       
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public int getCompetitionNumber(){
        return competitionNumber;
    }
    
    public void setCompetitionNumber(int competitionNumber){
        this.competitionNumber = competitionNumber;
    }
    
     public String getGender(){
        return gender;
    }
     
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public List<Attempt> getAttempts()
    {
        return attempt;
    }
    
    public void setAttempt(Attempt attempt)
    {
        this.attempt.add(attempt);
    }
    
    public List<Event> getEvents()
    {
        return this.events;
    }
    
    public void setEvents(Event events)
    {
        this.events.add(events);
    }
    
    public String toString()
    {
        return "Name: "+this.name+"\nCompetition Number: "+this.competitionNumber+"";
    }
}