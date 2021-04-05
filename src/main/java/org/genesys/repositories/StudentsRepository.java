package org.genesys.repositories;

import org.genesys.entities.StudentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentsRepository extends ReactiveCrudRepository<StudentEntity, Integer> {
}
