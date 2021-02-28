package pos.view.tm;

public class FoodOrderTM {
    private String id;
    private String category;
    private String items;
    private String date;
    private String total;

    public FoodOrderTM(String id, String category, String items, String date, String total) {
        this.id = id;
        this.category = category;
        this.items = items;
        this.date = date;
        this.total = total;
    }

    public FoodOrderTM() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    @Override
    public String toString() {
        return "FoodOrderTM{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", items='" + items + '\'' +
                ", date='" + date + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
