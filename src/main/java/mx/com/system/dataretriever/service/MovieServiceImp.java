package mx.com.system.dataretriever.service;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import mx.com.system.dataretriever.clients.IApiOperatorClient;
import mx.com.system.dataretriever.dto.MovieDto;
import org.springframework.stereotype.Service;

@Getter
@Service
public class MovieServiceImp implements IMovieService {

  @Getter
  @Resource
  private IApiOperatorClient iApiOperatorClient;

  @Override
  public List<MovieDto> findAll() {
    return getIApiOperatorClient().getAllMovies();
  }

  @Override
  public MovieDto findById(String id) {
    return getIApiOperatorClient().getMovieById(id);
  }

  @Override
  public Set<MovieDto> searchMovie(String title, String description, String genre) {
    return getIApiOperatorClient().searchMovie(title, description, genre);
  }

}
