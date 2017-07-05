package xys.codeark.sierra.domain.workouts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(WorkoutConstants.ABS)
@Setter
@Getter
public class Abs extends Workout {
    @Column(name = "no_of_repetitions")
    private Byte numberOfRepetitions;

    @Column(name = "no_of_series")
    private Byte numberOfSeries;
}
