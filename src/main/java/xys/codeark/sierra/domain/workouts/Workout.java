package xys.codeark.sierra.domain.workouts;

import lombok.Getter;
import lombok.Setter;
import xys.codeark.sierra.domain.User;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "workout")
@DiscriminatorColumn(name = "type")
@DiscriminatorValue(WorkoutConstants.WORKOUT)
@NamedQueries({
        @NamedQuery(name = Workout.GET_WORKOUTS, query = "SELECT w FROM Workout w"),
})
public class Workout {
    public static final String GET_WORKOUTS = "getWorkouts";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private User user;

}
