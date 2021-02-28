package pos.entity;

public class Booking {


    private String bid;
    private String bDate;
    private String bFee;
    private String roomID;
    private String cusID;



    public Booking(String bid, String bDate, String bFee, String roomID, String cusID) {
        this.bid = bid;
        this.bDate = bDate;
        this.bFee = bFee;
        this.roomID = roomID;
        this.cusID = cusID;
    }

    public Booking() {
    }
    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getbFee() {
        return bFee;
    }

    public void setbFee(String bFee) {
        this.bFee = bFee;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }
}
