package es.ua.springboot.repository;

import es.ua.springboot.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by sjmg on 30/06/17.
 */
@Repository
public interface CustomFilmRepository {
    void logFilm(Film f);

}
