package pos.bo.custom.impl;

import pos.bo.custom.ItemBo;
import pos.dao.DAOFactory;
import pos.dao.custom.ItemDAO;
import pos.dto.ItemDTO;
import pos.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemBoImpl  implements ItemBo {
    private final ItemDAO dao = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.ITEM);
    @Override
    public boolean saveItem(ItemDTO dto) throws Exception {
        return dao.save(new Item(dto.getIID(),dto.getItemName(),dto.getDescription(),dto.getCategory(),
                dto.getUnitprice()));
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws Exception {
        return dao.update(new Item(dto.getIID(),dto.getItemName(),dto.getDescription(),dto.getCategory(),
                dto.getUnitprice()));
    }

    @Override
    public boolean deleteItem(String IID) throws Exception {
        return dao.delete(IID);
    }

    @Override
    public ItemDTO getItem(String IID) throws Exception {
       Item i = dao.get(IID);
        return new ItemDTO(i.getIID(),i.getItemName(),i.getDescription(),i.getCategory(),
               i.getUnitprice());
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws Exception {
        List<Item> iList =dao.getAll();
        ArrayList<ItemDTO>dtoList =new ArrayList();
        for (Item i: iList){
            dtoList.add(new ItemDTO(i.getIID(),i.getItemName(),i.getDescription(),i.getCategory(),
                    i.getUnitprice()));
        }
        return dtoList;
    }

}
