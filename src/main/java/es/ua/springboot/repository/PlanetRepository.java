package es.ua.springboot.repository;

import es.ua.springboot.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sjmg on 30/06/17.
 */
@Repository
public interface PlanetRepository extends JpaRepository<Planet,Long> {
    Planet findByName(String name);
    Planet findByNameLike(String name);
}
