public class Attempt {
    
    private float score;
    private Event event;
    Routine routine;
    
    public Attempt(Routine newRoutine, float score){
        this.routine =newRoutine;
        this.score = score;
        this.event = event;
    }
    
    public float getScore(){
        return score;
    }
    
    public void setScore(float score){
        this.score = score;
    }
    
    public void setevent(Event event)
    {
        this.event = event;
    }
    
    public Event getEvent()
    {
        return event;
    }
    
    public Routine getRoutine()
    {
        return routine;
    }
}