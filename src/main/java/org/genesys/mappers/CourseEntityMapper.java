package org.genesys.mappers;

import org.genesys.entities.CourseEntity;
import org.genesys.models.Course;

public class CourseEntityMapper {

    public static CourseEntity getCourseEntity(Course course) {
        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setCourseName(course.getCourseName());
        courseEntity.setCourseDescription(course.getCourseDescription());
        return courseEntity;
    }

    public static Course getCourse(CourseEntity courseEntity) {
        Course course = new Course();
        course.setCourseId(courseEntity.getCourseId());
        course.setCourseName(courseEntity.getCourseName());
        course.setCourseDescription(courseEntity.getCourseDescription());
        return course;
    }
}
