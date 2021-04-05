package org.genesys.mappers;

import org.genesys.entities.StudentEntity;
import org.genesys.models.Student;

public class StudentEntityMapper {

    public static Student getStudent(StudentEntity studentEntity) {
        Student student = new Student();
        student.setStudentId(studentEntity.getStudentId());
        student.setStudentName(studentEntity.getStudentName());
        return student;
    }

    public static StudentEntity getStudentEntity(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentId(student.getStudentId());
        studentEntity.setStudentName(student.getStudentName());
        return studentEntity;
    }
}
