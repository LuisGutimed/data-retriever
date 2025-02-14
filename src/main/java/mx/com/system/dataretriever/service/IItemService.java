package mx.com.system.dataretriever.service;

import java.util.List;
import mx.com.system.dataretriever.dto.ItemDto;

public interface IItemService {

  List<ItemDto> findAll();

  ItemDto findById(String id);

}
