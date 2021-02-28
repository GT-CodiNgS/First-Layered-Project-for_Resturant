package pos.entity;

public class Orders {
    private String oid;
    private String nicNo;
    private String orderType;
    private String date;
    private Double total;

    public Orders() {
    }

    public Orders(String oid, String nicNo, String orderType, String date, Double total) {
        this.oid = oid;
        this.nicNo = nicNo;
        this.orderType = orderType;
        this.date = date;
        this.total = total;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
