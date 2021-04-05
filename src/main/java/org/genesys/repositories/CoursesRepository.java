package org.genesys.repositories;

import org.genesys.entities.CourseEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CoursesRepository extends ReactiveCrudRepository<CourseEntity, Integer> {

}
