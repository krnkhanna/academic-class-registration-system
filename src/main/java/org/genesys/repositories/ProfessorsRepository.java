package org.genesys.repositories;

import org.genesys.entities.ProfessorEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProfessorsRepository extends ReactiveCrudRepository<ProfessorEntity, Integer> {
}
