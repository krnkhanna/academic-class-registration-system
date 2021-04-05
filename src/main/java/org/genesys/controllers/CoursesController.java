package org.genesys.controllers;

import org.genesys.models.Course;
import org.genesys.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourse(@PathVariable int courseId) {
        System.out.println(1);
        Course course = this.coursesService.getCourse(courseId);
        return ResponseEntity.status(HttpStatus.OK).body(course);
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        course = this.coursesService.saveCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(course);
    }
}
