package xys.codeark.sierra.dto.workouts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Setter
@Getter
public class PushUps extends Workout {
    private Byte numberOfRepetitions;

    private Byte numberOfSeries;
}
