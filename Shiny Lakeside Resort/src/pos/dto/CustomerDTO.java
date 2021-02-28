package pos.dto;

public class CustomerDTO {
    private String nicNo;
    private String id;
    private String name;
    private String address;
    private String cntNum;
    private String email;

    public CustomerDTO() {
    }

    public CustomerDTO(String nicNo, String id, String name, String address, String cntNum, String email) {
        this.nicNo = nicNo;
        this.id = id;
        this.name = name;
        this.address = address;
        this.cntNum = cntNum;
        this.email = email;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCntNum() {
        return cntNum;
    }

    public void setCntNum(String cntNum) {
        this.cntNum = cntNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "nicNo='" + nicNo + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cntNum='" + cntNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
