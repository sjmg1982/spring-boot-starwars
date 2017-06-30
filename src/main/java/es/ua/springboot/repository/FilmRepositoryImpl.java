package es.ua.springboot.repository;

import es.ua.springboot.model.Film;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by sjmg on 30/06/17.
 */
@Slf4j
public class FilmRepositoryImpl implements CustomFilmRepository {
    @Override
    public void logFilm(Film f) {
        log.info(f.getTitle());
    }
}
