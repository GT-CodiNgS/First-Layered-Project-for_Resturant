package pos.bo.custom;

import pos.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerBo {
    public boolean saveCustomer(CustomerDTO dto)throws Exception;
    public boolean updateCustomer(CustomerDTO dto)throws Exception;
    public boolean deleteCustomer(String CID)throws Exception;
    public CustomerDTO getCustomer(String NIC)throws Exception;
    public ArrayList<CustomerDTO> getAllCustomers()throws Exception;
}
