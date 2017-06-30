package es.ua.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import es.ua.springboot.model.People;

import java.util.Collection;
import java.util.List;

/**
 * Created by sjmg on 30/06/17.
 */
@Repository
public interface PeopleRepository extends JpaRepository<People,Long> {
    People findByNameIgnoreCase(String name);
    List<People> findByHeightGreaterThanEqual(String altura);
//    List<People> findByEyeColorIn(Collection<String> eyesColor);
    List<People> findTop20ByOrderByMassDesc();
    List<People> findByEyeColorOrderByName(String color);
    List<People> findByNameStartingWith(String name);
    @Query (value="select * from People where name like 'S%'",nativeQuery=true)
    List<People> findByNameStartingWith();
}
