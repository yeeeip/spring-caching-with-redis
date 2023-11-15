package com.nuzhd.springrediscaching.repository;

import com.nuzhd.springrediscaching.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
