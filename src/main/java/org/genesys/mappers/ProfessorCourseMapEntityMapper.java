package org.genesys.mappers;

import org.genesys.entities.ProfessorCourseMapEntity;

public class ProfessorCourseMapEntityMapper {

    public static ProfessorCourseMapEntity getProfessorCourseMapEntity(int professorId, int courseId) {
        ProfessorCourseMapEntity professorCourseMapEntity = new ProfessorCourseMapEntity();
        professorCourseMapEntity.setProfessorId(professorId);
        professorCourseMapEntity.setCourseId(courseId);
        return professorCourseMapEntity;
    }

}
