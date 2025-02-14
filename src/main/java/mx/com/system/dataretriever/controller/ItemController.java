package mx.com.system.dataretriever.controller;

import jakarta.annotation.Resource;
import java.util.List;
import mx.com.system.dataretriever.dto.ItemDto;
import mx.com.system.dataretriever.service.IItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
public class ItemController {

  @Resource
  private IItemService itemService;

  @GetMapping("/all")
  public List<ItemDto> getAllItems() {
    return itemService.findAll();
  }

  @GetMapping("/{id}")
  public ItemDto getItemById(@PathVariable String id) {
    return itemService.findById(id);
  }

}
