package pos.dao.custom.impl;

import pos.dao.CrudUtil;
import pos.dao.custom.CustomerDAO;
import pos.entity.Customer;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements  CustomerDAO {
    @Override
    public boolean save(Customer customer) throws Exception {
        return CrudUtil.execute("INSERT INTO  Customer  VALUES(?,?,?,?,?,?)",
                customer.getNic(),customer.getCid(),customer.getCusName(),customer.getAddress(),
                customer.getContact(),customer.getEmail());
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String CID) throws Exception {
        return CrudUtil.execute("DELETE FROM Customer WHERE CID=?",CID);
    }

    @Override
    public Customer get(String NIC) throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Customer WHERE NIC=?",NIC);
        if (resultSet.next()) {
            return new Customer(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6));
        } else {
            return null;
        }
    }

    @Override
    public List<Customer> getAll() throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Customer");
        ArrayList<Customer> customerList = new ArrayList<>();
        while (resultSet.next()) {
          customerList.add(new Customer(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6)


            ));
        }
        return customerList;

    }

}
