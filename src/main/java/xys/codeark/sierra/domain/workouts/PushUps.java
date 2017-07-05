package xys.codeark.sierra.domain.workouts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(WorkoutConstants.PUSH_UPS)
@Setter
@Getter
public class PushUps extends Workout {
    @Column(name = "no_of_repetitions")
    private Byte numberOfRepetitions;

    @Column(name = "no_of_series")
    private Byte numberOfSeries;
}
