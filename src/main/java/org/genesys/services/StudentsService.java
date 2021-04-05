package org.genesys.services;

import org.genesys.models.Student;

public interface StudentsService {

    Student getStudent(int studentId);

    Student saveStudent(Student student);

    void assignToCourse(int studentId, int courseId);
}
