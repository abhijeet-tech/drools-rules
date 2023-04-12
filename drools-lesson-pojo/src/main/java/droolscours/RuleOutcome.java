package droolscours;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.DateHelper;

public class RuleOutcome {
    private List<CustomerId> customers;
    private String ruleName;
    private Date executionDatetime;

    public RuleOutcome() {
        super();
        this.executionDatetime = DateHelper.getCurrentTime();
        this.customers = new ArrayList<CustomerId>();
    }
    public RuleOutcome(String ruleName) {
        super();
        this.ruleName = ruleName;
        this.executionDatetime = DateHelper.getCurrentTime();
        this.customers = new ArrayList<CustomerId>();
    }
    public RuleOutcome(String ruleName, CustomerId cust) {
        super();
        this.ruleName = ruleName;
        this.executionDatetime = DateHelper.getCurrentTime();
        this.customers = new ArrayList<CustomerId>();
        this.customers.add(cust);
    }
    public String getRuleName() {
        return ruleName;
    }
    public Date getExecutionDatetime() {
        return executionDatetime;
    }
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    public void setExecutionDatetime(Date executionDatetime) {
        this.executionDatetime = executionDatetime;
    }
    @Override
    public String toString() {
        return "RuleOutcome [customers=" + customers + ", executionDatetime=" + executionDatetime + ", ruleName="
                + ruleName + "]";
    }
    public List<CustomerId> getCustomers() {
        return customers;
    }
    public void setCustomers(List<CustomerId> customers) {
        this.customers = customers;
    }
    
    public Boolean hasCustomer(CustomerId cust) {
        return this.customers.contains(cust);
    }

    public void addCustomer(CustomerId cust) {
        this.customers.add(cust);
    }
    
}
