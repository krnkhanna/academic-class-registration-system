package org.genesys.services.impl;

import org.genesys.entities.StudentCourseMapEntity;
import org.genesys.entities.StudentEntity;
import org.genesys.exceptions.NoResourceFoundException;
import org.genesys.mappers.StudentCourseMapEntityMapper;
import org.genesys.mappers.StudentEntityMapper;
import org.genesys.models.Student;
import org.genesys.repositories.StudentCourseMapRepository;
import org.genesys.repositories.StudentsRepository;
import org.genesys.services.CoursesService;
import org.genesys.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    @Autowired
    private CoursesService coursesService;

    @Autowired
    private StudentCourseMapRepository studentCourseMapRepository;

    @Override
    public Student getStudent(int studentId) {
        StudentEntity studentEntity = studentsRepository.findById(studentId).block();
        if (null != studentEntity) {
            return StudentEntityMapper.getStudent(studentEntity);
        } else {
            throw new NoResourceFoundException(Integer.toString(studentId), Student.class.getSimpleName());
        }
    }

    @Override
    public Student saveStudent(Student student) {
        StudentEntity studentEntity = StudentEntityMapper.getStudentEntity(student);
        return StudentEntityMapper.getStudent(studentsRepository.save(studentEntity).block());
    }

    @Override
    public void assignToCourse(int studentId, int courseId) {
        getStudent(studentId);
        coursesService.getCourse(courseId);
        if (null == studentCourseMapRepository.findByStudentIdAndCourseId(studentId, courseId).block()) {
            StudentCourseMapEntity studentCourseMapEntity =
                    StudentCourseMapEntityMapper.getStudentCourseMapEntity(studentId, courseId);
            studentCourseMapRepository.save(studentCourseMapEntity).block();
        }
    }
}
