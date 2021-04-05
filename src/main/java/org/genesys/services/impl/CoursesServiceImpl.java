package org.genesys.services.impl;

import org.genesys.entities.CourseEntity;
import org.genesys.exceptions.NoResourceFoundException;
import org.genesys.mappers.CourseEntityMapper;
import org.genesys.models.Course;
import org.genesys.repositories.CoursesRepository;
import org.genesys.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public Course getCourse(int courseId) {
        CourseEntity courseEntity = coursesRepository.findById(courseId).block();
        if (null != courseEntity) {
            return CourseEntityMapper.getCourse(courseEntity);
        } else {
            throw new NoResourceFoundException(Integer.toString(courseId), Course.class.getSimpleName());
        }
    }

    @Override
    public Course saveCourse(Course course) {
        CourseEntity courseEntity = CourseEntityMapper.getCourseEntity(course);
        return CourseEntityMapper.getCourse(coursesRepository.save(courseEntity).block());
    }
}
