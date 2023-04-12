package droolscours;

public class ScoreSummary {
    public String fraudTypology;
    public String ragStatus;
    public ScoreSummary() {
        super();
    }
    public ScoreSummary(String fraudTypology, String ragStatus) {
        super();
        this.fraudTypology = fraudTypology;
        this.ragStatus = ragStatus;
    }
    public String getFraudTypology() {
        return fraudTypology;
    }
    public void setFraudTypology(String fraudTypology) {
        this.fraudTypology = fraudTypology;
    }
    public String getRagStatus() {
        return ragStatus;
    }
    public void setRagStatus(String ragStatus) {
        this.ragStatus = ragStatus;
    }
    @Override
    public String toString() {
        return "ScoreSummary [fraudTypology=" + fraudTypology + ", ragStatus=" + ragStatus + "]";
    }

    
}
