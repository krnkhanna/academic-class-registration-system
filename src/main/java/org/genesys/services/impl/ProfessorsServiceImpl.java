package org.genesys.services.impl;

import org.genesys.entities.ProfessorCourseMapEntity;
import org.genesys.entities.ProfessorEntity;
import org.genesys.exceptions.NoResourceFoundException;
import org.genesys.mappers.ProfessorCourseMapEntityMapper;
import org.genesys.mappers.ProfessorEntityMapper;
import org.genesys.models.Professor;
import org.genesys.repositories.ProfessorCourseMapRepository;
import org.genesys.repositories.ProfessorsRepository;
import org.genesys.services.CoursesService;
import org.genesys.services.ProfessorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorsServiceImpl implements ProfessorsService {

    @Autowired
    private CoursesService coursesService;

    @Autowired
    private ProfessorsRepository professorsRepository;

    @Autowired
    private ProfessorCourseMapRepository professorCourseMapRepository;

    @Override
    public Professor getProfessor(int professorId) {
        ProfessorEntity professorEntity = professorsRepository.findById(professorId).block();
        if (null != professorEntity) {
            return ProfessorEntityMapper.getProfessor(professorEntity);
        } else {
            throw new NoResourceFoundException(Integer.toString(professorId), Professor.class.getSimpleName());
        }
    }

    @Override
    public Professor saveProfessor(Professor professor) {
        ProfessorEntity professorEntity = ProfessorEntityMapper.getProfessorEntity(professor);
        return ProfessorEntityMapper.getProfessor(professorsRepository.save(professorEntity).block());
    }

    @Override
    public void assignToCourse(int professorId, int courseId) {
        getProfessor(professorId);
        coursesService.getCourse(courseId);
        if (null == professorCourseMapRepository.findByProfessorIdAndCourseId(professorId, courseId).block()) {
            ProfessorCourseMapEntity professorCourseMapEntity =
                    ProfessorCourseMapEntityMapper.getProfessorCourseMapEntity(professorId, courseId);
            professorCourseMapRepository.save(professorCourseMapEntity).block();
        }
    }
}
