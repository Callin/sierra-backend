package xys.codeark.sierra;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import xys.codeark.sierra.dto.workouts.Workout;
import xys.codeark.sierra.mappers.WorkoutMapper;

/**
 * Spring configuration class. The project uses JavaConfig instead of XML based Spring configuration
 */

@Configuration
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration(exclude = LiquibaseAutoConfiguration.class)
@ComponentScan(basePackageClasses = {SierraScanable.class})
public class SierraConfig {
    @Bean
    public Mapper mapper() {
        return new DozerBeanMapper();
    }

    @Bean
    public WorkoutMapper workoutMapper() {
        return new WorkoutMapper(xys.codeark.sierra.domain.workouts.Workout.class, Workout.class);
    }

}
