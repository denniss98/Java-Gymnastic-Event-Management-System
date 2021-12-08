import java.util.List;

public class Event {
    
    private String description;
    private String startTime;
    private String name;
    private String eventType;
    public Event(String name,String description, String startTime, String eventType)
            
    {
        this.description = description;
        this.startTime = startTime;
        this.name = name;
        this.eventType = eventType;
    }
    
    public Event(){}
    
    public String getDescription(){
        
        return description;
    }
    
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    
    public String getName(){
        
        return name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getEventType(){
        
        return eventType;
    }
    
    public void setEventType(String newEventType){
        this.name = newEventType;
    }
    
    public String getStartTime(){
        return startTime;
    }
    
    public void setStartTime(String newStartTime){
        this.startTime = newStartTime;
    }
    
    
    @Override
   public String toString()
   {
       return "Event: "+name +"\nDescription: " +description+"\nStart Time: "+startTime+"\n";
   }
}