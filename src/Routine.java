public class Routine {
    
    public String description;
    public String difficulityRating;
    
    public Routine(String description, String difficulityRating)
    {
        this.description = description;
        this.difficulityRating = difficulityRating;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getDescription()
    {
        return description;
    }
    
     public void setDifficulityRating(String difficulityRating)
    {
        this.difficulityRating = difficulityRating;
    }
    
    public String getDifficulityRating()
    {
        return difficulityRating;
    }
}