package pos.entity;

public class Customer implements SuperEntity {
    private String nic;
    private String cid;
    private String cusName;
    private String address;
    private String contact;
    private String email;

    public Customer() {
    }

    public Customer(String nic, String cid, String cusName, String address, String contact, String email) {
        this.nic = nic;
        this.cid = cid;
        this.cusName = cusName;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nic='" + nic + '\'' +
                ", cid='" + cid + '\'' +
                ", cusName='" + cusName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
