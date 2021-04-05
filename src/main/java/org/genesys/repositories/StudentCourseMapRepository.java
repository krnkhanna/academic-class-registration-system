package org.genesys.repositories;

import org.genesys.entities.StudentCourseMapEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface StudentCourseMapRepository extends ReactiveCrudRepository<StudentCourseMapEntity, Integer> {

    @Query("select * from student_course_map where student_id = :studentId and course_id = :courseId")
    Mono<StudentCourseMapEntity> findByStudentIdAndCourseId(int studentId, int courseId);
}
