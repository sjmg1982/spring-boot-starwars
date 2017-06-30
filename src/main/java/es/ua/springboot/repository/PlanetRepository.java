package es.ua.springboot.repository;

import es.ua.springboot.model.Planet;
import org.hibernate.boot.model.source.spi.Sortable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by sjmg on 30/06/17.
 */
@Repository
public interface PlanetRepository extends JpaRepository<Planet,Long> {
    Planet findByName(String name);
    Page<Planet> findAllBy(Pageable pageable);
    Page<Planet> findAllBy(Sortable pageable);
    Planet findByNameLike(String name);
    List<Planet> findByNameContaining(String name);
    List<Planet> findAllByOrderByNameDesc();
    List<Planet> findByPopulationGreaterThan(Long population);
    List<Planet> findByPopulationBetween(Long min,Long max);
    List<Planet> findTop10ByOrderByPopulationAsc();
    List<Planet> findTop10ByOrderByPopulationDesc();


}
