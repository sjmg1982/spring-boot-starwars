package es.ua.springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sjmg on 30/06/17.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Planet {
    @Id
    @GeneratedValue
    private Long planetId;

    private String name;
    private String rotationPeriod;
    private String orbitalPeriod;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surfaceWater;
    private String residents;
}
