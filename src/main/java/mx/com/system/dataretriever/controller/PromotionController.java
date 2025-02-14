package mx.com.system.dataretriever.controller;

import jakarta.annotation.Resource;
import java.util.List;
import mx.com.system.dataretriever.dto.PromotionDto;
import mx.com.system.dataretriever.service.IPromotionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/promotion")
public class PromotionController {

  @Resource
  private IPromotionService iPromotionService;

  @GetMapping("/all")
  public List<PromotionDto> getAllPromotions() {
    return iPromotionService.findAll();
  }

  @GetMapping("/{id}")
  public PromotionDto getPromotionById(@PathVariable String id) {
    return iPromotionService.findById(id);
  }


}
