package droolscours;

public class Applicant {
    private CustomerId customer;
    private String name;
    private String postcode;

    

    public Applicant() {
        super();
    }
    public Applicant(CustomerId customer, String name, String postcode) {
        super();
        this.customer = customer;
        this.name = name;
        this.postcode = postcode;
    }
    public CustomerId getCustomer() {
        return customer;
    }
    public void setCustomer(CustomerId customer) {
        this.customer = customer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    @Override
    public String toString() {
        return "Applicant [customer=" + customer + ", name=" + name + ", postcode=" + postcode + "]";
    }

    
}
