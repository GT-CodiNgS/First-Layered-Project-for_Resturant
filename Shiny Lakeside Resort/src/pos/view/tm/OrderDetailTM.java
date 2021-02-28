package pos.view.tm;

public class OrderDetailTM {
    private int id;
    private String nic;
    private String orderType ;
    private String orderDate ;
    private String orderTotal;

    public OrderDetailTM() {
    }

    public OrderDetailTM(int id, String nic, String orderType, String orderDate, String orderTotal) {
        this.id = id;
        this.nic = nic;
        this.orderType = orderType;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "OrderDetailTM{" +
                "id=" + id +
                ", nic='" + nic + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderTotal='" + orderTotal + '\'' +
                '}';
    }
}
