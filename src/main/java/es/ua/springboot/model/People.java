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
public class People {
    @Id
    @GeneratedValue
    private Long peopleId;

    private String name;
    private String eyeColor;
    private String gender;
    private String hairColor;
    private String mass;
    private String skinColor;
}
