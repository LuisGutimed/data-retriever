package mx.com.system.dataretriever.service;

import jakarta.annotation.Resource;
import java.util.List;
import lombok.Getter;
import mx.com.system.dataretriever.clients.IDataRetrieverClient;
import mx.com.system.dataretriever.dto.PromotionDto;
import org.springframework.stereotype.Service;

@Getter
@Service
public class IPromotionServiceImp implements IPromotionService {

  @Resource
  private IDataRetrieverClient iDataRetrieverClient;

  @Override
  public List<PromotionDto> findAll() {
    return iDataRetrieverClient.getAllPromotions();
  }

  @Override
  public PromotionDto findById(String id) {
    return iDataRetrieverClient.getPromotionById(id);
  }
}
