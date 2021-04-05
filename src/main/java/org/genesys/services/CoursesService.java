package org.genesys.services;

import org.genesys.models.Course;

public interface CoursesService {

    Course getCourse(int courseId);

    Course saveCourse(Course course);
}
