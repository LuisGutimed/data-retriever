package mx.com.system.dataretriever.controller;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import mx.com.system.dataretriever.dto.MovieDto;
import mx.com.system.dataretriever.service.IMovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Slf4j
@RestController
@RequestMapping("${data-retriever.rest.base-path}")
public class MovieController {

  @Resource
  private IMovieService movieService;

  @GetMapping("${data-retriever.rest.get-movies}")
  public List<MovieDto> getAllMovies() {
    return getMovieService().findAll();
  }

  @GetMapping("${data-retriever.rest.get-movie}")
  public MovieDto getMovieById(@PathVariable String id) {
    return getMovieService().findById(id);
  }

  @GetMapping("${data-retriever.rest.search}")
  public Set<MovieDto> searchMovie(@RequestParam(required = false) String title,
      @RequestParam(required = false) String description,
      @RequestParam(required = false) String genre) {
    return getMovieService().searchMovie(title, description, genre);
  }

}
