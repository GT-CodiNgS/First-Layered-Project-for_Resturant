package pos.dto;

public class ItemDTO {
    private String IID;
    private String itemName;
    private String description;
    private String category;
    private Double unitprice;

    public ItemDTO() {
    }

    public ItemDTO(String IID, String itemName, String description, String category, Double unitprice) {
        this.IID = IID;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.unitprice = unitprice;
    }

    public String getIID() {
        return IID;
    }

    public void setIID(String IID) {
        this.IID = IID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "IID='" + IID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", unitprice=" + unitprice +
                '}';
    }
}
