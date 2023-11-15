package com.nuzhd.springrediscaching.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private int grade;

    private int age;

    private boolean isIll;

    public Student(String name, String surname, int grade, int age) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.age = age;
        this.isIll = false;
    }
}
