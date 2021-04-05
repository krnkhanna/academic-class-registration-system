package org.genesys.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("student_course_map")
public class StudentCourseMapEntity {

    @Id
    @Column("student_course_map_id")
    private int studentCourseMapId;

    @Column("student_id")
    private int studentId;

    @Column("course_id")
    private int courseId;

    public int getStudentCourseMapId() {
        return studentCourseMapId;
    }

    public void setStudentCourseMapId(int studentCourseMapId) {
        this.studentCourseMapId = studentCourseMapId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
