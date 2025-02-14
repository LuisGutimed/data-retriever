package mx.com.system.dataretriever.clients;

import java.util.List;
import mx.com.system.dataretriever.dto.ItemDto;
import mx.com.system.dataretriever.dto.PromotionDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${data-retriever.config.client.name}")
public interface IDataRetrieverClient {

  @GetMapping("${data-retriever.config.client.item.operation.find-all}")
  List<ItemDto> getAllItems();

  @Cacheable(value = "getItemById", key = "#id")
  @GetMapping("${data-retriever.config.client.item.operation.find-id}")
  ItemDto getItemById(@PathVariable String id);


  @GetMapping("${data-retriever.config.client.promotion.operation.find-all}")
  List<PromotionDto> getAllPromotions();

  @Cacheable(value = "getPromotionById", key = "#id")
  @GetMapping("${data-retriever.config.client.promotion.operation.find-id}")
  PromotionDto getPromotionById(@PathVariable String id);

}
