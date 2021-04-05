package org.genesys.repositories;

import org.genesys.entities.ProfessorCourseMapEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProfessorCourseMapRepository extends ReactiveCrudRepository<ProfessorCourseMapEntity, Integer> {

    @Query("select * from professor_course_map where professor_id = :professorId and course_id = :courseId")
    Mono<ProfessorCourseMapEntity> findByProfessorIdAndCourseId(int professorId, int courseId);

}
