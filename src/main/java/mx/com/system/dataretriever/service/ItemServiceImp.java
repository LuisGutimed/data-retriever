package mx.com.system.dataretriever.service;

import jakarta.annotation.Resource;
import java.util.List;
import lombok.Getter;
import mx.com.system.dataretriever.clients.IDataRetrieverClient;
import mx.com.system.dataretriever.dto.ItemDto;
import org.springframework.stereotype.Service;

@Getter
@Service
public class ItemServiceImp implements IItemService {

  @Resource
  private IDataRetrieverClient iDataRetrieverClient;

  @Override
  public List<ItemDto> findAll() {
    return iDataRetrieverClient.getAllItems();
  }

  @Override
  public ItemDto findById(String id) {
    return iDataRetrieverClient.getItemById(id);
  }

}
