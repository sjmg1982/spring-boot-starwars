package es.ua.springboot;

import es.ua.springboot.model.Planet;
import es.ua.springboot.repository.PlanetRepository;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}
