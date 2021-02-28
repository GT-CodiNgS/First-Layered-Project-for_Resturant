package pos.view.tm;

public class RoomsTM {
    private String id;
    private int roomNum;
    private String roomType;
    private Double roomprice;

    public RoomsTM() {
    }

    public RoomsTM(String id, int roomNum, String roomType, Double roomprice) {
        this.id = id;
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomprice = roomprice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Double roomprice) {
        this.roomprice = roomprice;
    }

    @Override
    public String toString() {
        return "RoomsTM{" +
                "id='" + id + '\'' +
                ", roomNum=" + roomNum +
                ", roomType='" + roomType + '\'' +
                ", roomprice=" + roomprice +
                '}';
    }
}
