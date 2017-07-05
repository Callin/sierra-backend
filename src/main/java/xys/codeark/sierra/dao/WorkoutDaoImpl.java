package xys.codeark.sierra.dao;

import org.springframework.stereotype.Repository;
import xys.codeark.sierra.domain.workouts.Workout;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class WorkoutDaoImpl implements WorkoutDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void registerWorkout(Workout workout) {
        entityManager.persist(workout);
    }

    @Override
    public List<Workout> getWorkouts() {
//        entityManager.createNamedQuery()
        return null;
    }
}
