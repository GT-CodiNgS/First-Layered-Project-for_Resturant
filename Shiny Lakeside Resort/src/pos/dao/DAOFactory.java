package pos.dao;

import pos.dao.custom.impl.CustomerDAOImpl;
import pos.dao.custom.impl.ItemDAOImpl;
import pos.dao.custom.impl.QueryDAOImpl;


public class DAOFactory {
    private static DAOFactory daoFactory;
    private  DAOFactory(){}

    public static DAOFactory getInstance(){
        return (daoFactory==null)?
                (daoFactory = new DAOFactory()):(daoFactory);

    }
    public enum DAOType{
CUSTOMER,ITEM,ROOM,BOOKING,FOODORDER,ORDERS,QUERY
    }

    public<T >T getDAO(DAOType type){
        switch (type){
            case CUSTOMER:
                return (T)new CustomerDAOImpl();
            case ITEM:
                return (T)new ItemDAOImpl();
            case ROOM:
                return null;
            case BOOKING:
                return null;
            case FOODORDER:
                return null;
            case ORDERS:
                return null;
            case QUERY:
                return (T)new QueryDAOImpl();
            default:
                return null;
        }
    }

}
