package droolscours;

public class ScoringEngine {
    public String name;
    public Double scoreOutcome;

    public ScoringEngine() {
        super();
    }
    public ScoringEngine(String name, Double scoreOutcome) {
        super();
        this.name = name;
        this.scoreOutcome = scoreOutcome;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getScoreOutcome() {
        return scoreOutcome;
    }
    public void setScoreOutcome(Double scoreOutcome) {
        this.scoreOutcome = scoreOutcome;
    }
    @Override
    public String toString() {
        return "ScoringEngine [name=" + name + ", scoreOutcome=" + scoreOutcome + "]";
    }
    
    
}
