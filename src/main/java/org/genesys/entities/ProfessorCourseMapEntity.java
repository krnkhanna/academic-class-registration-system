package org.genesys.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("professor_course_map")
public class ProfessorCourseMapEntity {

    @Id
    @Column("professor_course_map_id")
    private int professorCourseMapId;

    @Column("professor_id")
    private int professorId;

    @Column("course_id")
    private int courseId;

    public int getProfessorCourseMapId() {
        return professorCourseMapId;
    }

    public void setProfessorCourseMapId(int professorCourseMapId) {
        this.professorCourseMapId = professorCourseMapId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
