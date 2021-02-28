package pos.view.tm;

public class BookingTM {
    private String bid;
    private String date;
    private String chekInDate;
    private String checkOutDate;
    private Double bkFee;
    private String roomId;
    private String custId;

    public BookingTM() {
    }

    public BookingTM(String bid, String date, String chekInDate, String checkOutDate, Double bkFee, String roomId, String custId) {
        this.bid = bid;
        this.date = date;
        this.chekInDate = chekInDate;
        this.checkOutDate = checkOutDate;
        this.bkFee = bkFee;
        this.roomId = roomId;
        this.custId = custId;

    }



    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChekInDate() {
        return chekInDate;
    }

    public void setChekInDate(String chekInDate) {
        this.chekInDate = chekInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Double getBkFee() {
        return bkFee;
    }

    public void setBkFee(Double bkFee) {
        this.bkFee = bkFee;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "BookingTM{" +
                "bid='" + bid + '\'' +
                ", date='" + date + '\'' +
                ", chekInDate='" + chekInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", bkFee=" + bkFee +
                ", roomId='" + roomId + '\'' +
                ", custId='" + custId + '\'' +
                '}';
    }
}
