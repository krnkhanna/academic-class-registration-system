package org.genesys.controllers;

import org.genesys.models.Student;
import org.genesys.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable int studentId) {
        Student student = this.studentsService.getStudent(studentId);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        student = this.studentsService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @PutMapping("/{studentId}/courses/{courseId}")
    public ResponseEntity assignCourse(@PathVariable int studentId, @PathVariable int courseId) {
        this.studentsService.assignToCourse(studentId, courseId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
