package org.genesys.mappers;

import org.genesys.entities.ProfessorEntity;
import org.genesys.models.Professor;

public class ProfessorEntityMapper {

    public static Professor getProfessor(ProfessorEntity professorEntity) {
        Professor professor = new Professor();
        professor.setProfessorId(professorEntity.getProfessorId());
        professor.setProfessorName(professorEntity.getProfessorName());
        return professor;
    }

    public static ProfessorEntity getProfessorEntity(Professor professor) {
        ProfessorEntity professorEntity = new ProfessorEntity();
        professorEntity.setProfessorId(professor.getProfessorId());
        professorEntity.setProfessorName(professor.getProfessorName());
        return professorEntity;
    }
}
