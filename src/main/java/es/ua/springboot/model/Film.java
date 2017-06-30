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
public class Film {
    @Id
    @GeneratedValue
    private Long filmId;

    private String title;
    private Integer emisodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private Date releaseDate;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name="filmId")},
            inverseJoinColumns = {@JoinColumn(name="filmId")})
    private List<People> people;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name="filmId")},
            inverseJoinColumns = {@JoinColumn(name="filmId")})
    private List<Planet> planets;
}
