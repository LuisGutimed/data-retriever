package mx.com.system.dataretriever.clients;

import java.util.List;
import java.util.Set;
import mx.com.system.dataretriever.dto.MovieDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${data-retriever.config.client.name}")
public interface IApiOperatorClient {

  @GetMapping("${data-retriever.config.client.movie.operation.find-all}")
  List<MovieDto> getAllMovies();

  @Cacheable(value = "getMovieById", key = "#id")
  @GetMapping("${data-retriever.config.client.movie.operation.find-id}")
  MovieDto getMovieById(@PathVariable String id);

  @Cacheable(value = "searchMovie", key = "{#title, #description, #genre}")
  @GetMapping("${data-retriever.config.client.movie.operation.search}")
  Set<MovieDto> searchMovie(@RequestParam(required = false) String title,
      @RequestParam(required = false) String description,
      @RequestParam(required = false) String genre);
}
