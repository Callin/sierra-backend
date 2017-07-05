package xys.codeark.sierra.domain;

import lombok.Getter;
import lombok.Setter;
import xys.codeark.sierra.domain.workouts.Workout;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany
    private List<Workout> workoutList;
}
