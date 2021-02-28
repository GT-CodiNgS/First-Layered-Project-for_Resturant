package pos.dao.custom.impl;

import pos.dao.CrudUtil;
import pos.dao.custom.ItemDAO;
import pos.entity.Item;

import java.sql.ResultSet;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean save(Item item) throws Exception {
        return CrudUtil.execute("INSERT INTO  Item  VALUES(?,?,?,?,?)",
                item.getIID(),item.getItemName(),item.getDescription(),item.getCategory(),
                item.getUnitprice());
    }

    @Override
    public boolean update(Item item) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String IID) throws Exception {
        return CrudUtil.execute("DELETE FROM Item WHERE IID=?",IID);
    }

    @Override
    public Item get(String IID) throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Item WHERE IID=?",IID);
        if (resultSet.next()) {
            return new Item(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5));
        } else {
            return null;
        }

    }

    @Override
    public List<Item> getAll() throws Exception {
        return null;
    }
}
