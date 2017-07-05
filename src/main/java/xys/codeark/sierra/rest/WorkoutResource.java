package xys.codeark.sierra.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import xys.codeark.sierra.dto.workouts.PullUps;
import xys.codeark.sierra.dto.workouts.Workout;
import xys.codeark.sierra.services.WorkoutService;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@Path(RestConstants.WORKOUT)
public class WorkoutResource {
    @Resource
    private WorkoutService workoutService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerWorkout(Workout workout){

        workoutService.registerWorkout(workout);

        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWorkouts(){
        List<Workout> registeredWorkouts = new ArrayList<>();

        PullUps pullUps = new PullUps();
        pullUps.setNumberOfSeries((byte) 5);
        pullUps.setNumberOfRepetitions((byte) 12);

        registeredWorkouts.add(pullUps);

        return Response.ok(registeredWorkouts).build();
    }
}
