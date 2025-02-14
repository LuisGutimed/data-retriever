package mx.com.system.dataretriever.dto;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryDto implements Serializable {

  @Serial
  private static final long serialVersionUID = 8706208264311123116L;
  private String id;
  private String name;
  private String description;

}
