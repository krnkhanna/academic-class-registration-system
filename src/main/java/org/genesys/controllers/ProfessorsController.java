package org.genesys.controllers;

import org.genesys.models.Professor;
import org.genesys.services.ProfessorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professors")
public class ProfessorsController {

    @Autowired
    private ProfessorsService professorsService;

    @GetMapping("/{professorId}")
    public ResponseEntity<Professor> getProfessor(@PathVariable int professorId) {
        Professor professor = this.professorsService.getProfessor(professorId);
        return ResponseEntity.status(HttpStatus.OK).body(professor);
    }

    @PostMapping
    public ResponseEntity<Professor> saveProfessor(@RequestBody Professor professor) {
        professor = this.professorsService.saveProfessor(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professor);
    }

    @PutMapping("/{professorId}/courses/{courseId}")
    public ResponseEntity assignCourse(@PathVariable int professorId, @PathVariable int courseId) {
        this.professorsService.assignToCourse(professorId, courseId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
