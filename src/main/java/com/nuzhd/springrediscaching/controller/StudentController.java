package com.nuzhd.springrediscaching.controller;

import com.nuzhd.springrediscaching.dto.StudentCreationRequest;
import com.nuzhd.springrediscaching.model.Student;
import com.nuzhd.springrediscaching.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId) {
        Student found = studentService.findById(studentId);

        return ResponseEntity.ok(found);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentCreationRequest request) {
        Student student = studentService.save(request);

        return ResponseEntity.ok(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteById(studentId);
        return ResponseEntity.ok("Student with id: " + studentId + " successfully deleted!");
    }
}
