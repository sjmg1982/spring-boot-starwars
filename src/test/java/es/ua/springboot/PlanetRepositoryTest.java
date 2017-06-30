package es.ua.springboot;

import es.ua.springboot.model.Planet;
import es.ua.springboot.repository.PlanetRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sjmg on 30/06/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanetRepositoryTest {
    @Autowired
    private PlanetRepository planetRepository;

    @Test
    public void should_find_by_name() throws Exception {
        Planet alderaan =planetRepository.findByName("Alderaan");
        assertThat(alderaan.getName(),is("Alderaan"));
    }

    @Test
    public void show_page_planets() throws Exception {
        PageRequest page = new PageRequest(0,2);
        Page<Planet> all =planetRepository.findAllBy(page);
        assertThat(all.getNumberOfElements(),is(2));
    }

//    @Test
//    public void show_sort_planets() throws Exception {
//
//        Sort sort=new Sort(Sort.Direction.ASC,"episodeId");
//
//        Page<Planet> all =planetRepository.findAllBy(sort);
//        assertThat(all.getNumberOfElements(),is(2));
//    }
}
