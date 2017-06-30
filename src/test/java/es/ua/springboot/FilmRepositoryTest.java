package es.ua.springboot;

import es.ua.springboot.model.Film;
import es.ua.springboot.model.People;
import es.ua.springboot.repository.FilmRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sjmg on 30/06/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmRepositoryTest {
    @Autowired
    private FilmRepository filmRepository;

    @Test
    public void show_all_planets() throws Exception {
        List<Film> all =filmRepository.findAllByOrderByEpisodeId();
        all.stream().forEach(System.out::println);
    }
}
