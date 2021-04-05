package org.genesys.mappers;

import org.genesys.entities.StudentCourseMapEntity;

public class StudentCourseMapEntityMapper {

    public static StudentCourseMapEntity getStudentCourseMapEntity(int studentId, int courseId) {
        StudentCourseMapEntity studentCourseMapEntity = new StudentCourseMapEntity();
        studentCourseMapEntity.setStudentId(studentId);
        studentCourseMapEntity.setCourseId(courseId);
        return studentCourseMapEntity;
    }
}
