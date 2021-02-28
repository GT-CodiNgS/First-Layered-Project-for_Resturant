package pos.bo;

import pos.bo.custom.impl.CustomerBoImpl;
import pos.bo.custom.impl.ItemBoImpl;

public class BoFactory {
    public static BoFactory boFactory;
    private BoFactory() {
    }
    public static BoFactory getInstance() {
        return (boFactory == null) ?
                (boFactory = new BoFactory()) : (boFactory);
    }
    public enum BOType {
        CUSTOMER,ITEM,ROOM,BOOKING,FOODORDER,ORDERS
    }

    public <T> T getBo(BOType type) {
        switch (type){
            case CUSTOMER:
                return (T)new CustomerBoImpl();
            case ITEM:
                return (T)new ItemBoImpl();
            case ROOM:
                return null;
            case BOOKING:
                return null;
            case FOODORDER:
                return null;
            case ORDERS:
                return null;
            default:
                return null;
        }
    }
}
