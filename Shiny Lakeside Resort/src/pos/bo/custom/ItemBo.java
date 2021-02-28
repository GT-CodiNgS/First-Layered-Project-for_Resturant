package pos.bo.custom;

import pos.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemBo {
    public boolean saveItem(ItemDTO dto)throws Exception;
    public boolean updateItem(ItemDTO dto)throws Exception;
    public boolean deleteItem(String IID)throws Exception;
    public ItemDTO getItem(String IID)throws Exception;
    public ArrayList<ItemDTO> getAllItems()throws Exception;
}
