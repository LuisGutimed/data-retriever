package mx.com.system.dataretriever.dto;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieDto implements Serializable {

  @Serial
  private static final long serialVersionUID = 1624348146750533487L;
  private String id;
  private String title;
  private String genre;
  private String director;
  private String description;
  private double rentPrice;
  private String coverImageUrl;
  private String thrillerUrl;
}
