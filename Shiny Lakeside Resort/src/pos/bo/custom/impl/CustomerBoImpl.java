package pos.bo.custom.impl;

import pos.bo.custom.CustomerBo;
import pos.dao.DAOFactory;
import pos.dao.custom.CustomerDAO;
import pos.dto.CustomerDTO;
import pos.entity.Customer;


import java.util.ArrayList;
import java.util.List;


public class CustomerBoImpl  implements CustomerBo {
    private CustomerDAO dao = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.CUSTOMER);


    @Override
    public boolean saveCustomer(CustomerDTO dto) throws Exception {
        return dao.save(new Customer( dto.getNicNo(),dto.getId(),dto.getName(),dto.getAddress(),dto.getCntNum(),dto.getEmail()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws Exception {
        return dao.update(new Customer( dto.getNicNo(),dto.getId(),dto.getName(),dto.getAddress(),dto.getCntNum(),dto.getEmail()));
    }

    @Override
    public boolean deleteCustomer(String CID) throws Exception {
        return dao.delete(CID);
    }

    @Override
    public CustomerDTO getCustomer(String NIC) throws Exception {
        Customer c = dao.get(NIC);
        return new CustomerDTO(c.getNic(),c.getCid(),c.getCusName(),c.getAddress(),
                c.getContact(),c.getEmail());
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        List<Customer> cList =dao.getAll();
        ArrayList<CustomerDTO>dtoList =new ArrayList();
        for (Customer c: cList){
            dtoList.add(new CustomerDTO(c.getNic(),c.getCid(),c.getCusName(),c.getAddress(),
                    c.getContact(),c.getEmail()));
        }
        return dtoList;
    }
}
