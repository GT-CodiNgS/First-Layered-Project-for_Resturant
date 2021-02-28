package pos.view.tm;

public class ItemTM {
    private String iId;
    private String item;
    private String description;
    private String category;
    private Double untPrice;

    public ItemTM(String iId, String item, String description, String category, Double untPrice) {
        this.iId = iId;
        this.item = item;
        this.description = description;
        this.category = category;
        this.untPrice = untPrice;
    }

    public ItemTM() {
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getUntPrice() {
        return untPrice;
    }

    public void setUntPrice(Double untPrice) {
        this.untPrice = untPrice;
    }

    @Override
    public String toString() {
        return "ItemTM{" +
                "iId='" + iId + '\'' +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", untPrice=" + untPrice +
                '}';
    }

}
