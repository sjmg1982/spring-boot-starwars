package es.ua.springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sjmg on 30/06/17.
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Peliculas {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Integer emisodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private Date releaseDate;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name="id")},
            inverseJoinColumns = {@JoinColumn(name="id")})
    private List<Personaje> people;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name="id")},
            inverseJoinColumns = {@JoinColumn(name="id")})
    private List<Planet> planets;
}
