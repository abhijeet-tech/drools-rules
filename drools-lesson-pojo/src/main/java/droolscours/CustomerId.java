package droolscours;

public class CustomerId {
    private String id;
    private String idType;

    public String getId() {
        return id;
    }
    public String getIdType() {
        return idType;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    
    public CustomerId() {
        super();
    }
    public CustomerId(String id, String type) {
        super();
        this.id = id;
        this.idType = type;
    }
    @Override
    public String toString() {
        return "CustomerId [id=" + id + ", idType=" + idType + "]";
    }
    
}
