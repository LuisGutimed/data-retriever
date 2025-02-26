package mx.com.system.dataretriever.service;

import java.util.List;
import java.util.Set;
import mx.com.system.dataretriever.dto.MovieDto;

public interface IMovieService {

  List<MovieDto> findAll();

  MovieDto findById(String id);

  Set<MovieDto> searchMovie(String title, String description, String genre);

}
