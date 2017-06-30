package es.ua.springboot.repository;

import es.ua.springboot.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by sjmg on 30/06/17.
 */
@Repository
public interface FilmRepository extends JpaRepository<Film,Long> {
    List<Film> findAllByOrderByEpisodeId();
    List<Film> findByReleaseDateGreaterThan(Date fecha);


//    @Query(value="select f from Film join f.people where p.name=:name")
//    List<Film> findAllByPeopleContais(@Param("name") String name);

}
