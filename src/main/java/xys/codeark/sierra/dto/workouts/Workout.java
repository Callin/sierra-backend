package xys.codeark.sierra.dto.workouts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;
import xys.codeark.sierra.dto.User;

import static com.fasterxml.jackson.annotation.JsonSubTypes.*;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.*;

@JsonTypeInfo(use = Id.CLASS,
        include = As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @Type(value = Abs.class),
        @Type(value = PullUps.class),
        @Type(value = PushUps.class)
})
@Getter
@Setter
public class Workout {
    private Long id;

    private User user;

}
