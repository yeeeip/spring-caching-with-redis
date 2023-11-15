package com.nuzhd.springrediscaching.service;

import com.nuzhd.springrediscaching.dto.StudentCreationRequest;
import com.nuzhd.springrediscaching.exceptions.StudentNotFoundException;
import com.nuzhd.springrediscaching.model.Student;
import com.nuzhd.springrediscaching.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "students")
public class StudentService {

    private final StudentRepository studentRepository;

    @Cacheable(key = "#id")
    public Student findById(Long id) {
        return studentRepository.findById(id)
                .orElse(null);
    }

    public Student save(StudentCreationRequest request) {

        Student student = new Student(
                request.name(),
                request.surname(),
                request.grade(),
                request.age()
        );

        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @CacheEvict(key = "#id")
    public void deleteById(Long id) throws StudentNotFoundException {
        studentRepository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException("Student with id: " + id + " not found")
                );
    }

    @CacheEvict(key = "#student.id")
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
