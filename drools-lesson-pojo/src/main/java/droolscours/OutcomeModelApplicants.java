package droolscours;

import java.util.ArrayList;
import java.util.List;

public class OutcomeModelApplicants {
    public List<CustomerId> customers;
    public Boolean alertFlag;
    public String alertType;

    public OutcomeModelApplicants() {
        super();
        this.customers = new ArrayList<CustomerId>();
    }

    
    public OutcomeModelApplicants(List<CustomerId> customers, Boolean alertFlag, String alertType) {
        super();
        this.customers = new ArrayList<CustomerId>();
        this.customers.addAll(customers);
        this.alertFlag = alertFlag;
        this.alertType = alertType;
    }


    public Boolean getAlertFlag() {
        return alertFlag;
    }


    public void setAlertFlag(Boolean alertFlag) {
        this.alertFlag = alertFlag;
    }


    public String getAlertType() {
        return alertType;
    }


    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }


    public OutcomeModelApplicants(List<CustomerId> customers) {
        this.customers = customers;
    }

    public List<CustomerId> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerId> customers) {
        this.customers = customers;
    }


    @Override
    public String toString() {
        return "OutcomeModelApplicants [alertFlag=" + alertFlag + ", alertType=" + alertType + ", customers="
                + customers + "]";
    }

    public void addCustomer(CustomerId cust) {
        if (this.customers == null) {
            this.customers = new ArrayList<CustomerId>();
        }
        this.customers.add(cust);
    }
    
    
    
}
