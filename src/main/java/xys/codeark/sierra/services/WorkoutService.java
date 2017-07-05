package xys.codeark.sierra.services;


import xys.codeark.sierra.dto.workouts.Workout;

import java.util.List;

public interface WorkoutService {
    /**
     * Registers a workout provided by the client (e.g. front end)
     * @param workout the workout to be registered
     */
    void registerWorkout(Workout workout);

    /**
     * Fetches the workouts from the database for a particular user
     *
     * @return a list of all the workouts the user has ever registered
     */
    List<Workout> getWorkouts();
}
