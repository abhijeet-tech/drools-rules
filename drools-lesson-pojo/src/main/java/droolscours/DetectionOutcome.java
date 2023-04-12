package droolscours;

import java.util.ArrayList;
import java.util.List;

public class DetectionOutcome {
    public String applicationId;
    public Rules rules;
    public List<OutcomeModelApplicants> outcomeModelApplicants;
    private List<RuleOutcome> ruleOutcome = null;
    private Boolean alert;

    public DetectionOutcome() {
        super();
        this.ruleOutcome = new ArrayList<RuleOutcome>();
        this.alert = Boolean.FALSE;
    }

    public DetectionOutcome(List<RuleOutcome> outcome, Boolean alert) {
        this.ruleOutcome = outcome;
        this.alert = alert;
    }

    public List<RuleOutcome> getRuleOutcome() {
        return ruleOutcome;
    }

    public void setRuleOutcome(List<RuleOutcome> ruleOutcome) {
        this.ruleOutcome = ruleOutcome;
    }

    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public void addRule(RuleOutcome rule) {
        this.ruleOutcome.add(rule);
    }

    @Override
    public String toString() {
        return "DetectionOutcome [alert=" + alert + ", ruleOutcome=" + ruleOutcome + "]";
    }
    
    public void addOutcomeModelApplicant(OutcomeModelApplicants applicant) {
        this.outcomeModelApplicants.add(applicant);
    }
}
