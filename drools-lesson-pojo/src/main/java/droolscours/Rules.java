package droolscours;

import java.util.ArrayList;
import java.util.List;


public class Rules {
    public List<String> activeRulesList;
    public List<String> riskFactorRulesList;
    public List<String> genuineFactorRulesList;
    public List<String> silentRulesList;
    public List<String> suppressedRulesList;

    public Rules() {
        super();
        this.activeRulesList = new ArrayList<String>();
        this.riskFactorRulesList = new ArrayList<String>();
        this.genuineFactorRulesList = new ArrayList<String>();
        this.silentRulesList = new ArrayList<String>();
        this.suppressedRulesList = new ArrayList<String>();
    }
    public Rules(List<String> activeRulesList, List<String> riskFactorRulesList, List<String> genuineFactorRulesList,
            List<String> silentRulesList, List<String> suppressedRulesList) {
        super();
        this.activeRulesList = activeRulesList;
        this.riskFactorRulesList = riskFactorRulesList;
        this.genuineFactorRulesList = genuineFactorRulesList;
        this.silentRulesList = silentRulesList;
        this.suppressedRulesList = suppressedRulesList;
    }
    public List<String> getActiveRulesList() {
        return activeRulesList;
    }
    public void setActiveRulesList(List<String> activeRulesList) {
        this.activeRulesList = activeRulesList;
    }
    public List<String> getRiskFactorRulesList() {
        return riskFactorRulesList;
    }
    public void setRiskFactorRulesList(List<String> riskFactorRulesList) {
        this.riskFactorRulesList = riskFactorRulesList;
    }
    public List<String> getGenuineFactorRulesList() {
        return genuineFactorRulesList;
    }
    public void setGenuineFactorRulesList(List<String> genuineFactorRulesList) {
        this.genuineFactorRulesList = genuineFactorRulesList;
    }
    public List<String> getSilentRulesList() {
        return silentRulesList;
    }
    public void setSilentRulesList(List<String> silentRulesList) {
        this.silentRulesList = silentRulesList;
    }
    public List<String> getSuppressedRulesList() {
        return suppressedRulesList;
    }
    public void setSuppressedRulesList(List<String> suppressedRulesList) {
        this.suppressedRulesList = suppressedRulesList;
    }
    @Override
    public String toString() {
        return "Rules [activeRulesList=" + activeRulesList + ", genuineFactorRulesList=" + genuineFactorRulesList
                + ", riskFactorRulesList=" + riskFactorRulesList + ", silentRulesList=" + silentRulesList
                + ", suppressedRulesList=" + suppressedRulesList + "]";
    }

    public void addActiveRule(String rule) {
        this.activeRulesList.add(rule);
    }

    public void addRiskFactor(String risk) {
        this.riskFactorRulesList.add(risk);
    }

    public void addSilentRule(String silent) {
        this.silentRulesList.add(silent);
    }

    public void addSuppressed(String rule) {
        this.suppressedRulesList.add(rule);
    }
}

