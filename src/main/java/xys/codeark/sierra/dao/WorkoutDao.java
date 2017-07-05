package xys.codeark.sierra.dao;


import xys.codeark.sierra.domain.workouts.Workout;

import java.util.List;

public interface WorkoutDao {
    void registerWorkout(Workout workout);

    List<Workout> getWorkouts();
}
