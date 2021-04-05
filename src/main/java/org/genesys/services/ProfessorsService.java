package org.genesys.services;

import org.genesys.models.Professor;

public interface ProfessorsService {

    Professor getProfessor(int professorId);

    Professor saveProfessor(Professor professor);

    void assignToCourse(int professorId, int courseId);

}
