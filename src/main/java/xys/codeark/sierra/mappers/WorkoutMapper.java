package xys.codeark.sierra.mappers;

import org.dozer.DozerConverter;
import org.dozer.Mapper;
import xys.codeark.sierra.domain.workouts.Workout;
import xys.codeark.sierra.dto.workouts.Abs;
import xys.codeark.sierra.dto.workouts.PullUps;
import xys.codeark.sierra.dto.workouts.PushUps;

import javax.annotation.Resource;

public class WorkoutMapper extends DozerConverter<Workout, xys.codeark.sierra.dto.workouts.Workout> {

    @Resource
    private Mapper mapper;

    public WorkoutMapper(Class<Workout> prototypeA, Class<xys.codeark.sierra.dto.workouts.Workout> prototypeB) {
        super(prototypeA, prototypeB);
    }

    @Override
    public xys.codeark.sierra.dto.workouts.Workout convertTo(Workout workoutDomain,
                                                             xys.codeark.sierra.dto.workouts.Workout workoutDto) {

        if (workoutDomain instanceof xys.codeark.sierra.domain.workouts.Abs) {
            workoutDto = mapper.map(workoutDomain, Abs.class);
        } else if (workoutDomain instanceof xys.codeark.sierra.domain.workouts.PushUps) {
            workoutDto = mapper.map(workoutDomain, PushUps.class);
        } else if (workoutDomain instanceof xys.codeark.sierra.domain.workouts.PullUps) {
            workoutDto = mapper.map(workoutDomain, PullUps.class);
        } else {
            workoutDto = mapper.map(workoutDomain, xys.codeark.sierra.dto.workouts.Workout.class);
        }

        return workoutDto;
    }

    @Override
    public Workout convertFrom(xys.codeark.sierra.dto.workouts.Workout workoutDto,
                               Workout workoutDomain) {
        if (workoutDto instanceof Abs) {
            workoutDomain = mapper.map(workoutDto, xys.codeark.sierra.domain.workouts.Abs.class);
        } else if (workoutDto instanceof PushUps) {
            workoutDomain = mapper.map(workoutDto, xys.codeark.sierra.domain.workouts.PushUps.class);
        } else if (workoutDto instanceof PullUps) {
            workoutDomain = mapper.map(workoutDto, xys.codeark.sierra.domain.workouts.PullUps.class);
        } else {
            workoutDomain = mapper.map(workoutDto, xys.codeark.sierra.domain.workouts.Workout.class);
        }
        return workoutDomain;
    }
}
