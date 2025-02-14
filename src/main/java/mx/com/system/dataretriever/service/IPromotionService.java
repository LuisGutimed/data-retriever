package mx.com.system.dataretriever.service;

import java.util.List;
import mx.com.system.dataretriever.dto.PromotionDto;

public interface IPromotionService {

  List<PromotionDto> findAll();

  PromotionDto findById(String id);

}
