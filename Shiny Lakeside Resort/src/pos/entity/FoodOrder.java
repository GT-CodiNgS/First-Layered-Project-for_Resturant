package pos.entity;

public class FoodOrder {


    private String fid;
    private String  items;
    private String  date;
    private String  total;

    public FoodOrder(String fid, String items, String date, String total) {
        this.fid = fid;
        this.items = items;
        this.date = date;
        this.total = total;
    }

    public FoodOrder() {
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
