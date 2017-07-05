package xys.codeark.sierra.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xys.codeark.sierra.dao.WorkoutDao;
import xys.codeark.sierra.dto.workouts.Workout;
import xys.codeark.sierra.mappers.WorkoutMapper;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Resource
    private WorkoutDao workoutDao;

    @Resource
    private WorkoutMapper workoutMapper;

    @Override
    public void registerWorkout(Workout workout) {
        xys.codeark.sierra.domain.workouts.Workout workoutDomain = null;
        workoutDomain = workoutMapper.convertFrom(workout, workoutDomain);
        workoutDao.registerWorkout(workoutDomain);
    }

    @Override
    public List<Workout> getWorkouts() {
//        List<Workout> workouts = mapper.
//        custom mapper to map collections
//        workoutMapper.convertFrom()
        return null;
    }
}
